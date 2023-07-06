 import java.util.ArrayList;

    public class Endereco extends Pessoa {
        private String rua;
        private String cidade;
        private String estado;

        public Endereco(String rua, String cidade, String estado, String nome, String cpf, String email) {
            super(nome, cpf, email);
            this.rua = rua;
            this.cidade = cidade;
            this.estado = estado;
        }



        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public String getCidade() {
            return cidade;
        }

        public void setCidade(String cidade) {
            this.cidade = cidade;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        @Override
        public String toString() {
            return "Endereco [rua=" + rua + ", cidade=" + cidade + ", estado=" + estado + "]";
        }
    }



