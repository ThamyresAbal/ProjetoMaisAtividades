package testesDao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import dao.PessoaFisicaDao;
import negocio.PessoaFisica;

public class TestaPessoaFisica {

	public static void main(String[] args) {
//Cria��o da data e hora
		Calendar DataNascimento = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");        
		try {
		     Date data = (Date)df.parse("24/08/1978");            
		     DataNascimento.setTime(data);
			} catch (ParseException e) {
				e.printStackTrace();
			}	       
		
		Calendar dataAtividade = Calendar.getInstance();
		DateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");        
		try {
		     Date data = (Date)df2.parse("18/11/2001");            
		     dataAtividade.setTime(data);
			} catch (ParseException e) {
				e.printStackTrace();
			}	       
		Calendar hora = Calendar.getInstance();        
        DateFormat dateFormat = new SimpleDateFormat("hh:mm");        
        try {
            Date dt = (Date)dateFormat.parse("23:50");
	        hora.setTime(dt);
		} catch (ParseException e) {
			e.printStackTrace();
		}       
		
       

		// instancia da classe Pessoa F�sica
		PessoaFisica pf = new PessoaFisica();
		// atributos da classe m�e(usu�rio)
		pf.setUsuario("MariZ�");
		pf.setSenha("sifugon�alves");
		// atributos da classe pessoa
		pf.setNome("Maria Jos� da Silva Santos");
		pf.setNomeSocial("Maria da Silva");
		pf.setDataNascimento(DataNascimento);
		pf.setCpf("xxx.xxx.xxx-xx");
		pf.setGenero("Feminino");
	//	pf.setContato(contato);
		

		PessoaFisicaDao.incluir(pf);
		
		List<PessoaFisica> Lista = PessoaFisicaDao.obterLista();
		for (PessoaFisica pF: Lista) {
			pF.imprimirTipo();		
		}
	}

}
