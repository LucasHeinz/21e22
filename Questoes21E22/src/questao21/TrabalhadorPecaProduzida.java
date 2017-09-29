package questao21;

public class TrabalhadorPecaProduzida extends Empregado {

	private int quantidade;

	public TrabalhadorPecaProduzida(String primeiroNome, String ultimoNome, double salario, int quantidade) {
		super(primeiroNome, ultimoNome);
		this.setSalario(salario);
		this.quantidade = quantidade;
	}

	@Override
	public double calcularGanho() {
		this.setGanho(this.getSalario() * this.quantidade);
		return this.getGanho();
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
