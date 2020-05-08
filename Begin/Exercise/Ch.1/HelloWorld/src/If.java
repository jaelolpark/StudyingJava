public class If {
    public static void main(String[] args) {
        int a = 38, b = 27;

        if(a == b) {
            System.out.println("a and b are same. a = b = " + (a));
        }
        else {
            System.out.println("a is not the same with b");
            if(a>b) {
                System.out.println("a is " + (a-b) + " bigger than b.");
            }
            else if(b>a) {
                System.out.println("b is " + (b-a) + " bigger than a.");
            }
        }
    }
}

