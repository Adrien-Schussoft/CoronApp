package org.example.model;

import org.json.JSONObject;

import java.io.IOException;

public class CoronaFranceRepo {

    private int criticals;
    private int cases;
    private int todayCases;
    private int deaths;
    private int todayDeaths;
    private int recovered;
    private int active;

    CoronaParserFrance coronaParserFrance = new CoronaParserFrance();

    public CoronaFranceRepo() throws IOException {

        cases = coronaParserFrance.parser().getInt("cases");
        criticals = coronaParserFrance.parser().getInt("critical");
        todayCases = coronaParserFrance.parser().getInt("todayCases");
        deaths = coronaParserFrance.parser().getInt("deaths");
        todayDeaths = coronaParserFrance.parser().getInt("todayDeaths");
        recovered = coronaParserFrance.parser().getInt("recovered");
        active = coronaParserFrance.parser().getInt("active");
    }

//Getters

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
