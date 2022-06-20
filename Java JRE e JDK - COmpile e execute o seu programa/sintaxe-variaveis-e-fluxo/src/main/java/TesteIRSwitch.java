import java.util.Scanner;

public class TesteIRSwitch {
    public static void main(String[] args) {
        int idade = 18;
        Scanner entrada =  new Scanner(System.in);
        System.out.println("Voê é maior de idade: Digite Sim ou Não");
        String validacao = entrada.next();
            switch (validacao) {
                case "Sim":
                    System.out.println("Você confimou que é maior de idade");
                    break;
                case "Não":
                    System.out.println("Você confimou que não é maior de idade");
                    break;
                default:
                    System.out.println("Você não confimou");
                    break;
        }
    }
}
