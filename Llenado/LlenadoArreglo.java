package fork_join;

import java.util.concurrent.RecuriveAction;

public class LlenadoArreglo extends RecursiveAction {

    private int arreglo[];
    private int umbral = 1000;

    public LlenadoArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }

    @Override
    protected void compute() {
       if (workload.length() > THRESHOLD) {
        ForkJoinTask.invokeAll(forkj());

       }else {
           llenado(){
            for (int i = 0; i < umbral; i++) {
                
            }
           }
       }
     

    }

    private List<LllenadoArreglo> forkj() {
        List<LlenadoArreglo> subtareas = new ArrayList<>();
        int arregloIzq[] = new int[arreglo.length / 2];
        int arregloDer[] = new int[arreglo.length / 2];

        subtareas.add(new LllenadoArreglo(arregloIzq));
        subtareas.add(new LlenadoArreglo(arregloDer));

        return subtareas;
    }

    private void llenado() {

    }
}
