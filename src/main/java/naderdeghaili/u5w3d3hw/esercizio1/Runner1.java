package naderdeghaili.u5w3d3hw.esercizio1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;

@Component
public class Runner1 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Info info = new Info();
        info.setNome("N");
        info.setCognome("D"); //oggetto info con nome e cognome

        Calendar cal = Calendar.getInstance(); //creo Calendar con data oggi

        cal.set(2000, 10, 10); //imposto data
        Date dataDiNascita = cal.getTime(); //converto in Date
        info.setDataDiNascita(dataDiNascita); //aggiungo ad Info, ha bisogno di Date e non Calendar

        DataSource dsAdapter = new InfoAdapter(info); //creo Adapter, implementa DataSource, contiene Info

        UserData userData = new UserData(); //creo UserData
        userData.getData(dsAdapter); //passo DataSource(InfoAdapter)
        //nomeCompleto = ds.getNomeCompleto();
        //eta = ds.getEta();

        System.out.println(dsAdapter.getEta());
        System.out.println(dsAdapter.getNomeCompleto());


    }
}
