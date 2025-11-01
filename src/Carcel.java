class Cell {
    public String name;
    public boolean isOpen;
    private int securityCode;

    public Cell(String n, boolean o, int code) {
        name = n;
        isOpen = o;
        securityCode = code;
    }

    public void setIsOpen(int code) {
    }



}

class Prisoner {
    public String name;
    public double height;
    public int sentence;
    public Cell cell;

    public Prisoner(String n, double h, int s, Cell c) {
        name = n;
        height = h;
        sentence = s;
        cell = c;
    }

    public Prisoner() {
        // TODO Auto-generated constructor stub
    }
}

public class Carcel {

    public static void main(String[] args) {
        Prisoner bubba = new Prisoner();
        System.out.println(bubba);
        bubba.name = "Bubba";
        System.out.println(bubba.name);

        String test = null;
        // System.out.println(test.length());

        Prisoner bubba1 = new Prisoner("Bubba", 2.08, 4, new Cell("A-1", false, 1234));
        Prisoner twitch = new Prisoner("Twitch", 1.73, 3, new Cell("B-1", false, 5678));
        System.out.println(bubba1.cell.isOpen);
        bubba1.cell.setIsOpen(1278);
        System.out.println(bubba1.cell.isOpen);

    }
}
