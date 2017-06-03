/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

/**
 *
 * @author Blake
 */

public class PUBGPlayerLoadoutChoice {
    
    // Event setup

    public static void main(String[] args){
        PUBGModel model = inputLoadout();

        PUBGView view = new PUBGView();

        PUBGController PUBGcontroller;
        PUBGcontroller = new PUBGController(model, view);        
        
        // Bringing item from model
        
        PUBGcontroller.PUBGLoadInformation();
        
        // First controller item
        
        PUBGcontroller.set_player_name("Blake");
        PUBGcontroller.set_primary_choice("Silenced SKS");
        PUBGcontroller.set_secondary_choice("Silenced UMP9");
        PUBGcontroller.set_tertiary_choice("None for more inventory space");
        PUBGcontroller.set_utility_choice("Frag Grenade");
        PUBGcontroller.set_backpack_choice("Level 3");
        PUBGcontroller.set_armor_choice("Level 3");
        PUBGcontroller.set_helmet_choice("Level 3");

        PUBGcontroller.PUBGLoadInformation();
        
        // Second controller item
        
        PUBGcontroller.set_player_name("Travis S");
        PUBGcontroller.set_primary_choice("Silenced SCAR");
        PUBGcontroller.set_secondary_choice("Silenced Khar 98");
        PUBGcontroller.set_tertiary_choice("None for more inventory space");
        PUBGcontroller.set_utility_choice("Frag Grenade");
        PUBGcontroller.set_backpack_choice("Level 3");
        PUBGcontroller.set_armor_choice("Level 3");
        PUBGcontroller.set_helmet_choice("Level 3");

        PUBGcontroller.PUBGLoadInformation2();
        
        // Third controller item
        
        PUBGcontroller.set_player_name("Brett");
        PUBGcontroller.set_primary_choice("Silenced AKM");
        PUBGcontroller.set_secondary_choice("Silenced Khar 98");
        PUBGcontroller.set_tertiary_choice("None for more inventory space");
        PUBGcontroller.set_utility_choice("Smoke Grenade");
        PUBGcontroller.set_backpack_choice("Level 3");
        PUBGcontroller.set_armor_choice("Level 3");
        PUBGcontroller.set_helmet_choice("Level 3");

        PUBGcontroller.PUBGLoadInformation3();

    }

    private static PUBGModel inputLoadout(){
        PUBGModel PUBGModel = new PUBGModel();
        
        // Item being brought into the controller
        
        PUBGModel.set_player_name("Travis K");
        PUBGModel.set_primary_choice("VSS");
        PUBGModel.set_secondary_choice("Silenced AKM");
        PUBGModel.set_tertiary_choice("None for more inventory space");
        PUBGModel.set_utility_choice("Smoke Grenade");
        PUBGModel.set_backpack_choice("Level 3");
        PUBGModel.set_armor_choice("Level 3");
        PUBGModel.set_helmet_choice("Level 3");

        return PUBGModel;
    }

}

