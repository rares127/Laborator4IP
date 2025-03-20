java import java.util.HashMap;
import java.util.Map;

class Autentificare {
    private Map<String, String> conturiUtilizatori; // Simulăm o bază de date cu email și parolă

    public Autentificare() {
        conturiUtilizatori = new HashMap<>();
        // Adăugăm utilizatori de test
        conturiUtilizatori.put("ion.popescu@uni.ro", "parola123");
        conturiUtilizatori.put("maria.ionescu@uni.ro", "profesor2024");
        conturiUtilizatori.put("andrei.radu@uni.ro", "secretariat789");
        conturiUtilizatori.put("mihai.vasilescu@uni.ro", "cantina456");
    }

    // Metodă de autentificare
    public boolean autentifica(String email, String parola) {
        if (conturiUtilizatori.containsKey(email) && conturiUtilizatori.get(email).equals(parola)) {
            System.out.println("Autentificare reușită pentru: " + email);
            return true;
        } else {
            System.out.println("Autentificare eșuată! Email sau parolă incorectă.");
            return false;
        }
    }
}