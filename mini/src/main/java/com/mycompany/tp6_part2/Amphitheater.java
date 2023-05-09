package com.mycompany.tp6_part2;

import java.util.ArrayList;

public class Amphitheater extends Building {

    public Boolean Availability;
    public ArrayList<Materials> materials_Amphitheater;

    public Amphitheater(int building_id, String building_name, double building_area, int Capacity, Boolean Availability) {
        super(building_id, building_name, building_area, Capacity);
        this.Availability = Availability;
    }

    public void print_amphitheater_infos() {
        System.out.println("Amphitheatre's id : " + this.building_id);
        System.out.println("Amphitheatre's name : " + this.building_name);
        System.out.println("Amphitheatre's area : " + this.building_area);
        System.out.println("Amphitheatre's capacity : " + this.Capacity);
        System.out.println("Amphitheatre's avalability : " + this.Availability);
        for(Materials material : materials_Amphitheater) {
            if (material instanceof PC) {
               ((PC) material).print_info();
            } else if (material instanceof Accessoires) {
               ((Accessoires) material).print_info();
            }  else if (material instanceof Printer) {
               ((Printer) material).print_info();
            }  else {
               ((DataShow) material).print_info();
            }; 
        }
    }

    @Override
    public void occupation() {
    }
    
    public void add_material_to_Amphitheater(Materials item) {
        materials_Amphitheater.add(item);
    }
}
