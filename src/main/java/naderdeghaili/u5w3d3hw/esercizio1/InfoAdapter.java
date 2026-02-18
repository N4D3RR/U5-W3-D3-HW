package naderdeghaili.u5w3d3hw.esercizio1;

import java.util.Calendar;
import java.util.Date;

public class InfoAdapter implements DataSource {

    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        Date dataDiNascita = info.getDataDiNascita(); //prendo data di nascita da info
        Calendar nascita = Calendar.getInstance(); //creo calendario
        nascita.setTime(dataDiNascita); // assegno a nascita la data di nascita
        Calendar oggi = Calendar.getInstance(); //creo un calendar con valore oggi LocalDate.now()

        int eta = oggi.get(Calendar.YEAR) - nascita.get(Calendar.YEAR);
        return eta;
    }
}
