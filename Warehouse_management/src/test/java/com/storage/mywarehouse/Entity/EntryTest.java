package com.storage.mywarehouse.Entity;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

public class EntryTest {

    private static final int ONE = 1;
    private Entry sut;


    @Test
    public void testGettersSetters() {
        sut = new Entry();
        sut.setEntryId(ONE);
        sut.setWarehouseId(ONE);
        sut.setProductId(ONE);
        sut.setQuantity(ONE);

        assertAll("test setter getter",
            () -> assertEquals(ONE, sut.getEntryId()),
            () -> assertEquals(ONE, sut.getWarehouseId()),
            () -> assertEquals(ONE, sut.getProductId()),
            () -> assertEquals(ONE, sut.getQuantity()));
    }


    @Test
    public void testConstructor() {
    
        Entry sut = new Entry(ONE, ONE, ONE, ONE);

        assertAll("test constructor",
            () -> assertEquals(ONE, sut.getEntryId()),
            () -> assertEquals(ONE, sut.getWarehouseId()),
            () -> assertEquals(ONE, sut.getProductId()),
            () -> assertEquals(ONE, sut.getQuantity()));
    }
 
    @Test
    public void testConstructor2() {
       
        Entry sut = new Entry(ONE, ONE, ONE);

    
        assertAll("test constructor with no entry id",
            () -> assertEquals(ONE, sut.getWarehouseId()),
            () -> assertEquals(ONE, sut.getProductId()),
            () -> assertEquals(ONE, sut.getQuantity()));
    }
}
