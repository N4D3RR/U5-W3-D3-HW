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
        Date dataDiNascita = info.getDataDiNascita();
        Calendar nascita = Calendar.getInstance();
        nascita.setTime(dataDiNascita);
        Calendar oggi = Calendar.getInstance();

        int eta = oggi.get(Calendar.YEAR) - nascita.get(Calendar.YEAR);
        return eta;
    }
}
