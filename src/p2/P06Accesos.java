package p2;

import java.time.LocalDate;

class Cell {
    String name;
    boolean isOpen;
    int securityCode;

    public Cell(String n,  int code) {
        name = n;
        isOpen = false;
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

    String name;
    char gender;    
    double height;
    int sentence;
    LocalDate birthDate;
    LocalDate entryDate;  
    Cell cell;

    public Prisoner() {
    }

    public Prisoner(String string, char gender, double d, int i, LocalDate of, LocalDate of2, Cell cell2) {
        name = string;
        this.gender = gender;
        height = d;
        sentence = i;
        birthDate = of;
        entryDate = of2;
        cell = cell2;
        prisonerCount++;
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

        Prisoner[] prisoners = new Prisoner[20];
        prisoners[0] = new Prisoner("Jesus", 'H', 1.80, 5, LocalDate.of(1990, 1, 1), LocalDate.of(2010, 1, 1), new Cell("A-1", 1234));
        prisoners[1] = new Prisoner("Maria", 'M',  1.65, 3, LocalDate.of(2000, 5, 15), LocalDate.of(2024, 6, 20), new Cell("B-2", 5678));
        prisoners[2] = new Prisoner("Jose", 'H', 1.75, 4, LocalDate.of(1988, 3, 10), LocalDate.of(2018, 7, 22), new Cell("A-2", 9101));
        prisoners[3] = new Prisoner("Melchor", 'H', 1.85, 6, LocalDate.of(1985, 12, 24), LocalDate.of(1999, 11, 30), new Cell("B-1", 1122));
        prisoners[4] = new Prisoner("Gaspar", 'H', 1.70, 2, LocalDate.of(1992, 2, 14), LocalDate.of(2022, 3, 15), new Cell("B-4", 3344));
        prisoners[5] = new Prisoner("Baltasar", 'H', 1.78, 8, LocalDate.of(1980, 4, 20), LocalDate.of(2017, 8, 10), new Cell("A-3", 5566));
        prisoners[6] = new Prisoner("Hugo", 'H', 1.82, 1, LocalDate.of(1993, 9, 5), LocalDate.of(2023, 2, 28), new Cell("C-5", 7788));
        prisoners[7] = new Prisoner("Paco", 'H', 1.68, 7, LocalDate.of(1987, 6, 30), LocalDate.of(2020, 12, 31), new Cell("A-4", 9900));
        prisoners[8] = new Prisoner("Luis", 'H', 1.77, 9, LocalDate.of(1991, 11, 11), LocalDate.of(2024, 5, 5), new Cell("C-1", 4321));
        prisoners[9] = new Prisoner("Pepito", 'H', 1.60, 10 , LocalDate.of(1994, 8, 8), LocalDate.of(2025, 7, 7), new Cell("A-5", 8765));
        prisoners[10] = new Prisoner("Mafalda", 'M', 1.70, 5, LocalDate.of(2000, 1, 1), LocalDate.of(2020, 5, 10), new Cell("A-6", 1234));
        prisoners[11] = new Prisoner("Clara", 'M',  1.65, 3, LocalDate.of(2005, 10, 15), LocalDate.of(2024, 11, 6), new Cell("B-3", 5678));
        System.out.println(Prisoner.getPrisonerCount());
        // Contestar las siguientes preguntas:
        // 1.- ¿Cuántos prisioneros hay?
        // 2.- Mostrar el nombre, edad actual y edad en que salio/saldra de la prisión.
        // 3.- ¿A que edad va a salir Pepito de la prisión?
        // 4.- ¿Quien es el prisionero con mayor edad?
        // 5.- ¿Quien es el prisionero que entró primero?
        // 6.- ¿Quien recibió la mayor condena?
        // 7.- ¿Cuantos prisioneros hay de género femenino?
        // 8.- ¿Cuantos pisos hay en la prisión? (El piso es la letra del nombre de la celda)
        // 9.- ¿Cuantos prisioneros hay en el piso B?
        // 10.- ¿En que piso hay más prisioneros?






    }
}
