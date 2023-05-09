package com.mycompany.tp6_part2;

import java.util.ArrayList;

public abstract class Building {

    public int building_id;

    public String building_name;

    protected double building_area;

    protected int Capacity;

    public Block block;

    public ArrayList<Materials> materials;

    public Building(int building_id, String building_name, double building_area, int cap) {
        this.building_id = building_id;
        this.building_name = building_name;
        this.building_area = building_area;
        this.Capacity = cap;
    }

    public void occupation() {
    }
}
