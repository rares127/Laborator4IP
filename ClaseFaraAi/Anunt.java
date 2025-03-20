class Anunt {
    private String mesaj;
    private String autor;
    private String dataPublicare;

    public Anunt(String mesaj, String autor, String dataPublicare) {
        this.mesaj = mesaj;
        this.autor = autor;
        this.dataPublicare = dataPublicare;
    }

    public void publica() {
        System.out.println("Anunț publicat de " + autor + " pe " + dataPublicare + ": " + mesaj);
    }

    public void modificaMesaj(String mesajNou) {
        this.mesaj = mesajNou;
        System.out.println("Mesajul anuntului a fost actualizat");
    }

    public void stergeAnunt() {
        System.out.println("Anuntul a fost sters");
        this.mesaj = "";
        this.autor = "";
        this.dataPublicare = "";
    }

    @Override
    public String toString() {
        return "Anunt{" + "mesaj='" + mesaj + '\'' + ", autor='" + autor + '\'' + ", dataPublicare='" + dataPublicare + '\'' + '}';
    }
}
