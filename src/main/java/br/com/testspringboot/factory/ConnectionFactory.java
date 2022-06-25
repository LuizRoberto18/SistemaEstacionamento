package br.com.testspringboot.factory;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionFactory {
	
	//Nome do Usuário do MySql
	private static final String USERNAME = "root";
	
	//Senha do Banco
	private static final String PASSWORD = "";
	
	//Caminho do Banco de dados, porta, nome do banco de dados
	private static final String DATABASE_URL = "jdbc:mysql://localhost:8080/sistema_estacionamento";
	
	/*
	 * Conexão com Banco de dados 
	 */
	public static Connection createConnectionToMySql() throws Exception {
		//Faz com que a classe seja carregada pela JVM
		Class.forName("com.mysql.jdbc.Driver");
		
		//Cria a conexão com o banco de dados
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
	}
	
	public static void main(String[] args) throws Exception {
		
		//Recuperar uma conexão com o banco de dados
		Connection connection = createConnectionToMySql();
		
		//Testar se a conexão é null
		if(connection !=null) {
			System.out.println("Conexão obtida com sucesso!");
			connection.close();
		}
	}
}
