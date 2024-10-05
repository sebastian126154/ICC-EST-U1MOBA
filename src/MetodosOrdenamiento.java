public class MetodosOrdenamiento {
    public int[] sortBubbleAva(int[] arreglo){

        int n = arreglo.length;
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n-1 ; j++){
                if(arreglo[j]> )
                
                //Intercambio 
                int aux = arreglo[j];
                arreglo[j+1] = arreglo[j];
                arreglo[j+1] = aux;


            }  
        }
        return arreglo;
    }

    public void printArreglo(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }

}
