package main;
import Connection.ConnectionBD;
import DAO.LivroDAO;

public class mainremovedor {
    public static void main(String[] args) {
        // Class criada para adicionar função para remover livros do banco de dados //
        LivroDAO livroDAO = new LivroDAO();
        // Removedor de livros por ID / Utiliza os índices para remover //
        int id = 0;
        livroDAO.removerLivroPorId(id);
        // "livroDAO.removerLivroPorId" Comando para remover os livros //
    }
}
