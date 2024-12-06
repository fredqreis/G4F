package br.com.g4f;

public abstract class Dispositivo {
	
	private String nome;
    private boolean ligado;

    public Dispositivo(String nome) {
        this.nome = nome;
        this.ligado = false;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println(nome + " ligado.");
        } else {
            System.out.println(nome + " já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println(nome + " desligado.");
        } else {
            System.out.println(nome + " já está desligado.");
        }
    }
    
    public abstract void executarAcao();
    
    public String getNome() {
        return nome;
    }

    public boolean isLigado() {
        return ligado;
    }

}
