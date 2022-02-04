package nl.music.flyweight.repo;

import nl.music.flyweight.model.Tree;
import nl.music.flyweight.model.TreeFactory;
import nl.music.flyweight.model.TreeType;


// in fact the real Flyweight in only visible in this class
public class TreeRepository implements Repository {

    private final TreeFactory treeFactory = new TreeFactory();

    private final int[][] deciduousLocations = {{1, 1}, {33, 50}, {100, 90}};
    private final int[][] coniferLocations = {{10, 87}, {24, 76}, {2, 64}};

    int[][][] forest;

    // creates the two flyweights

    public TreeRepository() {
        this.forest = new int[][][]{deciduousLocations, coniferLocations};
        display();
    }

    // could move this to the UI. But later
    private void display() {
        Tree deciduous, conifer;

        deciduous = treeFactory.getTree(TreeType.DECIDUOUS);
        for (int[] location : deciduousLocations) {
            deciduous.display(location[0], location[1]);
        }
        conifer = treeFactory.getTree(TreeType.CONIFER);
        for (int[] location : coniferLocations) {
            conifer.display(location[0], location[1]);
        }
    }

    @Override
    public boolean removeTreeFromLocationIfAvailable(int x, int y) {

        for (int[][] trees : forest) {
            for (int i = 0; i < trees.length; i++) {
                int[] locatie = trees[i];
                if (locatie != null && locatie[0] == x && locatie[1] == y) {
                    trees[i] = null;

                    return true;
                }
            }
        }
        return false;
    }
}



