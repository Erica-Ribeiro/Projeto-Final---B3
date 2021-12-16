package br.com.exemplo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.exemplo.model.EnderecoEmpresa;
import br.com.exemplo.until.ConnectionFactory;

public class EnderecoEmpresaDAO {
	private EnderecoEmpresa enderecoEmpresa;
	private Connection conn; 
	private PreparedStatement ps;
	private ResultSet rs;
	
	public EnderecoEmpresaDAO() throws Exception {
		try {
			this.conn = ConnectionFactory.getConnection();
		} catch (Exception erro) {
			throw new Exception ("Erro: " + erro.getMessage());
		}
	}
	public void Salvar (EnderecoEmpresa enderecoEmpresa) throws Exception {
		try {
			String sql = "INSERT INTO enderecoEmpresa (endereco, numero, bairro, cidade, estado ) "
					+ " values (?, ?, ?, ?, ? )";
			ps = conn.prepareStatement(sql);
			ps.setString (1, enderecoEmpresa.getEndereco());
			ps.setInt (2, enderecoEmpresa.getNumero());
			ps.setString (3, enderecoEmpresa.getBairro());
			ps.setString (4, enderecoEmpresa.getCidade());
			ps.setString (5, enderecoEmpresa.getEstado());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public void Alterar (EnderecoEmpresa enderecoEmpresa) throws Exception {
		try { 
			String sql = "UPDATE enderecoEmpresa SET endereco=?, numero=?, bairro=?, cidade=?, estado=? "
					+ " WHERE idEndereco=? ";
			ps = conn.prepareStatement(sql);
			ps.setString (1, enderecoEmpresa.getEndereco());
			ps.setInt (2, enderecoEmpresa.getNumero());
			ps.setString (3, enderecoEmpresa.getBairro());
			ps.setString (4, enderecoEmpresa.getCidade());
			ps.setString (5, enderecoEmpresa.getEstado());
			ps.setInt (6, enderecoEmpresa.getIdEndereco());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public void Excluir (int idEndereco) throws Exception {
		try {
			String sql = "DELETE FROM enderecoEmpresa WHERE idEndereco=? ";
			ps = conn.prepareStatement(sql);
			ps.setInt (1, idEndereco);
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public EnderecoEmpresa Consultar_PorID (int idEndereco) throws Exception {
		try {
			ps = conn.prepareStatement ("SELECT * FROM enderecoEmpresa "
					+ " WHERE idEndereco=?"); 
			ps.setInt (1, idEndereco);
			rs= ps.executeQuery();
			if(rs.next()) {
				int idEndereco2 = rs.getInt ("idEndereco");
				String endereco = rs.getString ("endereco");
				int numero = rs.getInt ("numero");
				String bairro = rs.getString ("bairro");
				String cidade = rs.getString ("cidade");
				String estado = rs.getString ("estado");
				enderecoEmpresa = new EnderecoEmpresa (idEndereco2, endereco, numero, bairro, cidade, estado );
			}
				return enderecoEmpresa;
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
//	public Empresas Consultar_PorNome (String razaoSocial) throws Exception {
//		try {
//			ps = conn.prepareStatement ("SELECT * FROM clientes "
//					+ " WHERE razaoSocial=?"); 
//			ps.setString (1, razaoSocial);
//			rs= ps.executeQuery();
//			if(rs.next()) {
//				int idEmpresa = rs.getInt ("idEmpresa");
//				String razaoSocial2 = rs.getString ("razaoSocial");
//				String nomeFantasia = rs.getString ("nomeFantasia");
//				String cnpj = rs.getString ("CNPJ");
//				String inscricaoEstadual = rs.getString ("inscricaoEstadual");
//				String telefoneEmpresa = rs.getString ("telefoneEmpresa");
//				String celularEmpresa = rs.getString ("celularEmpresa");
//				String emailEmpresa = rs.getString ("emailEmpresa");
//				int idEndereco = rs.getInt ("idEndereco");
//				empresas = new Empresas (idEmpresa, razaoSocial2, nomeFantasia, cnpj, inscricaoEstadual, telefoneEmpresa, celularEmpresa, emailEmpresa, idEndereco);
//			}
//				return empresas;
//		} catch (Exception e) {
//			throw new Exception (e.getMessage());
//		}
//	}
	public List ListarTodos() throws Exception {
		List<EnderecoEmpresa> lista = new ArrayList<EnderecoEmpresa>();
		try {
			ps = conn.prepareStatement ("SELECT * FROM enderecoEmpresa");
			rs = ps.executeQuery();
			while (rs.next()) {
				int idEndereco = rs.getInt ("idEndereco");
				String endereco = rs.getString ("endereco");
				int numero = rs.getInt ("numero");
				String bairro = rs.getString ("bairro");
				String cidade = rs.getString ("cidade");
				String estado = rs.getString ("estado");
				enderecoEmpresa = new EnderecoEmpresa (idEndereco, endereco, numero, bairro, cidade, estado);
				lista.add(enderecoEmpresa);
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
