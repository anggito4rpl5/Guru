package Guru;
/**
 * Guru
 */
public class Guru {

    int nip;
String nama, mapel, status;

public Guru(int i, String n, String m, String s) {
    nip = i;
    nama = n;
    mapel = m;
    status = s;

    


}
public void print() {
    
    System.out.println("Berikut Data Guru");
    
    System.out.println("Nama : "+nama);
    System.out.println("NIP : "+nip);
    System.out.println("Mapel : "+mapel);
    System.out.println("Status : "+status);
    
    }
}
