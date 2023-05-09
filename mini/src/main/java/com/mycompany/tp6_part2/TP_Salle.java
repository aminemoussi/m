package com.mycompany.tp6_part2;

import java.util.ArrayList;

public class TP_Salle extends Salle {

    public Boolean isActive;
    public ArrayList<Materials> materials_TPSalle = new ArrayList<>();

    public TP_Salle(String accessoire, int building_id, String building_name, double building_area, int Capacity, Boolean isActive) {
        super( accessoire, building_id, building_name, building_area, Capacity);
        this.isActive = isActive;
    }

    public void print_salleTP_infos() {
        System.out.println("TP Room's id : " + this.building_id);
        System.out.println("TP Room's name : " + this.building_name);
        System.out.println("TP Room's area : " + this.building_area);
        System.out.println("TP Room's capacity : " + this.Capacity);
        System.out.println("TP Room's activity : " + this.isActive);
        for(Materials material : materials_TPSalle) {
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
    
    public void add_material_to_TPSalle(Materials item) {
        materials_TPSalle.add(item);
    }

    public ArrayList<Materials> getTp_Materials() {
        return materials_TPSalle;

    }
}
