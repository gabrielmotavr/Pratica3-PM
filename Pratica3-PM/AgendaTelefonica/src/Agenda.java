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

    public void removercontato(Contato contato){
        try{
            if(contatos.contains(contato)){
                contatos.remove(contato);
            }else{
                System.out.println("Contato não encontrado");
            }
        }catch(Exception e){
            System.out.println("Erro ao remover: "+e);
        }
    }

    public ArrayList<Contato> buscarContatoPorNome(String nome){
        ArrayList<Contato> contatosBuscados = new ArrayList<Contato>();
        try {
            for (Contato contato : contatos) {
                if(contato.getNome().equals(nome)){
                    contatosBuscados.add(contato);
                }   
            }
            return contatosBuscados;
        } catch (Exception e) {
            System.err.println("Errp ao buscar: "+e);
        }
        return contatosBuscados;
    }
    
    public ArrayList<Contato> buscarContatoPorEmail(String email){
        ArrayList<Contato> contatosBuscados = new ArrayList<Contato>();
        try {
            for (Contato contato : contatos) {
                if(contato.getEmail().equals(email)){
                    contatosBuscados.add(contato);
                }   
            }
            return contatosBuscados;
        } catch (Exception e) {
            System.err.println("Errp ao buscar: "+e);
        }
        return contatosBuscados;
    }
    public ArrayList<Contato> buscarContatoPorTelefone(String telefone){
        ArrayList<Contato> contatosBuscados = new ArrayList<Contato>();
        try {
            for (Contato contato : contatos) {
                if(contato.getTelefone().equals(telefone)){
                    contatosBuscados.add(contato);
                }   
            }
            return contatosBuscados;
        } catch (Exception e) {
            System.err.println("Erro ao buscar: "+e);
        }
        return contatosBuscados;
    }

}
