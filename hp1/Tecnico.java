package hp1;

public class Tecnico extends Assistente{
	private double bonus;

	public Tecnico(String nome, String cpf, double salario, int matricula, double bonus) {
		super(nome, cpf, salario, matricula);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public void Salario(double bonus) {
		this.setSalario(getSalario()*(bonus/100));
	}
	
}
