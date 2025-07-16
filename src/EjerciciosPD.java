import java.util.HashMap;
import java.util.Map;
public class EjerciciosPD {

//recursivo 
public int getFibonacci(int n){
    if (n <= 1) {
        return n;
    return getFibonacci(n - 1) + getFibonacci(n - 2);

}

public int getFibonacciPD(int n){
    Map<Integer, Integer> x = new HashMap<>();
    return getFibonacciPDHelper(n, x);

}

public int getFibonacciPDHelper(int n, Map<Integer, Integer> cache) {
    // comprobacion si existe en el catching
    if (cache.containsKey(n)) {
        //retonramos
        return cache.get(n);
    }
    // caso base
    if (n <= 1) {
        cache.put(n, n);
        return n;
    }
    // calculo y guardamos en el mapa
    int resultado = getFibonacciPDHelper(n - 1, cache) + getFibonacciPDHelper(n - 2, cache);
    // guardamos resultado
    cache.put(n, resultado);
    //retornamo dato guardado
    return resultado;
}


 }
 
}