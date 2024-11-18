package main;

import Service.LivroService;

public class main {
    public static void main(String[] args) {
        LivroService livroService = new LivroService();
        // Class criada para adicionar função ao código. //

        livroService.adicionarLivro("Percy Jackson e o Ladrão de Raios", 2010, "Fantasia, Mitologia");
        // "livroService.adicionarLivro" Comando usado para adicionar um livro / Seguindo a sintaxe (Título, Ano de publicação, Gênero) //
    }
}
