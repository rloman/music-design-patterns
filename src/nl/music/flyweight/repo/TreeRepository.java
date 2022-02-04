package nl.music.flyweight.repo;

import nl.music.flyweight.model.Tree;
import nl.music.flyweight.model.TreeFactory;

public class TreeRepository implements Repository {

    private final int[][] deciduousLocations = {{1, 1}, {33, 50}, {100, 90}};
    private final int[][] coniferLocations = {{10, 87}, {24, 76}, {2, 64}};

    int[][][] forest;

    // creates the two flyweights

    public TreeRepository() {
        this.forest = new int[][][]{deciduousLocations, coniferLocations};
        display();
    }

    private void display() {
        Tree deciduous, conifer;
        TreeFactory treeFactory = new TreeFactory();
        deciduous = treeFactory.getTree("deciduous");
        for (int[] location : deciduousLocations) {
            deciduous.display(location[0], location[1]);
        }
        conifer = treeFactory.getTree("conifer");
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



