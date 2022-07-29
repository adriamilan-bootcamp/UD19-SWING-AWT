
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraGrafica extends JFrame {

	// Panel de la aplicacion
	private JPanel contentPane;
	
	public CalculadoraGrafica() {
		
		// Anadimos un titulo al programa
		setTitle("Saludador");
		
		// Coordenadas x y  de la aplicacion
		setBounds(400, 200, 425, 207);
		
		// Indica cuando se cierra la ventana se cierra la aplicacion
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Hace visible la ventana
		setVisible(true);
		
		// Creamos el panel
		contentPane = new JPanel();
		
		// Indicamos el diseno del panel
		contentPane.setLayout(null);
		
		// Asignamos el panel a la ventana
		setContentPane(contentPane);
		
		JLabel lblValor = new JLabel("Valor1");
		lblValor.setBounds(20, 12, 70, 15);
		contentPane.add(lblValor);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(20, 32, 91, 21);
		contentPane.add(textPane);
		
		JLabel lblValor_1 = new JLabel("Valor2");
		lblValor_1.setBounds(20, 62, 70, 15);
		contentPane.add(lblValor_1);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(20, 82, 91, 21);
		contentPane.add(textPane_1);
		
		JLabel lblValor_1_1 = new JLabel("Resultado");
		lblValor_1_1.setBounds(20, 112, 110, 15);
		contentPane.add(lblValor_1_1);
		
		JTextPane textPane_1_1 = new JTextPane();
		textPane_1_1.setEditable(false);
		textPane_1_1.setBounds(20, 132, 91, 21);
		contentPane.add(textPane_1_1);
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.setBounds(130, 10, 117, 25);
		
		btnSumar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				textPane_1_1.setText(String.valueOf(Double.parseDouble(textPane.getText()) + Double.parseDouble(textPane_1.getText())));
				
			}
		});
		contentPane.add(btnSumar);
		
		JButton btnRestar = new JButton("Restar");
		btnRestar.setBounds(130, 40, 117, 25);
		
		btnRestar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				textPane_1_1.setText(String.valueOf(Double.parseDouble(textPane.getText()) - Double.parseDouble(textPane_1.getText())));
				
			}
		});
		contentPane.add(btnRestar);
		
		JButton btnSumar_1_1 = new JButton("Multiplicar");
		btnSumar_1_1.setBounds(130, 70, 117, 25);
		
		btnSumar_1_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				textPane_1_1.setText(String.valueOf(Double.parseDouble(textPane.getText()) * Double.parseDouble(textPane_1.getText())));
				
			}
		});
		contentPane.add(btnSumar_1_1);
		
		JButton btnSumar_1_1_1 = new JButton("Dividir");
		btnSumar_1_1_1.setBounds(130, 100, 117, 25);
		
		btnSumar_1_1_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				textPane_1_1.setText(String.valueOf(Double.parseDouble(textPane.getText()) / Double.parseDouble(textPane_1.getText())));
				
			}
		});
		contentPane.add(btnSumar_1_1_1);
		
		JButton btnSumar_1_1_1_1 = new JButton("Salir");
		btnSumar_1_1_1_1.setBounds(130, 130, 117, 25);
		
		btnSumar_1_1_1_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		contentPane.add(btnSumar_1_1_1_1);
		
		
		JLabel labelAns = new JLabel("");
		labelAns.setBounds(303, 32, 46, 14);
		contentPane.add(labelAns);
		
		
		JButton btnSumar_1_1_1_1_1 = new JButton("About");
		btnSumar_1_1_1_1_1.setBounds(275, 130, 117, 25);
		
		btnSumar_1_1_1_1_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Creadores:\n=> Felipe\n=> Adria\n=> Josep\n\nOpenJDK 1.8\nMiniCalculadora 1.0v");
				
			}
		});
		
		contentPane.add(btnSumar_1_1_1_1_1);
		
		
		
	}
}
