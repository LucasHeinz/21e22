package questao21;

public class TrabalhadorHora extends Empregado {

	private double horas;

	public TrabalhadorHora(String primeiroNome, String ultimoNome, double salario, double horas) {
		super(primeiroNome, ultimoNome);
		this.setSalario(salario);
		this.horas = horas;
	}

	@Override
	public double calcularGanho() {
		this.setGanho(this.getSalario() * this.horas);
		return this.getGanho();
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

}
