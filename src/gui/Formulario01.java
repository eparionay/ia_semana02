package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Formulario01 extends JFrame {
	private JTextField txtCantidad;
	private JComboBox cboModelo;
	private JTextArea txtSResultado;
	private JTextField txtPrecio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario01 frame = new Formulario01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Formulario01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(29, 34, 46, 14);
		contentPane.add(lblModelo);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(29, 75, 46, 14);
		contentPane.add(lblCantidad);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(98, 72, 143, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		cboModelo = new JComboBox();
		cboModelo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				
				int indice = cboModelo.getSelectedIndex();
				
				if (indice == 0) {
					txtPrecio.setText("10.5");
				}else if (indice ==1) {
					txtPrecio.setText("35.5");
				}else {
					txtPrecio.setText("150.80");
				}
			}
		});
		cboModelo.setBounds(98, 31, 143, 20);
		contentPane.add(cboModelo);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Capturar un comboBox
				
				String modelo = cboModelo.getSelectedItem().toString();
				// Captura un TextField
				String cantidad = txtCantidad.getText();
				
				int iCantidad = Integer.parseInt(cantidad);
				
				
				// "CUALQUIER TEXTO" + nombreVariable
				
				txtSResultado.append(
						"Modelo :" + modelo + "\n" +
						"Cantidad : " + iCantidad 
						
						);
				
				
				
				
				
			}
		});
		btnProcesar.setBounds(314, 30, 89, 23);
		contentPane.add(btnProcesar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSResultado.setText("");
				txtCantidad.setText("");
				cboModelo.setSelectedIndex(0);
				
			}
		});
		btnBorrar.setBounds(314, 71, 89, 23);
		contentPane.add(btnBorrar);
		
		
		
		txtSResultado = new JTextArea();
		txtSResultado.setBounds(29, 142, 374, 94);
		contentPane.add(txtSResultado);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(29, 117, 46, 14);
		contentPane.add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(98, 114, 143, 20);
		contentPane.add(txtPrecio);
		
		
		cboModelo.addItem("Porta");
		cboModelo.addItem("Scherman");
		cboModelo.addItem("Nike");
		
	}
}
