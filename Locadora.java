import java.util.LinkedList;
public class Locadora {

    // Listas para Cliente e DVD(linkedList)
    private LinkedList<Cliente> listaCliente = new LinkedList<>();
    private LinkedList<Dvd> listaDvd = new LinkedList<>();

    // Método cadastrarCliente
    public boolean cadastrarCliente(Cliente ob){
        for (Cliente y: listaCliente){
            if (y.getMatricula() == ob.getMatricula() || y.getNome().equals(ob.getNome())){
                return false;
            }
        }
        listaCliente.add(ob);
        return true;
    }

    // Método cadastrarDVD
    public boolean cadastrarDvd(Dvd ob){
        for (Dvd y: listaDvd){
            if (y.getTitulo().equals(ob.getTitulo()) || y.getCodigo() == ob.getCodigo()){
                return false;
            }
        }
        listaDvd.add(ob);
        return true;
    }
    // Método de contagem de DVD(s) emprestado(s)
    public int contarDvdEmprestado(){
        int cont = 0;
        for (Dvd o:listaDvd){
            if(o.getCliente() != null){
                cont += 1;
            }
        }return cont;
    }
    // Método para realizar o emprestimo de um dvd
    public boolean fazerEmprestimo(Cliente ob,Dvd og){
        int posicaoDvd = listaDvd.indexOf(og);
        int posicaoCliente = listaCliente.indexOf(ob);
        if (posicaoDvd == -1 || posicaoCliente == -1){
            return false;
        }
        else {
            if(og.getCliente()==null){
                og.setCliente(ob);
                return true;
            }
        }
        return false;
    }

    // Lista de dados(toString) para Cliente e DVD
    public void listarInfoDvd(){
        for (Dvd y: listaDvd){
            System.out.println(y);
        }
    }
    public void listarInfoCliente(){
        for (Cliente y: listaCliente){
            System.out.println(y);
        }
    }

}
