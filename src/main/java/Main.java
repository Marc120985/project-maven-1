public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Was passiert jetzt?");
    }

    public static int subtrate(int value) {
        return value - 5;
    }

    public static boolean biggerThen(int big){

        if(big > 100){
            System.out.println("Bigger 100");
            return true;
        }else {
            System.out.println("Smaller then 100");
            return false;
        }


    }
}