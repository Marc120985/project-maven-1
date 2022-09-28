public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Was passiert jetzt?");



        System.out.println("Die Fakultaet von 7 ist gleich: " + facurechner(7));
        System.out.println("Die Fakultaet von 7 ist gleich: " + facurechnerWithWhile(7));
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

    public static int facurechnerWithWhile(int f) {
        int count = 1;
        int result = 1;
        while (count <= f){
            result = result * count;
            count++;
        }
        return result;
    }
}