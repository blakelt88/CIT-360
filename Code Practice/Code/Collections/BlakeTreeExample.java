
package cit360;

/**
 *
 * @author Blake Turley
 */
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class BlakeTreeExample {

   public static void main (String[] args) {
      
       // HashMaps won't have a set order when it prints
       HashMap<Double, String> hashMap = new HashMap<>(); 
       // LinkedHashMaps do stay in order when printed
       LinkedHashMap<Double, String> linkedHashMap = new LinkedHashMap<>();
       // TreeMaps stay in order by list
       TreeMap<Double, String> treeMap = new TreeMap<>();
       
       // Explanatory statements for what object is
       
       String varHash = "Hash Map Example (Caliber and Weapon)";    
       
       String varTreeMap = "Tree Map Example (Caliber and Weapon)";
       
       String varLinkedHash = "Linked Hash Map ";
       
       // Double and String format
       caliberMap(varHash, hashMap);
       
       caliberMap(varLinkedHash, linkedHashMap);
       
       caliberMap(varTreeMap, treeMap);
   }
   
   public static void caliberMap(String w, Map<Double, String> weaponMap) {
       // Values for the maps
       weaponMap.put(7.62, "SKS");
       weaponMap.put(.308, "M24");
       weaponMap.put(5.56, "M4A1");
       weaponMap.put(.9, "Beretta 9");
       weaponMap.put(.45, "Vector");
       weaponMap.put(.30, "AWM");
       
       // Type of map will be printed out
       System.out.println(w); 
       // Print the key and values of the maps in for loop
       // Prints to make a return
           System.out.println();
       for (Double ammo: weaponMap.keySet()) {
           String weapon = weaponMap.get(ammo);
           
       // Printing out the final statement
           System.out.println("The " + weapon + " shoots " + ammo + "mm ammunition");
       }
        System.out.println();
   }

}
