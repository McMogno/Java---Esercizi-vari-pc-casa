package DipendenteEdEserciziCorrelati;

public class Dipendente {

    public String matricola;   // n° matricola
    public double stipendio;   // stipendio base
    public double pagaStraordinario;  // paga oraria straordinari
    int oreStraord;  // ore di straordinari fatte
    double pagaMensile;

    public Dipendente(String matricola, double stipendio, double pagaStraordinario){
        this.matricola=matricola;
        this.stipendio=stipendio;
        this.pagaStraordinario = pagaStraordinario;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double paga (int oreStraord){
        return pagaMensile = (stipendio+(oreStraord* pagaStraordinario));
    }

    public void stampa( int oreStraord){
        System.out.print(" Con " + oreStraord + " ore di straordinari, il tuo stipendio di questo mese è " + pagaMensile);
    }


}
