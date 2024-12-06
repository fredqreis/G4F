package br.com.g4f.main;

import br.com.g4f.ArCondicionado;
import br.com.g4f.ControleRemoto;
import br.com.g4f.Televisao;

public class Principal {

	public static void main(String[] args) {
        Televisao televisao = new Televisao("Televisão da Sala");
        ArCondicionado arCondicionado = new ArCondicionado("Ar-Condicionado do Quarto");
        ControleRemoto controleRemoto = new ControleRemoto();
        
        controleRemoto.ligarDispositivo(televisao);
        televisao.mudarCanal(5);
        controleRemoto.executarAcao(televisao);
        controleRemoto.desligarDispositivo(televisao);

        controleRemoto.ligarDispositivo(arCondicionado);
        arCondicionado.ajustarTemperatura(18);
        controleRemoto.executarAcao(arCondicionado);
        controleRemoto.desligarDispositivo(arCondicionado);
	}

}
