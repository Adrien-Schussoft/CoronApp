package org.example.model;

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
    private String defautChoice;

    CoronaParserImpl coronaParser = new CoronaParserImpl();

    public CoronaRepo() throws IOException {

        setDefautChoice("france");
        setCountry(coronaParser.parserUniv(defautChoice).getString("country"));
        setCases(coronaParser.parserUniv(defautChoice).getInt("critical"));
        setCriticals(coronaParser.parserUniv(defautChoice).getInt("critical"));
        setTodayCases(coronaParser.parserUniv(defautChoice).getInt("todayCases"));
        setDeaths(coronaParser.parserUniv(defautChoice).getInt("deaths"));
        setTodayCases(coronaParser.parserUniv(defautChoice).getInt("deaths"));
        setRecovered(coronaParser.parserUniv(defautChoice).getInt("recovered"));
        setActive(coronaParser.parserUniv(defautChoice).getInt("active"));
    }

    public String getCountry() { return this.country; }

    public int getCriticals() {
        return this.criticals;
    }

    public int getCases() { return this.cases; }

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

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCriticals(int criticals) {
        this.criticals = criticals;
    }

    public void setCases(int cases) {
        this.cases = cases;
    }

    public void setTodayCases(int todayCases) {
        this.todayCases = todayCases;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public void setTodayDeaths(int todayDeaths) {
        this.todayDeaths = todayDeaths;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public void setDefautChoice(String defautChoice) {
        this.defautChoice = defautChoice;
    }
}
