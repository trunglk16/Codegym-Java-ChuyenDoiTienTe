public class change {
    public static void main(String[] args) {
        System.out.println("Insert USD: ");
        java.util.Scanner input = new java.util.Scanner(System.in);

        double usd = input.nextDouble();

        java.util.Scanner input2 = new java.util.Scanner(System.in);
        double rate = 23000;
        double vnd = usd*rate;
        System.out.println("Result: " + vnd + "VND");
    }
}
