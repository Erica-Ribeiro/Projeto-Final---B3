package br.com.exemplo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.exemplo.model.Funcionario;
import br.com.exemplo.until.ConnectionFactory;

public class FuncionarioDAO {
	private Funcionario funcionario;
	private Connection conn; 
	private PreparedStatement ps;
	private ResultSet rs;
	
	public FuncionarioDAO() throws Exception {
		try {
			this.conn = ConnectionFactory.getConnection();
		} catch (Exception erro) {
			throw new Exception ("Erro: " + erro.getMessage());
		}
	}
	public void Salvar (Funcionario funcionario) throws Exception {
		try {
			String sql = "INSERT INTO funcionario (nomeFuncionario, cpfFuncionario, emailFuncionario, celularFuncionario ) "
					+ " values (?, ?, ?, ? )";
			ps = conn.prepareStatement(sql);
			ps.setString (1, funcionario.getNomeFuncionario());
			ps.setString (2, funcionario.getCpfFuncionario());
			ps.setString (3, funcionario.getEmailFuncionario());
			ps.setString (4, funcionario.getCelularFuncionario());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public void Alterar (Funcionario funcionario) throws Exception {
		try { 
			String sql = "UPDATE funcionario SET nomeFuncionario=?, cpfFuncionario=?, emailFuncionario=?, celularFuncionario=? "
					+ " WHERE codFuncionario=? ";
			ps = conn.prepareStatement(sql);
			ps.setString (1, funcionario.getNomeFuncionario());
			ps.setString (2, funcionario.getCpfFuncionario());
			ps.setString (3, funcionario.getEmailFuncionario());
			ps.setString (4, funcionario.getCelularFuncionario());
			ps.setInt (5, funcionario.getCodFuncionario());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public void Excluir (int codFuncionario) throws Exception {
		try {
			String sql = "DELETE FROM funcionario WHERE codFuncionario=? ";
			ps = conn.prepareStatement(sql);
			ps.setInt (1, codFuncionario);
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public Funcionario Consultar_PorCodFuncionario (int codFuncionario) throws Exception {
		try {
			ps = conn.prepareStatement ("SELECT * FROM funcionario "
					+ " WHERE codFuncionario=? "); 
			ps.setInt (1, codFuncionario);
			rs= ps.executeQuery();
			if(rs.next()) {
				int codFuncionario2 = rs.getInt ("codFuncionario");
				String nomeFuncionario = rs.getString ("nomeFuncionario");
				String cpfFuncionario = rs.getString ("cpfFuncionario");
				String emailFuncionario = rs.getString ("emailFuncionario");
				String celularFuncionario = rs.getString ("celularFuncionario");
				funcionario = new Funcionario (codFuncionario, nomeFuncionario, cpfFuncionario, emailFuncionario, celularFuncionario);
			}
				return funcionario;
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public List ListarTodos() throws Exception {
		List<Funcionario> lista = new ArrayList<Funcionario>();
		try {
			ps = conn.prepareStatement ("SELECT * FROM funcionario");
			rs = ps.executeQuery();
			while (rs.next()) {
				int codFuncionario = rs.getInt ("codFuncionario");
				String nomeFuncionario = rs.getString ("nomeFuncionario");
				String cpfFuncionario = rs.getString ("cpfFuncionario");
				String emailFuncionario = rs.getString ("emailFuncionario");
				String celularFuncionario = rs.getString ("celularFuncionario");
				funcionario = new Funcionario (codFuncionario, nomeFuncionario, cpfFuncionario, emailFuncionario, celularFuncionario);
				lista.add(funcionario);
			}
			return lista;
		}catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
}
