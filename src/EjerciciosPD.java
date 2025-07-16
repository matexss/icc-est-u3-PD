import java.util.HashMap;
import java.util.Map;
public class EjerciciosPD {

    //recursivo 
    public long getFibonacci(int n){
        if (n <= 1) {
            return n;
        }
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

    public long getFibonacciPD(int n){
        Map<Integer, Long> x = new HashMap<>();
        return getFibonacciPDHelper(n, x);
    }

    public long getFibonacciPDHelper(int n, Map<Integer, Long> cache) {
        // comprobacion si existe en el catching
        if (cache.containsKey(n)) 
            //retonramos
            return cache.get(n);
        // caso base
        if (n <= 1) {
            cache.put(n, (long)n);
            return n;
        }
        // calculo y guardamos en el mapa
        long resultado = getFibonacciPDHelper(n - 1, cache) + getFibonacciPDHelper(n - 2, cache);
        // guardamos resultado
        cache.put(n, resultado);
        //retornamo dato guardado
        return resultado;
    }
}