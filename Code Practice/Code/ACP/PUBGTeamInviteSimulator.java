
package acp;

import java.util.ArrayList;

/**
 *
 * @author Blake
 */
 
public class PUBGTeamInviteSimulator {

    public static void main(String[] args) {
        
        PUBGTeamInviteController PUBGController = new PUBGTeamInviteController();
        
    	// Offline and In Game status representation
    	String OfflineStatus = "Offline";
    	String InGameStatus = "In Game";
    		
        ArrayList<String> SteamFriendList = new ArrayList<>();
        ArrayList<String> TeamMembers = new ArrayList<>();
        
        String Status;
        Integer PlayerID, TeamMembersStatus;
        
	// Creating "friend list"
        
        SteamFriendList.add("Sa!t");
        SteamFriendList.add("TankEvanz");
        SteamFriendList.add("KuyaTurls");
        SteamFriendList.add("Master2Mind");
        SteamFriendList.add("Kuya Turls");
        SteamFriendList.add("BenignBrett");
        SteamFriendList.add("fegenbush");
        SteamFriendList.add("monkeybiscutz");
        SteamFriendList.add("bangawayne");

  /**
 *
 * @author Blake
 */
        
	// Sa!t called because they have Status = Online
				
        System.out.println("Invite Sent");
        Status = "Online";
        PlayerID = 0;
        PUBGController.handle(Status, PlayerID, SteamFriendList, TeamMembers);
        
        // Text output to "simulate" player being offline
        
        System.out.println("Invite Not Sent. Player is offline. \n");
        
        // Text output to "simulate" player being offline
        
        System.out.println("Invite Not Sent. Player is offline. \n");
        
        // Master2Mind called because they have Status = Online
        
        System.out.println("Invite Sent");
        Status = "Online";
        PlayerID = 3;
        PUBGController.handle(Status, PlayerID, SteamFriendList, TeamMembers);
        
        // Text output to "simulate" player being offline
        
        System.out.println("Invite Not Sent. Player is offline. \n");
        
        // BenignBrett called because they have Status = Online
        
        System.out.println("Invite Sent");
        Status = "Online";
        PlayerID = 5;
        PUBGController.handle(Status, PlayerID, SteamFriendList, TeamMembers);
        
  /**
 *
 * @author Blake
 */
        
        // Text output to "simulate" player being offline
        
        System.out.println("Invite Not Sent. Player is offline. \n");
        
        // Text output to "simulate" player being offline
        
        System.out.println("Invite Not Sent. Player is offline. \n");
        
        // Text output to "simulate" player being offline
        
        System.out.println("Invite Not Sent. Player is offline. \n");
        
}
}