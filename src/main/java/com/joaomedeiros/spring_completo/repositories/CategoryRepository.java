package com.joaomedeiros.spring_completo.repositories;

import com.joaomedeiros.spring_completo.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
