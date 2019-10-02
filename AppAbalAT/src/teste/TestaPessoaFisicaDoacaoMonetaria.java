package teste;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import negocio.Contato;
import negocio.DoacaoMonetaria;
import negocio.Endereco;
import negocio.PessoaFisica;

public class TestaPessoaFisicaDoacaoMonetaria {

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
		     Date data = (Date)df2.parse("24/08/1978");            
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
		
        // instancia da classe Contato
		Contato contato = new Contato();
		contato.setEmail("marize@marize.com");
		contato.setTelefone("(21) xxxxx-xxxx");
		contato.setCelular("(21) xxxxx-xxxx");

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
		pf.setContato(contato);
		pf.imprimirTipo();

		// instancia de endere�o
		Endereco end = new Endereco();
		end.setCep("xxxxx-xxx");
		end.setRua("Rua da Esperan�a");
		end.setBairro("Alegria");
		end.setCidade("DC");
		end.setUf("RJ");
		end.setComplemento("n�mero XXX");
						        
		// instancia da classe Doa��o
		DoacaoMonetaria doacaoMonetaria = new DoacaoMonetaria();
		// atributos da m�e(atividade)
		doacaoMonetaria.setNomeAtividade("Camapanha natalina");
		doacaoMonetaria.setDataAtividade(dataAtividade);
		doacaoMonetaria.setHora(hora);
		doacaoMonetaria.setCategoria("Ajuda");
		doacaoMonetaria.setDescricao("Campanha natalina- Arrecadaremos fundos para a montagem de cestas b�sicas");
		// atributos de doa��o
		doacaoMonetaria.setValorDoacao(120);
		doacaoMonetaria.setMetaArrecadacao(5000);
		doacaoMonetaria.setValorArrecadado(1000);
		doacaoMonetaria.setEndereco(end);
		doacaoMonetaria.divulgar();
	}
}
