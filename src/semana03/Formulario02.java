package semana03;

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
import javax.swing.DefaultComboBoxModel;

public class Formulario02 extends JFrame {

	private JPanel contentPane;
	private JTextField txtCantidad;
	private JTextArea txtS;
	private JComboBox cboCodigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario02 frame = new Formulario02();
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
	public Formulario02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantidad");
		lblNewLabel.setBounds(24, 22, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(115, 19, 175, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		cboCodigo = new JComboBox();
		cboCodigo.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3"}));
		cboCodigo.setBounds(115, 58, 175, 20);
		contentPane.add(cboCodigo);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.setBounds(313, 18, 89, 23);
		contentPane.add(btnProcesar);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(24, 61, 46, 14);
		contentPane.add(lblCodigo);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(313, 57, 89, 23);
		contentPane.add(btnLimpiar);
		
		txtS = new JTextArea();
		txtS.setBounds(24, 109, 377, 124);
		contentPane.add(txtS);
	}
}
