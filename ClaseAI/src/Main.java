public class Main {
    public static void main(String[] args)
    {
        // Creare instanțe
        Student student1 = new Student("Ion Popescu", "ion.popescu@uni.ro");
        Secretariat secretariat = new Secretariat("Andrei Radu", "andrei.radu@uni.ro");
        ///AdministratorCantina adminCantina = new AdministratorCantina("Mihai Vasilescu", "mihai.vasilescu@uni.ro");
        AdministratorCantina adminCantina = new AdministratorCantina("Mihai Vasilescu", "mihai.vasilescu@uni.ro");


        // Autentificare
        student1.autentificare();
        secretariat.autentificare();
        adminCantina.autentificare();

        // Student vizualizează orarul
        Orar orar = new Orar();
        student1.vizualizareOrar(orar);

        // Student depune cerere pentru decontare
        CerereDecontare cerere = new CerereDecontare();
        student1.depuneCerereDecontare(cerere);

        // Secretariat gestionează cererea de decontare
        secretariat.gestioneazaCereri(cerere);
        cerere.aproba();

        // Secretariat publică notele
        CatalogNote catalog = new CatalogNote();
        secretariat.publicaNote(catalog, student1, 9.5);

        // Student vizualizează notele
        student1.vizualizareNote(catalog);

        // Administrator cantină actualizează meniul
        MeniuCantina meniu = new MeniuCantina();
        ///adminCantina.actualizeazaMeniu(meniu);

        // Actualizare meniu pentru luni
        adminCantina.actualizeazaMeniu(meniu, "Luni", "Mic Dejun", "Omletă cu legume și ceai");
        adminCantina.actualizeazaMeniu(meniu, "Luni", "Pranz", "Ciorbă de legume și pui la grătar");
        adminCantina.actualizeazaMeniu(meniu, "Luni", "Cina", "Salată de ton cu porumb");

        meniu.afisareMeniu();
    }
}
