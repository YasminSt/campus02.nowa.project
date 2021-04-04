package at.campus02.nowa;

import at.campus02.nowa.figures.*;

import java.io.PrintStream;
import java.util.Scanner;

public class App {
    private final Scanner input;
    private final PrintStream output;
    private boolean exit = false;
    private int figureNr;
    private Figure figure;
    private int grosse;

    // Konstruktor
    // input wird verwendet um Daten vom Benutzer einzulesen (verwendet scanner)
    // output wird verwendet um Text auf der Konsole auszugeben (verwendet sysout)
    public App(Scanner input, PrintStream output) {
        this.input = input;
        this.output = output;
    }

    //die Gameloop
    public void Run() {
        initialize();
        printState();

        while (!exit) {
            readUserInput();
            updateState();
            printState();
        }
    }

    private void initialize() {
        //TODO: Initialisierungen hier durchführen
    }

    private void readUserInput() {
        //TODO: Alle Eingaben der Benutzer einlesen
        inputFigure();
    }

    private void updateState() {
        //TODO: Benutzereingaben verarbeiten

        switch (figureNr) {
            case 0:
                exit = true;
                break;
            case 1:
                figure = new FigureH(grosse) ;
                break;
            case 2:
                figure = new FigureL(grosse);
                break;
            case 3:
                figure = new FigureO(grosse);
                break;
            case 4:
                figure = new FigureO2(grosse);

                break;
            case 5:
                figure = new FigureI(grosse);
                break;
            case 6:
                figure = new Minus(grosse);

                break;
            default:
                break;
        }



    }

    private void printState() {
        //TODO: Ausgabe des aktuellen Zustands

        if (exit == true) {
            System.out.println("Game End");
        } else if (figure != null) {
            output.println(figure );

        }
    }

    private void inputFigure() {
        // Hier sehen Sie ein Pattern für Benutzereingaben
        // Solange kein gültiger Wert eingegeben wurde, wird die Eingabe wiederholt

        do {
            output.println("Welche Grafik möchten Sie anzeigen (1-6)");
            figureNr = input.nextInt();
            System.out.println("Welche Größe möchten sie wählen (1-3)");
            grosse=input.nextInt();
            if (figureNr < 0 || figureNr > 6) {
                output.println("Dies ist keine gültige Grafik!");
            }
            if (grosse < 1 || grosse > 10) {
                output.println("Dies ist keine gültige Größe");
            }

                break;

        } while (true);
    }
}
