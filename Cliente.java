import java.util.StringJoiner;

public class Cliente {

    // Atributos para Cliente
    private int matricula;
    private String nome;

    // Construtores

    public Cliente() {
    }
    public Cliente(int matricula, String nome) {
        setMatricula(matricula);
        setNome(nome);
    }

    // Métodos gets
    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    // Métodos Sets
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return new StringJoiner("\n", Cliente.class.getSimpleName(),"\n")
                .add(" | Informações")
                .add("-----------------")
                .add("Matricula do cliente: "+getMatricula())
                .add("Nome do cliente: "+getNome())
                .toString();
    }
}
