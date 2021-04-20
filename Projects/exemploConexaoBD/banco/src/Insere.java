import java.sql.*;
import java.util.*;

public class Insere {
	public static void main(String[] args) throws SQLException {
		
		Connection conn = null;
		//Estabelecendo conexão
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/exemplo", "elis", "07*13An26");

		// cria um preparedStatement
		String sql = "insert into contatos (nome,email,endereco) values (?,?,?)";
		PreparedStatement stmt = conn.prepareStatement(sql);
		// preenche os valores
		stmt.setString(1, "Elisandra Silva");
		stmt.setString(2, "elisandra@ifsp.edu.br");
		stmt.setString(3, "R. AASAS, 6767");
		// executa
		stmt.execute();
		stmt.close();
		System.out.println("Gravado!");
		
		/*
		
		stmt = conn.prepareStatement("select * from contatos");
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			String nome = rs.getString("nome");
			String email = rs.getString("email");
			System.out.println(nome + " :: " + email);
		}			
		stmt.close();
		
		*/
			
		stmt = conn.prepareStatement("select * from contatos");
		ResultSet rs = stmt.executeQuery();
		ArrayList<Contato> contatos = new ArrayList<Contato>();
		while (rs.next()) {
		// criando o objeto Contato
		Contato contato = new Contato();
		contato.setNome(rs.getString("nome"));
		contato.setEmail(rs.getString("email"));
		contato.setEndereco(rs.getString("endereco"));
		// adicionando o objeto à lista
		contatos.add(contato);
		System.out.println("E-mail:"+rs.getString("email"));
		}
		rs.close();
		stmt.close();
		conn.close();
	
		}
	}