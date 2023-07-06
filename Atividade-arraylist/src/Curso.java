public class Curso extends aluno {
    private String nome;


    public Curso(String Curso, String nome, String cpf, String email) {
        super(Curso, nome, cpf, email);
        this.nome = nome;

    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return super.toString()
                + "\nTipo:" + nome;

    }
}
