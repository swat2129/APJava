package homework;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SaveScreen extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel jp = new JPanel();
	private JLabel jl = new JLabel();
	private JTextField jt = new JTextField(16);
	private JButton charLevel = new SubmitButton("Set Character Level", jl, jt);
	private JButton charPosX = new SubmitButton("Set Character Position X", jl, jt);
	private JButton charPosY = new SubmitButton("Set Character Position Y", jl, jt);
	
	public SaveScreen() {
		 setTitle("Tutorial");
         setVisible(true);
         setSize(320, 400);
         setDefaultCloseOperation(EXIT_ON_CLOSE);

         jp.add(jt);
         jp.add(charLevel);
         jp.add(charPosX);
         jp.add(charPosY);
         jp.add(jl);
         
         add(jp);
	}
}
