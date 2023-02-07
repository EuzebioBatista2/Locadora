import org.junit.Assert;
import org.junit.Test;


public class TesteLocadora {
    Locadora loc = new Locadora();
    Cliente c1 = new Cliente(100,"ana"); Dvd d1 = new Dvd(1,"Rambo");
    Cliente c2 = new Cliente(200,"pedro"); Dvd d2 = new Dvd(2,"StarWars");
    Cliente c3 = new Cliente(300,"caio"); Dvd d3 = new Dvd(3,"Vingadores");

    Cliente copiaC1 = new Cliente(100,"ana"); Dvd copiaD1 = new Dvd(1,"Rambo");

    @Test
    public void testEmprestimoDeveFuncionarSemProblema(){

        // Cadastro dos clientes c1, c2 e c3
        Assert.assertTrue(loc.cadastrarCliente(c1)); Assert.assertTrue(loc.cadastrarCliente(c2));
        Assert.assertTrue(loc.cadastrarCliente(c3));

        // Cadastro dos DVDs d1, d2 e d3
        Assert.assertTrue(loc.cadastrarDvd(d1)); Assert.assertTrue(loc.cadastrarDvd(d2));
        Assert.assertTrue(loc.cadastrarDvd(d3));

        Assert.assertEquals(0,loc.contarDvdEmprestado());

        // Fazer um emprestimo mediante o cliente e o dvd que se quer pegar emprestado
        Assert.assertTrue(loc.fazerEmprestimo(c1,d1));
        Assert.assertTrue(loc.fazerEmprestimo(c2,d2));

        Assert.assertEquals(2,loc.contarDvdEmprestado()); // deve existir 2 emprestimos

        Assert.assertTrue(loc.fazerEmprestimo(c3,d3));

        Assert.assertEquals(3,loc.contarDvdEmprestado()); // deve existir 3 emprestimos

    }
    @Test
    public void LocadoraNãoPermitirLocarDVDJáEmprestadoParaOutroCliente(){

        // Cadastro dos clientes c1, c2 e c3
        Assert.assertTrue(loc.cadastrarCliente(c1)); Assert.assertTrue(loc.cadastrarCliente(c2));
        Assert.assertTrue(loc.cadastrarCliente(c3));

        // Cadastro dos DVDs d1 e d2
        Assert.assertTrue(loc.cadastrarDvd(d1)); Assert.assertTrue(loc.cadastrarDvd(d2));

        // Fazer um emprestimo mediante o cliente e o dvd que se quer pegar emprestado
        Assert.assertTrue(loc.fazerEmprestimo(c1,d1));
        Assert.assertTrue(loc.fazerEmprestimo(c2,d2));

        // Casdastro em um emprestimo que já possui um cliente cadastrado(false)
        Assert.assertFalse(loc.fazerEmprestimo(c3,d2));

        Assert.assertEquals(2,loc.contarDvdEmprestado()); // deve existir 2 emprestimos
    }
    @Test
    public void testLocadoraNãoPermitirCadastrarNaLocadoraClienteJáExistente(){

        // Cadastro dos clientes c1 e c2
        Assert.assertTrue(loc.cadastrarCliente(c1)); Assert.assertTrue(loc.cadastrarCliente(c2));

        // Verificar se é possivel cadastrar um cliente já existente(false)
        Assert.assertFalse(loc.cadastrarCliente(copiaC1));

    }
    @Test
    public void testLocadoraNãoPermitirCadastrarNaLocadoraDVDJáExistente(){

        // Cadastro dos DVDs d1 e d2
        Assert.assertTrue(loc.cadastrarDvd(d1)); Assert.assertTrue(loc.cadastrarDvd(d2));

        // Verificar se é possivel cadastrar um DVD já existente(false)
        Assert.assertFalse(loc.cadastrarDvd(copiaD1));

    }

}
