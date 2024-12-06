package br.com.g4f;

public class Televisao extends Dispositivo {
	
    private int canalAtual;

    public Televisao(String nome) {
        super(nome);
        this.canalAtual = 1;
    }

    public void mudarCanal(int canal) {
        if (isLigado()) {
            canalAtual = canal;
            System.out.println(getNome() + " mudou para o canal " + canalAtual);
        } else {
            System.out.println(getNome() + " está desligada. Não é possível mudar o canal.");
        }
    }

    @Override
    public void executarAcao() {
        System.out.println("Televisão: Exibindo o canal " + canalAtual);
    }

}
