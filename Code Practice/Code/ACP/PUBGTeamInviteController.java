
package acp;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Blake
 */

public class PUBGTeamInviteController {
    
    // private Hashmap usage below
    
    private HashMap<String, PUBGTeamInviteHandler> controlHash = new HashMap<>();
    
    // public controller below
    
    public PUBGTeamInviteController() {
        
        // Creating need for Online to work
        
        InviteFriend PUBGInviteFriend = new InviteFriend();
        controlHash.put("Online", PUBGInviteFriend);
        
    }
    
    /**
 *
 * @author Blake
 */
    
    public void handle(String Status, Integer playerID, ArrayList<String>... PUBGArray) {
        
        // Retrieves value from Status
        
        PUBGTeamInviteHandler PUBGInvite = controlHash.get(Status);
        
        PUBGInvite.HandleInvites(playerID, PUBGArray);
        
    }
    
    
}
