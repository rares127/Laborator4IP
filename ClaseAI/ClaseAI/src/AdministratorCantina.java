class AdministratorCantina extends Utilizator {
    public AdministratorCantina(String nume, String email) {
        super(nume, email);
    }

    @Override
    public void autentificare() {
        System.out.println(nume + " s-a autentificat ca administrator cantină.");
    }

    public void actualizeazaMeniu(MeniuCantina meniu, String zi, String masa, String nouMeniu) {
        meniu.actualizeazaMeniu(zi, masa, nouMeniu);
    }
}
