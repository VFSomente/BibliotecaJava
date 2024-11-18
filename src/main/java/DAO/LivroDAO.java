package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Connection.ConnectionBD;
import Entity.Livros;

public class LivroDAO {
    // Forma de adicionar livros utilizando de linguagem SQL //
    public void adicionarLivro(Livros livro) {
        String sql = "INSERT INTO LIVROS (titulo, ano_publicacao, genero) VALUES (?, ?, ?)";

        try (Connection conn = ConnectionBD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, livro.getTitulo());
            stmt.setInt(2, livro.getAnoPublicacao());
            stmt.setString(3, livro.getGenero());
            // Validação de parâmetros dos livros //
            stmt.executeUpdate();
            System.out.println("Livro adicionado com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao adicionar o livro: " + e.getMessage());
        }
    }
    // Sistema de remoção de livro pelo ID //
    public void removerLivroPorId(int id) {
        String sql = "DELETE FROM LIVROS WHERE id = ?";

        try (Connection conn = ConnectionBD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            // Validação de remoção de Livros //
            int linhasAfetadas = stmt.executeUpdate();
            if (linhasAfetadas > 0) {
                System.out.println("Livro removido com sucesso!");
            } else {
                System.out.println("Nenhum livro encontrado com o ID fornecido.");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao remover o livro: " + e.getMessage());
        }
    }
}
