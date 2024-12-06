package br.com.g4f;

public class ControleRemoto {
	
	public void ligarDispositivo(Dispositivo dispositivo) {
        dispositivo.ligar();
    }

    public void desligarDispositivo(Dispositivo dispositivo) {
        dispositivo.desligar();
    }

    public void executarAcao(Dispositivo dispositivo) {
        dispositivo.executarAcao();
    }

}
