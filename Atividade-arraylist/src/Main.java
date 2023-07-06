import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        ArrayList<aluno> notas = new ArrayList<>();
        ArrayList<Endereco> endereco = new ArrayList<>();
        Pessoa pessoa = new Pessoa("João", "000001","alunoteste@gmail.com");
        aluno aluno = new aluno("eng.software", "joao","00001", "alunoteste@gmail.com");
        Professor professor = new Professor("MARIO", "000002","professorteste@gmai.com");




       System.out.println("Dados da pessoa: \n" + pessoa.toString());

        System.out.println("----------------//------------");

        System.out.println("Dados do Fornecedor: \n" + aluno.toString());

        System.out.println("----------------//------------");

        System.out.println("Dados do empregado: \n" + professor.toString());

        System.out.println("----------------//------------");
    }
}
