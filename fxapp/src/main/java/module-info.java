module com.twitter.teruteru.fxapp {
    requires transitive javafx.controls;
    requires transitive javafx.fxml;
    requires transitive javafx.graphics;

    opens com.twitter.teruteru128.application to javafx.graphics, javafx.fxml;
}
