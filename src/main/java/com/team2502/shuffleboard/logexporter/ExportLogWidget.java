package com.team2502.shuffleboard.logexporter;

import edu.wpi.first.shuffleboard.api.data.types.NoneType;
import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.ParametrizedController;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

@Description(dataTypes = {NoneType.class}, name = "Export logs")
@ParametrizedController(value = "com.team2502.shuffleboard.logexporter/ExportLogWidget.fxml")
public class ExportLogWidget extends SimpleAnnotatedWidget {

    public Pane getView() {
        return this.pane;
    }

    @FXML
    private Pane pane;

    @FXML
    private void onExportLog(ActionEvent e) {
        System.out.println("fds");
    }
}
