package view;



import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.Produtos;
import control.Classedao;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

public class TelaProduto<ClasseDao> {

	private JFrame frame;
	private JTextField txtCodProd;
	private JTextField txtNomeProd;
	private JTextField txtQuantidadeProduto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					@SuppressWarnings("rawtypes")
					TelaProduto window = new TelaProduto();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaProduto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setBounds(29, 25, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		txtCodProd = new JTextField();
		txtCodProd.setBounds(10, 50, 86, 20);
		frame.getContentPane().add(txtCodProd);
		txtCodProd.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome Produto");
		lblNewLabel_1.setBounds(143, 25, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtNomeProd = new JTextField();
		txtNomeProd.setBounds(130, 50, 86, 20);
		frame.getContentPane().add(txtNomeProd);
		txtNomeProd.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Quantidade");
		lblNewLabel_2.setBounds(272, 25, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtQuantidadeProduto = new JTextField();
		txtQuantidadeProduto.setBounds(272, 50, 86, 20);
		frame.getContentPane().add(txtQuantidadeProduto);
		txtQuantidadeProduto.setColumns(10);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				ClasseDao classeDao = new ClasseDao();
				
				Produtos produtos = new Produtos();
		  produtos.setCodprod(Integer.parseInt(txtCodProd.getText()));
          produtos.setNomeprod(txtNomeProd.getText());	
          classeDao.salvar(produtos);
			JOptionPane.showMessageDialog(null, "Nome do Produto Adicionado!");
          produtos.setQntdprod(Integer.parseInt(txtQuantidadeProduto.getText()));
          
			}
		});
		btnEnviar.setBounds(168, 149, 89, 23);
		frame.getContentPane().add(btnEnviar);
	}
}