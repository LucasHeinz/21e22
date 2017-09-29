package questao21;

public class Chefe extends Empregado {

	public Chefe(String primeiroNome, String ultimoNome, double salario) {
		super(primeiroNome, ultimoNome);
		this.setSalario(salario);
	}

	@Override
	public double calcularGanho() {
		this.setGanho(this.getSalario());
		return this.getGanho();
	}

	
}
