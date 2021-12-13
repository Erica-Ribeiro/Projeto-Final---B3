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
		//Crian��o das 4 vari�veis de controle
		String servidor = "jdbc:mysql://localhost/b3";
		String usuario = "root";
		String senha = "mysql";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		//Chamando o processo para tratar a exce��o no Banco de Dados
		
		try {
			Class.forName(driver);
			this.conection=DriverManager.getConnection(servidor,usuario,senha);
			this.statement=this.conection.createStatement();
		}catch(Exception e) {
			System.out.println("Erro: "+e.getMessage());
			//System.err.println();
		}
	}
	public boolean estaConectado() {
		if(this.conection!=null) {
			return true;
		}else {
			return false;
			
		}
	}


// a inclus�o dos metodo come�a a a partir daqui
}
