package funcaoCrud;
// main (fun��o principal do crud)
public class StartCrud {

	public static void main(String[] args) {
        // objeto para instanciar:(chamar) o Banco de dados  
		BancoDeDados carregaBanco = new BancoDeDados();
    		carregaBanco.conectar(); // chamada do m�todo que verifica��o da conex�o com o Banco
    		if(carregaBanco.estaConectado()) { //la�o que execulta a verifica��o se esta conectado 
    			//exibe (1) e chama as fun��es de oper��o no banco, sena�o exibe (2) 
    			carregaBanco.conectar();// chamada da conex�o com o banco
    			System.out.println("Conex�o com o banco feita com �xito"); //(1)
    		}else {
    			System.out.println("N�o foi poss�vel conectar ao Banco");//(2)      
    			}
    		}
    		

	}


