import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Informe a quantidade de veículos: ");
            int quantidadeVeiculos = scanner.nextInt();

            double[] notas = new double[quantidadeVeiculos];
            int carrosBons = 0;
            int carrosRuins = 0;
            double somaNotas = 0.0;

            for (int i = 0; i < quantidadeVeiculos; i++) {
                double nota;
                do {
                    System.out.print("Informe a nota do veículo " + (i + 1) + " (0 a 10): ");
                    nota = scanner.nextDouble();

                    if (nota < 0 || nota > 10) {
                        System.out.println("Nota inválida! Por favor, insira uma nota entre 0 e 10.");
                    }
                } while (nota < 0 || nota > 10);

                notas[i] = nota;
                somaNotas += nota;

                if (nota >= 6) {
                    carrosBons++;
                } else {
                    carrosRuins++;
                }
            }

            double media = somaNotas / quantidadeVeiculos;

            System.out.println("\nResultado da Avaliação:");
            System.out.println("Média das notas: " + media);
            System.out.println("Quantidade de carros bons : " + carrosBons);
            System.out.println("Quantidade de carros ruins : " + carrosRuins);

            scanner.close();
        }
    }
