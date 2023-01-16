package br.com.alura.rh.model;

import java.math.BigDecimal;

public class DadosPessoais {
	public String nome;
	public String cpf;
	public Cargo cargo;
	public BigDecimal salario;
	
	public DadosPessoais(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
	}
}