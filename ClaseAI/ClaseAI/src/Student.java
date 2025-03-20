class Student extends Utilizator
{
    public Student(String nume, String email)
    {
        super(nume, email);
    }

    @Override
    public void autentificare() {
        System.out.println(nume + " s-a autentificat ca student.");
    }

    public void vizualizareOrar(Orar orar)
    {
        orar.afisare();
    }

    public void depuneCerereDecontare(CerereDecontare cerere) {
        System.out.println("Cererea pentru decontare a fost depusă.");
    }

    public void vizualizareNote(CatalogNote catalog)
    {
        catalog.afisareNote(this);
    }

}
