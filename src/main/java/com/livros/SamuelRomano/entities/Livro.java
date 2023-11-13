package com.livros.SamuelRomano.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "tb_livro")
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@NotNull
	private String descricao;
	
	@NotBlank
	@NotNull
	private String isbn;
	
	public Long getId() {
		return id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public String getIsbn(){
		return isbn;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}
