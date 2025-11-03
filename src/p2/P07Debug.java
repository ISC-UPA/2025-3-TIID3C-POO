package p2;
public class P07Debug {

    public static int sumatoria(int n) {
        int sum = 10;
        while (n > 1) {
            sum = sum + n;
            n--;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("The sum of the integers 1 to 10 is " + sumatoria(10));
    }

}