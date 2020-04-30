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
import org.example.model.CoronaFranceRepo;

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
    Button btn_exit = new Button();
    @FXML
    VBox vbox = new VBox();

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void exit() {
        Platform.exit();
        System.exit(0);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        try {
            CoronaFranceRepo coronaFranceRepo = new CoronaFranceRepo();

            label_test.setText(String.valueOf(coronaFranceRepo.getCases()));
            label_today.setText(String.valueOf(coronaFranceRepo.getTodayDeaths()));
            label_deaths.setText(String.valueOf(coronaFranceRepo.getDeaths()));
            label_critical.setText(String.valueOf(coronaFranceRepo.getCriticals()));
            label_actif.setText(String.valueOf(coronaFranceRepo.getActive()));
            label_guerie.setText(String.valueOf(coronaFranceRepo.getRecovered()));
             } catch (IOException e) {
                 e.printStackTrace();
        }
        initializeContextMenu();
    }

    private void initializeContextMenu(){
        MenuItem exitItem = new MenuItem("Exit");
        exitItem.setOnAction(event ->{
            System.exit(0);
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

