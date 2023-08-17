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
	}
	
}
