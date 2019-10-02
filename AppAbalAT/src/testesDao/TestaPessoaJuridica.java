package testesDao;

import java.util.List;

import dao.PessoaJuridicaDao;
import negocio.PessoaJuridica;

public class TestaPessoaJuridica {

	public static void main(String[] args) {
	 
		// instancia da classe Pessoa Jur�dica
		PessoaJuridica pj = new PessoaJuridica();
		// atributos da classe m�e(usu�rio)
		pj.setUsuario("Empresax");
		pj.setSenha("123455w");
		// atributos da classe pessoa
		pj.setNomeEmpresa("Infnet");
		pj.setCnpj("231424315243");
		pj.setRazaoSocial("Instituto de tecnologia Infnet");
//		pj.setContato(contato);
		
		PessoaJuridicaDao.incluir(pj);
		
		List<PessoaJuridica> Lista = PessoaJuridicaDao.obterLista();
		for (PessoaJuridica pJ: Lista) {
			pJ.imprimirTipo();		
		}
	    
	

	}

}
