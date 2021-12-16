package br.com.exemplo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.exemplo.model.Extrato;
import br.com.exemplo.until.ConnectionFactory;

public class ExtratoDAO {
	private Extrato extrato;
	private Connection conn; 
	private PreparedStatement ps;
	private ResultSet rs;
	
	public ExtratoDAO() throws Exception {
		try {
			this.conn = ConnectionFactory.getConnection();
		} catch (Exception erro) {
			throw new Exception ("Erro: " + erro.getMessage());
		}
	}
	public void Salvar (Extrato extrato) throws Exception {
		try {
			String sql = "INSERT INTO extrato (dataTransacao, tipo, descricao, valor, saldoData, idCliente ) "
					+ " values (?, ?, ?, ?, ?, ? )";
			ps = conn.prepareStatement(sql);
			ps.setString (1, extrato.getDataTransacao());
			ps.setString (2, extrato.getTipo());
			ps.setString (3, extrato.getDescricao());
			ps.setDouble (4, extrato.getValor());
			ps.setDouble (5, extrato.getSaldoData());
			ps.setInt (6, extrato.getIdCliente());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public void Alterar (Extrato extrato) throws Exception {
		try { 
			String sql = "UPDATE extrato SET dataTransacao=?, tipo=?, descricao=?, valor=?, saldoData=?, idCliente=? "
					+ " WHERE idExtrato=? ";
			ps = conn.prepareStatement(sql);
			ps.setString (1, extrato.getDataTransacao());
			ps.setString (2, extrato.getTipo());
			ps.setString (3, extrato.getDescricao());
			ps.setDouble (4, extrato.getValor());
			ps.setDouble (5, extrato.getSaldoData());
			ps.setInt (6, extrato.getIdCliente());
			ps.setInt (7, extrato.getIdExtrato());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public void Excluir (int idExtrato) throws Exception {
		try {
			String sql = "DELETE FROM extrato WHERE idExtrato=? ";
			ps = conn.prepareStatement(sql);
			ps.setInt (1, idExtrato);
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public Extrato Consultar_PorData (String dataMinima, String dataMaxima) throws Exception {
		try {
			ps = conn.prepareStatement ("SELECT *, DATE_FORMAT(dataTransacao, '%d/%m/%Y') AS dataTransacaoFormatada FROM extrato "
					+ " WHERE dataTransacao BETWEEN ? AND ? "); 
			ps.setString (1, dataMinima);
			ps.setString (2, dataMaxima);
			rs= ps.executeQuery();
			if(rs.next()) {
				int idExtrato = rs.getInt ("idExtrato");
				String dataTransacao = rs.getString ("dataTransacaoFormatada");
				String tipo = rs.getString ("tipo");
				String descricao = rs.getString ("descricao");
				Double valor = rs.getDouble ("valor");
				Double saldoData = rs.getDouble ("SaldoData");
				int idCliente = rs.getInt ("idCliente");
				extrato = new Extrato (idExtrato, dataTransacao, tipo, descricao, valor, saldoData, idCliente);
			}
				return extrato;
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public Extrato Consultar_PorIdCliente (int idCliente) throws Exception {
		try {
			ps = conn.prepareStatement ("SELECT *, DATE_FORMAT(dataTransacao, '%d/%m/%Y') AS dataTransacaoFormatada FROM extrato "
					+ " WHERE idCliente=? "); 
			ps.setInt (1, idCliente);
			rs= ps.executeQuery();
			if(rs.next()) {
				int idExtrato = rs.getInt ("idExtrato");
				String dataTransacao = rs.getString ("dataTransacaoFormatada");
				String tipo = rs.getString ("tipo");
				String descricao = rs.getString ("descricao");
				Double valor = rs.getDouble ("valor");
				Double saldoData = rs.getDouble ("SaldoData");
				int idCliente2 = rs.getInt ("idCliente");
				extrato = new Extrato (idExtrato, dataTransacao, tipo, descricao, valor, saldoData, idCliente2);
			}
				return extrato;
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public List ListarTodos() throws Exception {
		List<Extrato> lista = new ArrayList<Extrato>();
		try {
			ps = conn.prepareStatement ("SELECT * FROM extrato");
			rs = ps.executeQuery();
			while (rs.next()) {
				int idExtrato = rs.getInt ("idExtrato");
				String dataTransacao = rs.getString ("dataTransacao");
				String tipo = rs.getString ("tipo");
				String descricao = rs.getString ("descricao");
				Double valor = rs.getDouble ("valor");
				Double saldoData = rs.getDouble ("saldoData");
				int idCliente = rs.getInt ("idCliente");
				extrato = new Extrato (idExtrato, dataTransacao, tipo, descricao, valor, saldoData, idCliente);
				lista.add(extrato);
			}
			return lista;
		}catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
}
