package controladora;

public class PortaoFechando extends IPortao {

	public PortaoFechando(final int posicaoPortao, final int posicaoMaximaPortao) {
		this.portaoAbrindo = false;
		this.posicaoPortao = posicaoPortao;
		this.posicaoMaximaPortao = posicaoMaximaPortao;
	}

	@Override
	public IPortao tratarTempo() {
		// verificando se o portao chegou no limite inferior
		if (posicaoPortao - 1 == 0) {
			// proximo movimento sera de abertura
			return new PortaoParado(0, posicaoMaximaPortao, true);
		}
		return new PortaoFechando(posicaoPortao - 1, posicaoMaximaPortao);
	}

	@Override
	public IPortao tratarBotao() {
		// parando o portao
		return new PortaoParado(posicaoPortao, posicaoMaximaPortao, portaoAbrindo);
	}

	@Override
	public IPortao tratarObstaculo() {
		// abrindo o portao
		return new PortaoAbrindo(posicaoPortao, posicaoMaximaPortao);
	}

}
