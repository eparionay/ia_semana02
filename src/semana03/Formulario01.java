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

public class Formulario01 extends JFrame {

	private JPanel contentPane;
	private JTextField txtCantidad;
	private JTextField txtPrecio;
	private JTextArea txtS;

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
		lblCantidad.setBounds(22, 30, 46, 14);
		contentPane.add(lblCantidad);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(22, 67, 46, 14);
		contentPane.add(lblPrecio);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(78, 27, 191, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.setBounds(299, 26, 89, 23);
		contentPane.add(btnProcesar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(299, 63, 89, 23);
		contentPane.add(btnLimpiar);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(78, 64, 191, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtS = new JTextArea();
		txtS.setBounds(22, 103, 370, 120);
		contentPane.add(txtS);
	}
}
