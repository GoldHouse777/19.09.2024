public class Main {
    public static void main(String[] args) {
        Osoba osoba = new Uczen("Jaś", "Stokrotka");
        System.out.println(osoba.getImie());
        System.out.println(osoba.getNazwisko());
        System.out.println(osoba.getWiek());
        osoba.setImie("Jan");
        System.out.println(osoba.getImie());
        System.out.println(osoba);//wywolana metoda toString

        System.out.println("Liczba uczniów: "+Uczen.liczbaUczniow);
        Uczen uczen = new Uczen("Ewa", "Mewa");
        System.out.println(uczen);
        System.out.println("Liczba uczniów: "+Uczen.liczbaUczniow);
        Uczen uczen1 = new Uczen("Ada", "Pada");
        System.out.println(uczen1);
        System.out.println("Liczba uczniów: "+Uczen.liczbaUczniow);
        Uczen uczen2 = new Uczen("Staś", "Paś");
        System.out.println(uczen2);
        System.out.println("Liczba uczniów: "+Uczen.liczbaUczniow);

    }
}

