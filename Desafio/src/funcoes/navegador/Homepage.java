package funcoes.navegador;

public class Homepage implements Browser {
	public void exibirPagina() {
		System.out.println("EXIBINDO PÁGINA");
	}
	public void novaAba() {
		System.out.println("ABRINDO NOVA ABA");
	}
	public void pesquisar() {
		System.out.println("PESQUISANDO");
	}
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PÁGINA");
	}
	public void adicionarFavoritos() {
		System.out.println("ADICIONADO AOS FAVORITOS");
	}
	public void fecharNavegador() {
		System.out.println("FECHANDO NAVEGADOR");
	}
	public void fecharAba() {
		System.out.println("FECHANDO ABA");
	}
	
}
