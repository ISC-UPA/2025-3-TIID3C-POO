public class Calculator {
    // overloaded methods
    
    public int sum(int num1, int num2) { 
        return num1 + num2;
    }

    // public double sum(int x, int y) {
    //     return x + y;
    // }

    public double sum(double num1, double num2) {
        return num1 + num2;
    }

    public double sum(int num1, double num2) {
        return num1 + num2;
    }

    public double sum(double num1, double num2, double num3) { 
        // return num1 + num2 + num3;
        return sum(num1, num2) + num3;
    }

    public static void main(String[] args) {
        double result;
        Calculator calc = new Calculator();
        result = calc.sum(5, 10);

        result = calc.sum(5, 10.0);
        result = calc.sum(5.0, 10.0, 15.0);
        System.out.println(result);
        

    }
}// end class Calculator