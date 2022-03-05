package ru.semen.demorestmvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.semen.demorestmvc.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
