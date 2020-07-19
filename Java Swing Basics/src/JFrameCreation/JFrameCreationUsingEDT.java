package JFrameCreation;
import javax.swing.*;

public class JFrameCreationUsingEDT extends JFrame {
	
	JFrameCreationUsingEDT(){
		setTitle("My Swing Frame");
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(
				new Runnable() {
					
					@Override
					public void run() {
						new JFrameCreationUsingEDT();
						
					}
				});
		
		
	}

}
