package com.joaomedeiros.spring_completo.resources;

import com.joaomedeiros.spring_completo.domain.Category;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @GetMapping
    public List<Category> list() {
        final Category cat1 = new Category(1, "Eletronic");
        final Category cat2 = new Category(2, "Office");

        return Arrays.asList(cat1, cat2);
    }

}
