
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.ButtonGroup;
import javax.swing.JButton;


public class SurveyInterface extends JFrame {

	private JPanel contentPane;
	ArrayList <JCheckBox> skill = new ArrayList<JCheckBox>();


	/**
	 * Create the frame.
	 */
	public SurveyInterface() {
		
		// MAIN FRAME
		setTitle("MINI GRAPHIC SURVEY");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		setComponents();
		
	}
	
	private void setComponents(){
		
		// THIS METHOD SPREADS THE ELEMENTS DESIGN 
		JLabel label = new JLabel("Choose an operating system");
		label.setBounds(29, 29, 177, 14);
		contentPane.add(label);
		
		JRadioButton radio = new JRadioButton("Windows");
		radio.setSelected(true);
		radio.setBounds(50, 59, 109, 23);
		contentPane.add(radio);
		
		JRadioButton radio_1 = new JRadioButton("Linux");
		radio_1.setBounds(50, 85, 109, 23);
		contentPane.add(radio_1);
		
		JRadioButton radio_2 = new JRadioButton("Macintoch");
		radio_2.setBounds(50, 111, 109, 23);
		contentPane.add(radio_2);
		
        ButtonGroup group = new ButtonGroup();
        group.add(radio);
        group.add(radio_1);
        group.add(radio_2);
		
		JLabel label_1 = new JLabel("Choose a job specialty");
		label_1.setBounds(225, 29, 118, 14);
		contentPane.add(label_1);
		
		JCheckBox box = new JCheckBox("Software developer");
		box.setBounds(235, 59, 127, 23);
		contentPane.add(box);
		
		JCheckBox box_1 = new JCheckBox("Graphic designer");
		box_1.setBounds(235, 85, 118, 23);
		contentPane.add(box_1);
		
		JCheckBox box_2 = new JCheckBox("Systems administrator");
		box_2.setBounds(235, 111, 141, 23);
		contentPane.add(box_2);
		
		skill.add(box);
		skill.add(box_1);
		skill.add(box_2);
	
		JSlider slider = new JSlider();
		slider.setValue(0);
		slider.setMaximum(10);
		slider.setSnapToTicks(true);
		slider.setPaintLabels(true);
		slider.setBounds(50, 161, 200, 26);
		contentPane.add(slider);
		
		JButton button = new JButton("Show profile data");
		button.setBounds(50, 214, 156, 23);
		contentPane.add(button);
		
		JLabel label_2 = new JLabel("Hours");
		label_2.setBounds(271, 161, 45, 13);
		contentPane.add(label_2);
		
		
        // FUNCTIONALITY
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){	
				if (radio.isSelected())
					JOptionPane.showMessageDialog(null, "Operatin System: "+radio.getText()+"\n"
					+"Skills: "+skillRegister(skill)+"\nHours: "+slider.getValue(), "DATA PROFILE", JOptionPane.INFORMATION_MESSAGE);
				else if (radio_1.isSelected())
					JOptionPane.showMessageDialog(null, "Operatin System: "+radio_1.getText()+"\n"
					+"Skills: "+skillRegister(skill)+"\nHours: "+slider.getValue(), "DATA PROFILE", JOptionPane.INFORMATION_MESSAGE);
				else if (radio_2.isSelected())
					JOptionPane.showMessageDialog(null, "Operatin System: "+radio_2.getText()+"\n"
					+"Skills: "+skillRegister(skill)+"\nHours: "+slider.getValue(), "DATA PROFILE", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
	};
	// RETURNS AN ARRAY WHITH THE STRINGS OF THE CHECKED SKILLS
	public ArrayList<String> skillRegister(ArrayList <JCheckBox> skills){

		 ArrayList <String> skillsList = new ArrayList<String>();
		 for(int i=0;i<skills.size(); i++){
			 JCheckBox aux = skills.get(i);
			 if(aux.isSelected())
				 skillsList.add(aux.getText());
		 }
		 return skillsList;

	}
	

}
