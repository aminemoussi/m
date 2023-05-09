package com.mycompany.tp6_part2;

import java.util.ArrayList;

public class Salle extends Building {

    public String accessoire;
    public ArrayList<Materials> materials_Salle = new ArrayList<>();
    

    public Salle(String accessoire, int building_id, String building_name, double building_area, int Capacity) {
        super(building_id, building_name, building_area, Capacity);
        this.accessoire = accessoire;
    }

    public void print_salle_infos() {
        System.out.println("Room's id : " + this.building_id);
        System.out.println("Room's name : " + this.building_name);
        System.out.println("Room's area : " + this.building_area);
        System.out.println("Room's capacity : " + this.Capacity);
        System.out.println("Room's accessories : " + this.accessoire);
        for(Materials material : materials_Salle) {
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
    
    public void add_material_to_Salle(Materials item) {
        materials_Salle.add(item);
    }
}
