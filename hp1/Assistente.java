package hp1;

public class Assistente extends Funcionario{
	private int matricula;

	public Assistente(String nome, String cpf, double salario, int matricula) {
		super(nome, cpf, salario);
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void exibeDados() {
		System.out.println("Nome: "+ this.getNome());
		System.out.println("CPF: "+ this.getCpf());
		System.out.println("Sal�rio: "+ this.getSalario());
		System.out.println("Matr�cula: "+ this.getMatricula());
	}

}
