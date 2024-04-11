package semana03;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Formulario01 extends JFrame {

	private JPanel contentPane;
	private JTextArea txtS;
	private JTextField txtCantidad;
	private JComboBox cboCodigo;

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
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(22, 67, 46, 14);
		contentPane.add(lblCantidad);
		
		JLabel lblPrecio = new JLabel("Codigo");
		lblPrecio.setBounds(22, 30, 46, 14);
		contentPane.add(lblPrecio);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double importeCompra, descuento, importePagar;
				String regalo;

				String cantidad = txtCantidad.getText();
				String precio = txtPrecio.getText();

				int icantidad = Integer.parseInt(cantidad);
				double dprecio= Double.parseDouble(precio);

				importeCompra= icantidad*dprecio;

				if (icantidad > 10){
					descuento = 0.15*importeCompra;
				} else{
					descuento = 0.05*importeCompra;
				}

				importePagar= importeCompra- descuento;
				
				if (importePagar > 200){
					regalo = "Agenda";	
				}else{
					regalo = "Cuaderno";
				}

				txtS.append("Obsequio : " + regalo);
				/*
				xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
				El nombre es : Juan
				La edad es   : 20
				El sueldo es : 2500
				xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
				*/
				String nombre= "Juan";
				int edad = 20;
				double sueldo = 2500;
				String resultado;
				resultado = "El nombre es : " + nombre + "\n" +
							"La edad es   : " + edad   + "\n" +
							"El sueldo es : " + sueldo;

				txtS.append(resultado);



			
			
			}
		});
		btnProcesar.setBounds(299, 26, 89, 23);
		contentPane.add(btnProcesar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(299, 63, 89, 23);
		contentPane.add(btnLimpiar);
		
		txtS = new JTextArea();
		txtS.setBounds(22, 103, 370, 120);
		contentPane.add(txtS);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(87, 64, 86, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		cboCodigo = new JComboBox();
		cboCodigo.setBounds(87, 27, 130, 20);
		contentPane.add(cboCodigo);
	}
}
