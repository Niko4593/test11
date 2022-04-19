public class HomeWorkApp {

    public static void main(String[] args) {

        printThreeWords();
        checkSumSign(55, 77);
        printColor(-66);
        compareNumbers(100, 50);

    }
    public static void printThreeWords() {
        System.out.print("Orange \n");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(int a, int b) {

        if ((a + b) > 0) {
            System.out.println("Sum is positive");
        } else {
            System.out.println("Sum is negative");
        }
    }
    public static void printColor(int value) {

        if ( value <= 0 ){
            System.out.println("Red");
        } else if ( value > 100) {
            System.out.println("Green");
        }
        else {
            System.out.println("Yellow");
        }
    }
    public static void compareNumbers(int a, int b) {

        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<=b");
        }
    }
}
