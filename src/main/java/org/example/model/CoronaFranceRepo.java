package org.example.model;

import java.io.IOException;

public class CoronaFranceRepo {

    CoronaParserFrance coronaParserFrance = new CoronaParserFrance();

    public CoronaFranceRepo(){

    }

    public int getCriticals() throws IOException {

        int criticals = coronaParserFrance.parser().getInt("critical");
        return criticals;
    }

    public int getCases() throws IOException {
        int cases = coronaParserFrance.parser().getInt("cases");
        return cases;
    }

    public int getTodayCases() throws IOException {
        int todayCases = coronaParserFrance.parser().getInt("todayCases");
        return todayCases;
    }

    public int getDeaths() throws IOException {
        int deaths = coronaParserFrance.parser().getInt("deaths");
        return deaths;
    }

    public int getTodayDeaths() throws IOException {
        int todayDeaths = coronaParserFrance.parser().getInt("todayDeaths");
        return todayDeaths;
    }

    public int getRecovered() throws IOException {
        int recovered = coronaParserFrance.parser().getInt("recovered");
        return recovered;
    }

    public int getActive() throws IOException {
        int active = coronaParserFrance.parser().getInt("active");
        return active;
    }
}
