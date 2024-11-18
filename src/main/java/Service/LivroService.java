package Service;

import DAO.LivroDAO;
import Entity.Livros;

public class LivroService {
    private final LivroDAO livroDAO;
    // Integração a classe LivroDAO com validação de livros //
    public LivroService() {
        this.livroDAO = new LivroDAO();
    }

    public void adicionarLivro(String titulo, int anoPublicacao, String genero) {
        if (titulo == null || titulo.isEmpty()) {
            System.err.println("O título do livro não pode ser vazio.");
            return;
        }
        if (anoPublicacao <= 0) {
            System.err.println("O ano de publicação deve ser válido.");
            return;
        }
        if (genero == null || genero.isEmpty()) {
            System.err.println("O gênero do livro não pode ser vazio.");
            return;
        }
        // class para adicionar livros //
        Livros livro = new Livros(titulo, anoPublicacao, genero);


        livroDAO.adicionarLivro(livro);
    }
}
