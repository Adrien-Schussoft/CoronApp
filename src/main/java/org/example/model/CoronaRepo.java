package org.example.model;

import java.io.IOException;

public class CoronaRepo {

    private String defautChoice;
    private CoronaParserImpl coronaParser = new CoronaParserImpl();
    private CoronaEntity coronaEntity = new CoronaEntity();

    public CoronaRepo(String defautChoice) throws IOException {

        coronaEntity.setCountry(coronaParser.parserUniv(defautChoice).getString("country"));
        coronaEntity.setCases(coronaParser.parserUniv(defautChoice).getInt("cases"));
        coronaEntity.setCriticals(coronaParser.parserUniv(defautChoice).getInt("critical"));
        coronaEntity.setTodayCases(coronaParser.parserUniv(defautChoice).getInt("todayCases"));
        coronaEntity.setDeaths(coronaParser.parserUniv(defautChoice).getInt("deaths"));
        coronaEntity.setTodayDeaths(coronaParser.parserUniv(defautChoice).getInt("todayDeaths"));
        coronaEntity.setRecovered(coronaParser.parserUniv(defautChoice).getInt("recovered"));
        coronaEntity.setActive(coronaParser.parserUniv(defautChoice).getInt("active"));
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
        return defautChoice;
    }

    public void setDefautChoice(String defautChoice) {
        this.defautChoice = defautChoice;
    }

    public void setCoronaParser(CoronaParserImpl coronaParser) {
        this.coronaParser = coronaParser;
    }

    public void setCoronaEntity(CoronaEntity coronaEntity) {
        this.coronaEntity = coronaEntity;
    }
}
