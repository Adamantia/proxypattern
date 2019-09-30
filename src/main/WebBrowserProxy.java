package main;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;


/**
 * Fill in the missing code below (1, 2 & 3)
 */
public class WebBrowserProxy implements WebBrowser {
    private String[] bannedDomains = {"instagram", "facebook", "linkedin"};
    /* ------- 1. missing attribute ----- */


    /* ------ 2. missing constructor ---- */

    @Override
    public void goToWebsite(String url) throws Exception {
        if (url.equals("exit")) {
            System.out.println("Doei");
            /* ---- 3. build the rest of the if/else logic to check for valid url format and
            if url contains banned domain (use functions below) ---- */
        }
    }


    // Check for valid url format
    private static boolean isValid(String url) {
        try {
            new URL(url).openStream().close();
        } catch (MalformedURLException e) {
            System.out.println("Je moet protocol http:// of https:// toevoegen");
            return false;
        } catch (IOException e) {
            System.out.println(e + " Probeer nog een keer.");
            return false;
        }

        return true;
    }

    // check if url contains banned domain
    private static boolean urlContainsBannedDomain(String url, String[] bannedDomains) {
        return Arrays.stream(bannedDomains).parallel().anyMatch(url::contains);
    }
}

