package org.example.model;

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

    public CoronaFranceRepo(){
    }

    private int criticals(int criticals) throws IOException {
        criticals = coronaParserFrance.parser().getInt("critical");
        return criticals;
    }

    private int cases(int cases) throws IOException {
        cases = coronaParserFrance.parser().getInt("cases");
        return cases;
    }

    private int todayCases(int todayCases) throws IOException {
        todayCases = coronaParserFrance.parser().getInt("todayCases");
        return todayCases;
    }

    private int deaths(int deaths) throws IOException {
        deaths = coronaParserFrance.parser().getInt("deaths");
        return deaths;
    }

    private int todayDeaths(int todayDeaths) throws IOException {
        todayDeaths = coronaParserFrance.parser().getInt("todayDeaths");
        return todayDeaths;
    }

    private int recovered(int recovered) throws IOException {
        recovered = coronaParserFrance.parser().getInt("recovered");
        return recovered;
    }

    private int active(int active) throws IOException {
        active = coronaParserFrance.parser().getInt("active");
        return active;
    }

//Getters

    public int getCriticals() throws IOException {
        return this.criticals(criticals);
    }

    public int getCases() throws IOException {
        return  this.cases(cases);
    }

    public int getTodayCases() throws IOException{
        return this.todayCases(todayCases);
    }

    public int getDeaths() throws  IOException {
        return this.deaths(deaths);
    }

    public int getTodayDeaths() throws IOException {
        return this.todayDeaths(todayDeaths);
    }

    public int getRecovered() throws IOException {
        return this.recovered(recovered);
    }

    public int getActive() throws IOException {
        return this.active(active);
    }
}
