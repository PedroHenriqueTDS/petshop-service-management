import java.util.Scanner;
import java.time.LocalDate;

public class PetshopRobot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventario inventario = new Inventario();
        String dataHoje = LocalDate.now().toString();
        int contador = 1;

        System.out.println(" Robô de Atendimento - Petshop UFPB");

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Registrar Novo Serviço");
            System.out.println("2. Fechar Loja (Relatório)");
            System.out.println("0. Sair do Sistema");
            System.out.print("Escolha uma opção: ");

            int opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    registrarServico(sc, inventario, dataHoje, contador++);
                    break;
                case 2:
                    inventario.imprimirRelatorioFinal();
                    continuar = false;
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        System.out.println("Sistema encerrado. Até amanhã!");
        sc.close();
    }

    private static void registrarServico(Scanner sc, Inventario inv, String data, int id) {
        String cod = "SERV-" + id;

        System.out.println("\nTipo de Serviço: (1) Banho (2) Hotel (3) Tosa");
        int tipo = Integer.parseInt(sc.nextLine());

        System.out.println("Porte do Animal: (1) Pequeno (2) Médio (3) Grande");
        int pIdx = Integer.parseInt(sc.nextLine());
        TamanhoAnimal porte = TamanhoAnimal.values()[pIdx - 1];

        if (tipo == 1) { // Banho
            System.out.println("Tipo de Pelo: (1) Curto (2) Médio (3) Longo");
            int peloIdx = Integer.parseInt(sc.nextLine());
            inv.adicionarServico(new Banho(cod, data, porte, TamanhoPelo.values()[peloIdx - 1]));
        } else if (tipo == 2) { // Hotel
            System.out.println("Quantidade de horas:");
            int horas = Integer.parseInt(sc.nextLine());
            inv.adicionarServico(new Hotelzinho(cod, data, porte, horas));
        } else if (tipo == 3) { // Tosa
            inv.adicionarServico(new Tosa(cod, data, porte));
        }

        System.out.println(cod + " adicionado ao inventário.");
    }
}