public class IngressoComum extends Ingresso {
    private double valorFinal;

    public IngressoComum(int codigo, String nomeEvento, String setor, double valorBase) {
        super(codigo, nomeEvento, setor, valorBase);
        this.valorFinal = super.getValorBase();
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }


    @Override 
    public String obterBeneficios(){
        return "Benefícios do ingresso comum: Acesso ao evento.";
    }        
    @Override
    public double calcularValorFinal() {
        return getValorFinal();
    }
    
}
