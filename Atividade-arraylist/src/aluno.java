import java.util.ArrayList;

public class aluno extends Pessoa {

    private String Curso;
    private ArrayList<String> notas;


    public aluno( String Curso, String nome, String cpf, String email){
        super(nome, cpf, email);
        this.Curso = Curso;

        public String getCurso(){
            return curso;
        }

        public void setCurso(String Curso) {
            this.Curso = Curso;
        }


        public static double calcularMedia(notas) {
            double soma = 0;
            int quantidadeNotas = notas.size();

            for (double notas : notas) {
                soma += notas;
            }

            double media = soma / quantidadeNotas;
            return media;
        }


        @Override
        public String toString() {
            return super.toString()
                    + "\nTipo:" + curso;
                      + "\nTipo:" + media;

        }
    }
}

