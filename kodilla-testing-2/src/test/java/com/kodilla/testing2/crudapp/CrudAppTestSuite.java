package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.google.config.WebDriverConfig;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.stream.Collectors;

/**
 * Created by Marcin Muller on 15.11.17.
 */
public class CrudAppTestSuite {
    private static final String BASE_URL="http://marcinmuller.github.io/";
    private WebDriver driver;
    private Random generator;

    @Before
    public void initTests() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(BASE_URL);
        generator = new Random();
    }
    @After
    public void cleanUpAfterTest(){
        driver.close();
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException{
        String taskName=createCrudAppTestTask();
        sendTestTaskToTrello(taskName);

        Alert alt = driver.switchTo().alert();
        alt.accept();

        deleteTaskFromCrudApp(taskName);
        Assert.assertTrue(checkTaskExistsTrello(taskName));
    }

    private void deleteTaskFromCrudApp(String taskName) throws InterruptedException{
        driver.navigate().refresh();

        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed());

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(a->a.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                        .getText().equals(taskName))
                .forEach(b->{
                    WebElement button=b.findElement(By.xpath(".//button[4]"));
                    button.click();
                });

        Thread.sleep(2000);

    }

    private String createCrudAppTestTask() throws InterruptedException{
//        final String XPATH_TASK_NAME="//form[contains(@action, \"createTask\")]/fieldset[1]/input";
        final String XPATH_TASK_NAME="//form[contains(@action, \"task\")]/fieldset[1]/input";
//        final String XPATH_TASK_CONTENT="//form[contains(@action, \"createTask\")]/fieldset[2]/textarea";
        final String XPATH_TASK_CONTENT="//form[contains(@action, \"task\")]/fieldset[2]/textarea";
//        final String XPATH_ADD_BUTTON="//form[contains(@action, \"createTask\")]/fieldset[3]/button";
        final String XPATH_ADD_BUTTON="//form[contains(@action, \"task\")]/fieldset[3]/button";
        String taskName = "task #"+generator.nextInt(100000);
        String taskContent = taskName+" content";

        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement addButton = driver.findElement(By.xpath(XPATH_ADD_BUTTON));
        addButton.click();
        Thread.sleep(2000);

        return taskName;
    }


    private void sendTestTaskToTrello(String taskName) throws InterruptedException {
        driver.navigate().refresh();

        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed());

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(a->a.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                        .getText().equals(taskName))
                .forEach(theForm->{
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectElement);
                    select.selectByIndex(1);

                    WebElement buttonCreateCard = theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                    buttonCreateCard.click();
                });
        Thread.sleep(5000);
    }

    private boolean checkTaskExistsTrello(String taskName) throws InterruptedException{
        final String TRELLO_URL="https://trello.com/login";
        boolean result = false;
        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driverTrello.get(TRELLO_URL);

        driverTrello.findElement(By.id("user")).sendKeys("mmuller@o2.pl");
        driverTrello.findElement(By.id("password")).sendKeys("Dupa6666");
        driverTrello.findElement(By.id("login")).submit();

        Thread.sleep(2000);

        driverTrello.findElements(By.xpath("//a[@class=\"board-tile\"]")).stream()
                .filter(aHref->aHref.findElements(By.xpath(".//span[@title=\"Kodilla Application\"]")).size()>0)
                .forEach(aHref->aHref.click());

        Thread.sleep(5000);

     //           result = driverTrello.findElements(By.xpath("//span")).stream()
        result = driverTrello.findElements(By.xpath("//a[@class=\"list-card js-member-droppable ui-droppable\"]")).stream()
                .filter(theSpan->theSpan.getText().contains(taskName))
                .collect(Collectors.toList())
                .size() > 0;

        driverTrello.close();

        return result;
    }
}
