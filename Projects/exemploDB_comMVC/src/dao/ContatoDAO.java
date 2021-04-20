package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Contato;

public class ContatoDAO {
	
	
	public void insere(Contato contato) {		
		Conexao conexao = new Conexao();	
		try {
			// cria um preparedStatement
			String sql = "insert into contatos (nome,email,endereco) values (?,?,?)";
			PreparedStatement stmt = conexao.getConn().prepareStatement(sql);
			// preenche os valores
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.execute();
			stmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		

	
	public ResultSet consulta() {
	
		Conexao conexao = new Conexao();
		PreparedStatement stmt;
		ResultSet rs=null;
		try {			
			stmt = conexao.getConn().prepareStatement("select * from contatos");
			rs = stmt.executeQuery();
			//stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	
	}
	/*
	stmt = conn.prepareStatement("select * from contatos");
	ResultSet rs = stmt.executeQuery();
	ArrayList<Contato> contatos = new ArrayList<Contato>();
	wh8ile (rs.next()) {
	// criando o objeto Contato
	Contato contato = new Contato();
	contato.setNome(rs.getString("nome"));
	contato.setEmail(rs.getString("email"));
	contato.setEndereco(rs.getString("endereco"));
	
	// adicionando o objeto lista
	contatos.add(contato);
	}
	rs.close();
	stmt.close();
	conn.close();
*/

}
