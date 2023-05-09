package com.mycompany.tp6_part2;

import java.util.ArrayList;

public class Bureau extends Building {

    public String bureau_name;
    public ArrayList<Materials> materials_Bureau = new ArrayList<>();

    public Bureau(int building_id, String building_name, double building_area, int Capacity, String bureau_name) {
        super(building_id, building_name, building_area, Capacity);
        this.bureau_name = bureau_name;
    }

    public void print_bureau_infos() {
        System.out.println("Bureau's id : " + this.building_id);
        System.out.println("Bureau's name(building) : " + this.building_name);
        System.out.println("Bureau's area : " + this.building_area);
        System.out.println("Bureau's capacity : " + this.Capacity);
        System.out.println("Bureau's name : " + this.bureau_name);
        System.out.println("Materials: ");
        for(Materials material : materials_Bureau) {
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
    
    public void add_material_to_Bureau(Materials item) {
        materials_Bureau.add(item);
    }
}
