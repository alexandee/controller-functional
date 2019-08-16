package controladora;

public class PortaoAbrindo extends IPortao {

	public PortaoAbrindo(final int posicaoPortao, final int posicaoMaximaPortao) {
		this.portaoAbrindo = true;
		this.posicaoPortao = posicaoPortao;
		this.posicaoMaximaPortao = posicaoMaximaPortao;
	}

	@Override
	public IPortao tratarTempo() {
		// verificando se o portao atingiu o limite maximo de abertura
		if (posicaoPortao + 1 >= posicaoMaximaPortao) {
			// proximo movimento sera de fechamento
			return new PortaoParado(posicaoMaximaPortao, posicaoMaximaPortao, false);
		}
		return new PortaoAbrindo(posicaoPortao + 1, posicaoMaximaPortao);
	}

	@Override
	public IPortao tratarBotao() {
		// parando o portao
		return new PortaoParado(posicaoPortao, posicaoMaximaPortao, portaoAbrindo);
	}

	@Override
	public IPortao tratarObstaculo() {
		// fechando o portao
		return new PortaoFechando(posicaoPortao, posicaoMaximaPortao);
	}

}
