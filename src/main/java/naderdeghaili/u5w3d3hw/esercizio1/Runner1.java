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
        info.setCognome("D");

        Calendar cal = Calendar.getInstance();
        cal.set(2000, 10, 10);
        Date dataDiNascita = cal.getTime();
        info.setDataDiNascita(dataDiNascita);

        DataSource dsAdapter = new InfoAdapter(info);

        UserData userData = new UserData();
        userData.getData(dsAdapter);

        System.out.println(dsAdapter.getEta());
        System.out.println(dsAdapter.getNomeCompleto());


    }
}
