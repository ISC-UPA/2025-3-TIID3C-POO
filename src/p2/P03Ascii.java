package p2;
public class P03Ascii {
    public static void main(String[] args) {
        // Conversiones explícitas
        int ascii = (int) 'A';
        char character = (char) ascii;

        // Conversiones implícitas
        int ascii1 = 65;
        int ascii2 = 'A';

        char caracter1 = 65;
        char caracter2 = 'A';

        for (int i = 65; i <= 90; i++) {
            System.out.print( (char) i + " ");
        }
        System.out.println();

        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();

        char letra = 'A';
        for (int i = 0; i < 26; i++) {
            System.out.print(letra +  " ");
            letra++;
        }
        System.out.println();

    }

}
