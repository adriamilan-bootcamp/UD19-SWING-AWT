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
		setTitle("Peliculas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 200, 549, 206);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel tituloLabel = new JLabel("Escribe el titulo de una pelicula");
		tituloLabel.setBounds(29, 40, 199, 20);
		contentPane.add(tituloLabel);
		
		JTextField tituloPelicula = new JTextField();
		tituloPelicula.setBounds(39, 71, 127, 20);
		contentPane.add(tituloPelicula);
		tituloPelicula.setColumns(10);
		
		JComboBox comboBoxPelis = new JComboBox();
		comboBoxPelis.setBounds(288, 84, 150, 22);
		contentPane.add(comboBoxPelis);
		
		JLabel peliculaLabel = new JLabel("Peliculas");
		peliculaLabel.setBounds(339, 43, 60, 14);
		contentPane.add(peliculaLabel);
		
		JButton buttonAdd = new JButton("Añadir");
		buttonAdd.setBounds(59, 102, 89, 23);
		
		buttonAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				comboBoxPelis.addItem(tituloPelicula.getText());
				tituloPelicula.setText("");
				
			}
		});
		
		contentPane.add(buttonAdd);
		
	}
}
