package funcaoCrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class BancoDeDados {
private Connection conection = null;
private java.sql.Statement statement = null;
private ResultSet resultset =null;
//passagem de parametros p/ conectar o servidor
	public void conectar() {
		//Crianção das 4 variáveis de controle
		String servidor = "jdbc:mysql://localhost/b3";
		String usuario = "root";
		String senha = "mysql";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		//Chamando o processo para tratar a exceção no Banco de Dados
		
		try {
			Class.forName(driver);
			this.conection=DriverManager.getConnection(servidor,usuario,senha);
			this.statement=this.conection.createStatement();
		}catch(Exception e) {
			System.out.println("Erro: "+e.getMessage());
			//System.err.println();
		}
	}
	public boolean estaConectado() { //verificação se o banco 
		if(this.conection!=null) {
			return true;
		}else {
			return false;
			
		}
	}


// a inclusão dos metodos começa a a partir daqui
}
