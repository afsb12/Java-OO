public class TestaMetodo {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        Conta segundaConta = new Conta();
        primeiraConta.deposita(100.0);
        primeiraConta.deposita(200);
        primeiraConta.saca(50);
        primeiraConta.transfere(200, segundaConta);
        System.out.println(primeiraConta.saldo);
        System.out.println(segundaConta.saldo);

        if (primeiraConta.transfere(200, segundaConta)){
            System.out.println("Valor depositado com sucesso!");
        }
        else {
            System.out.println("Saldo insuficiente para fazer a transferência");
        }
        System.out.println(primeiraConta.saldo);
        System.out.println(segundaConta.saldo);

    }
}
