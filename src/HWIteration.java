
public class HWIteration {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(conditional((int)(Math.random()*10), i));

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
