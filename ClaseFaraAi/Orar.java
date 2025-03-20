import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Orar {
    private Clasa[] clase;

    public Orar(Clasa[] clase) {
        this.clase = clase;
    }

    public List<Clasa> getClaseDisciplina(String dis) {
        List<Clasa> rezultat = new ArrayList<>();
        for (Clasa clasec : clase) {
            if (clasec.getDisciplina().equals(dis)) {
                rezultat.add(clasec);
            }
        }
        return rezultat;
    }

    public List<Clasa> getClaseProfesor(Profesor profesor) {
        List<Clasa> rezultat = new ArrayList<>();
        for (Clasa clasec : clase) {
            if (clasec.getProfesor().equals(profesor)) {
                rezultat.add(clasec);
            }
        }
        return rezultat;
    }

    public List<Clasa> getClaseSala(String sala) {
        List<Clasa> rezultat = new ArrayList<>();
        for (Clasa clasec : clase) {
            if (clasec.getDisciplina().equals(sala)) {
                rezultat.add(clasec);
            }
        }
        return rezultat;
    }

    public void setClase(Clasa[] clase) {
        this.clase = clase;
    }

   
    public String toString() {
        return "Orar{" + "clase=" + Arrays.toString(clase) + '}';
    }
}
