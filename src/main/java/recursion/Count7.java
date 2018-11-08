package recursion;

public class Count7 {


    public static void main(String[] args) {
        Count7 count7 = new Count7();
        System.out.println("Count: "+ count7.count7(717));
        System.out.println("Count: "+ count7.count7(999));
        System.out.println("Count: "+ count7.count7(101079992));
    }


    private int count7(int n) {
        if (n%10 == 7)
            return 1+count7(n/10);
        else if (n/10==0)
            return 0;
        else
            return count7(n/10);
    }

}

