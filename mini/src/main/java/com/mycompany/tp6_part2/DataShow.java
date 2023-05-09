package com.mycompany.tp6_part2;

public class DataShow extends Materials {

    private String brand_name;

    public DataShow(int id, String re, String di, String bn) {
        super(id, re, di, "Data Show");
        this.brand_name = bn;
    }

    public void get_brand_name() {
        System.out.print(brand_name);
    }

    public void set_brand_name(String bn) {
        this.brand_name = bn;
    }
    
    public void print_info() {
        System.out.println("Data show N°"+ this.id);
        System.out.println("Brand: "+ this.brand_name);
    }
}
