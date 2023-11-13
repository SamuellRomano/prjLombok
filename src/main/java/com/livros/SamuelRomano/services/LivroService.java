package com.livros.SamuelRomano.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.livros.SamuelRomano.entities.Livro;
import com.livros.SamuelRomano.repositories.LivroRepository;


@Service
public class LivroService {
	
	private final LivroRepository livroRepository;
	
	@Autowired
	public LivroService(LivroRepository livroRepository) {
		this.livroRepository = livroRepository;
	}
	
	public Livro getLivroById(Long Id) {
		return livroRepository.findById(Id).orElse(null);
	}
	
	public Livro saveLivro(Livro Livro) {
		return livroRepository.save(Livro);
	}
	
	public List<Livro> getAllLivros(){
		return livroRepository.findAll();
	}
	
	public void deleteLivro(Long id) {
		livroRepository.deleteById(id);
	}
	
	public Livro updateLivro(Long id, Livro novoLivro) {
        Optional<Livro> livroOptional = livroRepository.findById(id);
        if (livroOptional.isPresent()) {
        	Livro livroExistente = livroOptional.get();
           	livroExistente.setDescricao(novoLivro.getDescricao());
        	livroExistente.setIsbn(novoLivro.getIsbn());          
            return livroRepository.save(livroExistente); 
        } else {
            return null; 
        }
    }

}
