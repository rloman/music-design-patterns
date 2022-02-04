package nl.music.flyweight;

public class Application {

    private static int[][] deciduousLocations = {{1, 1}, {33, 50}, {100, 90}};
    private static int[][] coniferLocations = {{10, 87}, {24, 76}, {2, 64}};

    public static void main(String[] args) {

        // creates the two flyweights
        Tree deciduous, conifer;
        TreeFactory treeFactory = new TreeFactory();
        try {
            deciduous = treeFactory.getTree("deciduous");
            for (int[] location : deciduousLocations) {
                deciduous.display(location[0], location[1]);
            }
            conifer = treeFactory.getTree("conifer");
            for (int[] location : coniferLocations) {
                conifer.display(location[0], location[1]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        shoot(1, 1);
        shoot(1, 1);
        shoot(10, 87);
    }

    public static void shoot(int x, int y) {
        int[][][] forest = new int[][][]{deciduousLocations, coniferLocations};
        for (int[][] trees : forest) {
            for (int i = 0; i < trees.length; i++) {
                int[] locatie = trees[i];
                if (locatie != null && locatie[0] == x && locatie[1] == y) {
					trees[i] = null;
                    System.out.printf("You shot the %s tree on location [%02d, %02d]%n", "deciduous", x, y);

                    return;
                }
            }
        }
    }
}