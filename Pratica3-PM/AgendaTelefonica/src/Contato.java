public class Contato{
    private String nome;
    private String email;
    private String telefone;
    /*private Contato contatoPessoal = new ContatoPessoal();
    private Contato contatoProfissional = new ContatoProfissional();
    private Contato contatoEmergencia = new contatoEmergencia();*/

    public Contato(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        //this.contatoPessoal = contatoPessoal;
        //this.contatoProfissional = contatoProfissional;
        //this.contatoEmergencia = contatoEmergencia;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String exibirDados(){
        return "Nome: "+getNome()+"\nEmail: "+getEmail()+"\nTelefone: "+getTelefone();
    }

}