package com.casestudy.cataloguemgmt.productcatalogueservice1.Model;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.casestudy.cataloguemgmt.productcatalogueservice1.Model.Product;

public class ProductTest {

    private Product product;

    @BeforeEach
    public void setUp() {
        // Create a new Product instance before each test
        product = new Product();
    }

    @Test
    public void testGetAndSetId() {
        // Set the ID to a specific value
        product.setId(1);

        // Check if the getter returns the same value
        assertEquals(1, product.getId());
    }

    @Test
    public void testGetAndSetName() {
        // Set the name to a specific value
        product.setName("Test Product");

        // Check if the getter returns the same value
        assertEquals("Test Product", product.getName());
    }

    @Test
    public void testGetAndSetPrice() {
        // Set the price to a specific value
        product.setPrice(19.99f);

        // Check if the getter returns the same value
        assertEquals(19.99f, product.getPrice(), 0.001); // Use a delta for float comparison
    }
}



//use JUnit 5 annotations such as @BeforeEach to set up a fresh Product instance before each test method (setUp method). Then, we have three test methods (testGetAndSetId, testGetAndSetName, and testGetAndSetPrice) that each focus on testing a specific getter and setter method of the Product class. 