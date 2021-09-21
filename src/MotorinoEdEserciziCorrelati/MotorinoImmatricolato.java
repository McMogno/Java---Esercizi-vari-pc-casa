package MotorinoEdEserciziCorrelati;

public class MotorinoImmatricolato extends Motorino{

    private final float maxVelocita;
    private final String targa;

    public MotorinoImmatricolato( String colore, float velocita, String tipo, float maxVelocita, String targa){
        super(colore,velocita,tipo);
        this.maxVelocita = maxVelocita;
        this.targa = targa;
    }

    public void getMax(){
        System.out.print("La velocità max del veicolo è: "+ maxVelocita + " km/h" + "\n");
    }

    public void getTarga(){
        System.out.print("La targa del veicolo è " + targa + "\n");
    }


    public void accelera(float aument){
        if ((velocita+aument) > maxVelocita)
            System.out.print(" É stata raggiunta la velocità massima di "+ maxVelocita+ "\n");
        else
            System.out.print("É stata raggiunta la velocità di" + (velocita+aument) + "\n");
    }


    public static void main(String[] args) {

        MotorinoImmatricolato vespa50special = new MotorinoImmatricolato("verde smeraldo", (float)45.6, "Vespa 50 special", 120, "EF456FG");

        // Stampo la velocità del motorino
        System.out.println("La velocità attuale è: "+ vespa50special.getVelocita());

        vespa50special.getTarga();

        // Stampo la velocità massima
        vespa50special.getMax();

        //accelero
        vespa50special.accelera(65);


    }





}
