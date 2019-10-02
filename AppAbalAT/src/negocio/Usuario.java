package negocio;

import java.util.List;

public abstract class Usuario {
	private int id;
	private String usuario;
	private String senha;
	private Contato contato;
	private List <Atividade> atividade;
		
	public Usuario() {
		
	}
	
	public Usuario(int id,String usuario, String senha, Contato contato) {
		this.setId(id);
		this.setUsuario(usuario);
		this.setSenha(senha);
		this.setContato(contato);
	}
	
	public void divulgar() {
		System.out.printf(":: Cadastro ::\n "
				+ "Usu�rio: %s \n "
				+ "Senha: %s \n",
				this.getUsuario(),
				this.getSenha()
				);	
		//contato.divulgar();
	}

	// forca as filhas implementarem o mesmo m�todo
	//adicionarCabecalho ser� chamado dentro de imprimirTipo
	public abstract void imprimirTipo();
	
	//protected n�o pode ser acessado fora do pacote a n�o ser em casos de heran�a
	//final � para n�o ser sobrescrito
	protected final void adicionarCabecalho() {
		System.out.println("# Usu�rio #");
		//chama o metodo da pr�pria classe
		divulgar();
	}
	

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Atividade> getAtividade() {
		return atividade;
	}

	public void setAtividade(List<Atividade> atividade) {
		this.atividade = atividade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
