public class UniqueSum {
    public static void main(String[] args) {
        System.out.println(uniqueSum(1,2,3));
        System.out.println(uniqueSum(3,3,3));
        System.out.println(uniqueSum(1,1,2));

    }

    private static int uniqueSum(int a, int b , int c){
        int sum = 0;
        if (!(a == b) && !(a == c)){
            sum += a;
        }

        if (!(a == b) && !(b == c)){
            sum += b;
        }

        if (!(c == b) && (a != c)){
            sum += c;
        }

        return  sum;

    }
}
