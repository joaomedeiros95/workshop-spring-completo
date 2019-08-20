package com.joaomedeiros.spring_completo.repositories;

import com.joaomedeiros.spring_completo.domain.Category;
import com.joaomedeiros.spring_completo.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
