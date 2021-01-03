package com.kodilla.hibernate.invoice.dao;

import java.math.BigDecimal;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {

        //Given

        Item item1 = new Item(new BigDecimal("100.00"), 20,new BigDecimal("5"));
        Item item2 = new Item(new BigDecimal("50000.00"),1000,new BigDecimal("50"));
        Invoice invoice = new Invoice("1");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assertions.assertNotEquals(0,id);

        //CleanUp
        invoiceDao.deleteById(id);




    }
}
