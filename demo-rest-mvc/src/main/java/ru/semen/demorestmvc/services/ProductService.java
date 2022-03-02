package ru.semen.demorestmvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.semen.demorestmvc.entity.Product;
import ru.semen.demorestmvc.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository repository;

    @Autowired
    public void setRepository(ProductRepository repository) {
        this.repository = repository;
    }

    public Product getProductById(Long id) {
        return repository.getProducts().get(id.intValue() - 1);
    }

    public List<Product> getAllProduct() {
        return repository.getProducts();
    }

    public void deleteProductById(Long id) {
        repository.deleteById(id);
    }
}
