public class genericmetot {

    public static <T> void printArray(T[] dizi) {
        for (T eleman : dizi) {
            System.out.print(eleman + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Java", "Generics", "Ödev"};

        printArray(intArray);
        printArray(strArray);
    }


}