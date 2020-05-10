public class While {
    public static void main(String[] args) {
        int num = 10000;
        int key = 153;
        int m = 0;
        int i = 1;
        while((i * key) < num) {
            m = i*key;
            i += 1;
        }
        System.out.println(m);
    }
}
