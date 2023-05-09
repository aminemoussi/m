package com.mycompany.tp6_part2;

import java.util.ArrayList;

public class Institution {

    public int id;

    private String Type;

    private String Address;

    private String Phone_Number;

    private String Logo_Url;

    public Departement dpt_1;

    public Departement dpt_2;
    
    public ArrayList<Departement> dpt_list = new ArrayList<>();

    public Institution(int id, String Type, String Address, String Phone_Number, String Logo_Url) {
        this.id = id;
        this.Type = Type;
        this.Address = Address;
        this.Phone_Number = Phone_Number;
        this.Logo_Url = Logo_Url;
    }

    public static String[] main(String[] args) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void GraduateStudent() {
    }

    public void get_type() {
        System.out.print(this.Type);
    }

    public void set_type(String type) {
        this.Type = type;
    }

    public void get_address() {
        System.out.print(this.Address);
    }

    public void set_address(String address) {
        this.Address = address;
    }

    public void get_phonenumber() {
        System.out.print(this.Phone_Number);
    }

    public void set_phonenumber(String phonenumber) {
        this.Phone_Number = phonenumber;
    }

    public void get_logo_url() {
        System.out.print(this.Logo_Url);
    }

    public void set_logo_url(String logo_url) {
        this.Logo_Url= logo_url;
    }
    
    public void setDepartement(Departement [] dept) {
     this.dpt_1 = dept[0];
     this.dpt_2 = dept[1];
     dpt_list.add(dpt_1);
     dpt_list.add(dpt_2);
    }
}
