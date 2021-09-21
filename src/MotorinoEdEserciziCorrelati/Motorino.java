package MotorinoEdEserciziCorrelati;

public class Motorino {

    String colore;
    float velocita;
    String tipo;
    boolean antifurto=false;

    public Motorino( String colore, float velocita, String tipo){
        this.colore=colore;
        this.velocita=velocita;
        this.tipo=tipo;
    }

    public float getVelocita(){
        return velocita;
    }

    public void accelera(float aumVelocita){
        if(antifurto==false)
            System.out.println("La velocità attuale è :" + (velocita += aumVelocita));
        else
            System.out.print("Non puoi accelerare");
        }


    public void inserisciAntifurto(){
        antifurto = true;
    }

    public static void main(String[] args) {

        //Costruttore
        Motorino piaggioScarabeo = new Motorino("rosso",(float)25.5, "piaggio scarabeo");

        // Stampo la velocità del motorino
        System.out.println("La velocità attuale è: "+ piaggioScarabeo.getVelocita());

        // Aumento la velocità del motorino (l'antifurto è spento)
        piaggioScarabeo.accelera(45);

        // Accendo antifurto
        piaggioScarabeo.inserisciAntifurto();

        // Cerco di aumentare la velocità (ma l'antifurto è inserito)
        piaggioScarabeo.accelera((float)37.6);


    }





}
