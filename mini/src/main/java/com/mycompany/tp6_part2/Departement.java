package com.mycompany.tp6_part2;

import java.util.ArrayList;

public class Departement {

    public int id;

    public String DepartmentName;

    private String Code;

    private String HeadName;

    private String Email;

    public Institution inst;

    public ArrayList<Block> bl_liste= new ArrayList<>();

    public Departement(int id, String DepartementName, String Code, String HeadName, String Email) {
        this.DepartmentName = DepartementName;
        this.id = id;
        this.Code = Code;
        this.HeadName = HeadName;
        this.Email = Email;
        //this.bl_liste = bl;
        //this.inst = inst;
    }

    public void print_departement_infos() {
        System.out.println("Dept's ID : " + this.id);
        System.out.println("Dept's Name : " + this.DepartmentName); 
        System.out.println("Dept's Code : " + this.Code);
        System.out.println("Dept's Head Name : " + this.HeadName);
        System.out.println("Dept's Email Adress : " + this.Email);
    }

    public void getStudentList() {
    }
    
    public void setBlocks(Block block) {
        bl_liste.add(block);
    }
    
}
