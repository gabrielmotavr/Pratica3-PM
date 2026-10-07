import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        String opcao = "";
        while (opcao != "g") {
            System.out.println("(a) Adicionar contato\n" + //
                    "(b) Remover contato - caso o usuário não seja encontrado o usuário deve ser informado\n" + //
                    "(c) Buscar contato por nome - caso o contato não seja encontrado o usuário deve ser informado\n" + //
                    "(d) Buscar contato por email - caso o contato não seja encontrado o usuário deve ser informado\n" + //
                    "(e) Buscar contato por telefone - caso o contato não seja encontrado o usuário deve ser informado\n"
                    + //
                    "(f) Consultar tamanho da Agenda - caso o contato não seja encontrado o usuário deve ser informado\n"
                    + //
                    "(g) Finalizar - o programa só deve encerrar quando o usuário selecionar esta opção");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextLine();

            switch (opcao) {
                case "a":
                    System.out.println("\n--- Adicionar Contato ---");
                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o telefone: ");
                    String telefone = sc.nextLine();
                    System.out.print("Digite o e-mail: ");
                    String email = sc.nextLine();

                    Contato novoContato = new Contato(nome, telefone, email);
                    agenda.adicionarContato(novoContato);
                    break;
                case "b":
                    agenda.removercontato(null);
                case "c":
                    agenda.buscarContatoPorNome(opcao);
                case "d":
                    agenda.buscarContatoPorEmail(opcao);
                case "e":
                    agenda.buscarContatoPorTelefone(opcao);
                case "f":
                    agenda.getQtdContatos();

                default:
                    break;
            }
        }
    }
}
