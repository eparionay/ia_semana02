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
				int icantidad;
				double descuento, importePagar;
				String codigo = cboCodigo.getSelectedItem().toString();
				String cantidad = txtCantidad.getText();
				double precio, importeCompra;

				if (codigo.equals("101")){
				    precio = 17.5;
				}else if (codigo.equals("102")){
					precio = 25;
				}else{
					precio= 15;
				}
				icantidad= Integer.parseInt(cantidad);

				importeCompra = precio *icantidad; 
				
				if (icantidad<11){
					descuento= 0.05*importeCompra;
				}else if (icantidad>=11 && icantidad <21){
					descuento = 0.075*importeCompra;
				}else if (icantidad>=21 && icantidad<31){
					descuento = 0.1*importeCompra;
				}else {
					descuento= 0.125*importeCompra;
				}
				importePagar= importeCompra- descuento;

				int caramelos = importePagar > 250 ?  3*icantidad : 2*icantidad;
				
				if (importePagar > 250){
					caramelos=3*icantidad;
				}else{
					caramelos=2*icantidad;
				}
				
				txtS.append("Obsequio Caramelos : " + caramelos);
			
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
		txtCantidad.setBounds(87, 64, 130, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		cboCodigo = new JComboBox();
		cboCodigo.setBounds(87, 27, 130, 20);
		contentPane.add(cboCodigo);

		cboCodigo.addItem("100");
		cboCodigo.addItem("101");
		cboCodigo.addItem("102");
		
	}
}
