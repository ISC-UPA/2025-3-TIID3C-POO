package jf.s3;

public class P3Casting {

    public static void main(String[] args) {
        byte a = 126;
        a++;
        System.out.println(a);
        a += 1;
        System.out.println(a);
        a = (byte) (a + 1);
        System.out.println(a);
        // a = a + 1;
       // System.out.println(a);
    }
}
