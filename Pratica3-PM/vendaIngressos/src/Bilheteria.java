import java.util.ArrayList;
public class Bilheteria {
    ArrayList<Ingresso> ingressos;
    
    public Bilheteria() {
        ingressos = new ArrayList<>();
    }

public void adicionarIngresso(Ingresso ingresso){
    ingressos.add(ingresso);
    System.out.println("Ingresso adicionado com sucesso!");
}

public void removeringresso(int codigo){
    for (int i = 0; i < ingressos.size(); i++) {
        if (ingressos.get(i).getCodigo() == codigo) {
            ingressos.remove(i);
            System.out.println("Ingresso removido com sucesso!");
            return;
        }
    }
    System.out.println("Ingresso não encontrado.");
}

}
