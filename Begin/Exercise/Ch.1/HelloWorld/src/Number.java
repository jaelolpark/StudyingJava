public class Number {
    public static void main(String[] args) {
        int a = 22;
        int c = 8;
        double b = 2.0;
        System.out.println(a / b);
        System.out.println(9 / 5);
        System.out.println(9.0 / 5);
        System.out.println(291 > -20);
        System.out.println(3 <= 3);
        System.out.println(1 != 1);
        System.out.println(true && true);
        System.out.println(true || false);
        System.out.println(!(false && (true || false)));
        System.out.println((double) a / c );



        int koreanScore = 86;
        int mathScore = 94;
        int scienceScore = 87;
        int computerScore = 100;

        System.out.println("Average: " + (double)(koreanScore + mathScore +scienceScore + computerScore) / 4);


    }
}
