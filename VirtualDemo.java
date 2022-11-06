//Winda Adelia 2111521002
public class VirtualDemo {
    public static void main(String[] args){
        Gaji s = new Gaji("Wahyu","KUBAR",3,5000.00);
        Pegawai e = new Gaji("Ini nama","Samarinda",2,2500.00); /*polymorphisme karena objek bertipe parent
        kelas yaitu kelas pegawai melakukan pemanggilan konstruktornya melalui kelas anak yaitu kelas gaji dan juga merupakan 
        upcasting karena mengambil objek dari kelas anaknya yaitu kelas gaji*/
        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji --");
        s.mailCheck();
        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
        e.mailCheck();
    }
}