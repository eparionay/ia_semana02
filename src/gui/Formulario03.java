package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Formulario03 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtPeso;
	private JTextArea txtS;
	private JButton btnBorrar;
	private JButton btnProcesar;
	private JTextField txtAñoNacimiento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario03 frame = new Formulario03();
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
	public Formulario03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombresYApellidos = new JLabel("Nombres y Apellidos");
		lblNombresYApellidos.setBounds(20, 28, 142, 14);
		contentPane.add(lblNombresYApellidos);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(167, 25, 184, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblAoDeNacimiento = new JLabel("A\u00F1o de Nacimiento");
		lblAoDeNacimiento.setBounds(20, 53, 107, 14);
		contentPane.add(lblAoDeNacimiento);
		
		txtAñoNacimiento = new JTextField();
		txtAñoNacimiento.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				
				int tecla = arg0.getKeyChar();
				
				if (!(tecla >= 48 && tecla<=57)){
					arg0.consume();
				}
				
				
			}
		});
		txtAñoNacimiento.setBounds(167, 50, 184, 20);
		contentPane.add(txtAñoNacimiento);
		txtAñoNacimiento.setColumns(10);
		
		JLabel lblPesoEnKilogramos = new JLabel("Peso en Kilogramos");
		lblPesoEnKilogramos.setBounds(20, 85, 128, 14);
		contentPane.add(lblPesoEnKilogramos);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(167, 81, 184, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Declaracion de variables
				String nombre, nacimiento;
				String peso;
				//Entrada de datos
				nombre = txtNombre.getText();
				nacimiento = txtAñoNacimiento.getText();
				peso = txtPeso.getText();
				
				
				double importeCompra = calcularImporte(28.5, 12);
				
				if (nombre.equals("") )
				{
					mensaje("Ingrese un mensaje");
				} else if (nacimiento.equals("")) {
					mensaje("Ingrese una fecha de nacimiento");
				} else if( peso.equals("")){
					mensaje("Ingrese un peso");
				}	else {
					double dpeso = Double.parseDouble(peso);
					txtS.append(" Nombre y Apellidos : " + getNombreCompleto(nombre, " perez") +  "\n" +
							" Nacimiento         : " + nacimiento  +  "\n" +
						    " Peso en Kilogramos : " + dpeso + "\n" +
							" Importe Compra : " + importeCompra
					
							
							
						);
				}
		
			}
		});
		btnProcesar.setBounds(59, 112, 89, 23);
		contentPane.add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				txtNombre.setText("");
				txtAñoNacimiento.setText("");
				txtPeso.setText("");
				txtS.setText("");
				
			}
		});
		btnBorrar.setBounds(201, 112, 89, 23);
		contentPane.add(btnBorrar);
		
		txtS = new JTextArea();
		txtS.setBounds(20, 150, 358, 100);
		contentPane.add(txtS);
	}
	
	
	public void mensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	public String getNombreCompleto(String nombre, String apellido) {
		
		return nombre + " "+ apellido;
	}
	
	public double calcularImporte(double precio, int cantidad) {
		return precio*cantidad;
	}
	
	
	
}
