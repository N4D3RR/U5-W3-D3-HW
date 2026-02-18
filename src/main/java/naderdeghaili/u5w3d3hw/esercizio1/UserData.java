package naderdeghaili.u5w3d3hw.esercizio1;

public class UserData {

    private String nomeCompleto;
    private int eta;

    public void getData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }


}
