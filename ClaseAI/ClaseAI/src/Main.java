public class Main {
    public static void main(String[] args)
    {
        // Creăm instanța sistemului de autentificare
        Autentificare sistemAutentificare = new Autentificare();

        // Creare instanțe studenti
        Student student1 = new Student("Ion Popescu", "ion.popescu@uni.ro");
        Secretariat secretariat = new Secretariat("Andrei Radu", "andrei.radu@uni.ro");
        ///AdministratorCantina adminCantina = new AdministratorCantina("Mihai Vasilescu", "mihai.vasilescu@uni.ro");
        AdministratorCantina adminCantina = new AdministratorCantina("Mihai Vasilescu", "mihai.vasilescu@uni.ro");

        // Testăm autentificarea
        System.out.println("\n--- Test autentificare student ---");
        if (student1.autentificare(sistemAutentificare)) {
            System.out.println(student1.nume + " poate accesa funcțiile aplicației.");
        }

        System.out.println("\n--- Test autentificare profesor ---");
        if (profesor1.autentificare(sistemAutentificare)) {
            System.out.println(profesor1.nume + " poate publica anunțuri.");
        }

        System.out.println("\n--- Test autentificare secretariat ---");
        if (secretariat.autentificare(sistemAutentificare)) {
            System.out.println(secretariat.nume + " poate publica orarul și gestiona notele.");
        }

        System.out.println("\n--- Test autentificare eșuată ---");
        Student student2 = new Student("Alex Dumitru", "alex.dumitru@uni.ro", "gresit123");
        student2.autentificare(sistemAutentificare);

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

        Profesor profesor1 = new Profesor("Maria Ionescu", "maria.ionescu@uni.ro");
        Orar orar = new Orar();
        Anunt anunt = new Anunt("Examenele vor începe pe 10 iunie.");

        profesor1.autentificare();
        profesor1.vizualizareOrar(orar);
        profesor1.publicaAnunt(anunt);
    }
}
