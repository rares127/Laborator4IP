class Anunt {
    private String mesaj;

    public Anunt(String mesaj) {
        this.mesaj = mesaj;
    }

    public void publica() {
        System.out.println("Anunț publicat: " + mesaj);
    }
}