abstract class Utilizator {
    protected String nume;
    protected String email;
    protected String parola;

    public Utilizator(String nume, String email, String parola) {
        this.nume = nume;
        this.email = email;
        this.parola = parola;
    }

    public boolean autentificare(Autentificare sistemAutentificare) {
        return sistemAutentificare.autentifica(email, parola);
    }
}