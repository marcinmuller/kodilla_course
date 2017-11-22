import com.kodilla.food2door.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Marcin Muller on 22.11.17.r
 */
public class Food2DoorTestSuite {
    @Before
    public void dsds(){
        System.out.println("---------------");
    }
    @Test
    public void testProductInExtraFoodShop(){
        //given
        Product product1=new Product("mydło",5.0);
        Product product2=new Product("powidło",7.0);

        Order order=new Order(new Client("andzia pampuch"));
        order.toOrder(product1, 1);

        ExtraFoodShop extra=new ExtraFoodShop();
        extra.addProduct(product1);
        extra.addProduct(product2);
        //when
        extra.offer();
        System.out.println("");
        boolean result=extra.process(order);
        //then
        Assert.assertTrue(result);
    }

    @Test
    public void testLackInExtraFoodShop(){
        //given
        Product product1=new Product("mydło",5.0);
        Product product2=new Product("powidło",7.0);
        Product product3=new Product("dzynks",700000.0);

        Order order=new Order(new Client("andzia pampuch"));
        order.toOrder(product3, 1);
        order.toOrder(product1,2);

        ExtraFoodShop extra=new ExtraFoodShop();
        extra.addProduct(product1);
        extra.addProduct(product2);
        //when
        extra.offer();
        System.out.println("");
        boolean result=extra.process(order);
        //then
        Assert.assertFalse(result);
    }

    @Test
    public void testProductInHealthyShop(){
        //given
        Product product1=new Product("mydło",5.0);
        Product product2=new Product("powidło",7.0);

        Order order=new Order(new Client("andzia pampuch"));
        order.toOrder(product1, 1);

        HealthyShop healthyShop=new HealthyShop();
        healthyShop.addProduct(product1,1);
        healthyShop.addProduct(product2,50);
        //when
        healthyShop.offer();
        System.out.println("");
        boolean result=healthyShop.process(order);
        //then
        Assert.assertTrue(result);
    }

    @Test
    public void testLackInHealthyFoodShop(){
        //given
        Product product1=new Product("mydło",5.0);
        Product product2=new Product("powidło",7.0);
        Product product3=new Product("dzynks",700000.0);

        Order order=new Order(new Client("andzia pampuch"));
        order.toOrder(product1,3);

        HealthyShop healthyShop=new HealthyShop();
        healthyShop.addProduct(product1,1);
        healthyShop.addProduct(product2,50);
        //when
        healthyShop.offer();
        System.out.println("");
        boolean result=healthyShop.process(order);
        //then
        Assert.assertFalse(result);
    }
}
