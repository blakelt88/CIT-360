
package cit360;

/**
 *
 * @author Blake
 */

public class PUBGController {
    
    // Controller setup
    
    // Declaration of the pubgMODEL and the View
    
    private PUBGModel model;
    private PUBGView view;

    public PUBGController(PUBGModel pubgMODEL, PUBGView view){
        this.pubgMODEL = model;
        this.view = view;
    }
    
    // Setting the player_name
    
    public void set_player_name(String player_name){
        pubgMODEL.set_player_name(player_name);
    }
    
    // Getting the player_name
    
    public String get_player_name(){
        return pubgMODEL.get_player_name();
    }
    
    // Setting the primary_choice
    
    public void set_primary_choice(String primary_choice){
        pubgMODEL.set_primary_choice(primary_choice);
    }
    
    // Geting the primary_choice
   
    public String get_primary_choice(){
        return pubgMODEL.get_primary_choice();
    }
    
    // Setting the secondary_choice
    
    public void set_secondary_choice(String secondary_choice){
        pubgMODEL.set_secondary_choice(secondary_choice);
    }
    
    // Getting the secondary_choice

    public String get_secondary_choice(){
        return pubgMODEL.get_secondary_choice();
    }
    
    // Setting the tertiary_choice

    public void set_tertiary_choice(String tertiary_choice){
        pubgMODEL.set_tertiary_choice(tertiary_choice);
    }
    
    // Getting the tertiary_choice

    public String get_tertiary_choice(){
        return pubgMODEL.get_tertiary_choice();
    }
    
    // Setting the utility_choice
    
    public void set_utility_choice(String utility_choice){
        pubgMODEL.set_utility_choice(utility_choice);
    }
    
    // Getting the utility_choice

    public String get_utility_choice(){
        return pubgMODEL.get_utility_choice();
    }
    
    // Getting the backpack_choice
    
    public void set_backpack_choice(String backpack_choice){
        pubgMODEL.set_backpack_choice(backpack_choice);
    }
    
    // Getting the backpack_choice

    public String get_backpack_choice(){
        return pubgMODEL.get_backpack_choice();
    }
    
    // Getting the armor_choice
    
    public void set_armor_choice(String armor_choice){
        pubgMODEL.set_armor_choice(armor_choice);
    }
    
    // Getting the armor_choice

    public String get_armor_choice(){
        return pubgMODEL.get_armor_choice();
    }
    
    // Getting the helmet_choice
    
    public void set_helmet_choice(String helmet_choice){
        pubgMODEL.set_helmet_choice(helmet_choice);
    }
    
    // Getting the helmet_choice

    public String get_helmet_choice(){
        return pubgMODEL.get_helmet_choice();
    }
    
    // Printing or loading the information for each player
    
    public void PUBGLoadInformation(){
        view.inputLoadout(pubgMODEL.get_player_name(),pubgMODEL.get_primary_choice(),pubgMODEL.get_secondary_choice(),pubgMODEL.get_tertiary_choice(),pubgMODEL.get_utility_choice(),pubgMODEL.get_backpack_choice(),pubgMODEL.get_armor_choice(),pubgMODEL.get_helmet_choice());
    }
    
    public void PUBGLoadInformation2() {
        view.inputLoadout(pubgMODEL.get_player_name(),pubgMODEL.get_primary_choice(),pubgMODEL.get_secondary_choice(),pubgMODEL.get_tertiary_choice(),pubgMODEL.get_utility_choice(),pubgMODEL.get_backpack_choice(),pubgMODEL.get_armor_choice(),pubgMODEL.get_helmet_choice());
    }
    
    public void PUBGLoadInformation3() {
        view.inputLoadout(pubgMODEL.get_player_name(),pubgMODEL.get_primary_choice(),pubgMODEL.get_secondary_choice(),pubgMODEL.get_tertiary_choice(),pubgMODEL.get_utility_choice(),pubgMODEL.get_backpack_choice(),pubgMODEL.get_armor_choice(),pubgMODEL.get_helmet_choice());
    }
}
