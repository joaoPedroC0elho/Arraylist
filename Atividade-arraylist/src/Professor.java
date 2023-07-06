import java.util.ArrayList;

public class Professor extends Pessoa {
    private  String titulacao;
    private  Double salario;
    public Professor(String nome, String cpf, String email) {
        super(nome, cpf, email);
        this.titulacao = titulacao;
        setsalario(salario);
    }

    private void setsalario(Double salario) {
        this.salario= salario;
    }


    public String getTitulacao() {
        return titulacao;
    }


    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }


    @Override
    public String toString() {
        return super.toString()
                + "\nTipo:" + titulacao
                + "\nsalario:" + salario;

    }
}
