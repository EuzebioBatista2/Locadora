import java.util.StringJoiner;

public class Dvd {

    // Atributos para DVD
    private int codigo;
    private String titulo;
    private Cliente cliente;

    // Construtores

    public Dvd() {
    }

    public Dvd(int codigo, String  titulo) {
        setCodigo(codigo);
        setTitulo(titulo);
        setCliente(null);
    }

    // Métodos gets

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public String getClienteToString() {
        if (getCliente() == null){
            return "Emprestimo livre.";

        }else{
            return "Dvd reservado pelo cliente: "+getCliente().getNome();
        }
    }

    // Métodos Sets
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return new StringJoiner("\n", Dvd.class.getSimpleName(),"\n")
                .add(" | Informações")
                .add("-----------------")
                .add("Código do DVD: "+getCodigo())
                .add("Titulo do DVD: "+getTitulo())
                .add(""+getClienteToString())
                .toString();
    }
}
