package AbbigliamentoEdEserciziCorrelati;

public class Negozio {

    public static void main(String[] args) {
        TipoCapoAbbigliamento colmar = new TipoCapoAbbigliamento("Colmar", "Giacca E45", 350.5);
        CapoAbbigliamento levis = new CapoAbbigliamento("Levis", "jeans 570sc", 79.8, 40, 30,30);

        levis.getvenduto(2);
        levis.getDettagli();


    }


}
