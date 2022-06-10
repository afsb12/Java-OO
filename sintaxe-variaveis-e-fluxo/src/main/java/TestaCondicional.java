public class TestaCondicional {
    public static void main(String[] args) {
        System.out.println("testando Condicionais");
        int idade = 13;
        int quantidaDePessoas = 1;
        if (idade >= 18) {
            System.out.println("Você tem mais de 18 anos");
        }else{
            if (quantidaDePessoas >= 2) {
                System.out.println("Você tem menos de 18 anos mais está acompanhado");
            }else{
                System.out.println("Infelizmente você não pode entrar!");
            }

        }
    }
}
