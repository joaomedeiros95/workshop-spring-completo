package com.joaomedeiros.spring_completo.resources;

import com.joaomedeiros.spring_completo.domain.Category;
import com.joaomedeiros.spring_completo.services.CategoryService;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> find(@PathVariable final int id) {
        final Category category = service.find(id);

        return ResponseEntity.ok().body(category);
    }

}
