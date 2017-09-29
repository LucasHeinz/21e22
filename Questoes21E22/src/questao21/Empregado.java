package questao21;

public abstract class Empregado {

	private String primeiroNome;
	private String ultimoNome;
	private double salario;
	private double ganho;

	public Empregado(String primeiroNome, String ultimoNome) {
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
	}

	public abstract double calcularGanho();

	public double getGanho() {
		return ganho;
	}

	public void setGanho(double ganho) {
		this.ganho = ganho;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
