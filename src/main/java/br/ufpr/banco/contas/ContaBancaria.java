package br.ufpr.banco.contas;

public class ContaBancaria {

	private double saldo;
	private double limite;
	private int numero;
	private int agencia;
	private Pessoa titular;	
	
	
	public ContaBancaria(Pessoa titular, int numero, int agencia, double limite) {
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
		this.limite = limite;
		this.saldo = 0;
	}


	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}


	public double getSaldo() {
		return saldo;
	}


	public int getNumero() {
		return numero;
	}


	public int getAgencia() {
		return agencia;
	}


	public Pessoa getTitular() {
		return titular;
	}
	
	/**
	 * Deposita o valor recebido, alterando o saldo, se estiver dentro do limite
	 * @param valor
	 * @throws Exception 
	 */
	public void depositar(double valor) throws Exception {
		if (valor > this.limite) {  // FLUXO DE EXCEÇÃO
			throw new Exception("ERRO: VALOR INSERIDO ACIMA DO LIMITE");
		} else {
			this.saldo += valor;  // this.saldo = this.saldo + valor
		}		
	}
	
	/**
	 * Saca o valor passado, se estiver dentro do limite
	 * @param valor
	 */
	public void sacar(double valor) {
		if (valor > this.saldo) {
			System.out.println("ERRO: SALDO INSUFICIENTE PARA SACAR"); // TODO: lançar exceção
		} else {
			this.saldo -= valor;
		}
	}
	
	//TODO: método transferir
	
	
}
