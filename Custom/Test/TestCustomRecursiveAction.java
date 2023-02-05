import java.util.concurrent.ForkJoinPool;

public class TestCustomRecursiveAction {
    public static void main(String[] args) {
        String cadena = "este es una prueba del modelo de fork-join";
        CustomRecursiveAction cra = new CustomRecursiveAction(cadena);

        ForkJoinPool fjp = new ForkJoinPool();
        fjp.invoke(cra);
    }
}
