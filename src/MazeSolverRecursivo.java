import java.util.List;
public class MazeSolverRecursivo implemnts MazeSolver {

     public List<Cell> getPath(boolean[][] gird, Cell start, Cell end);{
        List<Cell> path = new ArrayList<>();
        if(gird==null||gird.length==0)
            return path;
    if(findPath(gird, start, end, path))
        return path;
    return new ArrayList<>();
    //return path;
    }
    private boolean findPath(boolean[][] grid, Cell start, Cell end, List<Cell> path) {
       
    int row = start.getRow();
    int col = start.getCol();

    if(row>=grid.length ||col>=grid[0].length || !grid[row][col]) {
        return false;
    }
    if(row==end.getRow() && col==end.getCol()) {
        path.add(star);
        return true;
    }
       

    
}
