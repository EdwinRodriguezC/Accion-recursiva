public class TestCadenas {
    public static void main(String[] args) {
        String parrafo = "";

        long inicio = System.currentTimeMills(); 
        char [] arreglo=parrafo.toCharArray(); 
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i]=='e' || arreglo[i]=='E') {
                arreglo[i]='3'; 
            }
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i])); 
        }
        long fin = System.currentTimeMills(); 
        long total = fin - inicio; 
        System.out.println(""); 
        System.out.println("Tiempo de ejecución: " + total);
    }
}
