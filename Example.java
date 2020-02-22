public class Example {
    public static void main(String[] args) {
        byte a = 89;
        byte b = 74;
        System.out.println(a + b);
        byte c = (byte) (a + b);
        System.out.println(c);
        System.out.println((int)':');
        int x = 10;
        int y = 10;
        int h = 10;
        int d = 10;
        System.out.println("" + x++ + " " + y--);
        System.out.println(x);
        System.out.println("" + ++h + " " + --d);
        d += h;
        d = (int) (d + h);

    }
}
