package br.com.g4f;

public class ArCondicionado extends Dispositivo {
	
    private int temperatura;

    public ArCondicionado(String nome) {
        super(nome);
        this.temperatura = 24;
    }

    public void ajustarTemperatura(int temperatura) {
        if (isLigado()) {
            this.temperatura = temperatura;
            System.out.println(getNome() + " ajustou a temperatura para " + temperatura + "°C.");
        } else {
            System.out.println(getNome() + " está desligado. Não é possível ajustar a temperatura.");
        }
    }

    @Override
    public void executarAcao() {
        System.out.println("Ar-Condicionado: Operando a " + temperatura + "°C.");
    }

}
