public class App {
    public static void main(String[] args) throws Exception {
        //runEjerciciosPD();
        runMaze();
    }

    private static void runEjerciciosPD() {
        EjerciciosPD ejerciciosPD = new EjerciciosPD();
        System.out.println("Fibonacci de recursivo");
        long start = System.nanoTime();
        long resultado = ejerciciosPD.getFibonacci(50);
        long end = System.nanoTime();
        long duration = end - start;
        System.out.println("Resultado: " + resultado + " en tiempo: " + duration + " ns");
        System.out.println("Fibonacci Recursivo Caching");
        start = System.nanoTime();
        resultado = ejerciciosPD.getFibonacciPD(50);
        end = System.nanoTime();
        duration = end - start;
        System.out.println("Resultado: " + resultado + " en tiempo: " + duration + " ns");
    }

    private static void runMaze() {
        boolean[][] prefinedMaze= {
            {true, true, true, true},
            {false, true, true,true},
            {true, true, false, false},
            {true, true, false, false},
            {true, true, true, true}
        };
        Maze maze = new Maze(prefinedMaze);
        System.out.println("LABERINTO CARGADO");
        maze.printMaze();
    }
}
