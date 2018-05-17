public class HWIterationArray2 {
    public static void main(String[] args) {
        int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.println(array[i]);

        }
        System.out.println();

        for (int x = 0; x < array.length; x++) {
            array[x] = array[x] * 10;
            System.out.println(array[x]);
        }
    }
}


