import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // obtendo o primeiro parametro
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = sc.nextInt();

        // segundo parametro
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = sc.nextInt();

        // try catch
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // imprimir mensagem
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        sc.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        for (int i=0; i<=contagem; i++) {
            System.out.println("imprimindo o número " + i);
        }
    }
}
