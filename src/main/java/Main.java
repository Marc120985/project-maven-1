public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Was passiert jetzt?");
        System.out.println(facurechner(6) - facurechner(4));
    }


    public static int subtrate(int value) {
        return value - 5;
    }

    public static boolean biggerThen(int big) {

        if (big > 100) {
            System.out.println("Bigger 100");
            return true;
        } else {
            System.out.println("Smaller then 100");
            return false;
        }
    }

    public static int facurechner(int f){
        int result = 1;
        for (int i =1; i <=f; ++i){
            result = result * i;
        }
        return result;
    }

}