//Create CPU with attribute price. Create inner class Processor (no. of cores, manufacturer) 
//and static nested class RAM (memory, manufacturer). Create an object of CPU and print 
//information of Processor and RAM

package ExternalExam;


public class CO1Cpu {
    public static void main(String[] args) {
        CPU cpu = new CPU(32000);
        CPU.Processor processor = cpu.new Processor(7,"Intel");
        CPU.RAM ram = new  CPU.RAM(16,"Dell");
        System.out.println("CPU Price :: "+cpu.price);
        System.out.println("Processor Manufactures :: "+processor.manufacturer);
        System.out.println("Processor Cores :: "+processor.no_cores);
        
        System.out.println("Ram Manufacturer :: "+ ram.manufacturer);
        System.out.println("Ram Memory size :: "+ ram.memory);
    }    
}

class CPU{
    double price;
    CPU(double price) {
        this.price = price;
    }
    class Processor{
        int no_cores;
        String manufacturer;
        Processor(int no_cores, String manufacturer) {
            this.no_cores = no_cores;
            this.manufacturer = manufacturer;
        }
    }
    static class RAM{
        int memory;
        String manufacturer;
        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }
    }
}
