package mvc.view;

import java.awt.Dimension;
import java.awt.Image;
import java.net.URL;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class viewtest extends JFrame{
	private JLayeredPaneExtension basic_panel;
	 private ClassLoader cldr;
	 viewtest(){
		 
	   	 cldr = this.getClass().getClassLoader();
	   	
	        this.setResizable(false);
	        this.setTitle("Demo");
	        this.setPreferredSize(new Dimension(520, 500));
	        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	        this.setVisible(true);
	        URL imageURL = cldr.getResource("resources/images/bg_green.png"); //image
	        Image image = new ImageIcon(imageURL).getImage();
	        basic_panel = new JLayeredPaneExtension(image);
	        GroupLayout layout = new GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	                layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(basic_panel, GroupLayout.PREFERRED_SIZE, 910, GroupLayout.PREFERRED_SIZE));
	        layout.setVerticalGroup(
	                layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(basic_panel, GroupLayout.PREFERRED_SIZE, 685, GroupLayout.PREFERRED_SIZE));
	        pack();
	        basic_panel.repaint();
	 }
	 public static void main(String[] args) {
		 viewtest l=new viewtest();
	 }

}
