package com.joaomedeiros.spring_completo;

import com.joaomedeiros.spring_completo.domain.Category;
import com.joaomedeiros.spring_completo.domain.City;
import com.joaomedeiros.spring_completo.domain.Product;
import com.joaomedeiros.spring_completo.domain.State;
import com.joaomedeiros.spring_completo.repositories.CategoryRepository;
import com.joaomedeiros.spring_completo.repositories.CityRepository;
import com.joaomedeiros.spring_completo.repositories.ProductRepository;
import com.joaomedeiros.spring_completo.repositories.StateRepository;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication implements CommandLineRunner {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private StateRepository stateRepository;

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

    @Override
    public void run(final String... args) throws Exception {
        final Category cat1 = new Category(null, "Computers");
        final Category cat2 = new Category(null, "Office");

        final Product p1 = new Product(null, "Computer", 2000.00);
        final Product p2 = new Product(null, "Printer", 800.00);
        final Product p3 = new Product(null, "Mouse", 80.00);

        cat1.getProducts().addAll(Arrays.asList(p1, p2, p3));
        cat2.getProducts().add(p2);

        p1.getCategories().add(cat1);
        p2.getCategories().addAll(Arrays.asList(cat1, cat2));
        p3.getCategories().add(cat1);

        categoryRepository.saveAll(Arrays.asList(cat1, cat2));
        productRepository.saveAll(Arrays.asList(p1, p2, p3));

        final State st1 = new State(null, "Minas Gerais");
        final State st2 = new State(null, "São Paulo");

        final City c1 = new City(null, "Uberlandia", st1);
        final City c2 = new City(null, "São Paulo", st2);
        final City c3 = new City(null, "Campinas", st2);

        stateRepository.saveAll(Arrays.asList(st1, st2));
        cityRepository.saveAll(Arrays.asList(c1, c2, c3));
    }
}
