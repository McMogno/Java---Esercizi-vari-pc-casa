package AbbigliamentoEdEserciziCorrelati;

public class TipoCapoAbbigliamento {
        String marca;
        String modello;
        double costo;

        public TipoCapoAbbigliamento(String marca, String modello, double costo){
            this.marca=marca;
            this.modello=modello;
            this.costo=costo;
        }

        public void getCosto(){
            System.out.print(costo);
        }

        public double applicaSconto(double percentualeSconto) {
            double prezzoScontato;
            return prezzoScontato = costo - ((costo * percentualeSconto) / 100);
        }

        public void modificaCosto(double nuovoCosto){
            costo = nuovoCosto;
        }

}
