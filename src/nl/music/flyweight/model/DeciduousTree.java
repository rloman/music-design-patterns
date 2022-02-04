package nl.music.flyweight.model;

public class DeciduousTree implements Tree {
	// complex trunk, branch, leaf graphic data
	public void display(int x, int y) {
		System.out.println("Deciduous tree is located at " + x + ", " + y);
	}
}