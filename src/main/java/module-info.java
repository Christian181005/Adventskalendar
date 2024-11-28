module htl.steyr.adventskalendar {
    requires javafx.controls;
    requires javafx.fxml;


    opens htl.steyr.adventskalendar to javafx.fxml;
    exports htl.steyr.adventskalendar;
}