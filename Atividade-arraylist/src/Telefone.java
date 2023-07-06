public class Telefone extends Pessoa {

    private String ddd;
    private String tipo;
    private String numero;

    public Telefone(String nome, String cpf, String email) {
        super(nome, cpf, email);
    }


    public void Telefone(String ddd, String tipo, String numero) {
        this.tipo = tipo;
        this.ddd = ddd;
        this.numero = numero;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nTipo:" + tipo
                + "\nQual o DDD:" + ddd
                + "\nQual o numero:" + numero;


    }
}