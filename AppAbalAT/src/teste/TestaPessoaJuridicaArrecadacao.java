package teste;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import negocio.Arrecadacao;
import negocio.Contato;
import negocio.Endereco;
import negocio.PessoaJuridica;

public class TestaPessoaJuridicaArrecadacao {

	public static void main(String[] args) {
		Calendar dataAtividade = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");        
		try {
		     Date data = (Date)df.parse("24/08/1978");            
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

		// instancia da classe Pessoa Jur�dica
		PessoaJuridica pj = new PessoaJuridica();
		// atributos da classe m�e(usu�rio)
		pj.setUsuario("Empresax");
		pj.setSenha("123455w");
		// atributos da classe pessoa
		pj.setNomeEmpresa("Infnet");
		pj.setCnpj("231424315243");
		pj.setRazaoSocial("Instituto de tecnologia Infnet");
		pj.setContato(contato);
		pj.imprimirTipo();
		
		// instancia de endere�o
		Endereco end = new Endereco();
		end.setCep("xxxxx-xxx");
		end.setRua("Rua S�o Jos�");
		end.setBairro("Centro");
		end.setCidade("Rio de Janeiro");
		end.setUf("RJ");
		end.setComplemento("n�mero 90");
		
		Arrecadacao arrecadacao = new Arrecadacao();
		arrecadacao.setNomeAtividade("Long Jin Quan ");
		arrecadacao.setDataAtividade(dataAtividade);
		arrecadacao.setHora(hora);
		arrecadacao.setCategoria("Arrecada��o de Alimentos");
		arrecadacao.setDescricao("Campanha natalina- Arrecadaremos alimentos para a montagem de cestas b�sicas");
		//atributos de arrecadacao
		arrecadacao.setMetaArrecadacao(50);
		arrecadacao.setPublicoAlvo("familias");
		arrecadacao.setQtdAlimentos(50);
		arrecadacao.setQtdBrinquedosRoupas(12);
		arrecadacao.setEndereco(end);
		arrecadacao.imprimirTipo();
	}

}
