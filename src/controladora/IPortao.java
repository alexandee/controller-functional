package controladora;

public abstract class IPortao {

	int posicaoPortao;
	int posicaoMaximaPortao;
	boolean portaoAbrindo;

	abstract public IPortao tratarTempo();

	abstract public IPortao tratarBotao();

	abstract public IPortao tratarObstaculo();
}
