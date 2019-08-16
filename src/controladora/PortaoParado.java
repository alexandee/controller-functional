package controladora;

public class PortaoParado extends IPortao {

	public PortaoParado(final int posicaoPortao, final int posicaoMaximaPortao, final boolean portaoAbrindo) {
		this.portaoAbrindo = portaoAbrindo;
		this.posicaoPortao = posicaoPortao;
		this.posicaoMaximaPortao = posicaoMaximaPortao;
	}

	@Override
	public IPortao tratarTempo() {
		// aguardando o botao ser pressionado
		return this;
	}

	@Override
	public IPortao tratarBotao() {
		// movimentar o portao quando o botao for pressionado
		if (portaoAbrindo) {
			return new PortaoAbrindo(posicaoPortao, posicaoMaximaPortao);
		}

		return new PortaoFechando(posicaoPortao, posicaoMaximaPortao);
	}

	@Override
	public IPortao tratarObstaculo() {
		// aguardando o botao ser pressionado
		return this;
	}
}
