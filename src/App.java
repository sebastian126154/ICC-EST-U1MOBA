public class App {
    public static void main(String[] args) {

        MetodosOrdenamiento mO = new MetodosOrdenamiento();
        int[] arr = { 5, 8, 9, 3, 0 };
        mO.sortBubbleAva(arr);
        mO.printArreglo(arr);

    }
}
