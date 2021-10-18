package com.programacioniva.api.repositories;

import com.programacioniva.api.entidades.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {

}
