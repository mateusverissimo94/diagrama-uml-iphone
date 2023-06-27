package funcoes.aparelhoTelefonico;

public class Contatos implements Phone {
	public void ligar() {
		System.out.println("LIGANDO");
	}
	public void listaContato() {
		System.out.println("LISTANDO DE CONTATO");
	}
	public void perfilContato() {
		System.out.println("PERFIL DO CONTATO");
	}
	public void tecladoNumerico() {
		System.out.println("DISCANDO NÚMERO");
	}
	public void salvarContato() {
		System.out.println("SALVANDO CONTATO");
	}
	public void selecionarCorreioVoz() {
		System.out.println("SELECIONANDO CORREIO DE VOZ");
	}
	public void encerrarLigacao() {
		System.out.println("ENCERRANDO LIGAÇÃO");
	}
	public void atenderLigacao() {
		System.out.println("ATENDENDO LIGAÇÃO");
	}
}
