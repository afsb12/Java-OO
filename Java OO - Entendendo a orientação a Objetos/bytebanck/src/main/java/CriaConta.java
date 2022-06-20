public class CriaConta {
    public static void main(String[] args) {
       Conta primeiraConta =  new Conta();
       primeiraConta.saldo = 2000.0;
       System.out.println(primeiraConta.saldo);
       primeiraConta.saldo += 100;
       System.out.println(primeiraConta.saldo);

       Conta segundaConta = new Conta();
       segundaConta.saldo = 5000.0;

       System.out.println("Primeira conta tem: " + primeiraConta.saldo);
       System.out.println("Segunda conta tem: " + segundaConta.saldo);

       if (primeiraConta == segundaConta){
          System.out.println("primeira conta e segunda conta são a mesmmissíma conta");
       }

       System.out.println(primeiraConta);
       System.out.println(segundaConta);

    }
}
