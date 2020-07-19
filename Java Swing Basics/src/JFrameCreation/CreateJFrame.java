package JFrameCreation;

import javax.swing.*;
public class CreateJFrame {

	public static void main(String[] args) {
		JFrame f=new JFrame("My Frame");
//		f.setTitle("My Frame");
		f.setSize(300,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
