package com.mycompany.tp6_part2;

import java.util.ArrayList;

public class Block {

    public String Block_Name;

    public String Block_Localisation;

    public String WallsColor;

    public Departement dept;

    private ArrayList<Building> buildings;

    public Block(String Block_Name, String Block_Localisation, String WallsColor) {
        this.Block_Name = Block_Name;
        this.Block_Localisation = Block_Localisation;
        this.WallsColor = WallsColor;
    }

    public void setBuildings(ArrayList<Building> building) {
        this.buildings = building;
    }
}
