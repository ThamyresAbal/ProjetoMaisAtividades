package negocio;

public class Contato {
	private String email = "joao@maria.com.br";
	private String telefone = "(XX) XXXX-XXXX";
	private String celular = "(XX) XXXXX-XXXX";

//Contrutor padrão
	public Contato() {
		this.email = "joao@maria.com.br";
		this.telefone = "(XX) XXXX-XXXX";
		this.celular = "(XX) XXXXX-XXXX";
	}
	public Contato() {
		
	}
	
	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


		
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void Contato() {
		System.out.printf(":: Contato :: \n Email: %s \n Telefone:%s    Celular: %s",
				email,
				telefone,
				celular);
	}
}
