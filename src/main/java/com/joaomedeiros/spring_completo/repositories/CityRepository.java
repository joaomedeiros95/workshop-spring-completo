package com.joaomedeiros.spring_completo.repositories;

import com.joaomedeiros.spring_completo.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
}
