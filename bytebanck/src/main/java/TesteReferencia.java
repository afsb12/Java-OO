public class TesteReferencia {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300.0;
        System.out.println("Saldo da primeira Conta : " + primeiraConta.saldo);
        Conta segundaConta = primeiraConta;
        System.out.println("Saldo da segunda Conta : " + primeiraConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("Saldo da segunda Conta : " + primeiraConta.saldo);
        System.out.println("Saldo da primeira Conta : " + primeiraConta.saldo);

        if (primeiraConta == segundaConta){
            System.out.println("primeira conta e segunda conta são a mesmmissíma conta");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
