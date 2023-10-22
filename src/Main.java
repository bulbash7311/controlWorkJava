import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Set <Laptop> laptop = new HashSet<>();
        Laptop D543MA_DM1368 = new Laptop("D543MA-DM1368","ASUS","Intel Celeron N4020",15.6,4,1024,1900);
        laptop.add(D543MA_DM1368);
        Laptop NMH_WDQ9HN = new Laptop("NMH-WDQ9HN","GIGABYTE","Intel Core i5-12500H",15.6,16,512,2080);
        laptop.add(NMH_WDQ9HN);
        Laptop G5_MF = new Laptop("G5 MF","Honor","AMD Ryzen 5 5500U",14.0,8,512,1380);
        laptop.add(G5_MF);
        Laptop RLEF_X = new Laptop("RLEF-X","HUAWEI","Intel Core i5-12450H",16.0,16,512,1710);
        laptop.add(RLEF_X);
        Laptop SC_893XRU = new Laptop("11SC-894XRU","MSI","Intel Core i5-11260H",17.3,4,256,2600);
        laptop.add(SC_893XRU);

        Laptop FilterLaptop = new Laptop();
        System.out.println(FilterLaptop.Filter(laptop));
    }
}