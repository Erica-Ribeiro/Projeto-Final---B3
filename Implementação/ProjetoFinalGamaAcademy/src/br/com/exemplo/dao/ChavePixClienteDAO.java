package br.com.exemplo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.exemplo.model.ChavePixCliente;
import br.com.exemplo.until.ConnectionFactory;

public class ChavePixClienteDAO {
	private ChavePixCliente chavePixCliente;
	private Connection conn; 
	private PreparedStatement ps;
	private ResultSet rs;
	
	public ChavePixClienteDAO() throws Exception {
		try {
			this.conn = ConnectionFactory.getConnection();
		} catch (Exception erro) {
			throw new Exception ("Erro: " + erro.getMessage());
		}
	}
	public void Salvar (ChavePixCliente chavePixCliente) throws Exception {
		try {
			String sql = "INSERT INTO chavePixCliente (tipoChavePix, chavePix, cpfCliente ) "
					+ " values (?, ?, ? )";
			ps = conn.prepareStatement(sql);
			ps.setString (1, chavePixCliente.getTipoChavePix());
			ps.setString (2, chavePixCliente.getChavePix());
			ps.setString (3, chavePixCliente.getCpfCliente());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public void Alterar (ChavePixCliente chavePixCliente) throws Exception {
		try { 
			String sql = "UPDATE chavePixCliente SET tipoChavePix=?, chavePix=? "
					+ " WHERE cpfCliente=? ";
			ps = conn.prepareStatement(sql);
			ps.setString (1, chavePixCliente.getTipoChavePix());
			ps.setString (2, chavePixCliente.getChavePix());
			ps.setString (3, chavePixCliente.getCpfCliente());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public void Excluir (String cpfCliente) throws Exception {
		try {
			String sql = "DELETE FROM chavePixCliente WHERE cpfCliente=? ";
			ps = conn.prepareStatement(sql);
			ps.setString (1, cpfCliente);
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public ChavePixCliente Consultar_PorCPF (String cpfCliente) throws Exception {
		try {
			ps = conn.prepareStatement ("SELECT * FROM chavePixCliente "
					+ " WHERE cpfCliente=?"); 
			ps.setString (1, cpfCliente);
			rs= ps.executeQuery();
			if(rs.next()) {
				int idChavePix = rs.getInt ("idChavePix");
				String tipoChavePix = rs.getString ("tipoChavePix");
				String chavePix = rs.getString ("chavePix");
				String cpfCliente2 = rs.getString ("cpfCliente");
				chavePixCliente = new ChavePixCliente (idChavePix, tipoChavePix, chavePix, cpfCliente2);
			}
				return chavePixCliente;
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public ChavePixCliente Consultar_PorCPFTipoChave (String cpfCliente, String tipoChavePix) throws Exception {
		try {
			ps = conn.prepareStatement ("SELECT * FROM chavePixCliente "
					+ " WHERE cpfCliente=? AND tipoChavePix=?"); 
			ps.setString (1, cpfCliente);
			ps.setString(2, tipoChavePix);
			rs= ps.executeQuery();
			if(rs.next()) {
				int idChavePix = rs.getInt ("idChavePix");
				String tipoChavePix2 = rs.getString ("tipoChavePix");
				String chavePix = rs.getString ("chavePix");
				String cpfCliente2 = rs.getString ("cpfCliente");
				chavePixCliente = new ChavePixCliente (idChavePix, tipoChavePix2, chavePix, cpfCliente2);
			}
				return chavePixCliente;
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public ChavePixCliente Consultar_PorID (int idChavePix) throws Exception {
		try {
			ps = conn.prepareStatement ("SELECT * FROM chavePixCliente "
					+ " WHERE idChavePix=?"); 
			ps.setInt (1, idChavePix);
			rs= ps.executeQuery();
			if(rs.next()) {
				int idChavePix2 = rs.getInt ("idChavePix");
				String tipoChavePix = rs.getString ("tipoChavePix");
				String chavePix = rs.getString ("chavePix");
				String cpfCliente = rs.getString ("cpfCliente");
				chavePixCliente = new ChavePixCliente (idChavePix2, tipoChavePix, chavePix, cpfCliente);
			}
				return chavePixCliente;
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public List ListarTodos(String cpfCliente) throws Exception {
		List<ChavePixCliente> lista = new ArrayList<ChavePixCliente>();
		try {
			ps = conn.prepareStatement ("SELECT * FROM chavePixCliente WHERE cpfCliente=?");
			ps.setString(1, cpfCliente);
			rs = ps.executeQuery();
			while (rs.next()) {
				int idChavePix = rs.getInt ("idChavePix");
				String tipoChavePix = rs.getString ("tipoChavePix");
				String chavePix = rs.getString ("chavePix");
				String cpfCliente2 = rs.getString ("cpfCliente");
				chavePixCliente = new ChavePixCliente (idChavePix, tipoChavePix, chavePix, cpfCliente2);
				lista.add(chavePixCliente);
			}
			return lista;
		}catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
}
