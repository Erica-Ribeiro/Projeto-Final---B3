package funcaoCrud;
// main (função principal do crud)
public class StartCrud {

	public static void main(String[] args) {
        // objeto para instanciar:(chamar) o Banco de dados  
		BancoDeDados carregaBanco = new BancoDeDados();
    		carregaBanco.conectar(); // chamada do método que verificação da conexão com o Banco
    		if(carregaBanco.estaConectado()) { //laço que execulta a verificação se esta conectado 
    			//exibe (1) e chama as funções de operção no banco, senaão exibe (2) 
    			carregaBanco.conectar();// chamada da conexão com o banco
    			System.out.println("Conexão com o banco feita com êxito"); //(1)
    		}else {
    			System.out.println("Não foi possível conectar ao Banco");//(2)      
    			}
    		}
    		

	}


