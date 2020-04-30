package org.example.model;

import java.io.IOException;

public class CoronaFranceRepo {

    CoronaParserFrance coronaParserFrance = new CoronaParserFrance();

    public CoronaFranceRepo(){
    }

    private int criticals() throws IOException {
        int criticals = coronaParserFrance.parser().getInt("critical");
        return criticals;
    }

    private int cases() throws IOException {
        int cases = coronaParserFrance.parser().getInt("cases");
        return cases;
    }

    private int todayCases() throws IOException {
        int todayCases = coronaParserFrance.parser().getInt("todayCases");
        return todayCases;
    }

    private int deaths() throws IOException {
        int deaths = coronaParserFrance.parser().getInt("deaths");
        return deaths;
    }

    private int todayDeaths() throws IOException {
        int todayDeaths = coronaParserFrance.parser().getInt("todayDeaths");
        return todayDeaths;
    }

    private int recovered() throws IOException {
        int recovered = coronaParserFrance.parser().getInt("recovered");
        return recovered;
    }

    private int active() throws IOException {
        int active = coronaParserFrance.parser().getInt("active");
        return active;
    }

//Getters

    public int getCriticals() throws IOException {
        return this.criticals();
    }

    public int getCases() throws IOException {
        return  this.cases();
    }

    public int getTodayCases() throws IOException{
        return this.todayCases();
    }

    public int getDeaths() throws  IOException {
        return this.deaths();
    }

    public int getTodayDeaths() throws IOException {
        return this.todayDeaths();
    }

    public int getRecovered() throws IOException {
        return this.recovered();
    }

    public int getActive() throws IOException {
        return this.active();
    }
}
