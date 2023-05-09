package com.mycompany.tp6_part2;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        String logo="https://www.esi-sba.dz/fr/wp-content/uploads/2020/10/Logo-Complet-ESI-SBA-200mm-x-200mm_couleur-500x500.png";
        // create the Esi-sba institution
        Institution Esi = new Institution(0, "High School", "8 Mai 1945-Sidi-bel-abbes", "+21348749452 ", logo);
        // create new department called second cycle
        Departement preparatoireCycle = new Departement(0, "second cycle", "code", "Amrane abdelkader", "contact@esi-sba.dz");
        Departement departements [] = {null, preparatoireCycle};
        // add the second cycle department to Esi institution
        Esi.setDepartement(departements);
        // creation of one service the teaching service
        Service TeachingServise = new Service_Teaching("2020", "20", "2020", "2021");
        // creation of one block that will holds the salles or even Amphis
        Block block_A1 = new Block("A1", "left", "white") ;
        // creation of one amphi called AmphiA
        Amphitheater AmphiA = new Amphitheater(0, "Amphi D", 100.0, 1000, true);
        Salle Salle_1  =  new Salle("20 Tables", 0, "Salle 14", 20.0, 20);
        TP_Salle Salle_TP1  =  new TP_Salle("20 Tables", 0, "Salle 16", 20.0, 20, true);
        // creating of set of computers and one datashow
        Materials PC1 = new PC(1,"001" , "01/01/2020", "i7", "16G");
        Materials PC2 = new PC(2, "002", "02/01/2020", "i7", "16G");
        Materials PC3 = new PC(3, "003", "03/01/2020", "i7", "16G");
        Materials PC4 = new PC(4, "004", "04/01/2020", "i7", "16G");
        Materials datashow = new DataShow(5, "1122352512", "05/01/2020", "Epson");
        // add the matiriels to our Tp salle
        Salle_TP1.add_material_to_TPSalle(PC1);
        Salle_TP1.add_material_to_TPSalle(PC2);
        Salle_TP1.add_material_to_TPSalle(PC3);
        Salle_TP1.add_material_to_TPSalle(PC4);
        Salle_TP1.add_material_to_TPSalle(datashow);
        Salle_TP1.print_salleTP_infos();
        // add our TP salle of type building to the block block_A1
        block_A1.setBuildings(new ArrayList(Arrays.asList(Salle_TP1)) );  
        
    }
}
