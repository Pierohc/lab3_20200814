package com.example.lab3.Repositories;

import com.example.lab3.Entitys.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VeterinarioRepository extends JpaRepository<Veterinario, Integer> {

    List<Veterinario> findBySede_id(String sede_id);
}
