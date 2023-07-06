import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private ArrayList<String> Endereco;

    public Pessoa(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.Endereco = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return nome;
    }

    public void setCpf(String nome) {
        this.nome = nome;
    }


    public String getEmail() {
        return nome;
    }

    public void setEmail(String nome) {
        this.nome = nome;
    }


    public ArrayList<String> getEndereco() {
        return Endereco;
    }

    public void adicionarEndereco(Endereco endereco) {
        Endereco.add(String.valueOf(Endereco));
    }

    public void removerEndereco(Endereco endereco) {
        Endereco.remove(Endereco);
    }

    public void mostrarEnderecos() {
        System.out.println("Endereços de " + nome + ":");
        for (String Endereco : Endereco) {
            System.out.println(Endereco);
        }
    }

}
