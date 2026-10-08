import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<Contato>();
    private int qtdContatos;
    public ArrayList<Contato> getContatos() {
        return contatos;
    }
    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }
    public int getQtdContatos() {
        return qtdContatos;
    }
    public void setQtdContatos(int qtdContatos) {
        this.qtdContatos = qtdContatos;
    }

    public void adicionarContato(Contato contato){
        if(!contatos.contains(contato)){
            contatos.add(contato);
            qtdContatos++;
        }else{
            System.out.println("Contato ja existe");
        }
    }

    public void removercontato(String id){
        try{
            
            for(Contato contato : contatos){
                if(contato.getIdContato().equals(id) ){
                    contatos.remove(contato);
                    System.out.println("Contato removido com sucesso!");
                    break;
                }
            }
        }catch(Exception e){
            System.out.println("Erro ao remover: "+e);
        }
    }

    public ArrayList<String> buscarContatoPorNome(String nome){
        ArrayList<String> contatosBuscados = new ArrayList<String>();
        try {
            for (Contato contato : contatos) {
                if(contato.getNome().contains(nome)){
                    contatosBuscados.add(contato.exibirDados());
                }   
            }
            if(contatosBuscados.isEmpty()){
                System.out.println("Contato não encontrado");
            }
            return contatosBuscados;
        } catch (Exception e) {
            System.err.println("Errp ao buscar: "+e);
        }
        return contatosBuscados;
    }
    public ArrayList<String> buscarContatoPorTelefone(String telefone){
        ArrayList<String> contatosBuscados = new ArrayList<String>();
        try {
            for (Contato contato : contatos) {
                if(contato.getTelefone().contains(telefone)){
                    contatosBuscados.add(contato.exibirDados());
                }   
            }
            if(contatosBuscados.isEmpty()){
                System.out.println("Contato não encontrado");
            }
            return contatosBuscados;
        } catch (Exception e) {
            System.err.println("Errp ao buscar: "+e);
        }
        return contatosBuscados;
    }
    public ArrayList<String> buscarContatoPorEmail(String email){
        ArrayList<String> contatosBuscados = new ArrayList<String>();
        try {
            for (Contato contato : contatos) {
                if(contato.getEmail().contains(email)){
                    contatosBuscados.add(contato.exibirDados());
                }   
            }
            if(contatosBuscados.isEmpty()){
                System.out.println("Contato não encontrado");
            }
            return contatosBuscados;
        } catch (Exception e) {
            System.err.println("Errp ao buscar: "+e);
        }
        return contatosBuscados;
    }
    
   

}
