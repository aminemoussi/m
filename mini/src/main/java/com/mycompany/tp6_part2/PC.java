package com.mycompany.tp6_part2;

public class PC extends Materials {

    private String cpu;

    private String ram;

    public PC(int id, String re, String di, String cpu, String ram) {
        super(id, re, di, "pc");
        this.cpu = cpu;
        this.ram = ram;
    }

    public void get_cpu() {
        System.out.print(cpu);
    }

    public void set_cpu(String cpu1) {
        this.cpu = cpu1;
    }

    public void get_ram() {
        System.out.print(ram);
    }

    public void set_ram(String ram1) {
        this.ram = ram1;
    }
    
    public void print_info() {
        System.out.println("Pc N°"+ this.id);
        System.out.println("Cpu: "+ this.cpu);
        System.out.println("Ram: "+ this.ram);
    }
    
}
