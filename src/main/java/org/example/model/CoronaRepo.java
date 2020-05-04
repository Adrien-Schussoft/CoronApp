package org.example.model;

import org.json.JSONObject;

import java.io.IOException;

public class CoronaRepo {

    private String country;
    private int criticals;
    private int cases;
    private int todayCases;
    private int deaths;
    private int todayDeaths;
    private int recovered;
    private int active;

    CoronaParserImpl coronaParser = new CoronaParserImpl();

    public CoronaRepo() throws IOException {

        String defautChoice = "france";

        country = coronaParser.parserUniv(defautChoice).getString("country");
        cases = coronaParser.parserUniv(defautChoice).getInt("cases");
        criticals = coronaParser.parserUniv(defautChoice).getInt("critical");
        todayCases = coronaParser.parserUniv(defautChoice).getInt("todayCases");
        deaths = coronaParser.parserUniv(defautChoice).getInt("deaths");
        todayDeaths = coronaParser.parserUniv(defautChoice).getInt("todayDeaths");
        recovered = coronaParser.parserUniv(defautChoice).getInt("recovered");
        active = coronaParser.parserUniv(defautChoice).getInt("active");
    }

//Getters

    public String getCountry() { return this.country; };

    public int getCriticals() {
        return this.criticals;
    }

    public int getCases() {
        return  this.cases;
    }

    public int getTodayCases() {
        return this.todayCases;
    }

    public int getDeaths() {
        return this.deaths;
    }

    public int getTodayDeaths() {
        return this.todayDeaths;
    }

    public int getRecovered() {
        return this.recovered;
    }

    public int getActive() {
        return this.active;
    }
}
