public class Maze {
    private boolean[][] maze;

    public Maze(boolean[][] maze) {
        this.maze = maze;
    }

    public void printMaze() {
        for (boolean[] row : maze) {
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j] ? "-" : "*");
                if (j < row.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    
}
