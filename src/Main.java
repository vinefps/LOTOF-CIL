import java.util.Scanner;
import java.util.Random;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println(
                "Menu:\n " +
                        "1)Apostar de 0 a 100\n" +
                        "2)Apostar de A a Z\n" +
                        "3)Apostar em par ou ímpar\n" +
                        "0)Sair");

        int userMenu = scanner.nextInt();

        switch (userMenu) {
            case 1:
                int userNumber;
                int randomNumber;

                do {
                    randomNumber = random.nextInt(101);

                    System.out.println("Escolha um num de 0 a 100. Digite 0 para sair. ");
                    userNumber = scanner.nextInt();

                    if (userNumber < 0 || userNumber > 100) {
                        System.out.println("Valor inválido! Digite o valor novamente:");
                        userNumber = scanner.nextInt();
                    }
                    if (randomNumber == userNumber) {
                        System.out.println("Você ganhou R$ 1000,00");
                    } else {
                        System.out.println("Que pena! O número sorteado foi " + randomNumber);
                    }

                } while (userNumber != 0 || userNumber != randomNumber);

                break;
            case 2:
                char letraEscolhida = (char) (random.nextInt(26) + 'A');
                char letraAposta;
                do {
                    System.out.println("Digite uma letra (A a Z): ");
                    letraAposta = scanner.next().toUpperCase().charAt(0);

                    if (Character.isLetter(letraAposta)) {

                        if (letraAposta == letraEscolhida) {
                            System.out.println("Você ganhou R$ 500,00 reais.");
                        } else {
                            System.out.println("Que pena! A letra sorteada foi: " + letraEscolhida + ".");
                        }
                    } else {
                        System.out.println("Aposta inválida.");
                    }
                } while (letraAposta != letraEscolhida);
                break;
            case 3:
                int randomNumero = random.nextInt();
                int numero;
                do {
                    if(randomNumero % 2 == 0) {
                        System.out.print("Digite um número inteiro: ");
                        numero = scanner.nextInt();

                        if (numero % 2 == 0) {
                            System.out.println("Você ganhou R$ 100,00 reais.");
                        } else {
                            System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares.");
                        }
                    }else {
                        System.out.print("Digite um número inteiro: ");
                        numero = scanner.nextInt();

                        if (numero % 2 == 0) {
                            System.out.println("Você ganhou R$ 100,00 reais.");
                        } else {
                            System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares.");
                        }
                    }
                }while(numero % 2 != 0 && randomNumero % 2 == 0 || numero % 2 == 0 && randomNumero % 2 != 0);
        }
    }
};
