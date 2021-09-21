package AbbigliamentoEdEserciziCorrelati;

public class CapoAbbigliamento extends TipoCapoAbbigliamento{

    int taglia;
    int qtaAcquistata;
    int qtaDisponibile;

    public CapoAbbigliamento(String marca, String modello, double costo, int taglia, int qtaAcquistata, int qtaDisponibile){
        super(marca,modello,costo);
    }

    public void getvenduto(int capiVenduti) {
        if( qtaDisponibile > (qtaDisponibile - capiVenduti))
            qtaDisponibile -= capiVenduti;
    }

    public void getDettagli(){
        System.out.print( marca + modello + taglia + costo + qtaDisponibile );
    }


}
