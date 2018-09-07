public class Mahasiswa {
    private String nama;
    private String npm;
    private String gender;

    public Mahasiswa(String nama, String npm, String gender) {
        this.nama = nama;
        this.npm = npm;
        this.gender = gender;
    }
    public Mahasiswa() {
        this("", "", "");
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNpm() {
        return npm;
    }
    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

}