package controle;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DoacaoMonetariaDao;
import negocio.DoacaoMonetaria;
public class DoacaoMonetariaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String operacao;
	
    public DoacaoMonetariaController() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		operacao = request.getParameter("operacao"); 
		id = request.getParameter("id") == null 
				? 0 
				: Integer.valueOf(request.getParameter("id"));
		
		request.setAttribute("doacao", DoacaoMonetariaDao.obterPorId(id));
		
		request.getRequestDispatcher("doacaoMonetariaDetalhe.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DoacaoMonetaria doacao = null;
		
		switch (operacao) {
		case "Incluir":			
			doacao = obterDoacaoMonetaria(request, response);
			DoacaoMonetariaDao.incluir(doacao);
			break;

		case "Alterar":
			doacao = obterDoacaoMonetaria(request, response);
			doacao.setId(id);
			DoacaoMonetariaDao.alterar(doacao);
			break;

		case "Excluir":		
			DoacaoMonetariaDao.excluir(id);
			break;
		case "Voltar":
			request.getRequestDispatcher("main.jsp").forward(request, response);

		default:
			break;
		}
		
		request.setAttribute("lista", DoacaoMonetariaDao.obterLista());
		
		request.getRequestDispatcher("doacaoMonetariaLista.jsp").forward(request, response);

	}
	
	private DoacaoMonetaria obterDoacaoMonetaria(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DoacaoMonetaria doacao = new DoacaoMonetaria();
		
		doacao.setNomeAtividade(request.getParameter("nomeAtividade"));
		doacao.setCategoria(request.getParameter("categoria"));
	
//hora        
		doacao.setDescricao(request.getParameter("descricao"));  
		doacao.setValorDoacao(Float.valueOf(request.getParameter("valorDoacao")));
		doacao.setMetaArrecadacao(Float.valueOf(request.getParameter("metaArrecadacao")));
		doacao.setValorArrecadado(Float.valueOf(request.getParameter("valorArrecadado")));
		

		Calendar dtData = Calendar.getInstance();    		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");        
        try {
        	Date data = (Date)df.parse(request.getParameter("dataAtividade"));            
            dtData.setTime(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}         		
		doacao.setDataAtividade(dtData);
	
		return doacao;
	}

}
