import java.util.HashMap;
import java.util.Map;

class MeniuCantina {
    private Map<String, Map<String, String>> meniuSaptamanal;

    public MeniuCantina() {
        meniuSaptamanal = new HashMap<>();
        initializeazaMeniu();
    }

    // Inițializare meniu cu zilele săptămânii și tipuri de mese
    private void initializeazaMeniu() {
        String[] zile = {"Luni", "Marti", "Miercuri", "Joi", "Vineri"};
        String[] mese = {"Mic Dejun", "Pranz", "Cina"};

        for (String zi : zile) {
            meniuSaptamanal.put(zi, new HashMap<>());
            for (String masa : mese) {
                meniuSaptamanal.get(zi).put(masa, "Meniu indisponibil");
            }
        }
    }

    // Metodă pentru actualizarea meniului unei zile și mese specifice
    public void actualizeazaMeniu(String zi, String masa, String nouMeniu) {
        if (meniuSaptamanal.containsKey(zi) && meniuSaptamanal.get(zi).containsKey(masa)) {
            meniuSaptamanal.get(zi).put(masa, nouMeniu);
            System.out.println("Meniul pentru " + masa + " de " + zi + " a fost actualizat cu: " + nouMeniu);
        } else {
            System.out.println("Ziua sau tipul de masă nu sunt valide.");
        }
    }

    // Afișează meniul complet
    public void afisareMeniu() {
        for (String zi : meniuSaptamanal.keySet()) {
            System.out.println("Meniu pentru " + zi + ":");
            for (Map.Entry<String, String> entry : meniuSaptamanal.get(zi).entrySet()) {
                System.out.println("  " + entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
