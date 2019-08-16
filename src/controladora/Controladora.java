package controladora;

public class Controladora {

	public Controladora() {
	}

	private IPortao tratarEntrada(final char ch, final IPortao portao) {
		if (ch == 'P') {
			return portao.tratarBotao();
		} else if (ch == 'O') {
			return portao.tratarObstaculo();
		}
		return portao;
	}


	private String processaComando(final String entrada, final int posAtual, final IPortao portao) {
		//Caso de parada
		if (posAtual >= entrada.length()) {
			return "";
		}
		final char ch = entrada.charAt(posAtual);
		final IPortao portaoTratado = tratarEntrada(ch, portao);
		final IPortao portaoProcessado = portaoTratado.tratarTempo();

		final String resultadoRecursao = processaComando(entrada, posAtual + 1, portaoProcessado);
		final String saida = Integer.toString(portaoProcessado.posicaoPortao).concat(resultadoRecursao);
		return saida;
	}


	public String executar(final String entrada) {
		final String saida = processaComando(entrada, 0, new PortaoParado(0, 5, true));
		return saida;
	}

}
