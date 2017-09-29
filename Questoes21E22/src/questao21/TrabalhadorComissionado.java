package questao21;

public class TrabalhadorComissionado extends Empregado {

	private double comissao;
	private double quantidade;

	public TrabalhadorComissionado(String primeiroNome, String ultimoNome, double salario, double comissao,
			double quantidade) {
		super(primeiroNome, ultimoNome);
		this.setSalario(salario);
		this.comissao = comissao;
		this.quantidade = quantidade;
	}

	@Override
	public double calcularGanho() {
		this.setGanho((this.getSalario() + (this.comissao * this.quantidade)));
		return this.getGanho();
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

}
