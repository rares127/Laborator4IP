abstract class Utilizator
{
    protected String nume;
    protected String email;

    public Utilizator(String nume, String email) {
        this.nume = nume;
        this.email = email;
    }

    public abstract void autentificare();
}
