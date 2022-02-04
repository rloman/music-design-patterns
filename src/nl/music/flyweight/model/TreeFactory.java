package nl.music.flyweight.model;

public class TreeFactory {
	Tree d, c = null;
	public TreeFactory() {
		this.d = new DeciduousTree();
		this.c = new ConiferTree();
	}
	public Tree getTree(String type)  {
		if ("deciduous".equals(type)) {
			return this.d;
		} else if ("conifer".equals(type)) {
			return this.c;
		} else {
			throw new IllegalArgumentException("Invalid kind of tree");
		}
	}
}