package com.curso.app.services;

import com.curso.app.models.ProductEntity;
import com.curso.app.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductEntity save(ProductEntity product) {
        return productRepository.save(product);
    }

    @Override
    public Optional<ProductEntity> getById(Integer id) {
        return productRepository.findById(id);
    }

    @Override
    public void update(ProductEntity product) {
        productRepository.save(product);
    }

    @Override
    public void delete(Integer id) {
        productRepository.deleteById(id);
    }
}
