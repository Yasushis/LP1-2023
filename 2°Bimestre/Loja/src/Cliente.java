public class Cliente {

    private String nome;
    private int cpf;
    private int telefone;

    public Cliente(String nome, int cpf, int telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getTelefone() {
        return telefone;
    }
 }
