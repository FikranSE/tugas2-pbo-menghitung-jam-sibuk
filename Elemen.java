public class Elemen {
    public String nama;

    public Elemen(String nama) {
        /*
         * ini DOWNCASTING,karena semua constructor subclassnya
         * bereferensi kepada class Elemen yg merupakan superclass
         */
        this.nama = nama;
    }

}

class Dosen extends Elemen {// polymorphisme
    public int jamSibuk;
    private int jumlahHariKerja;

    public Dosen(String nama, int jumlahHariKerja) {
        super(nama);
        jamSibuk = jumlahHariKerja * 8;

    }

    public void display() {
        System.out.println(nama + " adalah seorang dosen dengan jam sibuk" + " " + jamSibuk);
    }

    public int getJamSibuk() {
        return jamSibuk;
    }
}

class Mahasiswa extends Elemen {// polymorphism
    private int sks;
    public int jamSibuk;

    public Mahasiswa(String nama, int sks) {
        super(nama);
        jamSibuk = sks * 3;
    }

    public int getJamSibuk() {
        return jamSibuk;

    }

    public void display() {
        System.out.println(nama + " adalah seorang Mahasiswa dengan jam sibuk" + " " + jamSibuk);
    }

}

class Asdos extends Mahasiswa {// polymorphisme
    private int jamNgasdos;

    public Asdos(String nama, int sks, int jamNgasdos) {
        super(nama, sks);
        jamSibuk = jamSibuk + jamNgasdos;

    }

    public int getJamSibuk() {
        return jamSibuk;
    }

    public void display() {
        /*
         * ini adalah UPCASTING,karena melakukan
         * perubahan isi method yang tidak sama dengan
         * class induknya
         */
        System.out.println(nama + " adalah seorang Asdos dengan jam sibuk" + " " + jamSibuk);
    }

}
