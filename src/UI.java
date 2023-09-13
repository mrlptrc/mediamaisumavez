import java.util.Scanner;

public class UI {
    Scanner ler = new Scanner(System.in);

    public String pedirTexto(String msg, Object... values) {
        System.out.printf(msg, values);
        String valor = ler.next();
        return valor;
    }

    public int pedirInt(String msg, Object... values) {
        System.out.printf(msg, values);
        int valor = ler.nextInt();
        return valor;
    }
    public void pularLinha() {
        System.out.println();
    }
    public double pedirDouble(String msg, Object... values) {
        System.out.printf(msg, values);
        double valor = ler.nextDouble();
        return valor;
    }
    public void escrever(String msg, Object... values) {
        System.out.printf(msg+"\n", values);
    }

    public void exibirResultado(Resultado resultado) {
        pularLinha();
        pularLinha();
        escrever("=========================");
        escrever("    COMPRA REALIZADA!");
        escrever("=========================");

        pularLinha();
        pularLinha();
        escrever("=========================");
        escrever("         ITENS");
        escrever("=========================");

        for (NotaDisciplina item : resultado.getNotaDisciplina()) {
            escrever("%s  R$ %.2f ", item.getMedia(), item.getFaltas());
        }

        pularLinha();
        pularLinha();
        escrever("=========================");
        escrever("    TOTAL DA COMPRA");
        escrever("=========================");
        escrever("R$ %.2f", resultado.getSituacao());

        pularLinha();
        pularLinha();
        escrever("=========================");
        escrever("        ENTREGA");
        escrever("=========================");
        escrever("  Código: %d", resultado.getAluno());
        escrever(" Cliente: %s", resultado.getAluno().getNome());
        escrever("Telefone: %s", resultado.getAluno().getCurso());
        escrever("Endereço: %s", resultado.getAluno().getTurma());
        escrever("Endereço: %s", resultado.getAluno().getChamada());

        pularLinha();
        pularLinha();
        escrever("=========================");
        escrever("          FIM");
        escrever("=========================");
        pularLinha();
        pularLinha();
        pularLinha();
    }

}
