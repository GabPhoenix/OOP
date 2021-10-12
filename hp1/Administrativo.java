package hp1;

public class Administrativo extends Assistente{
	private String turno;
	private double porcentagem;

	public Administrativo(String nome, String cpf, double salario, int matricula, String turno, double porcentagem) {
		super(nome, cpf, salario, matricula);
		this.turno = turno;
		this.porcentagem = porcentagem;
	}

	
	public double getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(double porcentagem) {
		this.porcentagem = porcentagem;
	}


	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public double adicionalTurno() {
		double adicional= 0;
		if(turno.equals("noite")){
			adicional += adicional*(porcentagem/100);
		}
		return adicional;
	}
	
}
