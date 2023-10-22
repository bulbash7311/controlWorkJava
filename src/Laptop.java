import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Laptop {
    private Integer ram;
    private Integer memory;
    private Double diagonal;
    private Integer weight;
    private String name;
    private String manufacturer;
    private String processor;

    public Laptop() {
    }
    public Laptop(String name,String manufacturer,String processor,Double diagonal,Integer ram,Integer memory,Integer weight) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.diagonal =  Math.round(diagonal * 10.0) / 10.0;
        this.ram = ram;
        this.memory = memory;
        this.weight = weight;
    }

    public Integer getRam(){return ram;};
    public  Integer getMemory(){return memory;};
    public  Double getDiagonal(){return diagonal;};
    public  Integer getWeight(){return weight;};
    public  String getName(){return name;};
    public  String getManufacturer(){return manufacturer;};
    public  String getProcessor(){return processor;};

    public Set<Laptop> Filter(Set<Laptop> laptop) {
        Scanner scan = new Scanner(System.in);
        Set<Laptop> listLaptop = new HashSet<>(laptop);

        System.out.println("Укажите номер или номера критериев фильрации ноутбуков" +
                "\n1. Диагональ\n2. Объем ОЗУ\n3. Размер жесткого диска");
        String userRequest = scan.nextLine();

        for (int i = 0; i < userRequest.length(); i++) {

            if(1 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Укажите диапазон искомой диагональ");
                System.out.println("от:");
                String startDiagonal = scan.nextLine();
                double doubleParseStartDiagonal = Double.parseDouble(startDiagonal);
                System.out.println("до:");
                String endDiagonal = scan.nextLine();
                double doubleParseEndDiagonal = Double.parseDouble(endDiagonal);
                for (Laptop tempLaptop : laptop) {
                    if (doubleParseStartDiagonal > tempLaptop.diagonal || doubleParseEndDiagonal < tempLaptop.diagonal ){
                        listLaptop.remove(tempLaptop);
                    }
                }
            }

            if(2 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Укажите нужный объем ОЗУ");
                System.out.println("от:");
                String startRam = scan.nextLine();
                int intParseStartRam = Integer.parseInt(startRam);
                System.out.println("до:");
                String endRam = scan.nextLine();
                int intParseEndRam = Integer.parseInt(endRam);
                for (Laptop tempLaptop : laptop) {
                    if (intParseStartRam > tempLaptop.ram || intParseEndRam < tempLaptop.ram ){
                        listLaptop.remove(tempLaptop);
                    }
                }
            }
            
            if(3 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Укажите нужный размер жесткого диска");
                System.out.println("от:");
                String startMemory = scan.nextLine();
                int intParseStartMemory = Integer.parseInt(startMemory);
                System.out.println("до:");
                String endMemory = scan.nextLine();
                int intParseEndMemory = Integer.parseInt(endMemory);
                for (Laptop tempLaptop : laptop) {
                    if (intParseStartMemory > tempLaptop.memory || intParseEndMemory < tempLaptop.memory){
                        listLaptop.remove(tempLaptop);
                    }
                }
            }
        }
        return listLaptop;
    }

    @Override
    public String toString() {
        return   String.format(
                "\nНазвание: %s \n" +
                        "Производитель: %s \n" +
                        "Процессор: %s\n" +
                        "Диагональ: %.1f\n" +
                        "ОЗУ: %d\n" +
                        "Жесткий диск: %d\n" +
                        "Вес: %d\n",
                name, manufacturer, processor, diagonal, ram, memory, weight);

    }
}