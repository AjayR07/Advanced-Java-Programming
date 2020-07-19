package JFrameCreation;
import javax.swing.*;

public class CreateJFrameByExtending extends JFrame {
	
	CreateJFrameByExtending(){
		setTitle("My Swing Frame");
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		new CreateJFrameByExtending();
	}

}