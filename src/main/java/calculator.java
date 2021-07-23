import java.util.Scanner;

public class calculator {
    Scanner scan = new Scanner(System.in);

    public void showMenu() {
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");}

    public double division() {
        double a, b,val;
        System.out.println("Enter First Value");
        a = scan.nextDouble();
        System.out.println("Enter Second Value");
        b = scan.nextDouble();
        val = a / b;
        return val;}

    public double multiplication() {
        double a, b,val;
        System.out.println("Enter First Value");
        a = scan.nextDouble();
        System.out.println("Enter Second Value");
        b = scan.nextDouble();
        val = a * b;
        return val;}

    public double subtraction() {
        double a, b,val;
        System.out.println("Enter First Value");
       a = scan.nextDouble();
        System.out.println("Enter Second Value");
        b = scan.nextDouble();
        val = a - b;
        return val;}

    public double addition() {
        double a, b,val;
        System.out.println("Enter First Value");
        a = scan.nextDouble();
        System.out.println("Enter Second Value");
        b = scan.nextDouble();
        val = a + b;
        return val;}

    public static void main(String[] args) {
        calculator calc = new calculator();
        Scanner scan = new Scanner(System.in);
        int x;
        double score;
        calc.showMenu();
        x = scan.nextInt();

        switch (x) {
            case 1:
                score = calc.addition();
                System.out.println(score);
                break;
            case 2:
                score = calc.subtraction();
                System.out.println(score);
                break;
            case 3:
                score = calc.multiplication();
                System.out.println(score);
                break;
            case 4:
                score = calc.division();
                System.out.println(score);
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }

    }
}

