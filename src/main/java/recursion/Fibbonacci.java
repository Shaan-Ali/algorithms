package recursion;

public class Fibbonacci {

    public static void main(String[] args) {
        Fibbonacci fibbonacci = new Fibbonacci();
        System.out.println("Count: "+ fibbonacci.fibonacci(4));
        System.out.println("Count: "+ fibbonacci.fibonacci(5));
        System.out.println("Count: "+ fibbonacci.fibonacci(7));
    }

    private int fibonacci(int n) {
        if (n==0)
            return 0;
        if (n==1)
            return 1;

        return fibonacci(n-1) + fibonacci(n-2);
    }

}
