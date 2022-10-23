package exercicio.tres;

public class CorridaMaluca {
    public static void main(String[] args) {
        Piloto dickVigarista = new Piloto("Dick Vigarista & Muttley", 45, Sexo.Masculino, "A máquina malvada");
        CarroCorrida maquinaDoMal = new CarroCorrida(00, dickVigarista, 150F, 0F, false);

        Piloto penelopeCharmosa = new Piloto("Penelope Charmosa", 22, Sexo.Feminino, "Carrinho pra frente");
        CarroCorrida carrinhoPraFrente = new CarroCorrida(5, penelopeCharmosa, 150F, 0F, false);

        initialize();
        status(maquinaDoMal, carrinhoPraFrente);

        maquinaDoMal.acelerar(80f);
        maquinaDoMal.ligar();
        carrinhoPraFrente.ligar();
        status(maquinaDoMal, carrinhoPraFrente);

        maquinaDoMal.acelerar(80f);
        carrinhoPraFrente.acelerar(100f);
        status(maquinaDoMal, carrinhoPraFrente);

        maquinaDoMal.frear(10f);
        carrinhoPraFrente.frear(50f);
        status(maquinaDoMal, carrinhoPraFrente);

        carrinhoPraFrente.desligar();
        carrinhoPraFrente.parar();
        carrinhoPraFrente.desligar();

        maquinaDoMal.parar();
        maquinaDoMal.desligar();

        status(maquinaDoMal, carrinhoPraFrente);
    }

    public static void initialize() {
        System.out.println("\n" +
                " ________  ________  ________  ________  ___  ________  ________          _____ ______   ________  ___       ___  ___  ________  ________     \n" +
                "|\\   ____\\|\\   __  \\|\\   __  \\|\\   __  \\|\\  \\|\\   ___ \\|\\   __  \\        |\\   _ \\  _   \\|\\   __  \\|\\  \\     |\\  \\|\\  \\|\\   ____\\|\\   __  \\    \n" +
                "\\ \\  \\___|\\ \\  \\|\\  \\ \\  \\|\\  \\ \\  \\|\\  \\ \\  \\ \\  \\_|\\ \\ \\  \\|\\  \\       \\ \\  \\\\\\__\\ \\  \\ \\  \\|\\  \\ \\  \\    \\ \\  \\\\\\  \\ \\  \\___|\\ \\  \\|\\  \\   \n" +
                " \\ \\  \\    \\ \\  \\\\\\  \\ \\   _  _\\ \\   _  _\\ \\  \\ \\  \\ \\\\ \\ \\   __  \\       \\ \\  \\\\|__| \\  \\ \\   __  \\ \\  \\    \\ \\  \\\\\\  \\ \\  \\    \\ \\   __  \\  \n" +
                "  \\ \\  \\____\\ \\  \\\\\\  \\ \\  \\\\  \\\\ \\  \\\\  \\\\ \\  \\ \\  \\_\\\\ \\ \\  \\ \\  \\       \\ \\  \\    \\ \\  \\ \\  \\ \\  \\ \\  \\____\\ \\  \\\\\\  \\ \\  \\____\\ \\  \\ \\  \\ \n" +
                "   \\ \\_______\\ \\_______\\ \\__\\\\ _\\\\ \\__\\\\ _\\\\ \\__\\ \\_______\\ \\__\\ \\__\\       \\ \\__\\    \\ \\__\\ \\__\\ \\__\\ \\_______\\ \\_______\\ \\_______\\ \\__\\ \\__\\\n" +
                "    \\|_______|\\|_______|\\|__|\\|__|\\|__|\\|__|\\|__|\\|_______|\\|__|\\|__|        \\|__|     \\|__|\\|__|\\|__|\\|_______|\\|_______|\\|_______|\\|__|\\|__|\n");
    }
    public static void status(CarroCorrida carro1, CarroCorrida carro2) {
        System.out.println("\n██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██" +
                "\n" +
                "       ┏━━━━━━━━━┓                                   ┏━━━━━━━━━┓\n" +
                "      ┏┛    " + carro1.getNumeroCarro() + "    ┗┓                                 ┏┛    " + carro2.getNumeroCarro() + "    ┗┓\n" +
                "   ³³=┗██━━━━━━██━┛                              ³³=┗██━━━━━━██━┛\n" +
                "» " + carro1.getPiloto().getNome() + " «\t\t\t\t\t» " + carro2.getPiloto().getNome() + " «" +
                "\n> Ligado: " + carro1.getLigado() + "                                  > Ligado: " + carro2.getLigado() +
                "\n> Velocidade atual: " + carro1.getVelocidadeAtual() + " km/h" + "  \t\t\t\t\t> Velocidade atual: " + carro2.getVelocidadeAtual() + " km/h" +
                "\n" +
                "░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░");
    }

}
