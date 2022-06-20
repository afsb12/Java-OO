public class FuncionarioTeste {
        private String nome;
        private String cpf;
        private double salario;
        private int tipo = 0; // 0 - Funcionario comum, 1- Gerente, 2 - Diretor

        public FuncionarioTeste(){

        }

        public void setTipo(int tipo) {
            this.tipo = tipo;
        }

        public int getTipo() {
            return tipo;
        }

        public double getBonificacao(){
            if (this.tipo == 0 ){ //Funcionario Comum
                return this.salario * 0.1;
            }else if (this.tipo == 1) {// Gerente
                return this.salario;
            }else {
                return this.salario + 1000.0;
            }
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
            if (cpf.length() > 11){
                System.out.println("Cpf com tamanho inválido.");
            }
            this.cpf = cpf;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            if (salario <= 0 ){
                System.out.println("Salário não pode ser menor ou igual a zero.");
                return;
            }
            this.salario = salario;
        }

}
