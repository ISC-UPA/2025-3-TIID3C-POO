package p3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.stage.Stage;

class Cell {
    String name;
    boolean isOpen;
    int securityCode;

    public Cell(String n, int code) {
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
    static int prisonerCount = 0;

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

public class ExcelFX extends Application {
    private static List<Prisoner> prisoners;

    @Override
    public void start(Stage primaryStage) {
        
    }

    public static void main(String[] args) {
        prisoners = new ArrayList<>();
        prisoners.add(new Prisoner("Jesus", 'H', 1.80, 5, LocalDate.of(1990, 1, 1), LocalDate.of(2010, 1, 1),
                new Cell("A-1", 1234)));
        prisoners.add(new Prisoner("Maria", 'M', 1.65, 3, LocalDate.of(2000, 5, 15), LocalDate.of(2024, 6, 20),
                new Cell("B-2", 5678)));
        prisoners.add(new Prisoner("Jose", 'H', 1.75, 4, LocalDate.of(1988, 3, 10), LocalDate.of(2018, 7, 22),
                new Cell("A-2", 9101)));
        prisoners.add(new Prisoner("Melchor", 'H', 1.85, 6, LocalDate.of(1985, 12, 24), LocalDate.of(1999, 11, 30),
                new Cell("B-1", 1122)));
        prisoners.add(new Prisoner("Gaspar", 'H', 1.70, 2, LocalDate.of(1992, 2, 14), LocalDate.of(2022, 3, 15),
                new Cell("B-4", 3344)));
        prisoners.add(new Prisoner("Baltasar", 'H', 1.78, 8, LocalDate.of(1980, 4, 20), LocalDate.of(2017, 8, 10),
                new Cell("A-3", 5566)));
        prisoners.add(new Prisoner("Hugo", 'H', 1.82, 1, LocalDate.of(1993, 9, 5), LocalDate.of(2023, 2, 28),
                new Cell("C-5", 7788)));
        prisoners.add(new Prisoner("Paco", 'H', 1.68, 7, LocalDate.of(1987, 6, 30), LocalDate.of(2020, 12, 31),
                new Cell("A-4", 9900)));
        prisoners.add(new Prisoner("Luis", 'H', 1.77, 9, LocalDate.of(1991, 11, 11), LocalDate.of(2024, 5, 5),
                new Cell("C-1", 4321)));
        prisoners.add(new Prisoner("Pepito", 'H', 1.60, 10, LocalDate.of(1994, 8, 8), LocalDate.of(2025, 7, 7),
                new Cell("A-5", 8765)));
        prisoners.add(new Prisoner("Mafalda", 'M', 1.70, 5, LocalDate.of(2000, 1, 1), LocalDate.of(2020, 5, 10),
                new Cell("A-6", 1234)));
        prisoners.add(new Prisoner("Clara", 'M', 1.65, 3, LocalDate.of(2005, 10, 15), LocalDate.of(2024, 11, 6),
                new Cell("B-3", 5678)));

        launch(args);
    }

}
