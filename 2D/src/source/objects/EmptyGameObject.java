package source.objects;

import source.Point;

public class EmptyGameObject extends Point {
	protected String name;

	public EmptyGameObject(String name, float x, float y) {
		super(x, y);
		this.name = name;
	}

	public String toString() {
		return name + "\n" + super.toString();
	}

}
