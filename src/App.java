
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // runEjerciciosPD();
        runMaze();
    }

    public static void runEjerciciosPD(){
        EjerciciosPD jPD = new EjerciciosPD();
        System.out.println("-- Fibonacci Recursivo ----------------");
        long start = System.nanoTime();
        long resultado = jPD.getFibonacci(100);
        long end = System.nanoTime();
        long duration = end - start;
        System.out.println("Resultado: " + resultado + " en tiempo " + duration);

        System.out.println("\n-- Fibonacci Recursivo Caching ----------------");
        start = System.nanoTime();
        resultado = jPD.getFibonacciPD(50);
        end = System.nanoTime();
        duration = end - start;
        System.out.println("Resultado: " + resultado + " en tiempo " + duration);
    }

    public static void runMaze(){
        boolean[][] predefinedMaze = {
            {true , true, true, true},
            {false, true, true , true},
            {true, true, false, false},
            {true, true, true, true}
        };

        Maze maze = new Maze(predefinedMaze);
        System.out.println("-- Laberinto ----------------");
        maze.printMaze();

        Cell start = new Cell(1, 2);
        Cell end =  new Cell(3, 3);
        List<MazeSolver> solvers = Arrays.asList(
            new MazeSolverRecursive(),
            new MazeSolverCompletoRecursivo());

        MazeSolver solver = solvers.get(0);
        List<Cell> path;
        path = solver.getPath(maze.getGrid(), start, end);

        System.out.println("\nCamino encontrado: ");
        System.out.println("Matriz: " + path);
        solver = solvers.get(1);
        path = solver.getPath(maze.getGrid(), start, end);

        System.out.println("\nCamino encontrado (4 direcciones)");
        if (path.isEmpty()) {
            System.out.println("No se encontró camino");
        } else {
            System.out.println(path);
        }
    }
}