public class IngressoEstudante extends Ingresso {
    private double valorFinal;
    private String instituicaoEnsino;
    
    public IngressoEstudante(int codigo, String nomeEvento, String setor, double valorBase) {
        super(codigo, nomeEvento, setor, valorBase);
    }

    
    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }



    public void setInstituicaoEnsino(String instituicaoEnsino) {
        this.instituicaoEnsino = instituicaoEnsino;
    }





    
    @Override
    public double calcularValorFinal() {
        setValorFinal(super.getValorBase() * 0.5);
        return getValorFinal();
    }

    @Override
    public String obterBeneficios() {
        return "Direito a meia entrada";
    }



    public double getValorFinal() {
        return valorFinal;
    }



    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }
    
}
