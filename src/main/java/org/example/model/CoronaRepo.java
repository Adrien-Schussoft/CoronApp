package org.example.model;

import java.io.IOException;

public class CoronaRepo {

    private String defaultChoice;
    private CoronaParserImpl coronaParser = new CoronaParserImpl();
    private CoronaEntity coronaEntity = new CoronaEntity();

    public CoronaRepo(String defaultChoice) throws IOException {

        coronaEntity.setCountry(coronaParser.parserUniv(defaultChoice).getString("country"));
        coronaEntity.setCases(coronaParser.parserUniv(defaultChoice).getInt("cases"));
        coronaEntity.setCriticals(coronaParser.parserUniv(defaultChoice).getInt("critical"));
        coronaEntity.setTodayCases(coronaParser.parserUniv(defaultChoice).getInt("todayCases"));
        coronaEntity.setDeaths(coronaParser.parserUniv(defaultChoice).getInt("deaths"));
        coronaEntity.setTodayDeaths(coronaParser.parserUniv(defaultChoice).getInt("todayDeaths"));
        coronaEntity.setRecovered(coronaParser.parserUniv(defaultChoice).getInt("recovered"));
        coronaEntity.setActive(coronaParser.parserUniv(defaultChoice).getInt("active"));
    }

    public String getCountry() {
        return coronaEntity.getCountry(); }

    public int getCriticals() {
        return coronaEntity.getCriticals();
    }

    public int getCases() {
        return coronaEntity.getCases(); }

    public int getTodayCases() {
        return coronaEntity.getTodayCases();
    }

    public int getDeaths() {
        return coronaEntity.getDeaths();
    }

    public int getTodayDeaths() {
        return coronaEntity.getTodayDeaths();
    }

    public int getRecovered() {
        return coronaEntity.getRecovered();
    }

    public int getActive() {
        return coronaEntity.getActive();
    }

    public String getDefautChoice() {
        return defaultChoice;
    }

    public void setDefaultChoice(String defaultChoice) {
        this.defaultChoice = defaultChoice;
    }

    public void setCoronaParser(CoronaParserImpl coronaParser) {
        this.coronaParser = coronaParser;
    }

    public void setCoronaEntity(CoronaEntity coronaEntity) {
        this.coronaEntity = coronaEntity;
    }
}
