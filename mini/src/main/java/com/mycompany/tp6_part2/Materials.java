package com.mycompany.tp6_part2;

public abstract class Materials {

    public int id;

    public String regestration_number;

    public String date_installation;
    
    public String type;

    public Materials(int id, String re, String di, String t) {
        this.id = id;
        this.regestration_number =re;
        this.date_installation = di;
        this.type = t;
    }

    public void print_material_infos(Materials material) {
        if (material instanceof PC) {
                    ((PC) material).print_info();
                } else if (material instanceof Accessoires) {
                    ((Accessoires) material).print_info();
                }  else if (material instanceof Printer) {
                    ((Printer) material).print_info();
                }  else {
                    ((DataShow) material).print_info();
                }
    }

}
