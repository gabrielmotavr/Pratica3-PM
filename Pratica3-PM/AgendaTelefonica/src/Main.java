import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        String opcao = "";
        while (opcao != "g") {
            System.out.println("(a) Adicionar contato\n" + //
                    "(b) Remover contato\n" + //
                    "(c) Buscar contato por nome\n" + //
                    "(d) Buscar contato por email\n" + //
                    "(e) Buscar contato por telefone\n"
                    + //
                    "(f) Consultar tamanho da Agenda\n"
                    + //
                    "(g) Finalizar - o programa só deve encerrar quando o usuário selecionar esta opção");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextLine();

            switch (opcao) {
                case "a":
                    System.out.println("\n--- Adicionar Contato ---");
                    System.out.print("Digite o id: ");
                    String idContato = sc.nextLine();
                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o telefone: ");
                    String telefone = sc.nextLine();
                    System.out.print("Digite o e-mail: ");
                    String email = sc.nextLine();

                    Contato novoContato = new Contato(idContato, nome, telefone, email);
                    agenda.adicionarContato(novoContato);
                    break;
                case "b":
                    System.out.println("\n--- Remover Contato ---");
                    System.out.print("Digite o id do contato que deseja remover: ");
                    String id = sc.nextLine();
                    agenda.removercontato(id);
                    break;
                case "c":
                    System.out.println("\n--- Buscar pelo Nome ---");
                    System.out.print("Pesquisa pelo nome: ");
                    String nomeBuscado = sc.nextLine();
                    System.out.println(agenda.buscarContatoPorNome(nomeBuscado));
                    break;
                case "d":
                    System.out.println("\n--- Buscar pelo Email ---");
                    System.out.print("Pesquisa pelo email: ");
                    String emailBuscado = sc.nextLine();
                    System.out.println(agenda.buscarContatoPorEmail(emailBuscado));
                    agenda.buscarContatoPorEmail(emailBuscado);
                    break;
                case "e":
                    System.out.println("\n--- Buscar pelo Telefone ---");
                    System.out.print("Pesquisa pelo telefone: ");
                    String telefoneBuscado = sc.nextLine();
                    System.out.println(agenda.buscarContatoPorTelefone(telefoneBuscado));
                    agenda.buscarContatoPorTelefone(telefoneBuscado);
                    break;
                case "f":
                    System.out.println("Quantidade de contatos: "+agenda.getQtdContatos());
                    break;
                case "g":
                    System.out.println("Programa finalizado!");
                    return;

                default:
                    break;
            }
        }
    }
}
