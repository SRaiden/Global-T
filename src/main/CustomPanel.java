package main;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class CustomPanel extends JPanel {

	private URL url = getClass().getResource("fondo/paisaje.jpg");
	Image image = new ImageIcon(url).getImage();
	
	@Override
	public void paint(Graphics g){
		g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
		super.paint(g);
	}

}
