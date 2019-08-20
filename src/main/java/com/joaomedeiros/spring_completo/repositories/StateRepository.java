package com.joaomedeiros.spring_completo.repositories;

import com.joaomedeiros.spring_completo.domain.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {
}
