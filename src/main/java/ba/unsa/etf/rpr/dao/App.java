package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.dao.Laptop;
import ba.unsa.etf.rpr.dao.LaptopDaoSerializableFile;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws IOException, ClassNotFoundException {
        Laptop l1 = new Laptop();
        l1.setBrend("Toshiba");
        Laptop l2 = new Laptop();
        l2.setBrend("HP");
        LaptopDao test = new LaptopDaoJSONFile();
        test.dodajLaptopUFile(l1);
        test.dodajLaptopUFile(l2);
        for(Laptop x : test.vratiPodatkeIzDatoteke()) System.out.println(x);
    }
}
