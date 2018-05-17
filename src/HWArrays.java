public class HWArrays {
    public static void main(String[] args) {

        int[] numberArray = {1,5,7,8,3,9,2,3,6,8};

        for (int i = 0; i < 10; i++) {
            System.out.println(conditional((int)(Math.random()*10), numberArray[i]));

        }




    }

    private static int conditional(int a, int b){
        if (a == 0 || b == 0 ){
            return a + b;
        }

        if (a > b){
            return a + b;
        }else{
            return a * b;
        }
    }
}
