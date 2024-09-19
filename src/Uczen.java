public class Uczen extends Osoba{

    private int nrEwidencyjny;
    public static int liczbaUczniow = 0;
    public Uczen(String imie, String nazwisko) {
        super(imie, nazwisko);
        liczbaUczniow++;
        nrEwidencyjny = liczbaUczniow;
    }
}
