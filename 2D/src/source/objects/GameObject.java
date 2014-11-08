package source.objects;

import java.awt.Color;
import java.awt.Graphics;

import source.Particle;

public class GameObject extends Particle{
	protected int width, height;

	public GameObject(String name, float x, float y, int w, int h, Color c) {
		super(name, x, y, c);
		width = w;
		height = h;
	}
	
	@Override
	public void paint(Graphics g, float disX, float disY) {
		g.setColor(color);
		g.fillRect((int)x+(int)disX, (int)y+(int)disY, width, height);
	}

}
