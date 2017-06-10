
package httpurlrequest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author Blake
 */

public class HttpURLRequest {
    public static void main(String[] args) throws Exception {
        
        // Declaring the Http URL Request
        
        HttpURLRequest SteamRequest = new HttpURLRequest();
        
        // Just a custom output when the request begins
        
        System.out.println("Loading up retreival parameters.");
        SteamRequest.getInformation();
    }
    
    private void getInformation() throws Exception {
        
        // URL being called
        String PUBGURL = "http://store.steampowered.com/app/578080/PLAYERUNKNOWNS_BATTLEGROUNDS/";
        
        // Assigning theURL to PUBGURL
        
        URL theURL = new URL(PUBGURL);
        
        // Beginning connection
        
        HttpURLConnection SteamConnect = (HttpURLConnection) theURL.openConnection();
        
        // getResponse to pull the reaponse
        
        int getResponse = SteamConnect.getResponseCode();
        
        // Custom message saying what is happening
        
        System.out.println("\nSending request to Steam.");

        BufferedReader RequestReader = new BufferedReader (
                new InputStreamReader(SteamConnect.getInputStream()));
        
        // Displaying output as a string (HTML CODE)
        
        String inputLine;
        StringBuffer response = new StringBuffer();
        
        while ((inputLine = RequestReader.readLine()) !=null) {
            response.append(inputLine);
        }
        RequestReader.close();
        System.out.println(response.toString());
    } 
}

