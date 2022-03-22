package campus02ooBeispiele.com;

public class VerwaltungsstrafeApp {
    public static void main(String[] args) {

Strafe erste= new Strafe();

erste.name = "Wolfang";
erste.nachname= "Fischer";
erste.kennzeichnen = "0987z234";
erste.anzahl=0;
erste.strafe=0;


//erste.strafeBerechnen(60);
System.out.println(erste.name + " " +erste.nachname + " ,Kennezeichnen:" + erste.kennzeichnen+ ", hat eine Strafe von Anzahl " +erste.anzahl+ " und muss  "+erste.strafe+ " zahlen" );

//erste.strafeBerechnen(34);
        System.out.println(erste.name + " " +erste.nachname + " ,Kennezeichnen:" + erste.kennzeichnen+ ", hat " +erste.anzahl+ " Strafe und muss  "+erste.strafe+ " zahlen" );

//erste.verbandsPaket();
System.out.println(erste.name + " " +erste.nachname + " ,Kennezeichnen:" + erste.kennzeichnen+ ", hat " +erste.anzahl+ " Strafe und muss  "+erste.strafe+ " zahlen" );

erste.alkohol(0.6);
        System.out.println(erste.name + " " +erste.nachname + " ,Kennezeichnen:" + erste.kennzeichnen+ ", hat " +erste.anzahl+ " Strafe und muss  "+erste.strafe+ " zahlen" );


        erste.sonstiges(10);
        System.out.println(erste.name + " " +erste.nachname + " ,Kennezeichnen:" + erste.kennzeichnen+ ", hat " +erste.anzahl+ " Strafe und muss  "+erste.strafe+ " zahlen" );

        double strafe = erste.getStrafe(); //wenn es gibt methode mit return, dann muss ich ergebniss in eine variable speichern in main

        System.out.println(erste.name + " " +erste.nachname + " ,Kennezeichnen:" + erste.kennzeichnen+ ", hat " +erste.anzahl+ " Strafe und muss  "+strafe+ " zahlen" );

    }
}
