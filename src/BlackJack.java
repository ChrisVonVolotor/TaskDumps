public class BlackJack {
    public static void main(String[] args) {
        System.out.println(resolve(18,21));
        System.out.println(resolve(15,22));

        System.out.println(resolve(19,20));

        System.out.println(resolve(17,17));

    }

    public static int resolve(int player, int house){
        if (player <= 21 && (player >= house || house > 21)){
            return player;
        }else if(house <= 21 && (house > player || player > 21)){
            return house;
        }
        else{
            return 0;
        }
    }
}
