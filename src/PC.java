public class PC {
    private CPU cpu;
    private HardDisk HardDisk;

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public HardDisk getHardDisk() {
        return HardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        HardDisk = hardDisk;
    }

    public void show() {                             //print speed of CPU and capacity of hard disk
        System.out.println("The speed of the CPU is " + cpu.getSpeed());
        System.out.println("The capacity of the hard dist is " + HardDisk.getAmount());
    }
}
