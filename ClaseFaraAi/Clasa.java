import java.time.LocalDate;

public class Clasa {
    private LocalDate interval;  
    private String disciplina;
    private String tip;
    private Profesor profesor;
    private String sala;
    private String zi;
    private String grupa;
     public Clasa(LocalDate interval, String disciplina, String tip, Profesor profesor, String sala, String zi, String grupa) {
         this.interval = interval;
         this.disciplina = disciplina;
         this.tip = tip;
         this.profesor = profesor;
         this.sala = sala;
         this.zi = zi;
         this.grupa = grupa;
         
     }
 
     public LocalDate getInterval() {
         return interval;
     }
 
     public String getDisciplina() {
         return disciplina;
     }
 
     public String getTip() {
         return tip;
     }
 
     public Profesor getProfesor() {
         return profesor;
     }
 
     public String getSala() {
         return sala;
     }
 
     public String getZi() {
         return zi;
     }
 
     public String getGrupa() {
         return grupa;
     }
      
     
     public void setInterval(LocalDate interval) {
         this.interval = interval;
     }
 
     public void setDisciplina(String disciplina) {
         this.disciplina = disciplina;
     }
 
     public void setTip(String tip) {
         this.tip = tip;
     }
 
     public void setProfesor(Profesor profesor) {
         this.profesor = profesor;
     }
 
     public void setSala(String sala) {
         this.sala = sala;
     }
 
     public void setZi(String zi) {
         this.zi = zi;
     }
 
     public void setGrupa(String grupa) {
         this.grupa = grupa;
     }
 
     @Override
     public String toString() {
         return "Orar{" + "interval=" + interval + ", discipline=" + disciplina + ", tip=" + tip + ", profesori=" + profesor + ", sali=" + sala + ", zile=" + zi + ", grupa=" + grupa + '}';
     }
     
     
 }
