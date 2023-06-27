package funcoes.reprodutorMusical;

public class Musica implements Ipod{
	public void tocar(){
		System.out.println("TOCANDO MÚSICA");
	}
	public void pausar(){
		System.out.println("PAUSANDO MÚSICA");
	}
	public void escolhendoMusica(){
		System.out.println("ESCOLHANDO MÚSICA");
	}
	public void aumentarVolume(){
		System.out.println("AUMENTANDO O VOLUME");
	}
	public void diminuirVolume(){
		System.out.println("DIMINUINDO VOLUME");
	}
}
