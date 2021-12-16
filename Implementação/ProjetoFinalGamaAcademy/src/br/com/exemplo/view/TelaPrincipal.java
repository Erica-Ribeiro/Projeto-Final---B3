package br.com.exemplo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.exemplo.dao.FuncionarioDAO;
import br.com.exemplo.dao.LoginFuncionarioDAO;
import br.com.exemplo.model.Funcionario;
import br.com.exemplo.model.LoginFuncionario;

import java.awt.Toolkit;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JSeparator separator;
	private JMenuItem mntmNewMenuItem_2;
	private JLabel lblNewLabel;
	private JLabel lblPorFavorEscolha;
	private JSeparator separator_1;
	private JButton btnSair;
	private JLabel lblNewLabel_1;
	private JTextField txtLogin;
	private JLabel lblNewLabel_2;
	private JPasswordField txtSenha;
	private JButton btnEntrar;
	private JLabel lblValidarSenha;
	private JLabel lblValidarLogin;
	private JLabel lblValidar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
					frame.setResizable(false);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private boolean ValidarCampos() {
		boolean camposValidos = false;
		try {
			
			//Validando Login
			if (txtLogin.getText().isBlank() || txtLogin.getText().isEmpty()) {
				lblValidarLogin.setVisible(true);
			}
			else {
				lblValidarLogin.setVisible(false);
			}
			
			//Validando Senha
			if (txtSenha.getPassword().length == 0) {
				lblValidarSenha.setVisible(true);
			}
			else {
				lblValidarSenha.setVisible(false);
			}
			
			//Validando Validações
			if (lblValidarLogin.isVisible() || lblValidarSenha.isVisible()) {
				lblValidar.setVisible(true);
			}
			else {
				lblValidar.setVisible(false);
				camposValidos = true;
			}
					
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao validar. Erro: " + e.getMessage());
		}
		return camposValidos;
	}
	
	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaPrincipal.class.getResource("/br/com/exemplo/view/images/dolar.png")));
		setTitle("Sistema do Banco SolutionTech");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 332, 336);
		this.setLocationRelativeTo(null);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Informa\u00E7\u00F5es");
		mnNewMenu.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/br/com/exemplo/view/images/info30.png")));
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("Tela Principal");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options = {"OK"};
				ImageIcon icon = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/information.png")));
				JOptionPane.showOptionDialog(null, "=========================================Tela Principal========================================="
						+ "\n Nesta Tela Você Poderá: "
						+ "\n\n 1. Fazer login para prosseguir"
						+ "\n\n 2. Você também pode ver a versão do sistema no menu Ajuda -> Sobre o Sistema"
						+ "\n\n 3. Se caso queira sair temos 3 opções:"
						+ "\n     * Botão sair na tela principal"
						+ "\n     * Opção no menu Ajuda -> Sair"
						+ "\n     * Apertando a tecla de atalho: Alt + F4"
						+ "\n=============================================================================================", "Informações da Tela Principal", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		mnNewMenu_1 = new JMenu("Ajuda");
		mnNewMenu_1.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/br/com/exemplo/view/images/help30.png")));
		menuBar.add(mnNewMenu_1);
		
		mntmNewMenuItem_1 = new JMenuItem("Sobre o Sistema");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String osName = System.getProperty("os.name");
				String osVersion = System.getProperty("os.version");
				String javaI = System.getProperty("java.version");
				String javaRE = System.getProperty("java.runtime.version");
				Object[] options = {"OK"};
				ImageIcon icon = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/information.png")));
				JOptionPane.showOptionDialog(null, "====================Sobre o Sistema===================="
						+ "\n Instalado: " + osName + " e Versão: " + osVersion
						+ "\n Versão do Java: " + javaI + " e Versão da Runtime: " + javaRE
						+ "\n=====================================================", "Informações do Sistema", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		separator = new JSeparator();
		mnNewMenu_1.add(separator);
		
		mntmNewMenuItem_2 = new JMenuItem("Sair");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mntmNewMenuItem_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
		mnNewMenu_1.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 255), new Color(64, 64, 64), Color.DARK_GRAY, new Color(0, 0, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Seja Bem Vindo(a) a Tela Principal");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 296, 23);
		contentPane.add(lblNewLabel);
		
		lblPorFavorEscolha = new JLabel("Por favor fa\u00E7a seu login para prosseguir");
		lblPorFavorEscolha.setForeground(Color.BLACK);
		lblPorFavorEscolha.setHorizontalAlignment(SwingConstants.CENTER);
		lblPorFavorEscolha.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblPorFavorEscolha.setBounds(10, 45, 296, 23);
		contentPane.add(lblPorFavorEscolha);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(0, 187, 316, 2);
		contentPane.add(separator_1);
		
		btnSair = new JButton("");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/br/com/exemplo/view/images/exit.png")));
		btnSair.setBounds(134, 201, 48, 49);
		contentPane.add(btnSair);
		
		lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 89, 46, 23);
		contentPane.add(lblNewLabel_1);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(66, 91, 143, 20);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Senha");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 123, 46, 23);
		contentPane.add(lblNewLabel_2);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(66, 125, 143, 20);
		contentPane.add(txtSenha);
		
		btnEntrar = new JButton("");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(ValidarCampos() == true) {
						int codFuncionario = Integer.parseInt(txtLogin.getText());
						String senhaString = String.valueOf(txtSenha.getPassword());
						
						int senha = Integer.parseInt(senhaString);
						
						LoginFuncionario loginFuncionario = new LoginFuncionario();
						LoginFuncionarioDAO loginFuncionarioDAO = new LoginFuncionarioDAO();
						loginFuncionario = loginFuncionarioDAO.Login(codFuncionario, senha);
						 
						if (codFuncionario == loginFuncionario.getCodFuncionario() && senha == loginFuncionario.getSenha()) {
							Funcionario funcionario = new Funcionario();
							FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
							funcionario = funcionarioDAO.Consultar_PorCodFuncionario(codFuncionario);
							String nome = funcionario.getNomeFuncionario();
							
							Object[] options = {"OK"};
							ImageIcon icon = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/gender-neutral-user--v1.png")));
							JOptionPane.showOptionDialog(null, "Seja Bem Vindo(a): " + nome, "Login", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);
							TelaPessoaFisica telaPessoaFisica = new TelaPessoaFisica();			
							telaPessoaFisica.setVisible (true);
							
							TelaPrincipal telaPrincipal = new TelaPrincipal();
							telaPrincipal.setVisible(false);
							telaPrincipal.dispose();
						}
						else {
							Object[] options = {"OK"};
							ImageIcon icon = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/comments.png")));
							JOptionPane.showOptionDialog(null, "Funcionário não cadastrado!", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);
						}
					}
				} catch (Exception e1) {
					Object[] options = {"OK"};
					ImageIcon icon = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/error.png")));
					JOptionPane.showOptionDialog(null, "Erro ao Fazer o Login!. "
							+ "\n\n1. Verifique se todos os campos foram preenchidos"
							+ "\n2. Caso estejam preenchidos, verifique se você realizou seu cadastro"
							+ "\n3. Caso realizado, verifique se os dados foram digitados corretamente."
							+ "\n\nErro: " + e1, "Erro", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);
				}
			}
		});
		btnEntrar.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/br/com/exemplo/view/images/enter-2.png")));
		btnEntrar.setBounds(236, 89, 48, 49);
		contentPane.add(btnEntrar);
		
		lblValidarSenha = new JLabel("*");
		lblValidarSenha.setVisible(false);
		lblValidarSenha.setForeground(Color.RED);
		lblValidarSenha.setFont(new Font("Arial", Font.BOLD, 14));
		lblValidarSenha.setBounds(55, 121, 46, 23);
		contentPane.add(lblValidarSenha);
		
		lblValidarLogin = new JLabel("*");
		lblValidarLogin.setVisible(false);
		lblValidarLogin.setForeground(Color.RED);
		lblValidarLogin.setFont(new Font("Arial", Font.BOLD, 14));
		lblValidarLogin.setBounds(49, 87, 46, 23);
		contentPane.add(lblValidarLogin);
		
		lblValidar = new JLabel("* Preenchimento Obrigat\u00F3rio");
		lblValidar.setVisible(false);
		lblValidar.setForeground(Color.RED);
		lblValidar.setFont(new Font("Arial", Font.BOLD, 14));
		lblValidar.setBounds(10, 157, 220, 23);
		contentPane.add(lblValidar);
	}
}