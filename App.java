public class App {
    public static void main(String[] args) {
        Asdos a = new Asdos("fairuzikun", 23, 4);
        Dosen b = new Dosen("Raja OP damanik", 5);
        Asdos c = new Asdos("Angel-chan", 20, 4);
        Mahasiswa d = new Mahasiswa("Firman", 20);
        Mahasiswa e = new Mahasiswa("Nid to Pass this sem", 23);
        Dosen f = new Dosen("Nivotko", 3);
        
        
        a.display();
        b.display();
        c.display();
        d.display();
        e.display();
        f.display();
        int totalJamSibuk = a.jamSibuk + b.jamSibuk + c.jamSibuk + d.jamSibuk + e.jamSibuk + f.jamSibuk;
        System.out.println("Total jam sibuk elemen fasilkom adalah " + totalJamSibuk);
    }
}
