import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("\n===== CALCULADORA =====");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            if (opcao >= 1 && opcao <= 4) {

                System.out.print("Digite o primeiro número: ");
                double a = sc.nextDouble();

                System.out.print("Digite o segundo número: ");
                double b = sc.nextDouble();

                switch (opcao) {

                    case 1:
                        System.out.println("Resultado: " + (a + b));
                        break;

                    case 2:
                        System.out.println("Resultado: " + (a - b));
                        break;

                    case 3:
                        System.out.println("Resultado: " + (a * b));
                        break;

                    case 4:
                        if (b != 0) {
                            System.out.println("Resultado: " + (a / b));
                        } else {
                            System.out.println("Erro: Divisão por zero não é permitida.");
                        }
                        break;
                }

            } else if (opcao != 0) {
                System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        System.out.println("Programa encerrado. Obrigado por usar a calculadora!");
        sc.close();
    }
}
