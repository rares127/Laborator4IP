class CerereDecontare {
    private String status = "In asteptare";

    public void aproba() {
        status = "Aprobat";
        System.out.println("Cererea a fost aprobata");
    }

    public String getStatus() {
        return status;
    }
}