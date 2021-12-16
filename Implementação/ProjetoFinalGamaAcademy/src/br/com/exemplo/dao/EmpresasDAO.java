package br.com.exemplo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.exemplo.model.Empresas;
import br.com.exemplo.until.ConnectionFactory;

public class EmpresasDAO {
	private Empresas empresas;
	private Connection conn; 
	private PreparedStatement ps;
	private ResultSet rs;
	
	public EmpresasDAO() throws Exception {
		try {
			this.conn = ConnectionFactory.getConnection();
		} catch (Exception erro) {
			throw new Exception ("Erro: " + erro.getMessage());
		}
	}
	public void Salvar (Empresas empresas) throws Exception {
		try {
			String sql = "INSERT INTO empresas (razaoSocial, nomeFantasia, CNPJ, inscricaoEstadual, telefoneEmpresa, celularEmpresa, emailEmpresa, idEndereco ) "
					+ " values (?, ?, ?, ?, ?, ?, ?, ? )";
			ps = conn.prepareStatement(sql);
			ps.setString (1, empresas.getRazaoSocial());
			ps.setString (2, empresas.getNomeFantasia());
			ps.setString (3, empresas.getCnpj());
			ps.setString (4, empresas.getInscricaoEstadual());
			ps.setString (5, empresas.getTelefoneEmpresa());
			ps.setString(6, empresas.getCelularEmpresa());
			ps.setString (7, empresas.getEmailEmpresa());
			ps.setInt (8, empresas.getIdEndereco());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public void Alterar (Empresas empresas) throws Exception {
		try { 
			String sql = "UPDATE empresas SET razaoSocial=?, nomeFantasia=?, CNPJ=?, inscricaoEstadual=?, telefoneEmpresa=?, celularEmpresa=?, emailEmpresa=?, idEndereco=? "
					+ " WHERE idEmpresa=? ";
			ps = conn.prepareStatement(sql);
			ps.setString (1, empresas.getRazaoSocial());
			ps.setString (2, empresas.getNomeFantasia());
			ps.setString (3, empresas.getCnpj());
			ps.setString (4, empresas.getInscricaoEstadual());
			ps.setString (5, empresas.getTelefoneEmpresa());
			ps.setString (6, empresas.getCelularEmpresa());
			ps.setString (7, empresas.getEmailEmpresa());
			ps.setInt (8, empresas.getIdEndereco());
			ps.setInt (9, empresas.getIdEmpresa());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public void Excluir (int idEmpresa) throws Exception {
		try {
			String sql = "DELETE FROM empresas WHERE idEmpresa=? ";
			ps = conn.prepareStatement(sql);
			ps.setInt (1, idEmpresa);
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public Empresas Consultar_PorID (int idEmpresa) throws Exception {
		try {
			ps = conn.prepareStatement ("SELECT * FROM empresas "
					+ " WHERE idEmpresas=?"); 
			ps.setInt (1, idEmpresa);
			rs= ps.executeQuery();
			if(rs.next()) {
				int idEmpresa2 = rs.getInt ("idEmpresa");
				String razaoSocial = rs.getString ("razaoSocial");
				String nomeFantasia = rs.getString ("nomeFantasia");
				String cnpj = rs.getString ("CNPJ");
				String inscricaoEstadual = rs.getString ("inscricaoEstadual");
				String telefoneEmpresa = rs.getString ("telefoneEmpresa");
				String celularEmpresa = rs.getString ("celularEmpresa");
				String emailEmpresa = rs.getString ("emailEmpresa");
				int idEndereco = rs.getInt ("idEndereco");
				empresas = new Empresas (idEmpresa2, razaoSocial, nomeFantasia, cnpj, inscricaoEstadual, telefoneEmpresa, celularEmpresa, emailEmpresa, idEndereco);
			}
				return empresas;
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public Empresas Consultar_PorNome (String razaoSocial) throws Exception {
		try {
			ps = conn.prepareStatement ("SELECT * FROM clientes "
					+ " WHERE razaoSocial=?"); 
			ps.setString (1, razaoSocial);
			rs= ps.executeQuery();
			if(rs.next()) {
				int idEmpresa = rs.getInt ("idEmpresa");
				String razaoSocial2 = rs.getString ("razaoSocial");
				String nomeFantasia = rs.getString ("nomeFantasia");
				String cnpj = rs.getString ("CNPJ");
				String inscricaoEstadual = rs.getString ("inscricaoEstadual");
				String telefoneEmpresa = rs.getString ("telefoneEmpresa");
				String celularEmpresa = rs.getString ("celularEmpresa");
				String emailEmpresa = rs.getString ("emailEmpresa");
				int idEndereco = rs.getInt ("idEndereco");
				empresas = new Empresas (idEmpresa, razaoSocial2, nomeFantasia, cnpj, inscricaoEstadual, telefoneEmpresa, celularEmpresa, emailEmpresa, idEndereco);
			}
				return empresas;
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public List ListarTodos() throws Exception {
		List<Empresas> lista = new ArrayList<Empresas>();
		try {
			ps = conn.prepareStatement ("SELECT * FROM empresas");
			rs = ps.executeQuery();
			while (rs.next()) {
				int idEmpresa = rs.getInt ("idEmpresa");
				String razaoSocial = rs.getString ("razaoSocial");
				String nomeFantasia = rs.getString ("nomeFantasia");
				String cnpj = rs.getString ("CNPJ");
				String inscricaoEstadual = rs.getString ("inscricaoEstadual");
				String telefoneEmpresa = rs.getString ("telefoneEmpresa");
				String celularEmpresa = rs.getString ("celularEmpresa");
				String emailEmpresa = rs.getString ("emailEmpresa");
				int idEndereco = rs.getInt ("idEndereco");
				empresas = new Empresas (idEmpresa, razaoSocial, nomeFantasia, cnpj, inscricaoEstadual, telefoneEmpresa, celularEmpresa, emailEmpresa, idEndereco);
				lista.add(empresas);
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
