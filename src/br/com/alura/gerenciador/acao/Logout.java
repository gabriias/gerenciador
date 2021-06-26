package br.com.alura.gerenciador.acao;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Logout implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession sessao = request.getSession();
		//remove o atributo mas o objeto segue em mem�ria
//		sessao.removeAttribute("usuarioLogado");
		
		//remove o objeto http session e destr�i o cookie com o id da requisi��o
		sessao.invalidate();
		
		return "redirect:entrada?acao=LoginForm";
	}

}
