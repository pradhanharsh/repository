package com.casestudy.cataloguemgmt.productcatalogueservice1.Service;

//we use Mockito to mock the ProductRepository and inject it into the ProductService

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.casestudy.cataloguemgmt.productcatalogueservice1.Model.Product;
import com.casestudy.cataloguemgmt.productcatalogueservice1.Repository.ProductRepository;
import com.casestudy.cataloguemgmt.productcatalogueservice1.Service.ProductService;

public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testListAllProducts() {
        // Mock the behavior of the ProductRepository to return a list of products
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Product1", 10.0f));
        productList.add(new Product(2, "Product2", 20.0f));
        when(productRepository.findAll()).thenReturn(productList);

        // Call the service method
        List<Product> result = productService.listAll();

        // Verify that the result matches the mocked data
        assertEquals(2, result.size());
    }

    @Test
    public void testSaveProduct() {
        // Create a new product
        Product product = new Product(1, "Product1", 10.0f);

        // Call the service method to save the product
        productService.save(product);

        // Verify that the save method of the repository was called with the same product
        verify(productRepository, times(1)).save(product);
    }

    @Test
    public void testGetProductById() {
        // Mock the behavior of the ProductRepository to return a product with ID 1
        when(productRepository.findById(1)).thenReturn(Optional.of(new Product(1, "Product1", 10.0f)));

        // Call the service method to get a product by ID
        Product result = productService.get(1);

        // Verify that the result is the expected product
        assertEquals(1, result.getId());
        assertEquals("Product1", result.getName());
        assertEquals(10.0f, result.getPrice(), 0.001);
    }

    @Test
    public void testDeleteProduct() {
        // Call the service method to delete a product by ID
        productService.delete(1);

        // Verify that the deleteById method of the repository was called with the correct ID
        verify(productRepository, times(1)).deleteById(1);
    }
}
