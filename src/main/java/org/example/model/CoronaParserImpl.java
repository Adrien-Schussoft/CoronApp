package org.example.model;

import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class CoronaParserImpl implements ICoronaParser {

    @Override
    public JSONObject parserUniv(String country) throws IOException {
        country = country.replace(" ", "%20");
        String url = "https://coronavirus-19-api.herokuapp.com/countries/"+country;
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-agent", "Mozzila/5.0");
        int responseCode = con.getResponseCode();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response1 = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response1.append(inputLine);
        }
        JSONObject jso = new JSONObject(response1.toString());//JSONObject contenant response1
        in.close();

        return jso;
    }

    public static int StringSearch(String phrase, String lettre) {

        int compteur = 0;
        phrase = phrase.trim();
        for (int i = 0; i < phrase.length() - 1; i++) {
            if (phrase.substring(i, i + 1).contentEquals(lettre)) {
                compteur++;
            }
        }
        //System.out.println(compteur);
        return compteur;
    }
}
