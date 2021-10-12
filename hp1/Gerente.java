package hp1;

public class Gerente extends Funcionario{
	private String Departamento;

	public Gerente(String nome, String cpf, double salario, String departamento) {
		super(nome, cpf, salario);
		Departamento = departamento;
	}

	public String getDepartamento() {
		return Departamento;
	}

	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}
	
}
