class Profesor extends Utilizator {
    public Profesor(String nume, String email) {
        super(nume, email);
    }

    @Override
    public void autentificare() {
        System.out.println(nume + " s-a autentificat ca profesor.");
    }

    // Metodă pentru publicarea unui anunț important
    public void publicaAnunt(Anunt anunt) {
        anunt.publica();
    }

    // Metodă pentru vizualizarea orarului
    public void vizualizareOrar(Orar orar) {
        orar.afisare();
    }
}