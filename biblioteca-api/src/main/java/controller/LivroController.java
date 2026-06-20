package com.biblioteca.bibliotecaapi.controller;

import com.biblioteca.bibliotecaapi.model.Livro;
import com.biblioteca.bibliotecaapi.service.LivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping
    public List<Livro> listarLivros() {
        return livroService.listarLivros();
    }

    @GetMapping("/{id}")
    public Livro buscarPorId(@PathVariable Long id) {
        return livroService.buscarPorId(id);
    }

    @PostMapping
    public Livro adicionarLivro(@RequestBody Livro livro) {
        return livroService.adicionarLivro(livro);
    }

    @PutMapping("/{id}")
    public Livro atualizar(
            @PathVariable Long id,
            @RequestBody Livro livro) {

        return livroService.atualizar(id, livro);
    }

    @DeleteMapping("/{id}")
    public String remover(@PathVariable Long id) {
        livroService.remover(id);
        return "Livro removido com sucesso!";
    }
}