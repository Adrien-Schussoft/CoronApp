package org.example.model;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CoronaParserFrance {

    public JSONObject parser() throws IOException {

            String url = "https://coronavirus-19-api.herokuapp.com/countries/france";
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
            JSONObject jso = new JSONObject(response1.toString()); //JSONObject contenant response1
            in.close();

        return jso;
    }
}
