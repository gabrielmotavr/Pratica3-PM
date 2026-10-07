/**
 * contatoEmergencia
 */
public class contatoEmergencia extends Contato {
    public contatoEmergencia(String nome, String email, String telefone, Contato contatoPessoal,
            Contato contatoProfissional, Contato contatoEmergencia, Numero grauPrioridade, String observacao) {
        super(nome, email, telefone);// contatoPessoal, contatoProfissional, contatoEmergencia
        this.grauPrioridade = grauPrioridade;
        this.observacao = observacao;
    }

    private Numero grauPrioridade;
    private String observacao;

    public Numero getGrauPrioridade() {
        return grauPrioridade;
    }

    public void setGrauPrioridade(Numero grauPrioridade) {
        this.grauPrioridade = grauPrioridade;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }


    @Override
    public String exibirDados(){
        
        return super.exibirDados() + "\nGrau prioridade: "+ getGrauPrioridade()+"\nobservacao: "+getObservacao();
    }
}
