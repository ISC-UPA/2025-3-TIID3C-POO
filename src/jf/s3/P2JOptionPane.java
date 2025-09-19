package jf.s3;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class P2JOptionPane {
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog(null, "Enter your name");   
        String mensaje = "¡Hola, " + name + "! Bienvenido a POO";             
        JOptionPane.showMessageDialog(null, mensaje);


        JOptionPane.showMessageDialog(null,
                "There's no input here, just a message",
                "Title",
                0); // 0 = X, 1 = !, 2 = ?

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Is this a question?",
                "Dialog Title",
                2,
                null,
                null,
                "Type something here.");
        
        
        String[] acceptableValues = {"Choice 1", "Choice 2", "Choice 3"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Is this a question?",
                "Dialog Title",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);

        Scanner sc = new Scanner(P2JOptionPane.class.getResourceAsStream("input04text.txt"));      
        System.out.println(sc.findInLine("BlueBumper"));
                
    }
}
