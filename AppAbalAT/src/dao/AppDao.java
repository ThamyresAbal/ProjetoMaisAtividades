package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.Conexao;
import negocio.Candidato;

public class AppDao {
		
	public static List<?> obterLista(String lista) {
	
		//deve existir quantos cases forem necessários para contemplar todas as suas telas de lista
		switch (lista){
		case "arrecadacaoLista.jsp":
			return ArrecadacaoDao.obterLista();

		case "contatoLista.jsp":
			return ContatoDao.obterLista();
			
		case "doacaoMonetariaLista.jsp":
			return DoacaoMonetariaDao.obterLista();
		
		case "enderecoLista.jsp":
			return EnderecoDao.obterLista();
		
		case "oficinaLista.jsp":
			return OficinaDao.obterLista();
			
		case "pessoaFisicaLista.jsp":
			return PessoaFisicaDao.obterLista();
			
		case "pessoaJuridicaLista.jsp":
			return PessoaJuridicaDao.obterLista();
		default:
			break;
		}
		
		return null;
		
	}
		
}		
		
//		if("arrecadacaoLista.jsp".equals(lista)) {
//			return (List<Arrecadacao>)ArrecadacaoDao.obterLista();
//		} else if("contatoLista.jsp".equals(lista)) {
//			return (List<Contato>)ContatoDao.obterLista();
//		} else if("doacaoMonetariaLista.jsp".equals(lista)) {
//			return (List<DoacaoMonetaria>)DoacaoMonetariaDao.obterLista();
//		} else if("enderecoLista.jsp".equals(lista)) {
//			return (List<Endereco>)EnderecoDao.obterLista();
//		} else if("oficinaLista.jsp".equals(lista)) {
//			return (List<Oficina>)OficinaDao.obterLista();
//		} else if("pessoaFisicaLista.jsp".equals(lista)) {
//			return (List<PessoaFisica>)PessoaFisicaDao.obterLista();
//		}else if("pessoaJuridicaLista.jsp".equals(lista)) {
//			return (List<PessoaJuridica>)PessoaJuridicaDao.obterLista();
//		}else {
//		return null;
//		}
//
//public static List<Candidato> obterLista(){
//	String sql = "SELECT * FROM TCandidato ORDER BY email";
//	
//	List<Candidato> lista = null;
//	
//	PreparedStatement ps = null;
//		
//	try {
//		lista = new ArrayList<Candidato>();
//		
//		ps = Conexao.obterConexao().prepareStatement(sql);
//		
//		ResultSet rs = null;
//		
//		rs = ps.executeQuery();
//		
//					
//		while(rs.next()){
				
//	        Contato contato = new Contato();
//	        
//	        contato.setId(rs.getInt("id"));
//			contato.setEmail(rs.getString("email"));
//			contato.setTelefone(rs.getString("telefone"));
//			contato.setCelular(rs.getString("celular"));
//			
//			lista.add(contato);
	        
//	        
//			// feito assim pq tenho um construtor em Contato que recebe todos os atributos
//			lista.add(
//				new Candidato(
//						rs.getInt("id"),               
//						rs.getString("nome"),      
//						rs.getString("resumo"),
//				        rs.getString("sobre"),
//				        null
//				        )
//				);
//				
//		}
//		
//		return lista;
//		
//	} catch (SQLException e) {
//		e.printStackTrace();
//	}
//	
//	return lista;		
//}
//
//
//public static boolean incluir(Candidato candidato){
//	String sql = "INSERT INTO TCandidato(nome, resumo, sobre) VALUES (?, ?, ?)";
//	
//	PreparedStatement ps = null;
//	
//	try {
//		
//		ps = Conexao.obterConexao().prepareStatement(sql);
//		
//		ps.setString(1, candidato.getNome());
//		ps.setString(2, candidato.getResumo());
//		ps.setString(3, candidato.getSobre());
//		
//		ps.execute();
//		
//		return true;
//		
//	} catch (SQLException e) {
//		e.printStackTrace();
//	}
//	
//	return false;
//}
//
//public static boolean excluir(int id){
//	String sql = "DELETE FROM TCandidato WHERE id = ?";
//	
//	PreparedStatement ps = null;
//	
//	try {
//		
//		ps = Conexao.obterConexao().prepareStatement(sql);
//		ps.setInt(1, id);
//		
//		ps.execute();
//		
//		return true;
//		
//	} catch (SQLException e) {
//		e.printStackTrace();
//	}
//	
//	return false;
//}
//
//public static boolean alterar(Candidato candidato){
//	String sql = "UPDATE TCandidato SET nome=? , resumo=?, sobre=? WHERE id = ?";
//	
//	PreparedStatement ps = null;
//	
//	try {
//			
//		ps = Conexao.obterConexao().prepareStatement(sql);
//		
//		ps.setString(1, candidato.getNome());
//		ps.setString(2, candidato.getResumo());
//		ps.setString(3, candidato.getSobre());
//		ps.setInt(4, candidato.getId());
//		
//		ps.execute();
//		
//		return true;
//		
//	} catch (SQLException e) {
//		e.printStackTrace();
//	}
//	
//	return false;
//}	
//
//public static Candidato obterPorId(int id) {
//	String sql = "SELECT * FROM TCandidato WHERE id = ?";
//	
//	PreparedStatement ps = null;
//	
//	try {			
//		ps = Conexao.obterConexao().prepareStatement(sql);
//		ps.setInt(1, id);
//		
//		ResultSet rs = null;
//		
//		rs = ps.executeQuery();
//		
//		if(rs.next()){
//			Candidato candidato = new Candidato();
//			candidato.setNome(rs.getString("nome"));
//			candidato.setResumo(rs.getString("resumo"));
//			candidato.setSobre(rs.getString("sobre"));
//
//		
//			return candidato;
//		}
//		
//	} catch (SQLException e) {
//		e.printStackTrace();
//	}
//	
//	return null;		
//}


