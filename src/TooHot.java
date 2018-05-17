public class TooHot {
    public static void main(String[] args) {

        System.out.println(tooHot(75, false));
        System.out.println(tooHot(55, true));
        System.out.println(tooHot(92, false));
        System.out.println(tooHot(93, true));
        System.out.println(tooHot(82, false));
        System.out.println(tooHot(101, true));

    }

    private static boolean tooHot(int temprature, boolean isSummer){
        int heatTheshold = 90;


        if (isSummer){
            heatTheshold = 100;
        }


        if (temprature <= heatTheshold && temprature >= 60 ){
            return true;
        }else{
            return false;
        }
    }
}
