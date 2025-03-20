public class Laborator4IP {

    public static void main(String[] args) {
               Clasa clasa1 = new Clasa(
                LocalDate.of(2025, 3, 20), 
                "BD",        
                "Seminar",               
                profesor1,  
                "C413",     
                "Luni",    
                "2B1"
        );
        Clasa clasa2 = new Clasa(
                LocalDate.of(2025, 3, 21),
                "SGBD",
                "Curs",
                profesor2,
                "C401",
                "Marti",
                "2A4"
        );

        Clasa clasa3 = new Clasa(
                LocalDate.of(2025, 3, 22),
                "SD",
                "Laborator",
                profesor1,
                "C412",
                "Miercuri",
                "1A2"
        );

    }
}
