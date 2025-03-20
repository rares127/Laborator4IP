import java.util.HashMap;

class CatalogNote {
    private HashMap<Student, Double> note = new HashMap<>();

    public void adaugaNota(Student student, double nota) {
        note.put(student, nota);
        System.out.println("Nota adăugata: " + nota + " pentru " + student.nume);
    }

    public void afisareNote(Student student) {
        if (note.containsKey(student)) {
            System.out.println("Nota pentru " + student.nume + " este: " + note.get(student));
        } else {
            System.out.println("Nu exista nota inregistrata");
        }
    }
}