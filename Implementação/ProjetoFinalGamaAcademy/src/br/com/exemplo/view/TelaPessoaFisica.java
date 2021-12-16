package br.com.exemplo.view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import br.com.exemplo.dao.ChavePixClienteDAO;
import br.com.exemplo.dao.ClientesDAO;
import br.com.exemplo.dao.ContaClienteDAO;
import br.com.exemplo.dao.ContasDAO;
import br.com.exemplo.dao.LoginClienteDAO;
import br.com.exemplo.model.ChavePixCliente;
import br.com.exemplo.model.Clientes;
import br.com.exemplo.model.ContaCliente;
import br.com.exemplo.model.Contas;
import br.com.exemplo.model.LoginCliente;

import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.InputEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.GridBagLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JList;
import javax.swing.JTextArea;

public class TelaPessoaFisica extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabNovoCliente;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JTextField txtNomeCliente;
	private JTextField txtEmailCliente;
	private JFormattedTextField ftfCPFCliente;
	private JFormattedTextField ftfCelularCliente;
	private JComboBox cmbAgencia;
	private JComboBox cmbTipoConta;
	private JButton btnSalvar;
	private JButton btnVoltar;
	private JButton btnSair;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JSeparator separator;
	private JLabel lblValidacaoNome;
	private JLabel lblValidacaoCPF;
	private JLabel lblValidacaoCelular;
	private JLabel lblValidacaoEmail;
	private JLabel lblValidacaoAgencia;
	private JLabel lblValidacaoConta;
	private JLabel lblValidacaoTipoConta;
	private JLabel lblValidacao;
	private JFormattedTextField ftfConta;
	private JTabbedPane tabCliente;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_5;
	private JPanel panel_6;
	private JLabel lblAberturaDeConta;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblValidacaoCPFCliente;
	private JLabel lblValidacaoAgenciaCliente;
	private JLabel lblValidacaoContaCliente;
	private JLabel lblValidacaoTipoContaCliente;
	private JLabel lblValidacaoCliente;
	private JFormattedTextField ftfCPF;
	private JFormattedTextField ftfContaCliente;
	private JComboBox cmbAgenciaCliente;
	private JComboBox cmbTipoContaCliente;
	private JButton btnSalvarCliente;
	private JButton btnVoltarTela;
	private JButton btnSairSistema;
	private JLabel lblAlteraesEConsulta;
	private JLabel lblNewLabel_12;
	private JTextField txtNome;
	private JLabel lblValidarNome;
	private JLabel lblNewLabel_13;
	private JFormattedTextField ftfCpf;
	private JLabel lblValidarCpf;
	private JLabel lblNewLabel_14;
	private JLabel lblValidarCelular;
	private JFormattedTextField ftfCelular;
	private JLabel lblNewLabel_15;
	private JTextField txtEmail;
	private JLabel lblValidarEmail;
	private JLabel lblValidar;
	private JButton btnAlterar;
	private JButton btnExcluir;
	private JButton btnSairTela;
	private JButton btnConsultar;
	private JButton btnVoltarTelaAnterior;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblListarTodasAs;
	private JScrollPane scrollPane_1;
	private JButton btnListarTodos;
	private JButton btnVoltarTelas;
	private JButton btnSairTelas;
	private JTable table_1;
	private JTable table_2;
	private JLabel lblNewLabel_16;
	private JComboBox cmbTipoTransacao;
	private JLabel lblValidarTipoTransacao;
	private JLabel lblNewLabel_18;
	private JTextField txtValor;
	private JLabel lblValidarValor;
	private JLabel lblNewLabel_20;
	private JLabel lblValidarCpfCliente;
	private JFormattedTextField ftfCpfCliente;
	private JLabel lblNewLabel_22;
	private JLabel lblValidarDataTransacao;
	private JLabel lblTransaes;
	private JLabel lblAgenciaDestino;
	private JTextField txtAgenciaDestino;
	private JLabel lblNewLabel_25;
	private JFormattedTextField ftfNumeroContaDestino;
	private JLabel lblNewLabel_26;
	private JFormattedTextField ftfCpfTitularConta;
	private JComboBox cmbTipoPix;
	private JLabel lblNewLabel_27;
	private JFormattedTextField ftfCpfPix;
	private JFormattedTextField ftfCelularPix;
	private JTextField txtAleatoriaPix;
	private JTextField txtEmailPix;
	private JLabel lblValidarAgencia;
	private JLabel lblValidarNumeroConta;
	private JLabel lblValidarCpfTitular;
	private JLabel lblValidarTipoPix;
	private JLabel lblNewLabel_32;
	private JLabel lblValidarPix;
	private JLabel lblValidarObrigatorio;
	private JFormattedTextField ftfDataTransacao;
	private JButton btnSalvarTransacao;
	private JButton btnVoltaTudo;
	private JButton btnSairTudo;
	private JButton btnPDF;
	private JFormattedTextField ftfNumeroContaCliente;
	private JTextField txtAgenciaCliente;
	private JLabel lblAgenciaCliente;
	private JLabel lblNewLabel_17;
	private JLabel lblValidarAgenciaDestino;
	private JLabel lblValidarContaDestino;
	private JLabel lblNewLabel_19;
	private JRadioButton btnSimPix;
	private JRadioButton btnNaoPix;
	private JComboBox cmbTipoPixCadastro;
	private JLabel lblNewLabel_21;
	private JLabel lblNewLabel_23;
	private JFormattedTextField ftfPixCelular;
	private JTextField txtPix;
	private JLabel lblValidarCadastroPix;
	private JLabel lblValidarTipoPixCadastro;
	private JLabel lblValidarPixCadastro;
	private JFormattedTextField ftfPixCpf;
	private JLabel lblNewLabel_24;
	private JRadioButton btnSimPix_1;
	private JRadioButton btnNaoPix_1;
	private JLabel lblNewLabel_28;
	private JComboBox cmbTipoPixCadastro_1;
	private JLabel lblNewLabel_29;
	private JFormattedTextField ftfPixCelular_1;
	private JLabel lblValidarTipoPixCliente;
	private JLabel lblValidarPixCliente;
	private JLabel lblValidarCadastroPixCliente;
	private JFormattedTextField ftfPixCpf_1;
	private JTextField txtPix_1;
	private JScrollPane scrollPane_2;
	private JTable table_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPessoaFisica frame = new TelaPessoaFisica();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void formatarCampo() {
		try {
			MaskFormatter formatarCelular = new MaskFormatter ("(##) #####-####");
			formatarCelular.install(ftfCelularCliente);
			MaskFormatter formatarCelularCliente = new MaskFormatter ("(##) #####-####");
			formatarCelularCliente.install(ftfCelular);
			MaskFormatter formatarCPF = new MaskFormatter ("###.###.###-##");
			formatarCPF.install(ftfCPFCliente);
			MaskFormatter formatarCPFCliente = new MaskFormatter ("###.###.###-##");
			formatarCPFCliente.install(ftfCPF);
			MaskFormatter formatarCpf = new MaskFormatter ("###.###.###-##");
			formatarCpf.install(ftfCpf);
			MaskFormatter formatarConta = new MaskFormatter ("#####-#");
			formatarConta.install(ftfConta);
			MaskFormatter formatarContaCliente = new MaskFormatter ("#####-#");
			formatarContaCliente.install(ftfContaCliente);
			MaskFormatter formatarCpfCliente = new MaskFormatter ("###.###.###-##");
			formatarCpfCliente.install(ftfCpfCliente);
			MaskFormatter formatarDataTransacao = new MaskFormatter ("##/##/####");
			formatarDataTransacao.install(ftfDataTransacao);
			MaskFormatter formatarNumeroConta = new MaskFormatter ("#####-#");
			formatarNumeroConta.install(ftfNumeroContaDestino);
			MaskFormatter formatarCpfTitular = new MaskFormatter ("###.###.###-##");
			formatarCpfTitular.install(ftfCpfTitularConta);
			MaskFormatter formatarCpfPix = new MaskFormatter ("###.###.###-##");
			formatarCpfPix.install(ftfCpfPix);
			MaskFormatter formatarCelularPix = new MaskFormatter ("(##) #####-####");
			formatarCelularPix.install(ftfCelularPix);
			MaskFormatter formatarPixCpf = new MaskFormatter ("###.###.###-##");
			formatarPixCpf.install(ftfPixCpf);
			MaskFormatter formatarPixCelular = new MaskFormatter ("(##) #####-####");
			formatarPixCelular.install(ftfPixCelular);
			MaskFormatter formatarNumeroContaCliente = new MaskFormatter ("#####-#");
			formatarNumeroContaCliente.install(ftfNumeroContaCliente);
			MaskFormatter formatarPixCpf2 = new MaskFormatter ("###.###.###-##");
			formatarPixCpf2.install(ftfPixCpf_1);
			MaskFormatter formatarPixCelular2 = new MaskFormatter ("(##) #####-####");
			formatarPixCelular2.install(ftfPixCelular_1);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao formatar o campo: Erro: " + e.getMessage());
		}
	}
	
	private boolean ValidarCampos() {
		boolean camposValidos = false;
		try {
			//Validando Nome
			if (txtNomeCliente.getText().isBlank() || txtNomeCliente.getText().isEmpty()) {
				lblValidacaoNome.setVisible(true);
			}
			else {
				lblValidacaoNome.setVisible(false);
			}
			
			//Validando CPF
			if (ftfCPFCliente.getText().trim().length() == 14) {
				lblValidacaoCPF.setVisible(false);
			}
			else {
				lblValidacaoCPF.setVisible(true);
			}
			
			//Validando Email
			if (txtEmailCliente.getText().isBlank() || txtEmailCliente.getText().isEmpty()) {
				lblValidacaoEmail.setVisible(true);
			}
			else {
				lblValidacaoEmail.setVisible(false);
			}
			
			//Validando Celular
			if (ftfCelularCliente.getText().trim().length() == 15) {
				lblValidacaoCelular.setVisible(false);
			}
			else {
				lblValidacaoCelular.setVisible(true);
			}
			
			//Validando Agencia
			if(cmbAgencia.getSelectedIndex() != 0) {
				lblValidacaoAgencia.setVisible(true);
			}
			else {
				lblValidacaoAgencia.setVisible(false);
			}
			
			//Validando Conta
			if(ftfConta.getText().trim().length() == 7) {
				lblValidacaoConta.setVisible(false);
			}
			else {
				lblValidacaoConta.setVisible(true);
			}
			
			//Validado Tipo Conta
			if (cmbTipoConta.getSelectedIndex() != 0) {
				lblValidacaoTipoConta.setVisible(false);
			}
			else {
				lblValidacaoTipoConta.setVisible(true);
			}
			
			if(btnSimPix.isSelected()) {
				lblValidarCadastroPix.setVisible(false);
				//Validando Tipo Pix
				if(cmbTipoPixCadastro.getSelectedIndex() == 0) {
					lblValidarTipoPixCadastro.setVisible(true);
				}
				else {
					lblValidarTipoPixCadastro.setVisible(false);
				}
				System.out.println(ftfPixCpf.getText().trim().length());
				
				//Validando Pix
				if (cmbTipoPixCadastro.getSelectedIndex() == 1) {
					if(ftfPixCpf.getText().trim().length() == 14) {
						lblValidarPixCadastro.setVisible(false);
					}
					else {
						lblValidarPixCadastro.setVisible(true);
					}
				}
				else if (cmbTipoPixCadastro.getSelectedIndex() == 2) {
					if(ftfPixCelular.getText().trim().length() == 15) {
						lblValidarPixCadastro.setVisible(false);
					}
					else {
						lblValidarPixCadastro.setVisible(true);
					}
				}
				else if (cmbTipoPixCadastro.getSelectedIndex() == 3 || cmbTipoPixCadastro.getSelectedIndex() == 4) {
					if(txtPix.getText().isBlank() || txtPix.getText().isEmpty()) {
						lblValidarPixCadastro.setVisible(true);
					}
					else {
						lblValidarPixCadastro.setVisible(false);
					}
				}
			}
			else if(btnNaoPix.isSelected()) {
				lblValidarCadastroPix.setVisible(false);
				lblValidarTipoPixCadastro.setVisible(false);
				lblValidarPixCadastro.setVisible(false);
			}
			else {
				lblValidarCadastroPix.setVisible(true);
			}
		
			//Validando Validações
			if (lblValidacaoNome.isVisible() || lblValidacaoCPF.isVisible() || lblValidacaoEmail.isVisible() || lblValidacaoCelular.isVisible() || lblValidacaoAgencia.isVisible() || lblValidacaoConta.isVisible() || lblValidacaoTipoConta.isVisible() || lblValidarCadastroPix.isVisible() || lblValidarTipoPixCadastro.isVisible() || lblValidarPixCadastro.isVisible()) {
				lblValidacao.setVisible(true);
			}
			else {
				lblValidacao.setVisible(false);
				camposValidos = true;
			}
					
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao validar. Erro: " + e.getMessage());
		}
		return camposValidos;
	}
	
	private boolean ValidarCamposTransacoes() {
		boolean camposValidos = false;
		String tipoTransacao = cmbTipoTransacao.getSelectedItem().toString();
		try {
			//Validando Tipo Transacao
			if (cmbTipoTransacao.getSelectedIndex() == 0) {
				lblValidarTipoTransacao.setVisible(true);
			}
			else {
				lblValidarTipoTransacao.setVisible(false);
			}
			
			//Validando Valor
			if (txtValor.getText().isBlank() || txtValor.getText().isEmpty()) {
				lblValidarValor.setVisible(true);
			}
			else {
				lblValidarValor.setVisible(false);
			}
			
			//Validando CPF Cliente
			if (ftfCpfCliente.getText().trim().length() == 14) {
				lblValidarCpfCliente.setVisible(false);
			}
			else {
				lblValidarCpfCliente.setVisible(true);
			}
			
			//Validando Data Transação
			if (ftfDataTransacao.getText().trim().length() == 10) {
				lblValidarDataTransacao.setVisible(false);
			}
			else {
				lblValidarDataTransacao.setVisible(true);
			}
			
			//Validando Agencia Cliente
			if (txtAgenciaCliente.getText().isBlank() || txtAgenciaCliente.getText().isEmpty()) {
				lblValidarAgencia.setVisible(true);
			}
			else {
				lblValidarAgencia.setVisible(false);
			}
			
			//Validando Conta Cliente
			if(ftfNumeroContaCliente.getText().trim().length() == 7) {
				lblValidarNumeroConta.setVisible(false);
			}
			else {
				lblValidarNumeroConta.setVisible(true);
			}
			
			if (tipoTransacao.equals("Transferência")) {
				//Validando Agencia Destino
				if (txtAgenciaDestino.getText().isBlank() || txtAgenciaDestino.getText().isEmpty()) {
					lblValidarAgenciaDestino.setVisible(true);
				}
				else {
					lblValidarAgenciaDestino.setVisible(false);
				}
				
				//Validando Numero Conta
				if (ftfNumeroContaDestino.getText().trim().length() == 7) {
					lblValidarContaDestino.setVisible(false);
				}
				else {
					lblValidarContaDestino.setVisible(true);
				}
				
				//Validando CPF Titular
				if (ftfCpfTitularConta.getText().trim().length() == 14) {
					lblValidarCpfTitular.setVisible(false);
				}
				else {
					lblValidarCpfTitular.setVisible(true);
				}
			}
//			else if (tipoTransacao.equals("PIX")) {
//				lblValidarAgencia.setVisible(false);
//				lblValidarNumeroConta.setVisible(false);
//				lblValidarCpfTitular.setVisible(false);
//				
//				//Validando Tipo Pix
//				if (cmbTipoPix.getSelectedIndex() == 0) {
//					lblValidarTipoPix.setVisible(true);
//				}
//				else {
//					lblValidarTipoPix.setVisible(false);
//				}
//				
//				//Validando Pix
//				if (ftfCpfPix.getText().trim().length() != 14 || ftfCelularPix.getText().trim().length() != 15 || txtEmailPix.getText().isBlank() || txtEmailPix.getText().isEmpty() || txtAleatoriaPix.getText().isBlank() || txtAleatoriaPix.getText().isEmpty()) {
//					lblValidarPix.setVisible(true);
//				}
//				else {
//					lblValidarPix.setVisible(false);
//				}
//			}
		
			//Validando Validações
			if (lblValidarTipoTransacao.isVisible() || lblValidarValor.isVisible() || lblValidarCpfCliente.isVisible() || lblValidarDataTransacao.isVisible() || lblValidarAgencia.isVisible() || lblValidarNumeroConta.isVisible() || lblValidarCpfTitular.isVisible() || lblValidarTipoPix.isVisible() || lblValidarPix.isVisible()) {
				lblValidarObrigatorio.setVisible(true);
			}
			else {
				lblValidarObrigatorio.setVisible(false);
				camposValidos = true;
			}
					
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao validar. Erro: " + e.getMessage());
		}
		return camposValidos;
	}
	
	private boolean ValidarCamposClientes() {
		boolean camposValidos = false;
		try {
			
			//Validando CPF
			if (ftfCPF.getText().trim().length() == 14) {
				lblValidacaoCPFCliente.setVisible(false);
			}
			else {
				lblValidacaoCPFCliente.setVisible(true);
			}
			
			//Validando Agencia
			if(cmbAgenciaCliente.getSelectedIndex() != 0) {
				lblValidacaoAgenciaCliente.setVisible(true);
			}
			else {
				lblValidacaoAgenciaCliente.setVisible(false);
			}
			
			//Validando Conta
			if(ftfContaCliente.getText().trim().length() == 7) {
				lblValidacaoContaCliente.setVisible(false);
			}
			else {
				lblValidacaoContaCliente.setVisible(true);
			}
			
			//Validado Tipo Conta
			if (cmbTipoContaCliente.getSelectedIndex() != 0) {
				lblValidacaoTipoContaCliente.setVisible(false);
			}
			else {
				lblValidacaoTipoContaCliente.setVisible(true);
			}
			
//			if(btnSimPix_1.isSelected()) {
//				lblValidarCadastroPixCliente.setVisible(false);
//				//Validando Tipo Pix
//				if(cmbTipoPixCadastro_1.getSelectedIndex() == 0) {
//					lblValidarTipoPixCliente.setVisible(true);
//				}
//				else {
//					lblValidarTipoPixCliente.setVisible(false);
//				}
//				
//				//Validando Pix
//				if (cmbTipoPixCadastro_1.getSelectedIndex() == 1) {
//					if(ftfPixCpf_1.getText().trim().length() == 14) {
//						lblValidarPixCliente.setVisible(false);
//					}
//					else {
//						lblValidarPixCliente.setVisible(true);
//					}
//				}
//				else if (cmbTipoPixCadastro_1.getSelectedIndex() == 2) {
//					if(ftfPixCelular_1.getText().trim().length() == 15) {
//						lblValidarPixCliente.setVisible(false);
//					}
//					else {
//						lblValidarPixCliente.setVisible(true);
//					}
//				}
//				else if (cmbTipoPixCadastro_1.getSelectedIndex() == 3 || cmbTipoPixCadastro_1.getSelectedIndex() == 4) {
//					if(txtPix_1.getText().isBlank() || txtPix_1.getText().isEmpty()) {
//						lblValidarPixCliente.setVisible(true);
//					}
//					else {
//						lblValidarPixCliente.setVisible(false);
//					}
//				}
//			}
//			else if(btnNaoPix.isSelected()) {
//				lblValidarCadastroPixCliente.setVisible(false);
//				lblValidarTipoPixCliente.setVisible(false);
//				lblValidarPixCliente.setVisible(false);
//			}
//			else {
//				lblValidarCadastroPixCliente.setVisible(true);
//			}
		
			//Validando Validações
			if (lblValidacaoCPFCliente.isVisible() || lblValidacaoAgenciaCliente.isVisible() || lblValidacaoContaCliente.isVisible() || lblValidacaoTipoContaCliente.isVisible()) {
				lblValidacaoCliente.setVisible(true);
			}
			else {
				lblValidacaoCliente.setVisible(false);
				camposValidos = true;
			}
					
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao validar. Erro: " + e.getMessage());
		}
		return camposValidos;
	}

	private boolean ValidarCamposCli() {
		boolean camposValidos = false;
		try {
			
			//Validando CPF
			if (ftfCpf.getText().trim().length() == 14) {
				lblValidarCpf.setVisible(false);
			}
			else {
				lblValidarCpf.setVisible(true);
			}
			
			//Validando Validações
			if (lblValidarCpf.isVisible()) {
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
	public TelaPessoaFisica() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaPessoaFisica.class.getResource("/br/com/exemplo/view/images/dolar.png")));
		setTitle("Sistema do Banco SolutionTech");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 542);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Informa\u00E7\u00F5es");
		mnNewMenu.setIcon(new ImageIcon(TelaPessoaFisica.class.getResource("/br/com/exemplo/view/images/info30.png")));
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("Tela Pessoa F\u00EDsica");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options = {"OK"};
				ImageIcon icon = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/information.png")));
				JOptionPane.showOptionDialog(null, "=========================================Tela Pessoa Física========================================="
						+ "\n Nesta Tela Você Poderá: "
						+ "\n\n 1. Realizar a abertura de conta para um novo cliente"
						+ "\n\n 2. Na parte de cliente já cadastrado você poderá:"
						+ "\n     * Realizar uma nova abertura de conta para um cliente"
						+ "\n     * Consultar e alterar dados de clientes e contas"
						+ "\n     * Realizar o encerramento de uma conta"
						+ "\n\n 3. Você também pode ver a versão do sistema no menu Ajuda -> Sobre o Sistema"
						+ "\n\n 4. Se caso queira sair temos 3 opções:"
						+ "\n     * Botão sair na tela principal"
						+ "\n     * Opção no menu Ajuda -> Sair"
						+ "\n     * Apertando a tecla de atalho: Alt + F4"
						+ "\n=================================================================================================", "Informações da Tela de Pessoa Física", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		mnNewMenu_1 = new JMenu("Ajuda");
		mnNewMenu_1.setIcon(new ImageIcon(TelaPessoaFisica.class.getResource("/br/com/exemplo/view/images/help30.png")));
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
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLUE, Color.DARK_GRAY, Color.DARK_GRAY, Color.BLUE));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tabNovoCliente = new JTabbedPane(JTabbedPane.TOP);
		tabNovoCliente.setBounds(10, 11, 570, 445);
		contentPane.add(tabNovoCliente);
		
		panel = new JPanel();
		tabNovoCliente.addTab("Novo Cliente", null, panel, null);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("Abertura de conta para novos clientes");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 521, 21);
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(65, 43, 48, 21);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("CPF");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(65, 75, 48, 21);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Celular");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(65, 107, 48, 21);
		panel.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Email");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(65, 139, 48, 21);
		panel.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Agencia");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(65, 171, 54, 21);
		panel.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Conta");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(65, 203, 54, 21);
		panel.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Tipo Conta");
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(65, 235, 75, 21);
		panel.add(lblNewLabel_7);
		
		txtNomeCliente = new JTextField();
		txtNomeCliente.setBounds(145, 43, 269, 20);
		panel.add(txtNomeCliente);
		txtNomeCliente.setColumns(10);
		
		txtEmailCliente = new JTextField();
		txtEmailCliente.setColumns(10);
		txtEmailCliente.setBounds(145, 140, 269, 20);
		panel.add(txtEmailCliente);
		
		ftfCPFCliente = new JFormattedTextField();
		ftfCPFCliente.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				ftfCPFCliente.setCaretPosition(0);
			}
		});
		ftfCPFCliente.setBounds(145, 75, 269, 20);
		formatarCampo();
		panel.add(ftfCPFCliente);
		
		ftfCelularCliente = new JFormattedTextField();
		ftfCelularCliente.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				ftfCelularCliente.setCaretPosition(0);
			}
		});
		ftfCelularCliente.setBounds(145, 107, 269, 20);
		formatarCampo();
		panel.add(ftfCelularCliente);
		
		cmbAgencia = new JComboBox();
		cmbAgencia.setModel(new DefaultComboBoxModel(new String[] {"Agencia da Rua Boa Vista - Agencia: 0001"}));
		cmbAgencia.setBounds(145, 170, 269, 22);
		panel.add(cmbAgencia);
		
		cmbTipoConta = new JComboBox();
		cmbTipoConta.setModel(new DefaultComboBoxModel(new String[] {"", "Conta Poupan\u00E7a", "Conta Corrente", "Conta de Investimentos"}));
		cmbTipoConta.setBounds(145, 234, 269, 22);
		panel.add(cmbTipoConta);
		
		btnSalvar = new JButton("");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(ValidarCampos() == true) {
						Clientes clientes = new Clientes();
						clientes.setNomeCliente(txtNomeCliente.getText());
						clientes.setCpfCliente(ftfCPFCliente.getText());
						clientes.setCelularCliente(ftfCelularCliente.getText());
						clientes.setEmailCliente(txtEmailCliente.getText());
						
						Contas contas = new Contas();
						contas.setTitularConta(txtNomeCliente.getText());
						contas.setAgenciaConta(1);
						contas.setNumeroConta(ftfConta.getText());
						contas.setTipoConta(cmbTipoConta.getSelectedIndex());
						contas.setSaldoConta(0);
						
						if(btnNaoPix.isSelected()) {
							Object[] options = {"Salvar", "Cancelar"};
							ImageIcon icon = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/comments.png")));
							int resposta = JOptionPane.showOptionDialog(null, "============Confira os Dados do Cliente e da Conta============"
									+ "\nNome Cliente: " + txtNomeCliente.getText()
									+ "\nCPF Cliente: " + ftfCPFCliente.getText()
									+ "\nCelular Cliente: " + ftfCelularCliente.getText()
									+ "\nEmail Cliente: " + txtEmailCliente.getText()
									+ "\nTitular da Conta: " + txtNomeCliente.getText()
									+ "\nAgencia da Conta: " + cmbAgencia.getSelectedItem().toString()
									+ "\nNumero da Conta: " + ftfConta.getText()
									+ "\nTipo da Conta: " + cmbTipoConta.getSelectedItem().toString(), "Aviso", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);
							
							if (resposta == JOptionPane.YES_OPTION) {
								
								int senha = Integer.parseInt(JOptionPane.showInputDialog(null, "Solicite que o cliente cadastre uma senha"));
								int confirmacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Confirme a senha"));
								
								if(senha == confirmacao) {
									ClientesDAO clientesDAO = new ClientesDAO();
									ContasDAO contasDAO = new ContasDAO();
									
									clientesDAO.Salvar(clientes);
									contasDAO.Salvar(contas);
									
									contas = contasDAO.Consultar_PorDadosConta(txtNomeCliente.getText(), 1, ftfConta.getText(), cmbTipoConta.getSelectedIndex());
									clientes = clientesDAO.Consultar_PorCPF(ftfCPFCliente.getText());
									
									ContaCliente contaCliente = new ContaCliente();
									ContaClienteDAO contaClienteDAO = new ContaClienteDAO();
									
									contaCliente.setIdCliente(clientes.getIdCliente());
									contaCliente.setIdConta(contas.getIdConta());
									
									contaClienteDAO.Salvar(contaCliente);
									
									LoginCliente loginCliente = new LoginCliente();
									LoginClienteDAO loginClienteDAO = new LoginClienteDAO();
									
									loginCliente.setIdCliente(clientes.getIdCliente());
									loginCliente.setSenha(senha);
									
									loginClienteDAO.Salvar(loginCliente);
									
									Object[] options1 = {"OK"};
									ImageIcon icon1 = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/high-priority.png")));
									JOptionPane.showOptionDialog(null, "Salvo com sucesso!", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options1, options1[0]);
									
									txtNomeCliente.setText(null);
									ftfCPFCliente.setText(null);
									ftfCelularCliente.setText(null);
									txtEmailCliente.setText(null);
									cmbAgencia.setSelectedIndex(0);
									ftfConta.setText(null);
									cmbTipoConta.setSelectedIndex(0);
								}
								else {
									Object[] options1 = {"OK"};
									ImageIcon icon1 = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/error.png")));
									JOptionPane.showOptionDialog(null, "Erro!!. "
											+ "\n\nAs senhas são incompativeis. Erro: ", "Erro", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options1, options1[0]);
								}
							}
						}
						else {
							int resposta = JOptionPane.OK_OPTION;
							ChavePixCliente chavePixCliente = new ChavePixCliente();
							if(cmbTipoPixCadastro.getSelectedItem().toString().equals("CPF")) {
								Object[] options = {"Salvar", "Cancelar"};
								ImageIcon icon = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/comments.png")));
								resposta = JOptionPane.showOptionDialog(null, "============Confira os Dados do Cliente e da Conta============"
										+ "\nNome Cliente: " + txtNomeCliente.getText()
										+ "\nCPF Cliente: " + ftfCPFCliente.getText()
										+ "\nCelular Cliente: " + ftfCelularCliente.getText()
										+ "\nEmail Cliente: " + txtEmailCliente.getText()
										+ "\nTitular da Conta: " + txtNomeCliente.getText()
										+ "\nAgencia da Conta: " + cmbAgencia.getSelectedItem().toString()
										+ "\nNumero da Conta: " + ftfConta.getText()
										+ "\nTipo da Conta: " + cmbTipoConta.getSelectedItem().toString()
										+ "\nTipo Pix: " + cmbTipoPixCadastro.getSelectedItem().toString()
										+ "\nPix: " + ftfPixCpf.getText(), "Aviso", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);
							
								chavePixCliente.setChavePix(ftfPixCpf.getText());	
							}
							else if (cmbTipoPixCadastro.getSelectedItem().toString().equals("Celular")) {
								Object[] options = {"Salvar", "Cancelar"};
								ImageIcon icon = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/comments.png")));
								resposta = JOptionPane.showOptionDialog(null, "============Confira os Dados do Cliente e da Conta============"
										+ "\nNome Cliente: " + txtNomeCliente.getText()
										+ "\nCPF Cliente: " + ftfCPFCliente.getText()
										+ "\nCelular Cliente: " + ftfCelularCliente.getText()
										+ "\nEmail Cliente: " + txtEmailCliente.getText()
										+ "\nTitular da Conta: " + txtNomeCliente.getText()
										+ "\nAgencia da Conta: " + cmbAgencia.getSelectedItem().toString()
										+ "\nNumero da Conta: " + ftfConta.getText()
										+ "\nTipo da Conta: " + cmbTipoConta.getSelectedItem().toString()
										+ "\nTipo Pix: " + cmbTipoPixCadastro.getSelectedItem().toString()
										+ "\nPix: " + ftfPixCelular.getText(), "Aviso", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);
								
								chavePixCliente.setChavePix(ftfPixCelular.getText());	
							}
							else if (cmbTipoPixCadastro.getSelectedItem().toString().equals("Email") || cmbTipoPixCadastro.getSelectedItem().toString().equals("Aleatoria")) {
								Object[] options = {"Salvar", "Cancelar"};
								ImageIcon icon = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/comments.png")));
								resposta = JOptionPane.showOptionDialog(null, "============Confira os Dados do Cliente e da Conta============"
										+ "\nNome Cliente: " + txtNomeCliente.getText()
										+ "\nCPF Cliente: " + ftfCPFCliente.getText()
										+ "\nCelular Cliente: " + ftfCelularCliente.getText()
										+ "\nEmail Cliente: " + txtEmailCliente.getText()
										+ "\nTitular da Conta: " + txtNomeCliente.getText()
										+ "\nAgencia da Conta: " + cmbAgencia.getSelectedItem().toString()
										+ "\nNumero da Conta: " + ftfConta.getText()
										+ "\nTipo da Conta: " + cmbTipoConta.getSelectedItem().toString()
										+ "\nTipo Pix: " + cmbTipoPixCadastro.getSelectedItem().toString()
										+ "\nPix: " + txtPix.getText(), "Aviso", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);
								
								chavePixCliente.setChavePix(txtPix.getText());	
							}
							
							if (resposta == JOptionPane.YES_OPTION) {
								int senha = Integer.parseInt(JOptionPane.showInputDialog(null, "Solicite que o cliente cadastre uma senha"));
								int confirmacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Confirme a senha"));
								
								boolean prosseguir = false;
								
								if (cmbTipoPixCadastro.getSelectedItem().toString().equals("CPF")) {
									if (ftfPixCpf.getText().equals(ftfCPFCliente.getText())) {
										prosseguir = true;
									}
								}
								else if (cmbTipoPixCadastro.getSelectedItem().toString().equals("Celular")) {
									if (ftfPixCelular.getText().equals(ftfCelularCliente.getText())) {
										prosseguir = true;
									}
								}
								else if (cmbTipoPixCadastro.getSelectedItem().toString().equals("Email")) {
									if (txtPix.getText().equals(txtEmailCliente.getText())) {
										prosseguir = true;
									}
								}
								else if (cmbTipoPixCadastro.getSelectedItem().toString().equals("Aleatoria")) {
									if (txtPix.getText() != null ) {
										 prosseguir = true;
									}
								}
								
								if(senha == confirmacao) {
									if(prosseguir == true) {
										ClientesDAO clientesDAO = new ClientesDAO();
										ContasDAO contasDAO = new ContasDAO();
										
										ChavePixClienteDAO chavePixClienteDAO = new ChavePixClienteDAO();
										
										chavePixCliente.setTipoChavePix(cmbTipoPixCadastro.getSelectedItem().toString());
										chavePixCliente.setCpfCliente(ftfCPFCliente.getText());
										
										clientesDAO.Salvar(clientes);
										contasDAO.Salvar(contas);
										chavePixClienteDAO.Salvar(chavePixCliente);
										
										contas = contasDAO.Consultar_PorDadosConta(txtNomeCliente.getText(), 1, ftfConta.getText(), cmbTipoConta.getSelectedIndex());
										clientes = clientesDAO.Consultar_PorCPF(ftfCPFCliente.getText());
										
										ContaCliente contaCliente = new ContaCliente();
										ContaClienteDAO contaClienteDAO = new ContaClienteDAO();
										
										contaCliente.setIdCliente(clientes.getIdCliente());
										contaCliente.setIdConta(contas.getIdConta());
										
										contaClienteDAO.Salvar(contaCliente);
										
										LoginCliente loginCliente = new LoginCliente();
										LoginClienteDAO loginClienteDAO = new LoginClienteDAO();
										
										loginCliente.setIdCliente(clientes.getIdCliente());
										loginCliente.setSenha(senha);
										
										loginClienteDAO.Salvar(loginCliente);
										
										Object[] options1 = {"OK"};
										ImageIcon icon1 = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/high-priority.png")));
										JOptionPane.showOptionDialog(null, "Salvo com sucesso!", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options1, options1[0]);
										
										txtNomeCliente.setText(null);
										ftfCPFCliente.setText(null);
										ftfCelularCliente.setText(null);
										txtEmailCliente.setText(null);
										cmbAgencia.setSelectedIndex(0);
										ftfConta.setText(null);
										cmbTipoConta.setSelectedIndex(0);
										btnSimPix.setSelected(false);
										btnNaoPix.setSelected(false);
										cmbTipoPixCadastro.setSelectedIndex(0);
										ftfPixCpf.setText(null);
										ftfPixCpf.setVisible(false);
										ftfPixCelular.setText(null);
										ftfPixCelular.setVisible(false);
										txtPix.setText(null);
									
									}
									else  {
										Object[] options1 = {"OK"};
										ImageIcon icon1 = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/error.png")));
										JOptionPane.showOptionDialog(null, "Erro!!. "
												+ "\n\nVerifique a chave pix digitada.", "Erro", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options1, options1[0]);
									}
									
								}
								else {
									Object[] options1 = {"OK"};
									ImageIcon icon1 = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/error.png")));
									JOptionPane.showOptionDialog(null, "Erro!!. "
											+ "\n\nAs senhas são incompativeis.", "Erro", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options1, options1[0]);
								}
							}
						}
					}
				} catch (Exception e1) {
					Object[] options = {"OK"};
					ImageIcon icon = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/error.png")));
					JOptionPane.showOptionDialog(null, "Erro!!. "
							+ "\n\n1. Verifique se Todos os Campos Foram Preenchidos"
							+ "\n2. Caso Todos Estejam Preenchidos. Verifique se Foram Preenchidos Corretamente" 
							+ "\n\nErro: " + e1, "Erro", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);
				}
			}
		});
		btnSalvar.setIcon(new ImageIcon(TelaPessoaFisica.class.getResource("/br/com/exemplo/view/images/save.png")));
		btnSalvar.setBounds(466, 74, 48, 40);
		panel.add(btnSalvar);
		
		btnVoltar = new JButton("");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPessoaFisica telaPessoaFisica = new TelaPessoaFisica();
				telaPessoaFisica.dispose();
				telaPessoaFisica.setVisible(false);
				
				TelaPrincipal telaPrincipal = new TelaPrincipal();
				telaPrincipal.setVisible(true);
			}
		});
		btnVoltar.setIcon(new ImageIcon(TelaPessoaFisica.class.getResource("/br/com/exemplo/view/images/voltar.png")));
		btnVoltar.setBounds(466, 188, 48, 40);
		panel.add(btnVoltar);
		
		btnSair = new JButton("");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setIcon(new ImageIcon(TelaPessoaFisica.class.getResource("/br/com/exemplo/view/images/exit.png")));
		btnSair.setBounds(466, 302, 48, 40);
		panel.add(btnSair);
		
		lblValidacaoNome = new JLabel("*");
		lblValidacaoNome.setVisible(false);
		lblValidacaoNome.setForeground(Color.RED);
		lblValidacaoNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValidacaoNome.setBounds(103, 43, 16, 14);
		panel.add(lblValidacaoNome);
		
		lblValidacaoCPF = new JLabel("*");
		lblValidacaoCPF.setVisible(false);
		lblValidacaoCPF.setForeground(Color.RED);
		lblValidacaoCPF.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValidacaoCPF.setBounds(97, 75, 16, 14);
		panel.add(lblValidacaoCPF);
		
		lblValidacaoCelular = new JLabel("*");
		lblValidacaoCelular.setVisible(false);
		lblValidacaoCelular.setForeground(Color.RED);
		lblValidacaoCelular.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValidacaoCelular.setBounds(109, 106, 18, 14);
		panel.add(lblValidacaoCelular);
		
		lblValidacaoEmail = new JLabel("*");
		lblValidacaoEmail.setVisible(false);
		lblValidacaoEmail.setForeground(Color.RED);
		lblValidacaoEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValidacaoEmail.setBounds(103, 139, 18, 14);
		panel.add(lblValidacaoEmail);
		
		lblValidacaoAgencia = new JLabel("*");
		lblValidacaoAgencia.setVisible(false);
		lblValidacaoAgencia.setForeground(Color.RED);
		lblValidacaoAgencia.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValidacaoAgencia.setBounds(114, 171, 18, 14);
		panel.add(lblValidacaoAgencia);
		
		lblValidacaoConta = new JLabel("*");
		lblValidacaoConta.setVisible(false);
		lblValidacaoConta.setForeground(Color.RED);
		lblValidacaoConta.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValidacaoConta.setBounds(101, 203, 18, 14);
		panel.add(lblValidacaoConta);
		
		lblValidacaoTipoConta = new JLabel("*");
		lblValidacaoTipoConta.setVisible(false);
		lblValidacaoTipoConta.setForeground(Color.RED);
		lblValidacaoTipoConta.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValidacaoTipoConta.setBounds(127, 232, 18, 14);
		panel.add(lblValidacaoTipoConta);
		
		lblValidacao = new JLabel("* Preenchimento Obrigat\u00F3rio");
		lblValidacao.setVisible(false);
		lblValidacao.setForeground(Color.RED);
		lblValidacao.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValidacao.setBounds(53, 373, 212, 21);
		panel.add(lblValidacao);
		
		ftfConta = new JFormattedTextField();
		ftfConta.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				ftfConta.setCaretPosition(0);
			}
		});
		ftfConta.setBounds(145, 203, 269, 20);
		formatarCampo();
		panel.add(ftfConta);
		
		lblNewLabel_19 = new JLabel("Cadastrar Pix?");
		lblNewLabel_19.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_19.setBounds(65, 268, 114, 21);
		panel.add(lblNewLabel_19);
		
		btnSimPix = new JRadioButton("Sim");
		btnSimPix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNaoPix.setSelected(false);
				cmbTipoPixCadastro.setEnabled(true);
				ftfPixCpf.setEditable(true);
				ftfPixCelular.setEditable(true);
				txtPix.setEditable(true);
			}
		});
		btnSimPix.setBounds(170, 267, 75, 23);
		panel.add(btnSimPix);
		
		btnNaoPix = new JRadioButton("N\u00E3o");
		btnNaoPix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSimPix.setSelected(false);
				cmbTipoPixCadastro.setEnabled(false);
				ftfPixCpf.setEditable(false);
				ftfPixCelular.setEditable(false);
				txtPix.setEditable(false);
			}
		});
		btnNaoPix.setBounds(247, 267, 75, 23);
		panel.add(btnNaoPix);
		
		cmbTipoPixCadastro = new JComboBox();
		cmbTipoPixCadastro.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (cmbTipoPixCadastro.getSelectedIndex() == 1) {
					ftfPixCpf.setVisible(true);
					ftfPixCelular.setVisible(false);
					txtPix.setVisible(false);
				}
				else if (cmbTipoPixCadastro.getSelectedIndex() == 2) {
					ftfPixCpf.setVisible(false);
					ftfPixCelular.setVisible(true);
					txtPix.setVisible(false);
				}
				else if (cmbTipoPixCadastro.getSelectedIndex() == 3 || cmbTipoPixCadastro.getSelectedIndex() == 4) {
					ftfPixCpf.setVisible(false);
					ftfPixCelular.setVisible(false);
					txtPix.setVisible(true);
				}
			}
		});
		cmbTipoPixCadastro.setModel(new DefaultComboBoxModel(new String[] {"", "CPF", "Celular", "Email", "Aleatoria"}));
		cmbTipoPixCadastro.setBounds(145, 300, 269, 22);
		panel.add(cmbTipoPixCadastro);
		formatarCampo();
		
		lblNewLabel_21 = new JLabel("Tipo Pix");
		lblNewLabel_21.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_21.setBounds(65, 300, 114, 21);
		panel.add(lblNewLabel_21);
		
		lblNewLabel_23 = new JLabel("Pix");
		lblNewLabel_23.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_23.setBounds(65, 333, 114, 21);
		panel.add(lblNewLabel_23);
		
		ftfPixCelular = new JFormattedTextField();
		ftfPixCelular.setVisible(false);
		formatarCampo();
		ftfPixCelular.setBounds(145, 342, 269, 20);
		panel.add(ftfPixCelular);
		
		txtPix = new JTextField();
		txtPix.setColumns(10);
		txtPix.setBounds(145, 342, 269, 20);
		panel.add(txtPix);
		
		lblValidarCadastroPix = new JLabel("*");
		lblValidarCadastroPix.setVisible(false);
		lblValidarCadastroPix.setForeground(Color.RED);
		lblValidarCadastroPix.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValidarCadastroPix.setBounds(155, 267, 114, 21);
		panel.add(lblValidarCadastroPix);
		
		lblValidarTipoPixCadastro = new JLabel("*");
		lblValidarTipoPixCadastro.setVisible(false);
		lblValidarTipoPixCadastro.setForeground(Color.RED);
		lblValidarTipoPixCadastro.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValidarTipoPixCadastro.setBounds(114, 300, 114, 21);
		panel.add(lblValidarTipoPixCadastro);
		
		lblValidarPixCadastro = new JLabel("*");
		lblValidarPixCadastro.setVisible(false);
		lblValidarPixCadastro.setForeground(Color.RED);
		lblValidarPixCadastro.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValidarPixCadastro.setBounds(88, 333, 114, 21);
		panel.add(lblValidarPixCadastro);
		
		ftfPixCpf = new JFormattedTextField();
		ftfPixCpf.setVisible(false);
		ftfPixCpf.setBounds(145, 342, 269, 20);
		panel.add(ftfPixCpf);
		
		panel_1 = new JPanel();
		tabNovoCliente.addTab("Cliente Já Cadastrado", null, panel_1, null);
		panel_1.setLayout(null);
		
		tabCliente = new JTabbedPane(JTabbedPane.TOP);
		tabCliente.setBounds(0, 11, 565, 406);
		panel_1.add(tabCliente);
		
		panel_2 = new JPanel();
		tabCliente.addTab("Abertura Conta", null, panel_2, null);
		panel_2.setLayout(null);
		
		lblAberturaDeConta = new JLabel("Abertura de conta para clientes");
		lblAberturaDeConta.setHorizontalAlignment(SwingConstants.CENTER);
		lblAberturaDeConta.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblAberturaDeConta.setBounds(10, 11, 516, 21);
		panel_2.add(lblAberturaDeConta);
		
		lblNewLabel_8 = new JLabel("CPF");
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(53, 68, 48, 21);
		panel_2.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Agencia");
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(53, 100, 71, 21);
		panel_2.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("Conta");
		lblNewLabel_10.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_10.setBounds(53, 132, 48, 21);
		panel_2.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("Tipo Conta");
		lblNewLabel_11.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_11.setBounds(53, 164, 71, 21);
		panel_2.add(lblNewLabel_11);
		
		lblValidacaoCPFCliente = new JLabel("*");
		lblValidacaoCPFCliente.setVisible(false);
		lblValidacaoCPFCliente.setForeground(Color.RED);
		lblValidacaoCPFCliente.setFont(new Font("Arial", Font.BOLD, 14));
		lblValidacaoCPFCliente.setBounds(82, 68, 20, 21);
		panel_2.add(lblValidacaoCPFCliente);
		
		lblValidacaoAgenciaCliente = new JLabel("*");
		lblValidacaoAgenciaCliente.setVisible(false);
		lblValidacaoAgenciaCliente.setForeground(Color.RED);
		lblValidacaoAgenciaCliente.setFont(new Font("Arial", Font.BOLD, 14));
		lblValidacaoAgenciaCliente.setBounds(102, 100, 20, 21);
		panel_2.add(lblValidacaoAgenciaCliente);
		
		lblValidacaoContaCliente = new JLabel("*");
		lblValidacaoContaCliente.setVisible(false);
		lblValidacaoContaCliente.setForeground(Color.RED);
		lblValidacaoContaCliente.setFont(new Font("Arial", Font.BOLD, 14));
		lblValidacaoContaCliente.setBounds(91, 132, 20, 21);
		panel_2.add(lblValidacaoContaCliente);
		
		lblValidacaoTipoContaCliente = new JLabel("*");
		lblValidacaoTipoContaCliente.setVisible(false);
		lblValidacaoTipoContaCliente.setForeground(Color.RED);
		lblValidacaoTipoContaCliente.setFont(new Font("Arial", Font.BOLD, 14));
		lblValidacaoTipoContaCliente.setBounds(119, 163, 20, 21);
		panel_2.add(lblValidacaoTipoContaCliente);
		
		lblValidacaoCliente = new JLabel("* Preenchimento Obrigat\u00F3rio");
		lblValidacaoCliente.setVisible(false);
		lblValidacaoCliente.setForeground(Color.RED);
		lblValidacaoCliente.setFont(new Font("Arial", Font.BOLD, 14));
		lblValidacaoCliente.setBounds(53, 302, 224, 21);
		panel_2.add(lblValidacaoCliente);
		
		ftfCPF = new JFormattedTextField();
		ftfCPF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				ftfCPF.setCaretPosition(0);
			}
		});
		ftfCPF.setBounds(134, 68, 271, 20);
		formatarCampo();
		panel_2.add(ftfCPF);
		
		ftfContaCliente = new JFormattedTextField();
		ftfContaCliente.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				ftfContaCliente.setCaretPosition(0);
			}
		});
		ftfContaCliente.setBounds(134, 132, 271, 20);
		formatarCampo();
		panel_2.add(ftfContaCliente);
		
		cmbAgenciaCliente = new JComboBox();
		cmbAgenciaCliente.setModel(new DefaultComboBoxModel(new String[] {"Agencia da Rua Boa Vista - Agencia: 0001"}));
		cmbAgenciaCliente.setBounds(134, 99, 271, 22);
		panel_2.add(cmbAgenciaCliente);
		
		cmbTipoContaCliente = new JComboBox();
		cmbTipoContaCliente.setModel(new DefaultComboBoxModel(new String[] {"", "Conta Poupan\u00E7a", "Conta Corrente", "Conta de Investimentos"}));
		cmbTipoContaCliente.setBounds(134, 163, 271, 22);
		panel_2.add(cmbTipoContaCliente);
		
		btnSalvarCliente = new JButton("");
		btnSalvarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(ValidarCamposClientes() == true) {
						Clientes clientes = new Clientes();
						ClientesDAO clientesDAO = new ClientesDAO();
						
						clientes = clientesDAO.Consultar_PorCPF(ftfCPF.getText());
						int idCliente = clientes.getIdCliente();
						
						Contas contas = new Contas();
						contas.setTitularConta(clientes.getNomeCliente());
						contas.setAgenciaConta(1);
						contas.setNumeroConta(ftfContaCliente.getText());
						contas.setTipoConta(cmbTipoContaCliente.getSelectedIndex());
						contas.setSaldoConta(0);
						
						Object[] options = {"Salvar", "Cancelar"};
						ImageIcon icon = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/comments.png")));
						int resposta = JOptionPane.showOptionDialog(null, "============Confira os Dados do Cliente e da Conta============"
								+ "\nNome Cliente: " + clientes.getNomeCliente()
								+ "\nCPF Cliente: " + ftfCPF.getText()
								+ "\nCelular Cliente: " + clientes.getCelularCliente()
								+ "\nEmail Cliente: " + clientes.getEmailCliente()
								+ "\nTitular da Conta: " + clientes.getNomeCliente()
								+ "\nAgencia da Conta: " + cmbAgenciaCliente.getSelectedItem().toString()
								+ "\nNumero da Conta: " + ftfContaCliente.getText()
								+ "\nTipo da Conta: " + cmbTipoContaCliente.getSelectedItem().toString(), "Aviso", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);
						
						if (resposta == JOptionPane.YES_OPTION) {
							ContasDAO contasDAO = new ContasDAO();
				
							contasDAO.Salvar(contas);
							
							clientes = clientesDAO.Consultar_PorCPF(ftfCPF.getText());
							
							contas = contasDAO.Consultar_PorDadosConta(clientes.getNomeCliente(), 1, ftfContaCliente.getText(), cmbTipoContaCliente.getSelectedIndex());
							
							ContaCliente contaCliente = new ContaCliente();
							ContaClienteDAO contaClienteDAO = new ContaClienteDAO();
							
							contaCliente.setIdCliente(idCliente);
							contaCliente.setIdConta(contas.getIdConta());
							
							LoginCliente loginCliente = new LoginCliente();
							LoginClienteDAO loginClienteDAO = new LoginClienteDAO();
							
							loginCliente.setIdCliente(idCliente);
							int senha = Integer.parseInt(JOptionPane.showInputDialog(null, "Solicite que o cliente cadastre uma senha"));
							int confirmacaoSenha = Integer.parseInt(JOptionPane.showInputDialog(null, "Solicite que o cliente confirme a senha"));
							
							if(senha == confirmacaoSenha) {
								loginCliente.setSenha(senha);
								
								loginClienteDAO.Salvar(loginCliente);
								contaClienteDAO.Salvar(contaCliente);
								
								Object[] options1 = {"OK"};
								ImageIcon icon1 = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/high-priority.png")));
								JOptionPane.showOptionDialog(null, "Salvo com sucesso!", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options1, options1[0]);
								
								ftfCPF.setText(null);
								cmbAgenciaCliente.setSelectedIndex(0);
								ftfContaCliente.setText(null);
								cmbTipoContaCliente.setSelectedIndex(0);
							}
							else {
								Object[] options1 = {"OK"};
								ImageIcon icon1 = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/high-priority.png")));
								JOptionPane.showOptionDialog(null, "A senhas são diferentes uma da outra!", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options1, options1[0]);
								
							}
						}
					}
				} catch (Exception e1) {
					Object[] options = {"OK"};
					ImageIcon icon = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/error.png")));
					JOptionPane.showOptionDialog(null, "Erro!!. "
							+ "\n\n1. Verifique se Todos os Campos Foram Preenchidos"
							+ "\n2. Caso Todos Estejam Preenchidos. Verifique se Foram Preenchidos Corretamente" 
							+ "\n\nErro: " + e1, "Erro", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);
				}
			}
		});
		btnSalvarCliente.setIcon(new ImageIcon(TelaPessoaFisica.class.getResource("/br/com/exemplo/view/images/save.png")));
		btnSalvarCliente.setBounds(455, 64, 48, 40);
		panel_2.add(btnSalvarCliente);
		
		btnVoltarTela = new JButton("");
		btnVoltarTela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPessoaFisica telaPessoaFisica = new TelaPessoaFisica();
				telaPessoaFisica.dispose();
				telaPessoaFisica.setVisible(false);
				
				TelaPrincipal telaPrincipal = new TelaPrincipal();
				telaPrincipal.setVisible(true);
			}
		});
		btnVoltarTela.setIcon(new ImageIcon(TelaPessoaFisica.class.getResource("/br/com/exemplo/view/images/voltar.png")));
		btnVoltarTela.setBounds(455, 168, 48, 40);
		panel_2.add(btnVoltarTela);
		
		btnSairSistema = new JButton("");
		btnSairSistema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSairSistema.setIcon(new ImageIcon(TelaPessoaFisica.class.getResource("/br/com/exemplo/view/images/exit.png")));
		btnSairSistema.setBounds(455, 272, 48, 40);
		panel_2.add(btnSairSistema);
		
		lblNewLabel_24 = new JLabel("Cadastrar Pix?");
		lblNewLabel_24.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_24.setBounds(53, 196, 114, 21);
		panel_2.add(lblNewLabel_24);
		
		btnSimPix_1 = new JRadioButton("Sim");
		btnSimPix_1.setEnabled(false);
		btnSimPix_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNaoPix_1.setSelected(false);
				cmbTipoPixCadastro_1.setEnabled(true);
				ftfPixCpf_1.setEditable(true);
				ftfPixCelular_1.setEditable(true);
				txtPix_1.setEditable(true);
			}
		});
		btnSimPix_1.setBounds(155, 195, 75, 23);
		panel_2.add(btnSimPix_1);
		
		btnNaoPix_1 = new JRadioButton("N\u00E3o");
		btnNaoPix_1.setEnabled(false);
		btnNaoPix_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSimPix_1.setSelected(false);
				cmbTipoPixCadastro_1.setEnabled(false);
				ftfPixCpf_1.setEditable(false);
				ftfPixCelular_1.setEditable(false);
				txtPix_1.setEditable(false);
			}
		});
		btnNaoPix_1.setBounds(239, 195, 75, 23);
		panel_2.add(btnNaoPix_1);
		
		lblNewLabel_28 = new JLabel("Tipo Pix");
		lblNewLabel_28.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_28.setBounds(53, 228, 114, 21);
		panel_2.add(lblNewLabel_28);
		
		cmbTipoPixCadastro_1 = new JComboBox();
		cmbTipoPixCadastro_1.setEnabled(false);
		cmbTipoPixCadastro_1.setModel(new DefaultComboBoxModel(new String[] {"", "CPF", "Celular", "Email", "Aleatoria"}));
		cmbTipoPixCadastro_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (cmbTipoPixCadastro_1.getSelectedIndex() == 1) {
					ftfPixCpf_1.setVisible(true);
					ftfPixCelular_1.setVisible(false);
					txtPix_1.setVisible(false);
				}
				else if (cmbTipoPixCadastro_1.getSelectedIndex() == 2) {
					ftfPixCpf_1.setVisible(false);
					ftfPixCelular_1.setVisible(true);
					txtPix_1.setVisible(false);
				}
				else if (cmbTipoPixCadastro_1.getSelectedIndex() == 3 || cmbTipoPixCadastro_1.getSelectedIndex() == 4) {
					ftfPixCpf_1.setVisible(false);
					ftfPixCelular_1.setVisible(false);
					txtPix_1.setVisible(true);
				}
			}
		});
		cmbTipoPixCadastro_1.setBounds(136, 228, 269, 22);
		panel_2.add(cmbTipoPixCadastro_1);
		
		lblNewLabel_29 = new JLabel("Pix");
		lblNewLabel_29.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_29.setBounds(53, 260, 114, 21);
		panel_2.add(lblNewLabel_29);
		
		ftfPixCelular_1 = new JFormattedTextField();
		ftfPixCelular_1.setEnabled(false);
		formatarCampo();
		ftfPixCelular_1.setVisible(false);
		ftfPixCelular_1.setBounds(134, 260, 271, 21);
		panel_2.add(ftfPixCelular_1);
		
		lblValidarTipoPixCliente = new JLabel("*");
		lblValidarTipoPixCliente.setVisible(false);
		lblValidarTipoPixCliente.setForeground(Color.RED);
		lblValidarTipoPixCliente.setFont(new Font("Arial", Font.PLAIN, 14));
		lblValidarTipoPixCliente.setBounds(102, 225, 114, 21);
		panel_2.add(lblValidarTipoPixCliente);
		
		lblValidarPixCliente = new JLabel("*");
		lblValidarPixCliente.setVisible(false);
		lblValidarPixCliente.setForeground(Color.RED);
		lblValidarPixCliente.setFont(new Font("Arial", Font.PLAIN, 14));
		lblValidarPixCliente.setBounds(82, 260, 114, 21);
		panel_2.add(lblValidarPixCliente);
		
		lblValidarCadastroPixCliente = new JLabel("*");
		lblValidarCadastroPixCliente.setVisible(false);
		lblValidarCadastroPixCliente.setForeground(Color.RED);
		lblValidarCadastroPixCliente.setFont(new Font("Arial", Font.PLAIN, 14));
		lblValidarCadastroPixCliente.setBounds(144, 196, 114, 21);
		panel_2.add(lblValidarCadastroPixCliente);
		
		ftfPixCpf_1 = new JFormattedTextField();
		formatarCampo();
		ftfPixCpf_1.setVisible(false);
		ftfPixCpf_1.setBounds(134, 260, 271, 20);
		panel_2.add(ftfPixCpf_1);
		
		txtPix_1 = new JTextField();
		txtPix_1.setBounds(134, 260, 271, 20);
		panel_2.add(txtPix_1);
		txtPix_1.setColumns(10);
		formatarCampo();
		formatarCampo();
		formatarCampo();
		
		panel_3 = new JPanel();
		tabCliente.addTab("Alterações e Encerramentos", null, panel_3, null);
		panel_3.setLayout(null);
		
		lblAlteraesEConsulta = new JLabel("Altera\u00E7\u00F5es, Exclus\u00E3o e Consulta de Contas");
		lblAlteraesEConsulta.setBounds(10, 11, 516, 21);
		lblAlteraesEConsulta.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlteraesEConsulta.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		panel_3.add(lblAlteraesEConsulta);
		
		lblNewLabel_12 = new JLabel("Nome");
		lblNewLabel_12.setBounds(10, 43, 48, 21);
		lblNewLabel_12.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_3.add(lblNewLabel_12);
		
		txtNome = new JTextField();
		txtNome.setBounds(96, 43, 340, 20);
		txtNome.setColumns(10);
		panel_3.add(txtNome);
		
		lblValidarNome = new JLabel("*");
		lblValidarNome.setBounds(49, 45, 18, 14);
		lblValidarNome.setVisible(false);
		lblValidarNome.setForeground(Color.RED);
		lblValidarNome.setFont(new Font("Arial", Font.BOLD, 14));
		panel_3.add(lblValidarNome);
		
		lblNewLabel_13 = new JLabel("CPF");
		lblNewLabel_13.setBounds(10, 75, 48, 21);
		lblNewLabel_13.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_3.add(lblNewLabel_13);
		
		ftfCpf = new JFormattedTextField();
		ftfCpf.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				ftfCpf.setCaretPosition(0);
			}
		});
		ftfCpf.setBounds(96, 75, 340, 20);
		formatarCampo();
		panel_3.add(ftfCpf);
		
		lblValidarCpf = new JLabel("*");
		lblValidarCpf.setBounds(40, 72, 18, 21);
		lblValidarCpf.setVisible(false);
		lblValidarCpf.setForeground(Color.RED);
		lblValidarCpf.setFont(new Font("Arial", Font.BOLD, 14));
		panel_3.add(lblValidarCpf);
		
		lblNewLabel_14 = new JLabel("Celular");
		lblNewLabel_14.setBounds(10, 107, 48, 21);
		lblNewLabel_14.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_3.add(lblNewLabel_14);
		
		lblValidarCelular = new JLabel("*");
		lblValidarCelular.setBounds(56, 105, 18, 21);
		lblValidarCelular.setVisible(false);
		lblValidarCelular.setForeground(Color.RED);
		lblValidarCelular.setFont(new Font("Arial", Font.BOLD, 14));
		panel_3.add(lblValidarCelular);
		
		ftfCelular = new JFormattedTextField();
		ftfCelular.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				ftfCelular.setCaretPosition(0);
			}
		});
		ftfCelular.setBounds(96, 107, 340, 20);
		formatarCampo();
		panel_3.add(ftfCelular);
		
		lblNewLabel_15 = new JLabel("Email");
		lblNewLabel_15.setBounds(10, 139, 48, 21);
		lblNewLabel_15.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_3.add(lblNewLabel_15);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(96, 139, 340, 20);
		txtEmail.setColumns(10);
		panel_3.add(txtEmail);
		
		lblValidarEmail = new JLabel("*");
		lblValidarEmail.setBounds(49, 139, 18, 21);
		lblValidarEmail.setVisible(false);
		lblValidarEmail.setForeground(Color.RED);
		lblValidarEmail.setFont(new Font("Arial", Font.BOLD, 14));
		panel_3.add(lblValidarEmail);
		
		lblValidar = new JLabel("* Preenchimento Obrigat\u00F3rio");
		lblValidar.setBounds(10, 346, 216, 21);
		lblValidar.setVisible(false);
		lblValidar.setForeground(Color.RED);
		lblValidar.setFont(new Font("Arial", Font.BOLD, 14));
		panel_3.add(lblValidar);
		
		btnAlterar = new JButton("");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(ValidarCamposCli() == true) {
						Clientes clientes = new Clientes();
						ClientesDAO clientesDAO = new ClientesDAO();
						
						clientes.setNomeCliente(txtNome.getText());
						clientes.setCpfCliente(ftfCpf.getText());
						clientes.setCelularCliente(ftfCelular.getText());
						clientes.setEmailCliente(txtEmail.getText());
						
						Clientes cliente = new Clientes();
						cliente = clientesDAO.Consultar_PorCPF(ftfCpf.getText());
						clientes.setIdCliente(cliente.getIdCliente());
						
						
						int senha = Integer.parseInt(JOptionPane.showInputDialog(null, "Solicite que o cliente digite a senha"));
						
						LoginCliente loginCliente = new LoginCliente();
						LoginClienteDAO loginClienteDAO = new LoginClienteDAO();
						
						loginCliente = loginClienteDAO.Consultar_PorIdCliente(clientes.getIdCliente());
						
						if (senha == loginCliente.getSenha()) {
							clientesDAO.Alterar(clientes);
							
							Object[] options1 = {"OK"};
							ImageIcon icon1 = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/high-priority.png")));
							JOptionPane.showOptionDialog(null, "Alterado com sucesso!", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options1, options1[0]);
							
							txtNome.setText(null);
							ftfCpf.setText(null);
							ftfCelular.setText(null);
							txtEmail.setText(null);
							((DefaultTableModel) table.getModel()).setRowCount(0);
							ftfCpf.setEditable(true);
						}
						else {
							Object[] options1 = {"OK"};
							ImageIcon icon1 = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/high-priority.png")));
							JOptionPane.showOptionDialog(null, "Senha inválida!", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options1, options1[0]);
						}
					}
				} catch (Exception e1) {
					Object[] options = {"OK"};
					ImageIcon icon = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/error.png")));
					JOptionPane.showOptionDialog(null, "Erro!!. "
							+ "\n\n1. Verifique se Todos os Campos Foram Preenchidos"
							+ "\n2. Caso Todos Estejam Preenchidos. Verifique se Foram Preenchidos Corretamente" 
							+ "\n\nErro: " + e1, "Erro", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);
				}
			}
		});
		btnAlterar.setIcon(new ImageIcon(TelaPessoaFisica.class.getResource("/br/com/exemplo/view/images/pencil.png")));
		btnAlterar.setBounds(478, 43, 48, 40);
		panel_3.add(btnAlterar);
		
		btnExcluir = new JButton("");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(ValidarCamposCli() == true) {
						Object[] itens = {"Excluir a Conta Selecionada", "Excluir Todas as Contas e Encerrar Cadastro do Cliente"};
						ImageIcon icon2 = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/high-priority.png")));
						Object selectedValue = JOptionPane.showInputDialog (null, "Escolha um Tipo de Exclusão", "Excluir Conta", JOptionPane.INFORMATION_MESSAGE, icon2, itens, itens[0]);
						String opcao = selectedValue.toString();
						
						if (opcao.equals("Excluir a Conta Selecionada")) {
							int id = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString());
							
							Clientes clientes = new Clientes();
							ClientesDAO clientesDAO = new ClientesDAO();
							
							ContasDAO contasDAO = new ContasDAO();
							
							System.out.println(ftfCpf.getText() + " " + id);
							
							clientes = clientesDAO.Consultar_PorCPF(ftfCpf.getText());
							
							ContaClienteDAO contaClienteDAO = new ContaClienteDAO();
							contaClienteDAO.Excluir_PorIDConta(clientes.getIdCliente(), id);
							
							int senha = Integer.parseInt(JOptionPane.showInputDialog(null, "Solicite que o cliente digite a senha"));
							
							LoginCliente loginCliente = new LoginCliente();
							LoginClienteDAO loginClienteDAO = new LoginClienteDAO();
							
							loginCliente = loginClienteDAO.Consultar_PorIdCliente(clientes.getIdCliente());
							
							if (senha == loginCliente.getSenha()) {
								contasDAO.Excluir(id);
								
								Object[] options1 = {"OK"};
								ImageIcon icon1 = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/high-priority.png")));
								JOptionPane.showOptionDialog(null, "Conta excluida com sucesso!", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options1, options1[0]);
								
								txtNome.setText(null);
								ftfCpf.setText(null);
								ftfCelular.setText(null);
								txtEmail.setText(null);
								((DefaultTableModel) table.getModel()).setRowCount(0);
								ftfCpf.setEditable(true);
							}
							else {
								Object[] options1 = {"OK"};
								ImageIcon icon1 = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/high-priority.png")));
								JOptionPane.showOptionDialog(null, "Senha inválida!", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options1, options1[0]);
							}
						}
						else if (opcao.equals("Excluir Todas as Contas e Encerrar Cadastro do Cliente")) {
							ContasDAO contasDAO = new ContasDAO();
							
							Clientes clientes = new Clientes();
							ClientesDAO clientesDAO = new ClientesDAO();
							
							ContaClienteDAO contaClienteDAO = new ContaClienteDAO();
							
							clientes = clientesDAO.Consultar_PorCPF(ftfCpf.getText());
							
							int senha = Integer.parseInt(JOptionPane.showInputDialog(null, "Solicite que o cliente digite a senha"));
							
							LoginCliente loginCliente = new LoginCliente();
							LoginClienteDAO loginClienteDAO = new LoginClienteDAO();
							
							loginCliente = loginClienteDAO.Consultar_PorIdCliente(clientes.getIdCliente());
							
							if (senha == loginCliente.getSenha()) {
								contaClienteDAO.Excluir_PorID(clientes.getIdCliente());
								
								
								contasDAO.Excluir_TodasContas(clientes.getNomeCliente());
								
								
								clientesDAO.Excluir(clientes.getIdCliente());
								
								Object[] options1 = {"OK"};
								ImageIcon icon1 = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/high-priority.png")));
								JOptionPane.showOptionDialog(null, "Todas as contas e o cliente foram excluidos com sucesso!", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options1, options1[0]);
								
								txtNome.setText(null);
								ftfCpf.setText(null);
								ftfCelular.setText(null);
								txtEmail.setText(null);
								((DefaultTableModel) table.getModel()).setRowCount(0);
								ftfCpf.setEditable(true);
							}
							else {
								Object[] options1 = {"OK"};
								ImageIcon icon1 = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/high-priority.png")));
								JOptionPane.showOptionDialog(null, "Senha inválida!", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options1, options1[0]);
							}
						}
					}
				} catch (Exception e1) {
					Object[] options = {"OK"};
					ImageIcon icon = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/error.png")));
					JOptionPane.showOptionDialog(null, "Erro!!. "
							+ "\n\n1. Verifique se Todos os Campos Foram Preenchidos"
							+ "\n2. Caso Todos Estejam Preenchidos. Verifique se Foram Preenchidos Corretamente" 
							+ "\n\nErro: " + e1, "Erro", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);
				}
			}
		});
		btnExcluir.setIcon(new ImageIcon(TelaPessoaFisica.class.getResource("/br/com/exemplo/view/images/delete.png")));
		btnExcluir.setBounds(478, 94, 48, 40);
		panel_3.add(btnExcluir);
		
		btnSairTela = new JButton("");
		btnSairTela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSairTela.setIcon(new ImageIcon(TelaPessoaFisica.class.getResource("/br/com/exemplo/view/images/exit.png")));
		btnSairTela.setBounds(478, 247, 48, 40);
		panel_3.add(btnSairTela);
		
		btnConsultar = new JButton("");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(ValidarCamposCli() == true) {
						Clientes clientes = new Clientes();
						ClientesDAO clientesDAO = new ClientesDAO();
						
						clientes = clientesDAO.Consultar_PorCPF(ftfCpf.getText());
						
						txtNome.setText(clientes.getNomeCliente());
						ftfCpf.setText(clientes.getCpfCliente());
						ftfCelular.setText(clientes.getCelularCliente());
						txtEmail.setText(clientes.getEmailCliente());
						
						Contas contas = new Contas();
						ContasDAO contasDAO = new ContasDAO();
						
						List<Contas> lista = new ArrayList<Contas>();
						lista = contasDAO.Consultar_PorNomeTitular(clientes.getNomeCliente());
						
						DefaultTableModel model = (DefaultTableModel) table.getModel();
						model.setNumRows(0);
						for (Contas contas1 : lista) {
							model.addRow (new Object[] {
									contas1.getIdConta(),
									contas1.getAgenciaConta(),
									contas1.getNumeroConta(),
									contas1.getTipoConta(),
							});
						}
						
						Object[] options1 = {"OK"};
						ImageIcon icon1 = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/high-priority.png")));
						JOptionPane.showOptionDialog(null, "Consulta realizada com sucesso!", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options1, options1[0]);
						
						ftfCpf.setEditable(false);
					}
				} catch (Exception e1) {
					Object[] options = {"OK"};
					ImageIcon icon = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/error.png")));
					JOptionPane.showOptionDialog(null, "Erro!!. "
							+ "\n\n1. Verifique se Todos os Campos Foram Preenchidos"
							+ "\n2. Caso Todos Estejam Preenchidos. Verifique se Foram Preenchidos Corretamente" 
							+ "\n\nErro: " + e1, "Erro", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);
				}
			}
		});
		btnConsultar.setIcon(new ImageIcon(TelaPessoaFisica.class.getResource("/br/com/exemplo/view/images/search.png")));
		btnConsultar.setBounds(478, 145, 48, 40);
		panel_3.add(btnConsultar);
		
		btnVoltarTelaAnterior = new JButton("");
		btnVoltarTelaAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPessoaFisica telaPessoaFisica = new TelaPessoaFisica();
				telaPessoaFisica.dispose();
				telaPessoaFisica.setVisible(false);
				
				TelaPrincipal telaPrincipal = new TelaPrincipal();
				telaPrincipal.setVisible(true);
			}
		});
		btnVoltarTelaAnterior.setIcon(new ImageIcon(TelaPessoaFisica.class.getResource("/br/com/exemplo/view/images/voltar.png")));
		btnVoltarTelaAnterior.setBounds(478, 196, 48, 40);
		panel_3.add(btnVoltarTelaAnterior);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 171, 426, 90);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID Conta", "Agencia", "N\u00FAmero Conta", "Tipo Conta"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Integer.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(1).setPreferredWidth(150);
		table.getColumnModel().getColumn(2).setPreferredWidth(150);
		table.getColumnModel().getColumn(3).setPreferredWidth(150);
		table.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		scrollPane.setViewportView(table);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setEnabled(false);
		scrollPane_2.setBounds(10, 272, 426, 69);
		panel_3.add(scrollPane_2);
		
		table_3 = new JTable();
		table_3.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id Chave Pix", "Tipo Chave Pix", "Chave Pix", "CPF Cliente"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_3.getColumnModel().getColumn(0).setPreferredWidth(100);
		table_3.getColumnModel().getColumn(1).setPreferredWidth(150);
		table_3.getColumnModel().getColumn(2).setPreferredWidth(200);
		table_3.getColumnModel().getColumn(3).setPreferredWidth(200);
		scrollPane_2.setViewportView(table_3);
		
		panel_6 = new JPanel();
		tabCliente.addTab("Transações", null, panel_6, null);
		panel_6.setLayout(null);
		
		lblNewLabel_16 = new JLabel("Tipo Transa\u00E7\u00E3o");
		lblNewLabel_16.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_16.setBounds(10, 44, 98, 20);
		panel_6.add(lblNewLabel_16);
		
		cmbTipoTransacao = new JComboBox();
		cmbTipoTransacao.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(cmbTipoTransacao.getSelectedIndex() == 1 || cmbTipoTransacao.getSelectedIndex() == 2) {
					txtAgenciaDestino.setEditable(false);
					ftfNumeroContaDestino.setEditable(false);
					ftfCpfTitularConta.setEditable(false);
					cmbTipoPix.setEnabled(false);
					ftfCpfPix.setEditable(false);
					ftfCelularPix.setEditable(false);
					txtEmailPix.setEditable(false);
					txtAleatoriaPix.setEditable(false);
				}
				else if (cmbTipoTransacao.getSelectedIndex() == 3) {
					cmbTipoPix.setEnabled(false);
					ftfCpfPix.setEditable(false);
					ftfCelularPix.setEditable(false);
					txtEmailPix.setEditable(false);
					txtAleatoriaPix.setEditable(false);
					txtAgenciaDestino.setEditable(true);
					ftfNumeroContaDestino.setEditable(true);
					ftfCpfTitularConta.setEditable(true);
				}
//				else if (cmbTipoTransacao.getSelectedIndex() == 4) {
//					txtAgenciaDestino.setEditable(false);
//					ftfNumeroContaDestino.setEditable(false);
//					ftfCpfTitularConta.setEditable(false);
//					cmbTipoPix.setEnabled(true);
//					ftfCpfPix.setEditable(true);
//					ftfCelularPix.setEditable(true);
//					txtEmailPix.setEditable(true);
//					txtAleatoriaPix.setEditable(true);
//				}
				else {
					txtAgenciaDestino.setEditable(true);
					ftfNumeroContaDestino.setEditable(true);
					ftfCpfTitularConta.setEditable(true);
					cmbTipoPix.setEnabled(true);
					ftfCpfPix.setEditable(true);
					ftfCelularPix.setEditable(true);
					txtEmailPix.setEditable(true);
					txtAleatoriaPix.setEditable(true);
				}
			}
		});
		cmbTipoTransacao.setModel(new DefaultComboBoxModel(new String[] {"", "Dep\u00F3sito", "Saque", "Transfer\u00EAncia", "PIX"}));
		cmbTipoTransacao.setBounds(118, 43, 191, 22);
		panel_6.add(cmbTipoTransacao);
		
		lblValidarTipoTransacao = new JLabel("*");
		lblValidarTipoTransacao.setVisible(false);
		lblValidarTipoTransacao.setForeground(Color.RED);
		lblValidarTipoTransacao.setFont(new Font("Arial", Font.BOLD, 14));
		lblValidarTipoTransacao.setBounds(98, 43, 28, 20);
		panel_6.add(lblValidarTipoTransacao);
		
		lblNewLabel_18 = new JLabel("Valor");
		lblNewLabel_18.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_18.setBounds(10, 76, 40, 20);
		panel_6.add(lblNewLabel_18);
		
		txtValor = new JTextField();
		txtValor.setBounds(118, 76, 191, 20);
		panel_6.add(txtValor);
		txtValor.setColumns(10);
		
		lblValidarValor = new JLabel("*");
		lblValidarValor.setVisible(false);
		lblValidarValor.setForeground(Color.RED);
		lblValidarValor.setFont(new Font("Arial", Font.BOLD, 14));
		lblValidarValor.setBounds(42, 75, 28, 20);
		panel_6.add(lblValidarValor);
		
		lblNewLabel_20 = new JLabel("CPF Cliente");
		lblNewLabel_20.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_20.setBounds(10, 107, 98, 20);
		panel_6.add(lblNewLabel_20);
		
		lblValidarCpfCliente = new JLabel("*");
		lblValidarCpfCliente.setVisible(false);
		lblValidarCpfCliente.setForeground(Color.RED);
		lblValidarCpfCliente.setFont(new Font("Arial", Font.BOLD, 14));
		lblValidarCpfCliente.setBounds(80, 107, 28, 20);
		panel_6.add(lblValidarCpfCliente);
		
		ftfCpfCliente = new JFormattedTextField();
		ftfCpfCliente.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				ftfCpfCliente.setCaretPosition(0);
			}
		});
		ftfCpfCliente.setBounds(118, 107, 191, 20);
		formatarCampo();
		panel_6.add(ftfCpfCliente);
		
		lblNewLabel_22 = new JLabel("Data Transa\u00E7\u00E3o");
		lblNewLabel_22.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_22.setBounds(10, 138, 98, 20);
		panel_6.add(lblNewLabel_22);
		
		lblValidarDataTransacao = new JLabel("*");
		lblValidarDataTransacao.setVisible(false);
		lblValidarDataTransacao.setForeground(Color.RED);
		lblValidarDataTransacao.setFont(new Font("Arial", Font.BOLD, 14));
		lblValidarDataTransacao.setBounds(102, 137, 28, 20);
		panel_6.add(lblValidarDataTransacao);
		
		lblTransaes = new JLabel("Transa\u00E7\u00F5es");
		lblTransaes.setHorizontalAlignment(SwingConstants.CENTER);
		lblTransaes.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblTransaes.setBounds(10, 11, 540, 21);
		panel_6.add(lblTransaes);
		
		lblAgenciaDestino = new JLabel("Agencia Destino");
		lblAgenciaDestino.setFont(new Font("Arial", Font.PLAIN, 12));
		lblAgenciaDestino.setBounds(10, 231, 98, 20);
		panel_6.add(lblAgenciaDestino);
		
		txtAgenciaDestino = new JTextField();
		txtAgenciaDestino.setColumns(10);
		txtAgenciaDestino.setBounds(118, 231, 191, 20);
		panel_6.add(txtAgenciaDestino);
		
		lblNewLabel_25 = new JLabel("Conta Destino");
		lblNewLabel_25.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_25.setBounds(10, 262, 98, 20);
		panel_6.add(lblNewLabel_25);
		
		ftfNumeroContaDestino = new JFormattedTextField();
		ftfNumeroContaDestino.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				ftfNumeroContaDestino.setCaretPosition(0);
			}
		});
		formatarCampo();
		ftfNumeroContaDestino.setBounds(118, 262, 191, 20);
		panel_6.add(ftfNumeroContaDestino);
		
		lblNewLabel_26 = new JLabel("CPF Titular");
		lblNewLabel_26.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_26.setBounds(10, 293, 98, 20);
		panel_6.add(lblNewLabel_26);
		
		ftfCpfTitularConta = new JFormattedTextField();
		ftfCpfTitularConta.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				ftfCpfTitularConta.setCaretPosition(0);
			}
		});
		formatarCampo();
		ftfCpfTitularConta.setBounds(118, 293, 191, 20);
		panel_6.add(ftfCpfTitularConta);
		
		cmbTipoPix = new JComboBox();
		cmbTipoPix.setEnabled(false);
		cmbTipoPix.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(cmbTipoPix.getSelectedIndex() == 1) {
					ftfCpfPix.setVisible(true);
					ftfCelularPix.setVisible(false);
					txtEmailPix.setVisible(false);
					txtAleatoriaPix.setVisible(false);
				}
				else if (cmbTipoPix.getSelectedIndex() == 2) {
					ftfCpfPix.setVisible(false);
					ftfCelularPix.setVisible(true);
					txtEmailPix.setVisible(false);
					txtAleatoriaPix.setVisible(false);
				}
				else if (cmbTipoPix.getSelectedIndex() == 3) {
					ftfCpfPix.setVisible(false);
					ftfCelularPix.setVisible(false);
					txtEmailPix.setVisible(true);
					txtAleatoriaPix.setVisible(false);
				}
				else if (cmbTipoPix.getSelectedIndex() == 4) {
					ftfCpfPix.setVisible(false);
					ftfCelularPix.setVisible(false);
					txtEmailPix.setVisible(false);
					txtAleatoriaPix.setVisible(true);
				}
			}
		});
		cmbTipoPix.setModel(new DefaultComboBoxModel(new String[] {"", "CPF", "Celular", "Email", "Aleat\u00F3ria"}));
		cmbTipoPix.setBounds(118, 324, 191, 22);
		panel_6.add(cmbTipoPix);
		
		lblNewLabel_27 = new JLabel("Tipo PIX");
		lblNewLabel_27.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_27.setBounds(10, 324, 98, 20);
		panel_6.add(lblNewLabel_27);
		
		ftfCpfPix = new JFormattedTextField();
		ftfCpfPix.setEnabled(false);
		ftfCpfPix.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				ftfCpfPix.setCaretPosition(0);
			}
		});
		formatarCampo();
		ftfCpfPix.setBounds(359, 325, 191, 20);
		formatarCampo();
		panel_6.add(ftfCpfPix);
		
		ftfCelularPix = new JFormattedTextField();
		ftfCelularPix.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				ftfCelularPix.setCaretPosition(0);
			}
		});
		formatarCampo();
		ftfCelularPix.setBounds(359, 325, 191, 20);
		panel_6.add(ftfCelularPix);
		
		txtAleatoriaPix = new JTextField();
		txtAleatoriaPix.setColumns(10);
		txtAleatoriaPix.setBounds(359, 325, 191, 20);
		panel_6.add(txtAleatoriaPix);
		
		txtEmailPix = new JTextField();
		txtEmailPix.setColumns(10);
		txtEmailPix.setBounds(359, 325, 191, 20);
		panel_6.add(txtEmailPix);
		
		lblValidarAgencia = new JLabel("*");
		lblValidarAgencia.setVisible(false);
		lblValidarAgencia.setForeground(Color.RED);
		lblValidarAgencia.setFont(new Font("Arial", Font.BOLD, 14));
		lblValidarAgencia.setBounds(98, 169, 28, 20);
		panel_6.add(lblValidarAgencia);
		
		lblValidarNumeroConta = new JLabel("*");
		lblValidarNumeroConta.setVisible(false);
		lblValidarNumeroConta.setForeground(Color.RED);
		lblValidarNumeroConta.setFont(new Font("Arial", Font.BOLD, 14));
		lblValidarNumeroConta.setBounds(90, 199, 28, 20);
		panel_6.add(lblValidarNumeroConta);
		
		lblValidarCpfTitular = new JLabel("*");
		lblValidarCpfTitular.setVisible(false);
		lblValidarCpfTitular.setForeground(Color.RED);
		lblValidarCpfTitular.setFont(new Font("Arial", Font.BOLD, 14));
		lblValidarCpfTitular.setBounds(80, 293, 28, 20);
		panel_6.add(lblValidarCpfTitular);
		
		lblValidarTipoPix = new JLabel("*");
		lblValidarTipoPix.setVisible(false);
		lblValidarTipoPix.setForeground(Color.RED);
		lblValidarTipoPix.setFont(new Font("Arial", Font.BOLD, 14));
		lblValidarTipoPix.setBounds(59, 324, 28, 20);
		panel_6.add(lblValidarTipoPix);
		
		lblNewLabel_32 = new JLabel("PIX");
		lblNewLabel_32.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_32.setBounds(319, 324, 30, 20);
		panel_6.add(lblNewLabel_32);
		
		lblValidarPix = new JLabel("*");
		lblValidarPix.setVisible(false);
		lblValidarPix.setForeground(Color.RED);
		lblValidarPix.setFont(new Font("Arial", Font.BOLD, 14));
		lblValidarPix.setBounds(342, 322, 28, 20);
		panel_6.add(lblValidarPix);
		
		lblValidarObrigatorio = new JLabel("* Preenchimento Obrigat\u00F3rio");
		lblValidarObrigatorio.setVisible(false);
		lblValidarObrigatorio.setForeground(Color.RED);
		lblValidarObrigatorio.setFont(new Font("Arial", Font.BOLD, 14));
		lblValidarObrigatorio.setBounds(10, 351, 208, 20);
		panel_6.add(lblValidarObrigatorio);
		
		ftfDataTransacao = new JFormattedTextField();
		ftfDataTransacao.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				ftfDataTransacao.setCaretPosition(0);
			}
		});
		formatarCampo();
		ftfDataTransacao.setBounds(118, 138, 191, 20);
		panel_6.add(ftfDataTransacao);
		
		btnSalvarTransacao = new JButton("");
		btnSalvarTransacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(ValidarCamposTransacoes() == true) {
						if(cmbTipoTransacao.getSelectedItem().toString().equals("Depósito")) {
							Clientes clientes = new Clientes();
							ClientesDAO clientesDAO = new ClientesDAO();
							
							clientes = clientesDAO.Consultar_PorCPF(ftfCpfCliente.getText());
							
							Contas contas = new Contas();
							ContasDAO contasDAO = new ContasDAO();
							
							contas = contasDAO.Consultar_PorDadosConta2(clientes.getNomeCliente(), Integer.parseInt(txtAgenciaCliente.getText()), ftfNumeroContaCliente.getText());
							
							Double saldoConta = contas.getSaldoConta();
							String valorString = txtValor.getText();
							Double valor = Double.parseDouble(valorString);
							
							contas.setSaldoConta(saldoConta + valor);
							
							int senha = Integer.parseInt(JOptionPane.showInputDialog(null, "Solicite que o cliente digite a senha"));
							
							LoginCliente loginCliente = new LoginCliente();
							LoginClienteDAO loginClienteDAO = new LoginClienteDAO();
							
							loginCliente = loginClienteDAO.Consultar_PorIdCliente(clientes.getIdCliente());
							
							if (senha == loginCliente.getSenha()) {
								contasDAO.Alterar(contas);
								
								Object[] options1 = {"OK"};
								ImageIcon icon1 = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/high-priority.png")));
								JOptionPane.showOptionDialog(null, "Depósito realizado com sucesso!", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options1, options1[0]);
							
							}
							else {
								Object[] options1 = {"OK"};
								ImageIcon icon1 = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/high-priority.png")));
								JOptionPane.showOptionDialog(null, "Senha inválida!", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options1, options1[0]);
							}
							
						}
						else if (cmbTipoTransacao.getSelectedItem().toString().equals("Saque")) {
							Clientes clientes = new Clientes();
							ClientesDAO clientesDAO = new ClientesDAO();
							
							clientes = clientesDAO.Consultar_PorCPF(ftfCpfCliente.getText());
							
							Contas contas = new Contas();
							ContasDAO contasDAO = new ContasDAO();
							
							contas = contasDAO.Consultar_PorDadosConta2(clientes.getNomeCliente(), Integer.parseInt(txtAgenciaCliente.getText()), ftfNumeroContaCliente.getText());
							
							Double saldoConta = contas.getSaldoConta();
							String valorString = txtValor.getText();
							Double valor = Double.parseDouble(valorString);
							
							if (saldoConta >= Double.parseDouble(txtValor.getText())) {
								contas.setSaldoConta(saldoConta - valor);
								
								int senha = Integer.parseInt(JOptionPane.showInputDialog(null, "Solicite que o cliente digite a senha"));
								
								LoginCliente loginCliente = new LoginCliente();
								LoginClienteDAO loginClienteDAO = new LoginClienteDAO();
								
								loginCliente = loginClienteDAO.Consultar_PorIdCliente(clientes.getIdCliente());
								
								if (senha == loginCliente.getSenha()) {
									contasDAO.Alterar(contas);
									
									Object[] options1 = {"OK"};
									ImageIcon icon1 = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/high-priority.png")));
									JOptionPane.showOptionDialog(null, "Saque realizado com sucesso!", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options1, options1[0]);
								
								}
								else {
									Object[] options1 = {"OK"};
									ImageIcon icon1 = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/high-priority.png")));
									JOptionPane.showOptionDialog(null, "Senha inválida!", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options1, options1[0]);
								}
								
							}
							else {
								Object[] options1 = {"OK"};
								ImageIcon icon1 = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/high-priority.png")));
								JOptionPane.showOptionDialog(null, "Saldo Insuficiente", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options1, options1[0]);
							}
						}
						else if (cmbTipoTransacao.getSelectedItem().toString().equals("Transferência")) {
							Clientes clientes = new Clientes();
							ClientesDAO clientesDAO = new ClientesDAO();
							
							clientes = clientesDAO.Consultar_PorCPF(ftfCpfCliente.getText());
							
							Contas contas = new Contas();
							ContasDAO contasDAO = new ContasDAO();
							
							contas = contasDAO.Consultar_PorDadosConta2(clientes.getNomeCliente(), Integer.parseInt(txtAgenciaCliente.getText()), ftfNumeroContaCliente.getText());
							
							Double saldoConta = contas.getSaldoConta();
							String valorString = txtValor.getText();
							Double valor = Double.parseDouble(valorString);
							
							if (saldoConta >= Double.parseDouble(txtValor.getText())) {
								contas.setSaldoConta(saldoConta - valor);
								
								int senha = Integer.parseInt(JOptionPane.showInputDialog(null, "Solicite que o cliente digite a senha"));
								
								LoginCliente loginCliente = new LoginCliente();
								LoginClienteDAO loginClienteDAO = new LoginClienteDAO();
								
								loginCliente = loginClienteDAO.Consultar_PorIdCliente(clientes.getIdCliente());
								
								if (senha == loginCliente.getSenha()) {
									contasDAO.Alterar(contas);
									
									Clientes clientesDestino = new Clientes();
									
									clientesDestino = clientesDAO.Consultar_PorCPF(ftfCpfTitularConta.getText());
									
									Contas contasDestino = new Contas();
									
									contasDestino = contasDAO.Consultar_PorDadosConta2(clientesDestino.getNomeCliente(), Integer.parseInt(txtAgenciaDestino.getText()), ftfNumeroContaDestino.getText());
									
									Double saldoContaDestino = contasDestino.getSaldoConta();
									String valorStringDestino = txtValor.getText();
									Double valorDestino = Double.parseDouble(valorStringDestino);
									
									contasDestino.setSaldoConta(saldoContaDestino + valorDestino);
									
									contasDAO.Alterar(contasDestino);
									
									Object[] options1 = {"OK"};
									ImageIcon icon1 = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/high-priority.png")));
									JOptionPane.showOptionDialog(null, "Tranferência realizada com sucesso!", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options1, options1[0]);
								}
								else {
									Object[] options1 = {"OK"};
									ImageIcon icon1 = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/high-priority.png")));
									JOptionPane.showOptionDialog(null, "Senha inválida!", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options1, options1[0]);
								}
							
							} else {
								Object[] options1 = {"OK"};
								ImageIcon icon1 = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/high-priority.png")));
								JOptionPane.showOptionDialog(null, "Saldo Insuficiente!", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options1, options1[0]);
							
							}
						}
					}
				} catch (Exception e1) {
					Object[] options = {"OK"};
					ImageIcon icon = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/error.png")));
					JOptionPane.showOptionDialog(null, "Erro!!. "
							+ "\n\n1. Verifique se Todos os Campos Foram Preenchidos"
							+ "\n2. Caso Todos Estejam Preenchidos. Verifique se Foram Preenchidos Corretamente" 
							+ "\n\nErro: " + e1, "Erro", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);
				}
			}
		});
		btnSalvarTransacao.setIcon(new ImageIcon(TelaPessoaFisica.class.getResource("/br/com/exemplo/view/images/save.png")));
		btnSalvarTransacao.setBounds(427, 56, 48, 40);
		panel_6.add(btnSalvarTransacao);
		
		btnVoltaTudo = new JButton("");
		btnVoltaTudo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPessoaFisica telaPessoaFisica = new TelaPessoaFisica();
				telaPessoaFisica.dispose();
				telaPessoaFisica.setVisible(false);
				
				TelaPrincipal telaPrincipal = new TelaPrincipal();
				telaPrincipal.setVisible(true);
			}
		});
		btnVoltaTudo.setIcon(new ImageIcon(TelaPessoaFisica.class.getResource("/br/com/exemplo/view/images/voltar.png")));
		btnVoltaTudo.setBounds(427, 179, 48, 40);
		panel_6.add(btnVoltaTudo);
		
		btnSairTudo = new JButton("");
		btnSairTudo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSairTudo.setIcon(new ImageIcon(TelaPessoaFisica.class.getResource("/br/com/exemplo/view/images/exit.png")));
		btnSairTudo.setBounds(427, 242, 48, 40);
		panel_6.add(btnSairTudo);
		
		btnPDF = new JButton("");
		btnPDF.setIcon(new ImageIcon(TelaPessoaFisica.class.getResource("/br/com/exemplo/view/images/pdf-2.png")));
		btnPDF.setBounds(427, 118, 48, 40);
		panel_6.add(btnPDF);
		
		ftfNumeroContaCliente = new JFormattedTextField();
		formatarCampo();
		ftfNumeroContaCliente.setBounds(118, 200, 191, 20);
		panel_6.add(ftfNumeroContaCliente);
		
		txtAgenciaCliente = new JTextField();
		txtAgenciaCliente.setColumns(10);
		txtAgenciaCliente.setBounds(118, 169, 191, 20);
		panel_6.add(txtAgenciaCliente);
		
		lblAgenciaCliente = new JLabel("Agencia Cliente");
		lblAgenciaCliente.setFont(new Font("Arial", Font.PLAIN, 12));
		lblAgenciaCliente.setBounds(10, 169, 98, 20);
		panel_6.add(lblAgenciaCliente);
		
		lblNewLabel_17 = new JLabel("Conta Cliente");
		lblNewLabel_17.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_17.setBounds(10, 200, 98, 20);
		panel_6.add(lblNewLabel_17);
		
		lblValidarAgenciaDestino = new JLabel("*");
		lblValidarAgenciaDestino.setVisible(false);
		lblValidarAgenciaDestino.setForeground(Color.RED);
		lblValidarAgenciaDestino.setFont(new Font("Arial", Font.BOLD, 14));
		lblValidarAgenciaDestino.setBounds(104, 230, 28, 20);
		panel_6.add(lblValidarAgenciaDestino);
		
		lblValidarContaDestino = new JLabel("*");
		lblValidarContaDestino.setVisible(false);
		lblValidarContaDestino.setForeground(Color.RED);
		lblValidarContaDestino.setFont(new Font("Arial", Font.BOLD, 14));
		lblValidarContaDestino.setBounds(95, 262, 28, 20);
		panel_6.add(lblValidarContaDestino);
		
		panel_5 = new JPanel();
		tabCliente.addTab("Listar Clientes e Contas", null, panel_5, null);
		panel_5.setLayout(null);
		
		lblListarTodasAs = new JLabel("Listar Todas as Contas e Clientes");
		lblListarTodasAs.setHorizontalAlignment(SwingConstants.CENTER);
		lblListarTodasAs.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblListarTodasAs.setBounds(10, 11, 540, 21);
		panel_5.add(lblListarTodasAs);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 43, 482, 324);
		panel_5.add(scrollPane_1);
		
		table_2 = new JTable();
		table_2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id Cliente", "Nome Cliente", "CPF Cliente", "Celular Cliente", "Email Cliente", "Id Conta", "Titular Conta", "Agencia Conta", "N\u00FAmero Conta", "Tipo Conta", "Saldo Conta", "Id Chave Pix", "Tipo Chave Pix", "Chave Pix", "CPF Cliente"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, String.class, Integer.class, String.class, Integer.class, String.class, Integer.class, Double.class, Integer.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_2.getColumnModel().getColumn(0).setPreferredWidth(100);
		table_2.getColumnModel().getColumn(1).setPreferredWidth(250);
		table_2.getColumnModel().getColumn(2).setPreferredWidth(150);
		table_2.getColumnModel().getColumn(3).setPreferredWidth(150);
		table_2.getColumnModel().getColumn(4).setPreferredWidth(150);
		table_2.getColumnModel().getColumn(5).setPreferredWidth(100);
		table_2.getColumnModel().getColumn(6).setPreferredWidth(250);
		table_2.getColumnModel().getColumn(7).setPreferredWidth(150);
		table_2.getColumnModel().getColumn(8).setPreferredWidth(150);
		table_2.getColumnModel().getColumn(9).setPreferredWidth(150);
		table_2.getColumnModel().getColumn(10).setPreferredWidth(100);
		table_2.getColumnModel().getColumn(11).setPreferredWidth(150);
		table_2.getColumnModel().getColumn(12).setPreferredWidth(150);
		table_2.getColumnModel().getColumn(13).setPreferredWidth(150);
		table_2.getColumnModel().getColumn(14).setPreferredWidth(150);
		scrollPane_1.setViewportView(table_2);
		
		btnListarTodos = new JButton("");
		btnListarTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ClientesDAO clientesDAO = new ClientesDAO();
					ContasDAO contasDAO = new ContasDAO();
					
					List<Clientes> lista = new ArrayList<Clientes>();
					lista = clientesDAO.ListarTodos();
					
					List<Contas> lista2 = new ArrayList<Contas>();
					
					DefaultTableModel model = (DefaultTableModel) table_2.getModel();
					model.setNumRows(0);
					for (Clientes clientes : lista) {
						lista2 = contasDAO.Consultar_PorNomeTitular(clientes.getNomeCliente());
						for (Contas contas : lista2) {
							model.addRow (new Object[] {
									clientes.getIdCliente(),
									clientes.getNomeCliente(),
									clientes.getCpfCliente(),
									clientes.getCelularCliente(),
									clientes.getEmailCliente(),
									contas.getIdConta(),
									contas.getTitularConta(),
									contas.getAgenciaConta(),
									contas.getNumeroConta(),
									contas.getTipoConta(),
									contas.getSaldoConta(),
								});
						}
					}
					JOptionPane.showMessageDialog(null, "Funcionários Listados com Sucesso");
				} catch (Exception e1) {
					Object[] options = {"OK"};
					ImageIcon icon = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/exemplo/view/images/error.png")));
					JOptionPane.showOptionDialog(null, "Erro!!. "
							+ "\n\nErro: " + e1, "Erro", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);
				}
			}
		});
		btnListarTodos.setIcon(new ImageIcon(TelaPessoaFisica.class.getResource("/br/com/exemplo/view/images/lista-de-controle.png")));
		btnListarTodos.setBounds(502, 57, 48, 50);
		panel_5.add(btnListarTodos);
		
		btnVoltarTelas = new JButton("");
		btnVoltarTelas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPessoaFisica telaPessoaFisica = new TelaPessoaFisica();
				telaPessoaFisica.dispose();
				telaPessoaFisica.setVisible(false);
				
				TelaPrincipal telaPrincipal = new TelaPrincipal();
				telaPrincipal.setVisible(true);
			}
		});
		btnVoltarTelas.setIcon(new ImageIcon(TelaPessoaFisica.class.getResource("/br/com/exemplo/view/images/voltar.png")));
		btnVoltarTelas.setBounds(502, 164, 48, 50);
		panel_5.add(btnVoltarTelas);
		
		btnSairTelas = new JButton("");
		btnSairTelas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSairTelas.setIcon(new ImageIcon(TelaPessoaFisica.class.getResource("/br/com/exemplo/view/images/exit.png")));
		btnSairTelas.setBounds(502, 271, 48, 50);
		panel_5.add(btnSairTelas);
		this.setLocationRelativeTo(null);
	}
}
