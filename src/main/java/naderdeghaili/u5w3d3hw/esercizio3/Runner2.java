package naderdeghaili.u5w3d3hw.esercizio3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner2 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        Tenente tenente = new Tenente();
        Capitano capitano = new Capitano();
        Maggiore maggiore = new Maggiore();
        Colonnello colonnello = new Colonnello();
        Generale generale = new Generale();

        tenente.setNext(capitano);
        capitano.setNext(maggiore);
        maggiore.setNext(colonnello);
        colonnello.setNext(generale);

        tenente.verificaStipendio(5000);
    }
}
