public class Main {
    public static void main(String[] args) {
        Osoba osoba = new Osoba("Jaś", "Stokrotka");
        System.out.println(osoba.imie);
        System.out.println(osoba.nazwisko);
        System.out.println(osoba.wiek);
        osoba.imie = "Jan";
        System.out.println(osoba.imie);
    }
}

