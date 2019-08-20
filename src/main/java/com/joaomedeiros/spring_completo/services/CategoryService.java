package com.joaomedeiros.spring_completo.services;

import com.joaomedeiros.spring_completo.domain.Category;
import com.joaomedeiros.spring_completo.repositories.CategoryRepository;
import com.joaomedeiros.spring_completo.services.exceptions.ObjectNotFoundException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repo;

    public Category find(final int id) {
        final Optional<Category> obj = repo.findById(id);

        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

}
