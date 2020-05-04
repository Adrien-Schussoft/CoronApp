package org.example;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import org.example.model.CoronaRepo;
import org.example.model.CoronaParserImpl;

public class PrimaryController implements Initializable {

    @FXML
    Label label_test = new Label();
    @FXML
    Label label_today = new Label();
    @FXML
    Label label_deaths = new Label();
    @FXML
    Label label_critical = new Label();
    @FXML
    Label label_actif = new Label();
    @FXML
    Label label_guerie = new Label();
    @FXML
    Label label_country = new Label();
    @FXML
    Label label_todayCases = new Label();
    @FXML
    Label label_info = new Label();
    @FXML
    TextField txtfield_choice = new TextField();
    @FXML
    Button btn_search = new Button();
    @FXML
    VBox vbox = new VBox();

    @FXML
    private void exit() {
        Platform.exit();
        System.exit(0);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        try {
            CoronaRepo coronaRepo = new CoronaRepo();
            label_info.setText("");
            label_country.setText(String.valueOf(coronaRepo.getCountry()));
            label_test.setText(String.valueOf(coronaRepo.getCases()));
            label_todayCases.setText(String.valueOf(coronaRepo.getTodayCases()));
            label_today.setText(String.valueOf(coronaRepo.getTodayDeaths()));
            label_deaths.setText(String.valueOf(coronaRepo.getDeaths()));
            label_critical.setText(String.valueOf(coronaRepo.getCriticals()));
            label_actif.setText(String.valueOf(coronaRepo.getActive()));
            label_guerie.setText(String.valueOf(coronaRepo.getRecovered()));
             } catch (IOException e) {
                 e.printStackTrace();
        }
        initializeContextMenu();
    }

    @FXML
    private void setCountryChoicedData() {

        try {
            CoronaParserImpl coronaParser = new CoronaParserImpl();
            if (!txtfield_choice.getText().isBlank()) {
                label_info.setText("");
                label_country.setText(String.valueOf(coronaParser.parserUniv(txtfield_choice.getText()).getString("country")));
                label_test.setText(String.valueOf(coronaParser.parserUniv(txtfield_choice.getText()).getInt("cases")));
                label_today.setText(String.valueOf(coronaParser.parserUniv(txtfield_choice.getText()).getInt("todayDeaths")));
                label_deaths.setText(String.valueOf(coronaParser.parserUniv(txtfield_choice.getText()).getInt("deaths")));
                label_critical.setText(String.valueOf(coronaParser.parserUniv(txtfield_choice.getText()).getInt("critical")));
                label_actif.setText(String.valueOf(coronaParser.parserUniv(txtfield_choice.getText()).getInt("active")));
                label_guerie.setText(String.valueOf(coronaParser.parserUniv(txtfield_choice.getText()).getInt("recovered")));
            }
        }catch(Exception e){
            label_info.setText("Ce pays n'existe pas !");
        }
    }

    private void initializeContextMenu(){
        MenuItem exitItem = new MenuItem("Exit");
        exitItem.setOnAction(event ->{
            exit();
        });
        final ContextMenu contextMenu = new ContextMenu(exitItem);
        vbox.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
            if(event.isSecondaryButtonDown()){
                contextMenu.show(vbox,event.getScreenX(),event.getScreenY());
            }else{
                if(contextMenu.isShowing()){
                    contextMenu.hide();
                }
            }
        });
    }

    }

