package areaDeTrabalho;

import funcoes.aparelhoTelefonico.Contatos;
import funcoes.aparelhoTelefonico.Phone;
import funcoes.navegador.Browser;
import funcoes.navegador.Homepage;
import funcoes.reprodutorMusical.Ipod;
import funcoes.reprodutorMusical.Musica;

public class Tela {
	public static void main(String[] args) {
		Ipod musica = new Musica();
		Phone contato = new Contatos();
		Browser navegador = new Homepage();
		
		musica.escolhendoMusica();
		musica.tocar();
		musica.aumentarVolume();
		musica.diminuirVolume();
		musica.pausar();
		
		contato.listaContato();
		contato.perfilContato();
		contato.ligar();
		contato.encerrarLigacao();
		contato.tecladoNumerico();
		contato.salvarContato();
		contato.selecionarCorreioVoz();
		contato.atenderLigacao();
		
		navegador.exibirPagina();
		navegador.novaAba();
		navegador.pesquisar();
		navegador.adicionarFavoritos();
		navegador.atualizarPagina();
		navegador.fecharAba();
		navegador.fecharNavegador();
	}
}
