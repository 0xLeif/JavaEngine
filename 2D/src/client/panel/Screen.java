package client.panel;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import source.Particle;
import source.objects.GameObject;
import client.Client;

public class Screen extends JPanel {

	public Screen(){
		super();
		setSize(Client.WIDTH, Client.HEIGHT);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		Particle p = new Particle("Test", 5, 5, Color.GREEN);
		p.paint(g);
		GameObject go = new GameObject("NEW", 30, 30, 50, 30, Color.blue);
		go.paint(g);
	}

}
