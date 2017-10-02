package questao21;

public class TesteEmpregados {

	public static void main(String[] args) {

		Chefe chefe = new Chefe("Robert", "Walterson", 5000);

		Relatorio relatorioChefe = new Relatorio();

		System.out.println(relatorioChefe.imprimirRelatorio(chefe));

		TrabalhadorComissionado trabalhadorComissionado = new TrabalhadorComissionado(
				"Thiago", "Fernandes", 2000, 0.20, 5000);
		Relatorio relatorioTrabaladorComissionado = new Relatorio();

		System.out.println(relatorioTrabaladorComissionado
				.imprimirRelatorio(trabalhadorComissionado));

		TrabalhadorHora trabalhadorHora = new TrabalhadorHora("Rogéria",
				"Barens", 50, 40);

		Relatorio relatorioTrabalhadorHora = new Relatorio();
		System.out.println(relatorioTrabalhadorHora
				.imprimirRelatorio(trabalhadorHora));

		TrabalhadorPecaProduzida trabalhadorPecaProduzida = new TrabalhadorPecaProduzida(
				"Caio", "Egg", 200, 50);
		Relatorio relatorioTrabalhadorPecaProduzida = new Relatorio();

		System.out.println(relatorioTrabalhadorPecaProduzida
				.imprimirRelatorio(trabalhadorPecaProduzida));
	}
}
