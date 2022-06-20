public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(){

    }

    public double getBonificacao(){
        return this.salario * 0.1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario <= 0 ){
            System.out.println("Salário não pode ser menor ou igual a zero");
            return;
        }
        this.salario = salario;
    }
}
