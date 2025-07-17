public class Maze {

    private final boolean[][] predefinedMaze; 

    public Maze(boolean[][] predefinedMaze) {
        this.predefinedMaze = predefinedMaze;
    }

    public void printMaze() {
        for (boolean[] row : predefinedMaze) {
            for (boolean cell : row) {
                System.out.print(cell ? " - " : " * ");
            }
            System.out.println();
        }
    }

    public boolean[][] getGrid() {
        return predefinedMaze;
    }
}