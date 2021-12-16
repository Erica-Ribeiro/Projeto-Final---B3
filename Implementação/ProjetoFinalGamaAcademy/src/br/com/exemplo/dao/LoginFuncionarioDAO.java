package br.com.exemplo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.exemplo.model.LoginFuncionario;
import br.com.exemplo.until.ConnectionFactory;

public class LoginFuncionarioDAO {
	private LoginFuncionario loginFuncionario;
	private Connection conn; 
	private PreparedStatement ps;
	private ResultSet rs;
	
	public LoginFuncionarioDAO() throws Exception {
		try {
			this.conn = ConnectionFactory.getConnection();
		} catch (Exception erro) {
			throw new Exception ("Erro: " + erro.getMessage());
		}
	}
	public void Salvar (LoginFuncionario loginFuncionario) throws Exception {
		try {
			String sql = "INSERT INTO loginFuncionario (codFuncionario, senha ) "
					+ " values (?, ? )";
			ps = conn.prepareStatement(sql);
			ps.setInt (1, loginFuncionario.getCodFuncionario());
			ps.setInt (2, loginFuncionario.getSenha());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public void Alterar (LoginFuncionario loginFuncionario) throws Exception {
		try { 
			String sql = "UPDATE loginFuncionario SET senha=? "
					+ " WHERE codFuncionario=? ";
			ps = conn.prepareStatement(sql);
			ps.setInt (1, loginFuncionario.getSenha());
			ps.setInt (2, loginFuncionario.getCodFuncionario());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public void Excluir (int codFuncionario) throws Exception {
		try {
			String sql = "DELETE FROM loginFuncionario WHERE codFuncionario=? ";
			ps = conn.prepareStatement(sql);
			ps.setInt (1, codFuncionario);
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public LoginFuncionario Consultar_PorCodFuncionario(int codFuncionario) throws Exception {
		try {
			ps = conn.prepareStatement ("SELECT * FROM loginFuncionario "
					+ " WHERE codFuncionario=? "); 
			ps.setInt (1, codFuncionario);
			rs= ps.executeQuery();
			if(rs.next()) {
				int codFuncionario2 = rs.getInt ("codFuncionario");
				int senha = rs.getInt ("senha");
				loginFuncionario = new LoginFuncionario (codFuncionario2, senha);
			}
				return loginFuncionario;
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public List ListarTodos() throws Exception {
		List<LoginFuncionario> lista = new ArrayList<LoginFuncionario>();
		try {
			ps = conn.prepareStatement ("SELECT * FROM loginFuncionario");
			rs = ps.executeQuery();
			while (rs.next()) {
				int codFuncionario = rs.getInt ("codFuncionario");
				int senha = rs.getInt ("senha");
				loginFuncionario = new LoginFuncionario (codFuncionario, senha);
				lista.add(loginFuncionario);
			}
			return lista;
		}catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public LoginFuncionario Login (int codFuncionario, int senha) throws Exception {
		try {
			ps = conn.prepareStatement ("SELECT * FROM loginFuncionario "
					+ " WHERE codFuncionario=? AND senha=?"); 
			ps.setInt (1, codFuncionario);
			ps.setInt (2, senha);
			rs= ps.executeQuery();
			if(rs.next()) {
				int codFuncionario2 = rs.getInt ("codFuncionario");
				int senha2 = rs.getInt ("senha");
				loginFuncionario = new LoginFuncionario (codFuncionario2, senha2);
			}
				return loginFuncionario;
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
}
