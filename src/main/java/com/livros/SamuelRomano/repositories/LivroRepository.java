package com.livros.SamuelRomano.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.livros.SamuelRomano.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

}
