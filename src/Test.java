public class Test {
    public static void main(String[] args) {
        CPU cpu = new CPU();                         //create object
        HardDisk dist = new HardDisk();
        PC pc = new PC();

        cpu.setSpeed(2200);                           //set speed
        dist.setAmount(200);                          //set amount

        pc.setCpu(cpu);

        pc.setHardDisk(dist);

        pc.show();                                    //print

    }
}
