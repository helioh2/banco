package br.ufpr.banco;

import br.ufpr.banco.contas.ContaBancaria;
import br.ufpr.banco.contas.Pessoa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // TESTES NO main
    	Pessoa p1 = new Pessoa("Fulano", 
    			"4434353223", 
    			"20292020992", 
    			"fulano@bol.com.br");
    	
    	System.out.println("Pessoa:");
    	System.out.println("\t- Nome: "+p1.getNome());
    	System.out.println("\t- Telefone: "+p1.getTelefone());
    	System.out.println("\t- CPF: "+p1.getCpf());
    	System.out.println("\t- Email: "+p1.getEmail());
    	
    	
    	p1.setNome("Beltrano");
    	
    	System.out.println("Pessoa:");
    	System.out.println("\t- Nome: "+p1.getNome());
    	System.out.println("\t- Telefone: "+p1.getTelefone());
    	System.out.println("\t- CPF: "+p1.getCpf());
    	System.out.println("\t- Email: "+p1.getEmail());
    	
    	
    	Pessoa p2 = new Pessoa("Ciclano", "26262626",
    			"4646464646", "ciclano@uol.com.br");
    	
    	p2.setEmail("ciclano@yahoo.com");
    	
    	
    	ContaBancaria cb1 = new ContaBancaria(p1, 12345, 234, 1000.0);
    	
    	ContaBancaria cb2 = new ContaBancaria(p2, 12346, 234, 2000.0);
    	
    	System.out.println(cb1.getSaldo());
    	
    	try {
			cb1.depositar(500);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  // teste
    	
    }
}
