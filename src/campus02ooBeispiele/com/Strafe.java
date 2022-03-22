package campus02ooBeispiele.com;

public class Strafe {

    String name;
    String nachname;
    String kennzeichnen;
    int strafnummer;
    double strafe=0;
    int anzahl=0;

    public void strafeBerechnen(int geschwindigkeitsUeberschreitung){


                if(geschwindigkeitsUeberschreitung<=20){
                    strafe=strafe+30;
                    anzahl=anzahl+1;
                }
                else if(geschwindigkeitsUeberschreitung>20 && geschwindigkeitsUeberschreitung<=30){
                    strafe=+50;
                    anzahl=+1;
                }
                else if(geschwindigkeitsUeberschreitung>30 && geschwindigkeitsUeberschreitung<=50){
                    strafe=+100;
                    anzahl=+1;
                }
                else if (geschwindigkeitsUeberschreitung>50 && geschwindigkeitsUeberschreitung<=100){
                    strafe=+500;
                    anzahl=+1;
                }
                else{
                    strafe=+1500;
                    anzahl=+1;
                }

            }

    public void verbandsPaket(){
        strafe=strafe+25;
        anzahl=anzahl+1;

        }

        public void alkohol(double wert){

        if(wert>=0.5 && wert<1){
            strafe=+100;
        }
        else if(wert>=1.0 && wert<2.0){
            strafe=+400;
        }
        else if (wert>=2.0 && wert<3.0){
            strafe=+1000;
        }
         else {
            strafe=+5000;
        }
       anzahl=+2;
        }




    }


//bis 20 km/h 30 Euro
//20 – 30 km/h 50 Euro
//30 – 50 km/h 100 Euro
//50 – 100 km/h 500 Euro
//> 100 km/h 1500 Euro