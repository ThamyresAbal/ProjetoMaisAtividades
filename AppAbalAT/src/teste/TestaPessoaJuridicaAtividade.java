package teste;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import negocio.Arrecadacao;
import negocio.Atividade;
import negocio.Contato;
import negocio.DoacaoMonetaria;
import negocio.Endereco;
import negocio.Oficina;
import negocio.PessoaJuridica;

public class TestaPessoaJuridicaAtividade {

	public static void main(String[] args) {
	List<Atividade> atividades = new ArrayList<Atividade>();
		
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
		
		Endereco end = new Endereco();
		end.setCep("xxxxx-xxx");
		end.setRua("rua 5 de Mario");
		end.setBairro("Engenho do Porto");
		end.setCidade("DC");
		end.setUf("RJ");
		end.setComplemento("n�mero XXX");
		
		Arrecadacao arrecadacao = new Arrecadacao();
		arrecadacao.setNomeAtividade("Long Jin Quan ");
		arrecadacao.setDataAtividade(dataAtividade);
		arrecadacao.setHora(hora);
		arrecadacao.setCategoria("Arrecada��o de Alimentos");
		arrecadacao.setDescricao("Campanha natalina- Arrecadaremos alimentos para a montagem de cestas b�sicas");
		arrecadacao.setMetaArrecadacao(50);
		arrecadacao.setPublicoAlvo("familias");
		arrecadacao.setQtdAlimentos(50);
		arrecadacao.setQtdBrinquedosRoupas(12);
		arrecadacao.setEndereco(end);
		
		Contato contato = new Contato();
		contato.setEmail("marize@marize.com");
		contato.setTelefone("(21) xxxxx-xxxx");
		contato.setCelular("(21) xxxxx-xxxx");
     	
		Oficina oficina = new Oficina();
		oficina.setNomeAtividade("Mais Atividades teatrais");
		oficina.setDataAtividade(dataAtividade);
		oficina.setHora(hora);
		oficina.setCategoria("Artes");
		oficina.setDescricao("Curso de teatro com Ab�lio Ramos");
		oficina.setQtdParticipantes(20);
		oficina.setEndereco(end);

		DoacaoMonetaria doacaoMonetaria = new DoacaoMonetaria();
		doacaoMonetaria.setNomeAtividade("Camapanha natalina");
		doacaoMonetaria.setDataAtividade(dataAtividade);
		doacaoMonetaria.setHora(hora);
		doacaoMonetaria.setCategoria("Ajuda");
		doacaoMonetaria.setDescricao("Campanha natalina- Arrecadaremos fundos para a montagem de cestas b�sicas");
		doacaoMonetaria.setValorDoacao(120);
		doacaoMonetaria.setMetaArrecadacao(5000);
		doacaoMonetaria.setValorArrecadado(1000);
		doacaoMonetaria.setEndereco(end);
		doacaoMonetaria.imprimirTipo();
		
		atividades.add(doacaoMonetaria);
		atividades.add(oficina);
		atividades.add(arrecadacao);
		
		PessoaJuridica pj = new PessoaJuridica();
		pj.setUsuario("Empresax");
		pj.setSenha("123455w");
		pj.setNomeEmpresa("Infnet");
		pj.setCnpj("231424315243");
		pj.setRazaoSocial("Instituto de tecnologia Infnet");
		pj.setContato(contato);
		pj.imprimirTipo();
	}

}
