public class ContatoPessoal extends Contato {
    public ContatoPessoal(String id, String nome, String email, String telefone){// Contato contatoPessoal,Contato contatoProfissional, Contato contatoEmergencia {
        super(id, nome, email, telefone);//contatoPessoal, contatoProfissional, contatoEmergencia;
    }

    private String dataAdicional;
    private String parentesco;

    public void setDataAdicional(String dataAdicional) {
        this.dataAdicional = dataAdicional;
    }

    public String getDataAdicional() {
        return dataAdicional;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }

    @Override
    public String exibirDados(){
        
        return super.exibirDados() + "\nData adicional: "+ getDataAdicional()+"\nParentesco: "+getParentesco();
    }
}
