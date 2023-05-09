package com.mycompany.tp6_part2;

public class Accessoires extends Materials {

    private String name;

    public Accessoires(int id, String re, String di, String name) {
        
        super(id, re, di, "Accessoires");
        this.name = name;
    }

    public void get_name() {
        System.out.print(name);
    }

    public void set_name(String name1) {
        this.name = name1;
    }
    
    public void print_info() {
        System.out.println("Accessoire N°"+ this.id);
        System.out.println("Name: "+ this.name);
    }
}
