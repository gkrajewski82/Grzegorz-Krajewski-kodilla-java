package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Item item1 = new Item(new BigDecimal(10), 2);
        Item item2 = new Item(new BigDecimal(10), 5);
        Item item3 = new Item(new BigDecimal(20), 3);
        Product product1 = new Product("product 1");
        Product product2 = new Product("product 2");
        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product2);
        Invoice invoice1 = new Invoice("123456");
        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);
        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);

        //When
        invoiceDao.save(invoice1);
        int id = invoice1.getId();

        //Then
        assertEquals(3, invoice1.getItems().size());
        assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);
    }
}