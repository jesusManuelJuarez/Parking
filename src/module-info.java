module Parking {
    requires javafx.fxml;
    requires javafx.controls;
    requires java.logging;

    opens sample;
    opens sample.Controller;
    opens sample.View;
}