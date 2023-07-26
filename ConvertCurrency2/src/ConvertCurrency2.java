import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.text.DecimalFormat;

public class ConvertCurrency2 extends JFrame {

	private JPanel contentPane;
	private JTextField Resultado;
	private JTextField N1;

	
	
	// Tasas de cambio fijas (marzo)
	double COP_USD = 0.00025;
	double COP_EUR = 0.00023;
	double COP_GBP = 0.00020;
	double COP_JPY = 0.036;
	double COP_KRW = 0.32;
	double USD_COP = 3.960;
	double EUR_COP = 4374;
	double GBP_COP = 5103;
	double JPY_COP = 28.08;
	double KRW_COP = 3.10;
	private final JLabel lblNewLabel_2 = new JLabel("");
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConvertCurrency2 frame = new ConvertCurrency2();
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
	public ConvertCurrency2() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Future Crime\\eclipse-workspace\\ConvertCurrency2\\img\\monedapeñe.png"));
		lblNewLabel_3.setBounds(10, 22, 94, 83);
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"USD_COP", "EUR_COP", "GBP_COP", "JPY_COP", "KRW_COP", "COP_USD ", "COP_EUR", "COP_GBP ", "COP_JPY ", "COP_KRW "}));
		comboBox_1.setBounds(168, 108, 94, 27);
		contentPane.add(comboBox_1);
		
		
		
		Resultado = new JTextField();
		Resultado.setBounds(137, 146, 156, 28);
		contentPane.add(Resultado);
		Resultado.setColumns(10);
		
		JButton Convertir = new JButton("Convertir");
		Convertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String Item;	
			Item = comboBox_1.getSelectedItem().toString();
			 
			double num1,res;
	
			
			
			if  (Item.equalsIgnoreCase ("USD_COP")) {
				num1 = Double.parseDouble(N1.getText());
				res=num1 / COP_USD;
				double respuesta = (Math.round(res *100.0d)/100);	
				DecimalFormat decimalFormat = new DecimalFormat("0.00");
			    String resultadoFormateado = decimalFormat.format(respuesta);

			    Resultado.setText(resultadoFormateado);
		    }
			
			if   (Item.equalsIgnoreCase ("EUR_COP")) {
				num1 = Double.parseDouble(N1.getText());
				res=num1 / COP_EUR;
				double respuesta = (Math.round(res *100.0d)/100);	
				DecimalFormat decimalFormat = new DecimalFormat("0.00");
			    String resultadoFormateado = decimalFormat.format(respuesta);

			    Resultado.setText(resultadoFormateado);
				}
			if  (Item.equalsIgnoreCase ("GBP_COP")) {
				num1 = Double.parseDouble(N1.getText());
				res=num1 / GBP_COP;
				double respuesta = (Math.round(res *100.0d)/100);	
				DecimalFormat decimalFormat = new DecimalFormat("0.00");
			    String resultadoFormateado = decimalFormat.format(respuesta);

			    Resultado.setText(resultadoFormateado);
		    }
			if  (Item.equalsIgnoreCase ("JPY_COP")) {
				num1 = Double.parseDouble(N1.getText());
				res=num1 / JPY_COP;
				double respuesta = (Math.round(res *100.0d)/100);	
				DecimalFormat decimalFormat = new DecimalFormat("0.00");
			    String resultadoFormateado = decimalFormat.format(respuesta);

			    Resultado.setText(resultadoFormateado);
		    }
			if  (Item.equalsIgnoreCase ("KRW_COP")) {
				num1 = Double.parseDouble(N1.getText());
				res=num1 / KRW_COP;
				double respuesta = (Math.round(res *100.0d)/100);	
				DecimalFormat decimalFormat = new DecimalFormat("0.00");
			    String resultadoFormateado = decimalFormat.format(respuesta);

			    Resultado.setText(resultadoFormateado);
		    }
			if  (Item.equalsIgnoreCase ("COP_USD")) {
				num1 = Double.parseDouble(N1.getText());
				res=num1 / COP_USD;
				double respuesta = (Math.round(res *100.0d)/100);	
				DecimalFormat decimalFormat = new DecimalFormat("0.00");
			    String resultadoFormateado = decimalFormat.format(respuesta);

			    Resultado.setText(resultadoFormateado);
		    }
			if  (Item.equalsIgnoreCase ("COP_EUR")) {
				num1 = Double.parseDouble(N1.getText());
				res=num1 / COP_EUR;
				double respuesta = (Math.round(res *100.0d)/100);	
				DecimalFormat decimalFormat = new DecimalFormat("0.00");
			    String resultadoFormateado = decimalFormat.format(respuesta);

			    Resultado.setText(resultadoFormateado);
		    }
			if  (Item.equalsIgnoreCase ("COP_GBP")) {
				num1 = Double.parseDouble(N1.getText());
				res=num1 / COP_GBP;
				double respuesta = (Math.round(res *100.0d)/100);	
				DecimalFormat decimalFormat = new DecimalFormat("0.00");
			    String resultadoFormateado = decimalFormat.format(respuesta);

			    Resultado.setText(resultadoFormateado);
		    }
			if  (Item.equalsIgnoreCase ("COP_JPY")) {
				num1 = Double.parseDouble(N1.getText());
				res=num1 / COP_JPY;
				double respuesta = (Math.round(res *100.0d)/100);	
				DecimalFormat decimalFormat = new DecimalFormat("0.00");
			    String resultadoFormateado = decimalFormat.format(respuesta);

			    Resultado.setText(resultadoFormateado);
		    }
			if  (Item.equalsIgnoreCase ("COP_KRW")) {
				num1 = Double.parseDouble(N1.getText());
				res=num1 / COP_KRW;
				double respuesta = (Math.round(res *100.0d)/100);	
				DecimalFormat decimalFormat = new DecimalFormat("0.00");
			    String resultadoFormateado = decimalFormat.format(respuesta);

			    Resultado.setText(resultadoFormateado);
		    }
		
		}
		});
		Convertir.setBounds(10, 220, 102, 36);
		contentPane.add(Convertir);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(335, 227, 89, 23);
		contentPane.add(btnSalir);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				N1.setText("");
				Resultado.setText(null);
				N1.requestFocus();
				
				
			}
		});
		btnLimpiar.setBounds(119, 227, 89, 23);
		contentPane.add(btnLimpiar);
		
		JLabel lblNewLabel = new JLabel("Ingresar monto");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(137, 42, 156, 27);
		contentPane.add(lblNewLabel);
		
		N1 = new JTextField();
		N1.setColumns(10);
		N1.setBounds(137, 68, 156, 27);
		contentPane.add(N1);
		
		JLabel lblResultasdo = new JLabel("Resultado");
		lblResultasdo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblResultasdo.setBounds(186, 172, 75, 33);
		contentPane.add(lblResultasdo);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(new Color(248, 248, 255));
		lblNewLabel_1.setBackground(new Color(255, 240, 245));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Future Crime\\eclipse-workspace\\ConvertCurrency2\\img\\opacidad mil.png")  );
		lblNewLabel_1.setBounds(-24, 6, 490, 250);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Future Crime\\eclipse-workspace\\ConvertCurrency2\\img\\pngwing.com (1).png"));
		lblNewLabel_2.setBounds(218, -2, 311, 258);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Future Crime\\eclipse-workspace\\ConvertCurrency2\\img\\pepe.png"));
		lblNewLabel_4.setBounds(18, 92, 102, 60);
		contentPane.add(lblNewLabel_4);
		float opacity = 30;
		
	 
	}
}