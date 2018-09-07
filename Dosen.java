public class Dosen {
    private String nama;
    private String nidn;
    private String kampus;

    public Dosen(String nama, String nidn, String kampus) {
        this.nama = nama;
        this.nidn = nidn;
        this.kampus = kampus;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNidn() {
        return nidn;
    }
    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getKampus() {
        return kampus;
    }
    public void setKampus(String kampus) {
        this.kampus = kampus;
    }
}
