module Pomodoro {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.media;

    opens com.teamtreehouse.pomodoro to javafx.fxml;
    opens com.teamtreehouse.pomodoro.controller to javafx.fxml;
    exports com.teamtreehouse.pomodoro;

}