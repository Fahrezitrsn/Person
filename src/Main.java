public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Person person2 = new Person();

        //Untuk Anton
        person.setNama("Anton");
        person.setJenisKelamin('L');
        person.setUmur(19);
        System.out.println("Nama: " + person.getNama());
        System.out.println("Jenis Kelamin: " + person.getJenisKelamin());
        System.out.println("Umur: " + person.getUmur());

        System.out.println();

        //Untuk Riko
        person2.setNama("Riko");
        person2.setJenisKelamin('L');
        person2.setUmur(23);
        System.out.println("Nama: " + person2.getNama());
        System.out.println("Jenis Kelamin: " + person2.getJenisKelamin());
        System.out.println("Umur: " + person2.getUmur());
    }
}