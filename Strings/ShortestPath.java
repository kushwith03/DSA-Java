package Strings;

public class ShortestPath {
    public static void find() {
        String path = "WNEENESENNN";
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'N') {
                y++;
            } else if (path.charAt(i) == 'S') {
                y--;
            } else if (path.charAt(i) == 'E') {
                x++;
            } else if (path.charAt(i) == 'W') {
                x--;
            }
        }
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("Shortest distance : " + distance);

    }
}
