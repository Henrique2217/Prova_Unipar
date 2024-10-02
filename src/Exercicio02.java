import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        int voto;

        System.out.print("Informe a quantidade de votantes: ");
        int quantidadeVotantes = scanner.nextInt();

        for (int i = 1; i <= quantidadeVotantes; i++) {
            System.out.println("Votante " + i + ", escolha seu candidato: ");
            System.out.println("80 - Taffe");
            System.out.println("70 - Rodrigo");
            System.out.println("60 - Lucas");
            System.out.println("50 - Alessandro");
            System.out.print("Seu voto: ");

            voto = scanner.nextInt();

            switch (voto) {
                case 1:
                    candidato1++;
                    break;
                case 2:
                    candidato2++;
                    break;
                case 3:
                    candidato3++;
                    break;
                case 4:
                    candidato4++;
                    break;
                default:
                    System.out.println("Voto inválido! Tente novamente.");
                    i--;
                    break;
            }
        }

        // Exibe o total de votos
        System.out.println("\nResultado da votação:");
        System.out.println("80 - Taffe: " + candidato1 + " votos.");
        System.out.println("70 - Rodrigo: " + candidato2 + " votos.");
        System.out.println("60 - Lucas: " + candidato3 + " votos.");
        System.out.println("50 - Alessandro: " + candidato4 + " votos.");
    }
}
