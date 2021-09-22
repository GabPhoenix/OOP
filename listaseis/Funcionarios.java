package aulas.listaseis;

import java.util.ArrayList;

public class Funcionarios {
	private String nome;
	private double salario;
	public Funcionarios(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public Funcionarios(){
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void altaRenda(ArrayList<Funcionarios> func) {
		for(int i=0; i<func.size(); i++) {
			if(func.get(i).getSalario() > 5000) {
				System.out.println(func.get(i).getNome());
			}
		}
	}

}
