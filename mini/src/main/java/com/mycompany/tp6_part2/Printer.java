package com.mycompany.tp6_part2;

public class Printer extends Materials {

    private String brand_name;

    private int capacity;

    public Printer(int id, String re, String di, String bn, int cap) {
        super(id, re, di, "Printer");
        this.capacity = cap;
    }

    public void get_brand_name() {
        System.out.print(brand_name);
    }

    public void set_brand_name(String bn) {
        this.brand_name = bn;
    }

    public void get_capacity() {
        System.out.print(capacity);
    }

    public void set_capacity(int cap) {
        this.capacity = cap;
    }
    
    public void print_info() {
        System.out.println("Printer N°"+ this.id);
        System.out.println("Brand: "+ this.brand_name);
    }
}
