package source;

import source.interfaces.IVisible;
import source.objects.EmptyGameObject;
import java.awt.*;

public class Particle extends EmptyGameObject implements IVisible{
	protected Color color;

	public Particle(String name, float x, float y, Color c) {
		super(name, x, y);
		color = c;
	}

	public void paint(Graphics g) {
		paint(g, 0, 0);
	}

	public void paint(Graphics g, float disX, float disY) {
		g.setColor(color);
		g.drawRect((int)x+(int)disX, (int)y+(int)disY, 1, 1);
	}
	
}
