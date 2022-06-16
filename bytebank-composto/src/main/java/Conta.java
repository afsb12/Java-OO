public class Conta {
    private double saldo;
    int agencia;
    int numero;
    Cliente titular;

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

    public double pegaSaldo(){
        return this.saldo;
    }
}
