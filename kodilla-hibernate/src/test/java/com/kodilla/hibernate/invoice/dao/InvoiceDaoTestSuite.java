package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

/**
 * Created by Marcin Muller on 06.09.17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //given
        Product product1=new Product("produkt 1");
        Product product2=new Product("produkt 2");
        Item item1=new Item(product1, new BigDecimal(101),2);
        Item item2=new Item(product1, new BigDecimal(77),3);
        Item item3=new Item(product2, new BigDecimal(150),1);
        Invoice invoice=new Invoice("01");
        product1.getItems().add(item1);
        product1.getItems().add(item2);
        product2.getItems().add(item3);
        item1.setProduct(product1);
        item2.setProduct(product1);
        item3.setProduct(product2);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        //when
        invoiceDao.save(invoice);
        int id= invoice.getId();
        //then
        Assert.assertNotEquals(0, id);
        //clean up
        invoiceDao.delete(id);
    }
}
