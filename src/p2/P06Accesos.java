package p2;

import java.time.LocalDate;

class Cell {
    private String name;
    private boolean isOpen;
    private int securityCode;

    public Cell(String n, boolean o, int code) {
        name = n;
        isOpen = o;
        securityCode = code;
    }

    public String getName() {
        return name;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsOpen(int code) {
        if (securityCode == code) {
            isOpen = !isOpen;
        }
    }

}

class Prisoner {
    static int prisonerCount=0;

    private String name;
    private double height;
    private int sentence;
    private LocalDate birthDate;
    private LocalDate entryDate;  
    private Cell cell;


    public Prisoner(String n, double h, int s, Cell c) {
        name = n;
        height = h;
        sentence = s;
        cell = c;
    }

    public Prisoner() {
        // TODO Auto-generated constructor stub
    }

    public static int getPrisonerCount() {
        return prisonerCount;
    }
}

public class P06Accesos {

    public static void main(String[] args) {
        Prisoner bubba = new Prisoner();
        System.out.println(bubba);
        bubba.name = "Bubba";
        System.out.println(bubba.name);

        String test = null;
        // System.out.println(test.length());

        Prisoner bubba1 = new Prisoner("Bubba", 2.08, 4, new Cell("A-1", false, 1234));
        bubba1.cell.isOpen = true;
        Prisoner twitch = new Prisoner("Twitch", 1.73, 3, new Cell("B-1", false, 5678));
        System.out.println(bubba1.cell.isOpen);
        bubba1.cell.setIsOpen(1278);
        System.out.println(bubba1.cell.isOpen);
        System.out.println(Prisoner.getPrisonerCount());

    }
}
