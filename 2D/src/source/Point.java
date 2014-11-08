package source;

import source.interfaces.IPoint;

public class Point implements IPoint {

	protected float x, y;

	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

}
