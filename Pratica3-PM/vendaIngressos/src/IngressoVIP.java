public class IngressoVIP extends Ingresso  {
    private double valorFinal;
    private boolean acessoBackstage;
    private int numeroLounge;
    

    public IngressoVIP(int codigo, String nomeEvento, String setor, double valorBase) {
        super(codigo, nomeEvento, setor, valorBase);
    }

    public boolean isAcessoBackstage() {
        return acessoBackstage;
    }

    public void setAcessoBackstage(boolean acessoBackstage) {
        this.acessoBackstage = acessoBackstage;
    }

    public int getNumeroLounge() {
        return numeroLounge;
    }

    public void setNumeroLounge(int numeroLounge) {
        this.numeroLounge = numeroLounge;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    @Override
    public double calcularValorFinal() {
        // Implement the logic for calculating the final value of a VIP ticket
        setValorFinal(super.getValorBase() * 1.8); 
        return getValorFinal();
    }

    @Override
    public String obterBeneficios() {
        if(acessoBackstage) {
            return "Benefícios do ingresso VIP: Acesso ao evento, acesso ao backstage, acesso ao lounge VIP.";
        } else {
            return "Benefícios do ingresso VIP: Acesso ao evento, acesso ao lounge VIP.";
        }
    }
    
}
