public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1213,3123);
        Conta conta2 = new Conta(1213,3123);
        Conta conta3 = new Conta(1213,3123);

        conta.setAgencia(-50);
        conta.setNumero(-330);
        System.out.println("Agencia : " + conta.getAgencia());
        System.out.println("numero :  " + conta.getNumero());

        System.out.println("quantidade total de contas :  " + Conta.getTotal());


    }
}
