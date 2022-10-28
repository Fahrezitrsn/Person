public class Person {
    private String nama;
    private char jenisKelamin;
    private int umur;

    //Setter
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
    public void setJenisKelamin(char jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }

    //Getter
    public String getNama(){
        return  this.nama;
    }
    public int getUmur(){
        return this.umur;
    }
    public char getJenisKelamin(){
        return this.jenisKelamin;
    }
}
