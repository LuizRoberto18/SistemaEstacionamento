package br.com.testspringboot.controllers;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import br.com.testspringboot.factory.ConnectionFactory;
import br.com.testspringboot.model.Usuario;

@RestController
public class UsuarioController {
    
   /*
	 * CRUD
	 * C -> CREATE
	 * R -> READ
	 * U -> UPDATE
	 * D -> DELETE
	 * */
	
	public void create(Usuario usuario) {
		String sql = "INSERT INTO tbl_usuario(nome, usuario, senha) VALUES (?, ?, ?)";
		 
		Connection conn = null;
		PreparedStatement pstm = null; 
		
		try {
			//Criar conexão com banco de dados
			conn = ConnectionFactory.createConnectionToMySql();
			//criamos uma PreparedStatement, para executar uma query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			// adicionar os valores esperados pela query
			pstm.setString(1, usuario.getNome());
			pstm.setString(2, usuario.getUsuario());
			pstm.setString(3, usuario.getSenha());
			//Executar a query
			pstm.execute();
			System.out.println("Usuario salvo com sucesso!");
			// new Date(usuario.getData().getTime())
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			//Fechar as conexões
			try {
				if(pstm != null) {
					pstm.close();
				}
				
				if(conn != null) {
					conn.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	

	public List<Usuario> getUsuarios() throws Exception{
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		String sql = "SELECT * FROM tbl_usuario";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		//Classe ue vai recuperar os dados do banco. ****SELECT****
		ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySql();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			rset = pstm.executeQuery();

			while (rset.next()) {
				Usuario usuario = new Usuario();

				//Recuperar o Id
				usuario.setId(rset.getLong("id"));
				//Recuperar o nome
				usuario.setNome(rset.getString("nome"));
				//Recuperar o usuario
				usuario.setUsuario(rset.getString("usuario"));
				//Recuperar a senha
				usuario.setSenha(rset.getString("senha"));
				//rset.getDate()
				usuarios.add(usuario);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(rset != null){
					rset.close();
				}
				if(pstm != null){
					pstm.close();
				}
				if(conn != null){
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return usuarios;
	}
	
	public void update(Usuario usuario) throws Exception{
		
		String sql = "UPDATE tbl_usuario SET nome = ?, usuario = ?, senha = ? " + "WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			//Criar conexão com o banco
			conn = ConnectionFactory.createConnectionToMySql();
			//Criar a classe pra exe
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			//Adicionar os valores para atualizar
			pstm.setString(1, usuario.getNome());
			
			pstm.setString(2, usuario.getUsuario());
			pstm.setString(3, usuario.getSenha());
			//setDate(3, new Date(usuario.getData().getTime())
			
			//Qual o Id do registro que deseja atualizar
			pstm.setLong(4, usuario.getId());
			
			//Executar a query
			pstm.execute();
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null){
					conn.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	public void deleteById(int id) {
		String sql = "DELETE FROM tbl_usuario WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySql();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			pstm.setInt(1, id);
			
			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

}