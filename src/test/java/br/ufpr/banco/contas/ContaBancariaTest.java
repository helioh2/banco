package br.ufpr.banco.contas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ContaBancariaTest {
	
	
//	@BeforeEach
//	public void setup() {
//		// TODO: configurar código que sempre executa antes dos testes
//	}

	@Test
	public void quandoDepositaComSucesso() {
		
		// QUANDO: (CRIAÇÃO DO CENÁRIO)
		
		Pessoa p1 = new Pessoa("Fulano", 
    			"4434353223", 
    			"20292020992", 
    			"fulano@bol.com.br");
		
		ContaBancaria cb1 = new ContaBancaria(p1, 12345, 234, 1000.0);
		// saldo neste momento == 0
		
		// FAREMOS (EXECUÇÃO):
		try {
			cb1.depositar(500);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// ENTÃO (VERIFICAÇÃO):
//		System.out.println(cb1.getSaldo()); // espera-se que imprima 500
		
		assertEquals(500, cb1.getSaldo()); 
		// quando eu executar cb1.getSaldo(), eu ESPERO que ele retorne 500
		
	}
	
	
	@Test
	public void quandoDepositaValorAcimaDoLimite() {
		// QUANDO: (CRIAÇÃO DO CENÁRIO)
		Pessoa p1 = new Pessoa("Fulano", 
    			"4434353223", 
    			"20292020992", 
    			"fulano@bol.com.br");
		
		ContaBancaria cb1 = new ContaBancaria(p1, 12345, 234, 1000.0);
		// saldo neste momento == 0
		
		// FAREMOS (EXECUÇÃO):
		
		assertThrows(
				Exception.class, 
				() -> cb1.depositar(1500),
				"ERRO: VALOR INSERIDO ACIMA DO LIMITE");
		
		
		// ENTÃO (VERIFICACAO):
		assertEquals(0 ,cb1.getSaldo());

	}
	
	
	@Test
	public void quandoSacarComSucesso() {
		// QUANDO: (CRIAÇÃO DO CENÁRIO)
		Pessoa p1 = new Pessoa("Fulano", 
    			"4434353223", 
    			"20292020992", 
    			"fulano@bol.com.br");
		
		ContaBancaria cb1 = new ContaBancaria(p1, 12345, 234, 1000.0);
		
		try {
			cb1.depositar(1000);  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// FAREMOS (EXECUÇÃO):
		cb1.sacar(600);
		
		// ENTÃO (VERIFICACAO):
		assertEquals(400, cb1.getSaldo());
		
	}
	
	@Test
	public void quandoSacarSemSaldoSuficiente() {
		// QUANDO: (CRIAÇÃO DO CENÁRIO)
		Pessoa p1 = new Pessoa("Fulano", 
    			"4434353223", 
    			"20292020992", 
    			"fulano@bol.com.br");
		
		ContaBancaria cb1 = new ContaBancaria(p1, 12345, 234, 1000.0);
		
		try {
			cb1.depositar(400); // TODO: testar exceção com assertThrows
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// FAREMOS (EXECUÇÃO):
		cb1.sacar(600);
		
		// ENTÃO (VERIFICACAO):
		assertEquals(400, cb1.getSaldo());
		
	}
	
	

}
