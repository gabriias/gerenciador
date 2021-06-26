package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	private static List<Usuario> listaUsuarios = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	//para quando subir o servidor já "cadastrar" esses 2 dados
	static {
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("aaa");
		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("bbb");
		
		lista.add(empresa);
		lista.add(empresa2);
		
		Usuario usuario = new Usuario();
		usuario.setLogin("a");
		usuario.setSenha("a");
		Usuario usuario2 = new Usuario();
		usuario2.setLogin("b");
		usuario2.setSenha("b");
		
		listaUsuarios.add(usuario);
		listaUsuarios.add(usuario2);
	}
	
	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

	public void removeEmpresa(Integer id) {
		
		//n pode usar o for aqui pq vai dar conflito, vou estar iterando e removendo o mesmo elemento
//		for (Empresa empresa : lista) {
//			if(empresa.getId() == id) {
//				lista.remove(empresa);
//			}
//		}
		
		Iterator<Empresa> it = lista.iterator();
		while(it.hasNext()) {
			Empresa emp = it.next();
			
			if(emp.getId() == id) {
				it.remove();
			}
		}
		
	}

	public void editaEmpresa(Integer id) {

		Iterator<Empresa> it = lista.iterator();
		while(it.hasNext()) {
			Empresa emp = it.next();
			
			if(emp.getId() == id) {
				it.remove();
			}
		}
		
	}

	public Empresa buscaEmpresa(Integer id) {
		
		for (Empresa empresa : lista) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}

	public Usuario existeUsuario(String login, String senha) {
		for (Usuario usuario : listaUsuarios) {
			if(usuario.ehIgual(login, senha)) {
				return usuario;
			}
		}
		return null;
	}

}
