package MotorinoEdEserciziCorrelati;

public class UsoMotorino extends Motorino {

    public UsoMotorino( String colore, float velocita, String tipo){
        super(colore,velocita,tipo);
    }


    public static void main(String[] args) {
        Motorino piaggioLiberty = new Motorino("grigio metallizzato", (float) 40.5, "Piaggio Liberty");
        MotorinoImmatricolato apriliaScarabeo = new MotorinoImmatricolato("rosso", (float) 30, "Aprilia Scarabeo", 60, "CV1234");

        float x= piaggioLiberty.getVelocita();
        apriliaScarabeo.getMax();

        piaggioLiberty.accelera((float)30.7);
        apriliaScarabeo.accelera((float)30.7);

        System.out.print(" Velocità Piaggio Liberty" + piaggioLiberty.getVelocita());
        System.out.print(" Velocità Aprilia Scarabeo" + apriliaScarabeo.getVelocita());
    }



}
