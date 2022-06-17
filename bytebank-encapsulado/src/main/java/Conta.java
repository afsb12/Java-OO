public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

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
        this.numero = numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
}
