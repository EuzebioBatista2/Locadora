public class TesteLocadoraMain {
    public static void main(String[] args) {
        Locadora loc = new Locadora();
        Cliente c1 = new Cliente(100,"ana");
        Cliente c2 = new Cliente(200,"pedro");
        Cliente c3 = new Cliente(300,"caio");
        Dvd d1 = new Dvd(1,"Rambo");
        Dvd d2 = new Dvd(2,"StarWars");
        Dvd d3 = new Dvd(3,"Vingadores");

        // Teste cadastro + função gráfico

        loc.cadastrarCliente(c1);
        loc.cadastrarCliente(c2);
        loc.cadastrarCliente(c3);
        loc.cadastrarDvd(d1);
        loc.cadastrarDvd(d2);
        loc.cadastrarDvd(d3);
        loc.fazerEmprestimo(c1,d1);
        loc.fazerEmprestimo(c2,d2);
        System.out.println("Quantidade de DVD emprestados(Part1 - 2): " + loc.contarDvdEmprestado());
        loc.listarInfoDvd();
        loc.fazerEmprestimo(c3,d3);
        System.out.println("Quantidade de DVD emprestados(Part2 - 3): " + loc.contarDvdEmprestado());
        loc.listarInfoDvd();

//        //Teste emprestimo com cliente já existente
//
//        loc.cadastrarCliente(c1) ; loc.cadastrarCliente(c2) ; loc.cadastrarCliente(c3);
//        loc.cadastrarDvd(d1) ;  loc.cadastrarDvd(d2) ;
//
//        loc.fazerEmprestimo(c1,d1);
//        loc.fazerEmprestimo(c2,d2);
//
//        loc.fazerEmprestimo(c3,d1);
//
//        System.out.println("Quantidade de DVD emprestados(Contém 2): " + loc.contarDvdEmprestado());
//
//        loc.listarInfoDvd();
//
        //Teste cadastrar cliente existente

        loc.cadastrarCliente(c1);
        loc.cadastrarCliente(c2);
        loc.cadastrarCliente(c1);

        loc.listarInfoCliente();
//
//        //Teste cadastrar DVD existente
//
//        loc.cadastrarDvd(d1);
//        loc.cadastrarDvd(d2);
//        loc.cadastrarDvd(d1);
//
//        loc.listarInfo();

    }
}
