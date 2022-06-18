public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero){
        Conta.total ++;
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estou criando uma conta.");
        System.out.println("O total de contas é: " + Conta.total);
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if (this.saldo < valor) {
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    public boolean transfere(double valor, Conta conta){
        if (this.saldo < valor){
            return false;
        }
        this.saca(valor);
        conta.deposita(valor);
        return true;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <=0 ){
            System.out.println("valor do número não pode ser menor ou igual a zero");
            return;
        }
        this.numero = numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <=0 ){
            System.out.println("valor da agência não pode ser menor ou igual a zero");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal(){
        return Conta.total;
    }
}
