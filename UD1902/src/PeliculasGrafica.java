import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JButton;

public class PeliculasGrafica extends JFrame {

	private JPanel contentPane;
	
	public PeliculasGrafica() {
		
		//Creamos el titulo de la ventana
		setTitle("Peliculas");
		
		//Asignamos la accion de terminar el programa al cerrar la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Colocamos la ubicacion y el tamaño de la ventana
		setBounds(700, 200, 549, 206);
		
		//Hacemos visible la ventana
		setVisible(true);
		
		//Creamos el JPanel
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//Vamos creando los diferentes componentes de la ventana
		//Label para la pelicula
		JLabel tituloLabel = new JLabel("Escribe el titulo de una pelicula");
		tituloLabel.setBounds(29, 40, 199, 20);
		contentPane.add(tituloLabel);
		
		//TextField para escribir el titulo de la pelicula
		JTextField tituloPelicula = new JTextField();
		tituloPelicula.setBounds(39, 71, 127, 20);
		contentPane.add(tituloPelicula);
		tituloPelicula.setColumns(10);
		
		//Añadimos el comboBox para guardar los titulos
		JComboBox comboBoxPelis = new JComboBox();
		comboBoxPelis.setBounds(288, 84, 150, 22);
		contentPane.add(comboBoxPelis);
		
		//Label de peliculas
		JLabel peliculaLabel = new JLabel("Peliculas");
		peliculaLabel.setBounds(339, 43, 60, 14);
		contentPane.add(peliculaLabel);
		
		//Añadimos el boton para añadir peliculas al comboBox
		JButton buttonAdd = new JButton("Añadir");
		buttonAdd.setBounds(59, 102, 89, 23);
		
		//Creamos la accion que hara el boton y lo añadimos al boton
		buttonAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//Extraemos el texto del TextField y lo añadimos al ComboBox
				comboBoxPelis.addItem(tituloPelicula.getText());
				//Seteamos el text a una cadena vacia
				tituloPelicula.setText("");
				
			}
		});
		
		contentPane.add(buttonAdd);
		
	}
}
