package visao;
import java.sql.*;
import java.util.Scanner;

import dao.ContatoDAO;
import modelo.Contato;

public class Principal {
	public static void main(String[] args) {
		int opcao;		
		Scanner entrada = new Scanner(System.in);
		String nome, email, endereco;
		ContatoDAO contatoDAO = new ContatoDAO();
		
		System.out.println("1. Inserir contato"
				+ "\n2. Consultar contatos"
				+ "\nEscolha uma opção:");
		opcao=entrada.nextInt();
		switch(opcao) {
			case 1:
				entrada = new Scanner(System.in);
				System.out.println("Digite o nome: ");
				nome=entrada.nextLine();
				entrada = new Scanner(System.in);
				System.out.println("Digite o email: ");
				email=entrada.nextLine();
				entrada = new Scanner(System.in);
				System.out.println("Digite insere(contato);o endereco: ");
				endereco=entrada.nextLine();
				
				Contato contato= new Contato();
				contato.setNome(nome);
				contato.setEmail(email);
				contato.setEndereco(endereco);
				
				contatoDAO = new ContatoDAO();
				contatoDAO.insere(contato);
				
			break;
			case 2:
				ResultSet resultado = contatoDAO.consulta();
				
			try {
				while (resultado.next()) {
					nome = resultado.getString("nome");
					email = resultado.getString("email");
					System.out.println(nome + " :: " + email);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}			
			break;
			default:
		}
		
		
		
		}
	}