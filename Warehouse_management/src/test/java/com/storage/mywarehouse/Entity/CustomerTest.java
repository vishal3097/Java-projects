package com.storage.mywarehouse.Entity;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

public class CustomerTest {

    private static final int ONE = 1;
    private static final String ANY = "ANY";
    private static final double DOUBLE_VAL = 1.1;
    private Customer sut;


    @Test
    public void testSettersGetters() {
        sut = new Customer();

        sut.setCustomerId(ONE);
        sut.setName(ANY);
        sut.setLastName(ANY);
        sut.setOccupation(ANY);
        sut.setDiscount(DOUBLE_VAL);
        sut.setEmail(ANY);
        sut.setCity(ANY);
        sut.setPostal(ANY);
        sut.setTelephone(ANY);

        assertAll("test setter getter",
            () -> assertEquals(ONE, sut.getCustomerId()),
            () -> assertEquals(ANY, sut.getName()),
            () -> assertEquals(ANY, sut.getLastName()),
            () -> assertEquals(ANY, sut.getOccupation()),
            () -> assertEquals(ANY, sut.getEmail()),
            () -> assertEquals(ANY, sut.getCity()),
            () -> assertEquals(ANY, sut.getPostal()),
            () -> assertEquals(ANY, sut.getTelephone()),
            () -> assertEquals(DOUBLE_VAL, sut.getDiscount(), 0.01));
    }

    @Test
    public void testConstructor() {
        sut = new Customer(ONE, ANY, ANY, ANY, DOUBLE_VAL, ANY, ANY, ANY, ANY);

        assertAll("test constructor",
            () -> assertEquals(ONE, sut.getCustomerId()),
            () -> assertEquals(ANY, sut.getName()),
            () -> assertEquals(ANY, sut.getLastName()),
            () -> assertEquals(ANY, sut.getOccupation()),
            () -> assertEquals(DOUBLE_VAL, sut.getDiscount(), 0.01),
            () -> assertEquals(ANY, sut.getEmail()),
            () -> assertEquals(ANY, sut.getPostal()),
            () -> assertEquals(ANY, sut.getCity()),
            () -> assertEquals(ANY, sut.getTelephone()));
    }
}
