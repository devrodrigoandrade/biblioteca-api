package com.biblioteca.bibliotecaapi.service;

import com.biblioteca.bibliotecaapi.model.Livro;
import com.biblioteca.bibliotecaapi.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    private final LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public List<Livro> listarLivros() {
        return livroRepository.findAll();
    }

    public Livro buscarPorId(Long id) {
        return livroRepository.findById(id).orElse(null);
    }

    public Livro adicionarLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    public void remover(Long id) {
        livroRepository.deleteById(id);
    }

    public Livro atualizar(Long id, Livro livroAtualizado) {

        Livro livroExistente = livroRepository.findById(id).orElse(null);

        if (livroExistente == null) {
            return null;
        }

        livroExistente.setTitulo(livroAtualizado.getTitulo());
        livroExistente.setAutor(livroAtualizado.getAutor());

        return livroRepository.save(livroExistente);
    }
}