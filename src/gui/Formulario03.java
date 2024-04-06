package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Formulario03 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtNacimiento;
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
		txtAñoNacimiento.setBounds(167, 50, 184, 20);
		contentPane.add(txtAñoNacimiento);
		txtAñoNacimiento.setColumns(10);
		
		JLabel lblPesoEnKilogramos = new JLabel("Peso en Kilogramos");
		lblPesoEnKilogramos.setBounds(20, 85, 128, 14);
		contentPane.add(lblPesoEnKilogramos);
		
		txtNacimiento = new JTextField();
		txtNacimiento.setBounds(167, 81, 184, 20);
		contentPane.add(txtNacimiento);
		txtNacimiento.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.setBounds(20, 116, 89, 23);
		contentPane.add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(141, 116, 89, 23);
		contentPane.add(btnBorrar);
		
		txtS = new JTextArea();
		txtS.setBounds(20, 150, 358, 100);
		contentPane.add(txtS);
	}
}
