package exercicio.tres;

public class CarroCorrida {
    private Integer numeroCarro;
    private Piloto piloto;
    private float velocidadeMaxima;
    private float velocidadeAtual;
    private boolean ligado;

    public CarroCorrida(Integer numeroCarro, Piloto piloto, float velocidadeMaxima, float velocidadeAtual, boolean ligado) {
        this.numeroCarro = numeroCarro;
        this.piloto = piloto;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
        this.ligado = ligado;
    }

    public Integer getNumeroCarro() {
        return numeroCarro;
    }

    public void setNumeroCarro(Integer numeroCarro) {
        this.numeroCarro = numeroCarro;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(float velocidadeAtual) {
        if(getLigado()) {
            this.velocidadeAtual = velocidadeAtual;
        } else {
            System.out.println("\n» O carro de " + piloto.getNome() + " precisa estar ligado!");
        }
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void acelerar(float acelerar) {
        if(getLigado()) {
            if ((getVelocidadeAtual() + acelerar) < getVelocidadeMaxima()) {
                setVelocidadeAtual(getVelocidadeAtual()+acelerar);
                System.out.println("\n» Acelerando o carro de " + piloto.getNome() + " em "+ acelerar + " km/h");
            } else {
                System.out.println("\n» Não é possível acelerar acima da velocidade máxima!");
            }
        } else {
            System.out.println("\n» O carro de " + piloto.getNome() + " precisa estar ligado para acelerar!");
        }
    }

    public void frear(float frear) {
        if (getLigado()) {
            if ((getVelocidadeAtual() - frear) < 0) {
                parar();
            } else {
                setVelocidadeAtual(getVelocidadeAtual() - frear);
                System.out.println("\n» Freando o carro de " + piloto.getNome() + " em " + frear + " km/h");
            }
        }
    }

    public void parar() {
        setVelocidadeAtual(0.0F);
        System.out.println("\n» Carro de " + piloto.getNome() +" parado ");
    }

    public void ligar() {
        System.out.println("\n» Carro de " + piloto.getNome() + "ligado ");
        setLigado(true);
    }

    public void desligar() {
        if(getVelocidadeAtual() == 0) {
            setLigado(false);
            System.out.println("\n» Carro de " + piloto.getNome() + " desligado");
        } else {
            System.out.println("\n» O carro de " + piloto.getNome() + " precisa estar parado para desligar");
        }
    }

    @Override
    public String toString() {
        return "\nCarro de Corrida: " + piloto.getNome() +
                "\n- Número do Carro: " + numeroCarro +
                "\n- Piloto: " + piloto.getNome() +
                "\n- Velocidade Máxima: " + velocidadeMaxima + " km/h" +
                "\n- Velocidade Atual: " + velocidadeAtual + " km/h" +
                "\n- Ligado: " + ligado;
    }
}
