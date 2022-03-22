package campus02ooBeispiele.BonusberechnungMitarbeiter;

public class Mitarbeiter {

    String vorname;
    String nacname;
    double gehalt;
    int alter;

    public double monatsAbrechnung(){
double gehaltproJahr=0;



return gehaltproJahr;

    }


}


//    Vorname (String) Vorname eines Mitarbeiters
//    Nachname (String) Nachname eines Mitarbeiters
//    Gehalt (double) Gibt das Gehalt pro Monat eines Mitarbeiters an
//    Alter (int) Gibt das Alter eines Mitarbeiters an.

//    public double monatsAbrechnung()
//    Schreiben Sie die Methode monatsAbrechnung, welche für einen Monat eine Gehaltsabrechnung
//        durchführt und das Ergebnis zurückliefert. Vom Gehalt sind 20 % Sozialversicherung abzuziehen. Vom
//        Restbetrag wird noch die Einkommensteuer, welche sich wie folgt gliedert, abgezogen.
//        bis 10.000 Euro 10 %
//        10.000 Euro bis 20.000 Euro 20 %
//        20.000 Euro bis 30.000 Euro 32 %
//        30.000 Euro bis 50.000 Euro 45 %
//        ab 50.001 Euro 60 %
