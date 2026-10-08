/**
 * ContatoProfissional
 */
public class ContatoProfissional extends Contato{
private String empresa;
private String cargo;


    public ContatoProfissional(String id,String nome, String email, String telefone, Contato contatoPessoal,
            Contato contatoProfissional, Contato contatoEmergencia) {
        super(id, nome, email, telefone);// contatoPessoal, contatoProfissional, contatoEmergencia
    }


    public String getEmpresa() {
        return empresa;
    }


    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }


    public String getCargo() {
        return cargo;
    }


    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    @Override
    public String exibirDados(){
        return super.exibirDados() + "\nEmpresa: "+ getEmpresa()+"\nCargo: "+getCargo();
    }


}
