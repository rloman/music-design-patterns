package nl.music.flyweight.model;

// in fact this is called a 'Simple Factory'
public class TreeFactory {
	Tree d, c = null;
	public TreeFactory() {
		this.d = new DeciduousTree();
		this.c = new ConiferTree();
	}
	public Tree getTree(TreeType type)  {
		if (TreeType.DECIDUOUS.equals(type)) {
			return this.d;
		} else if (TreeType.CONIFER.equals(type)) {
			return this.c;
		} else {
			throw new IllegalArgumentException("Invalid kind of tree");
		}
	}
}