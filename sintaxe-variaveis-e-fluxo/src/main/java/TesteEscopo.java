public class TesteEscopo {
    public static void main(String[] args) {
        System.out.println("testando Condicionais");
        int idade = 18;
        int quantidadeDePessoas = 3;
        //boolean acompanhado = quantidadeDePessoas >= 2;

        boolean acompanhado;
        if (quantidadeDePessoas >= 2){
            acompanhado = true;
        }
        else {
            acompanhado = false;
        }

        if (idade >= 18 && acompanhado) {
            System.out.println("Você tem mais de 18 anos");
        } else {
            System.out.println("Infelizmente você não pode entrar!");
        }
    }
}
