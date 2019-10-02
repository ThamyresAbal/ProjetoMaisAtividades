package negocio;

import java.util.Calendar;

public class Oficina extends Atividade {

	private int qtdParticipantes;
	private String[] listaParticipantes;

	public Oficina() {

	}
	
	public Oficina(int id, String nomeAtividade, Calendar dataAtividade, String categoria,
			String descricao, Endereco endereco, int qtdParticipantes) {
		super(id, nomeAtividade, dataAtividade, categoria, descricao, endereco);
		this.setQtdParticipantes(qtdParticipantes);
	}

	public void verificarDisponibilidadeVaga() {
		if (listaParticipantes.length >= qtdParticipantes) {
			System.out.println("N�o temos mais vagas. Fim da inscri��es");
			
		} else {
			System.out.println("Seja bem vindo(a)! Acompanhe sua inscri��o!");
		}
	}

	@Override
	public void imprimirTipo() {
	 //chamada da exibi��o da m�e
		super.adicionarCabecalho();
		
		System.out.printf(":: Oficina ::\n "
				+ "Quantidade de participantes: %d\n",
				this.getQtdParticipantes()
				);
	}
	
	
	public int getQtdParticipantes() {
		return qtdParticipantes;
	}

	public void setQtdParticipantes(int qtdParticipantes) {
		this.qtdParticipantes = qtdParticipantes;
	}

	public String[] getListaParticipantes() {
		return listaParticipantes;
	}

	public void setListaParticipantes(String[] listaParticipantes) {
		this.listaParticipantes = listaParticipantes;
	}

}