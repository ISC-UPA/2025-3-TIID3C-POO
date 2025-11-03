package p3;
class RedBumper {
    // Fields
    public static int orientation= 45; // Static variable
    public int rotation; // Instance variable

    // Constructor
    public RedBumper(int rotation) {
        this.rotation = rotation;
    }

    // Methods
    public void display() {
        System.out.println("Orientacion: " + orientation); // Access static var
        System.out.println("Rotacion: " + rotation); // Access instance var
    }
}

public class P01Estatico {
    public static void main(String[] args) {
        int x = RedBumper.orientation; // Access static variable
        RedBumper rb01 = new RedBumper(90); // Instance
        int y = rb01.rotation; // Access instance variable
    }
}
