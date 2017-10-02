package questao21;

import java.text.DecimalFormat;

public class Relatorio {

	DecimalFormat df = new DecimalFormat("#0.00");

	public String imprimirRelatorio(Empregado empregado) {
		return empregado.getPrimeiroNome() + " " + empregado.getUltimoNome()
				+ " tem o ganho de  R$ " + df.format(empregado.calcularGanho());
	}
}
