package DipendenteEdEserciziCorrelati;

public class DipendenteA extends Dipendente{

    int malattia;  // giorni di malattia iniziali


    public DipendenteA(String matricola, double stipendio, double straordinario) {
        super(matricola,stipendio,straordinario);
        malattia = 0;
    }

    public void prendiMalattia(int giorniMalattiaPresi){
        malattia += giorniMalattiaPresi;
    }

    public double paga(){
        double p= super.paga(25);
        if ( malattia == 0)
           return p;
        else
            return p -= (malattia*15);
    }

    public void stampaMalattia(){
        System.out.print(" Le ore di malattia di questo mese sono state" + malattia);
    }

}
