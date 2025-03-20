class Secretariat extends Utilizator
{
    public Secretariat(String nume, String email) {
        super(nume, email);
    }

    @Override
    public void autentificare() {
        System.out.println(nume + " s-a autentificat ca secretariat.");
    }

    public void gestioneazaCereri(CerereDecontare cerere)
    {
        System.out.println("Cererea a fost procesată.");
    }

    public void publicaNote(CatalogNote catalog, Student student, double nota) {
        catalog.adaugaNota(student, nota);
    }
}
