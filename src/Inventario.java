import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<ServicoPet> servicosRealizados = new ArrayList<>();

    public void adicionarServico(ServicoPet s) {
        servicosRealizados.add(s);
    }

    public void imprimirRelatorioFinal() {
        System.out.println("\n=======================================");
        System.out.println("   RELATÓRIO DE FECHAMENTO DO DIA");
        System.out.println("=======================================");

        double faturamentoTotal = 0;

        if (servicosRealizados.isEmpty()) {
            System.out.println("Nenhum serviço realizado hoje.");
        } else {
            for (ServicoPet s : servicosRealizados) {
                System.out.println(s.getDetalhes());
                faturamentoTotal += s.calcularPreco();
            }
        }

        System.out.println("---------------------------------------");
        System.out.printf("TOTAL RECEBIDO NO DIA: R$ %.2f\n", faturamentoTotal);
        System.out.println("=======================================\n");
    }
}