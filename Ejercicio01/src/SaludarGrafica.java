
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SaludarGrafica extends JFrame {

	// Panel de la aplicacion
	private JPanel contentPane;
	
	public SaludarGrafica() {
		
		// Anadimos un titulo al programa
		setTitle("Saludador");
		
		// Coordenadas x y  de la aplicacion
		setBounds(400, 200, 350, 175);
		
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
	
		// Creamos un label
		JLabel etiqueta = new JLabel("Escriba un nombre para saludar");
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		
		etiqueta.setBounds(50, 25, 235, 20);
		
		contentPane.add(etiqueta);
		
		// Creamos un TextPane
		JTextPane textPane = new JTextPane();
		textPane.setBounds(80, 57, 167, 21);
		contentPane.add(textPane);
		
		// Creamos un boton
		JButton btnNewButton = new JButton("Saludar!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Metodo que se ejecutara cuando el usuario clique en el boton
				JOptionPane.showMessageDialog(null, "¡Hola " + textPane.getText() + "!");
			}
		});
		btnNewButton.setBounds(110, 90, 117, 25);
		contentPane.add(btnNewButton);
		
	}
}
