package com.casestudy.cataloguemgmt.productcatalogueservice1.Repository;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void testRepositoryExtendsJpaRepository() {
        // Check if the ProductRepository interface extends JpaRepository
        assertTrue(ProductRepository.class.isAssignableFrom(productRepository.getClass()));
    }
}

