package PBO;

public class mahasiswa
{
    String nim, nama ;
    int usia;

    public void belajar()
    {
        System.out.println(this.nama+"belajar");
    }

    public void absen()
    {
        System.out.println(this.nama+ "dengan nim :"+ this.nim+" sedang absen");
    }

    public void getIdentitas(){
        System.out.println("Nama mahasiswa : "+ this.nama);
        System.out.println("Nim mahasiswa : "+ this.nim);
        System.out.println("Usia mahasiswa : "+ this.usia);
        
        
    }
}