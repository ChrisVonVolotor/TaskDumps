public class HWConditionals2 {
    public static void main(String[] args) {

        System.out.println(conditional(7,8,false));
        System.out.println(conditional(3,0,true));
        System.out.println(conditional(7,0,false));
        System.out.println(conditional(3,1,true));


    }

    private static int conditional(int a, int b, boolean c){
        if (a == 0 || b == 0 ){
            return a + b;
        }

        if (c){
            return a + b;
        }else{
            return a * b;
        }
    }
}
