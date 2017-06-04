
package acp;

import java.util.ArrayList;

/**
 *
 * @author Blake
 */
 
public interface PUBGTeamInviteHandler {
    
    // The handler is the smallest portion of the Application Controller Patter
    // This one handles the list of String Arrays and the Integer PlayerID
    
    public void HandleInvites(Integer playerID, ArrayList<String>... PUBGArray);
/**
 *
 * @author Blake
 */
}
