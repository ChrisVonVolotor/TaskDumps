public class HWConitionals {

    public static void main(String[] args) {

        System.out.println(conditional(7,8,false));
        System.out.println(conditional(3,4,true));
        System.out.println(conditional(7,5,false));
        System.out.println(conditional(3,1,true));


    }

    private static int conditional(int a, int b, boolean c){
        if (c){
            return a + b;
        }else{
            return a * b;
        }
    }
}
