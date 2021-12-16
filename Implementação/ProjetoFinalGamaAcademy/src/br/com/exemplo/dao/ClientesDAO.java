package br.com.exemplo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.exemplo.model.Clientes;
import br.com.exemplo.model.Contas;
import br.com.exemplo.until.ConnectionFactory;

public class ClientesDAO {
	private Clientes clientes;
	private Connection conn; 
	private PreparedStatement ps;
	private ResultSet rs;
	
	public ClientesDAO() throws Exception {
		try {
			this.conn = ConnectionFactory.getConnection();
		} catch (Exception erro) {
			throw new Exception ("Erro: " + erro.getMessage());
		}
	}
	public void Salvar (Clientes clientes) throws Exception {
		try {
			String sql = "INSERT INTO clientes (nomeCliente, cpfCliente, celularCliente, emailCliente ) "
					+ " values (?, ?, ?, ? )";
			ps = conn.prepareStatement(sql);
			ps.setString (1, clientes.getNomeCliente());
			ps.setString (2, clientes.getCpfCliente());
			ps.setString (3, clientes.getCelularCliente());
			ps.setString (4, clientes.getEmailCliente());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public void Alterar (Clientes clientes) throws Exception {
		try { 
			String sql = "UPDATE clientes SET nomeCLiente=?, cpfCliente=?, celularCliente=?, emailCliente=? "
					+ " WHERE idCliente=? ";
			ps = conn.prepareStatement(sql);
			ps.setString (1, clientes.getNomeCliente());
			ps.setString (2, clientes.getCpfCliente());
			ps.setString (3, clientes.getCelularCliente());
			ps.setString (4, clientes.getEmailCliente());
			ps.setInt (5, clientes.getIdCliente());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public void Excluir (int idCliente) throws Exception {
		try {
			String sql = "DELETE FROM clientes WHERE idCliente=? ";
			ps = conn.prepareStatement(sql);
			ps.setInt (1, idCliente);
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public Clientes Consultar_PorCPF (String cpfCliente) throws Exception {
		try {
			ps = conn.prepareStatement ("SELECT * FROM clientes "
					+ " WHERE cpfCliente=?"); 
			ps.setString (1, cpfCliente);
			rs= ps.executeQuery();
			if(rs.next()) {
				int idCliente = rs.getInt ("idCliente");
				String nomeCliente = rs.getString ("nomeCliente");
				String cpfCliente2 = rs.getString ("cpfCliente");
				String celularCliente = rs.getString ("celularCliente");
				String emailCliente = rs.getString ("emailCliente");
				clientes = new Clientes (idCliente, nomeCliente, cpfCliente2, celularCliente, emailCliente);
			}
				return clientes;
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public Clientes Consultar_PorID (int idCliente) throws Exception {
		try {
			ps = conn.prepareStatement ("SELECT * FROM clientes "
					+ " WHERE idCliente=?"); 
			ps.setInt (1, idCliente);
			rs= ps.executeQuery();
			if(rs.next()) {
				int idCliente2 = rs.getInt ("idCliente");
				String nomeCliente = rs.getString ("nomeCliente");
				String cpfCliente = rs.getString ("cpfCliente");
				String celularCliente = rs.getString ("celularCliente");
				String emailCliente = rs.getString ("emailCliente");
				clientes = new Clientes (idCliente2, nomeCliente, cpfCliente, celularCliente, emailCliente);
			}
				return clientes;
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public Clientes Consultar_PorNome (String nomeCliente) throws Exception {
		try {
			ps = conn.prepareStatement ("SELECT * FROM clientes "
					+ " WHERE nomeCliente=?"); 
			ps.setString (1, nomeCliente);
			rs= ps.executeQuery();
			if(rs.next()) {
				int idCliente = rs.getInt ("idCliente");
				String nomeCliente2 = rs.getString ("nomeCliente");
				String cpfCliente = rs.getString ("cpfCliente");
				String celularCliente = rs.getString ("celularCliente");
				String emailCliente = rs.getString ("emailCliente");
				clientes = new Clientes (idCliente, nomeCliente2, cpfCliente, celularCliente, emailCliente);
			}
				return clientes;
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public List ListarTodos() throws Exception {
		List<Clientes> lista = new ArrayList<Clientes>();
		try {
			ps = conn.prepareStatement ("SELECT * FROM clientes");
			rs = ps.executeQuery();
			while (rs.next()) {
				int idCliente = rs.getInt ("idCliente");
				String nomeCliente = rs.getString ("nomeCliente");
				String cpfCliente = rs.getString ("cpfCliente");
				String celularCliente = rs.getString ("celularCliente");
				String emailCliente = rs.getString ("emailCliente");
				clientes = new Clientes (idCliente, nomeCliente, cpfCliente, celularCliente, emailCliente);
				lista.add(clientes);
			}
			return lista;
		}catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
//	public List ListarTodos2(String status) throws Exception {
//		List<Coordenador> lista = new ArrayList<Coordenador>();
//		try {
//			ps = conn.prepareStatement ("SELECT * FROM coordenador WHERE status LIKE ?");
//			ps.setString (1, status);
//			rs = ps.executeQuery();
//			while (rs.next()) {
//				String nome = rs.getString ("nome");
//				coordenador = new Coordenador (nome);
//				lista.add(coordenador);
//			}
//			return lista;
//		}catch (Exception e) {
//			throw new Exception (e.getMessage());
//		}
//	}
//	public void AtivarDesativar (Coordenador coordenador) throws Exception {
//		try { 
//			String sql = "UPDATE coordenador SET status=? "
//					+ " WHERE id_coordenador=? ";
//			ps = conn.prepareStatement(sql);
//			ps.setString (1, coordenador.getStatus());
//			ps.setInt (2, coordenador.getIdCoordenador());
//			ps.executeUpdate();
//		} catch (Exception e) {
//			throw new Exception (e.getMessage());
//		}
//	}
//	public Coordenador Login (int codCoordenador, String senha, String status) throws Exception {
//		try {
//			ps = conn.prepareStatement ("SELECT * FROM coordenador "
//					+ " WHERE cod_coordenador=? AND senha=? AND status=?"); 
//			ps.setInt (1, codCoordenador);
//			ps.setString (2, senha);
//			ps.setString (3, status);
//			rs= ps.executeQuery();
//			if(rs.next()) {
//				int idCoordenador = rs.getInt ("id_coordenador");
//				int codCoordenador1 = rs.getInt ("cod_coordenador");
//				String senha1 = rs.getString ("senha");
//				String nome = rs.getString ("nome");
//				String status1 = rs.getString ("status");
//				coordenador = new Coordenador (idCoordenador, codCoordenador1, senha1, nome, status1);
//			}
//				return coordenador;
//		} catch (Exception e) {
//			throw new Exception (e.getMessage());
//		}
//	}
}
