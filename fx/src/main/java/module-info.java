module com.twitter.teruteru.fx {
    requires transitive javafx.controls;
    requires transitive javafx.fxml;
    requires transitive javafx.graphics;
    requires org.twitter4j.core;

    opens com.twitter.teruteru128.study.fx.sample1 to javafx.graphics, javafx.fxml;
    opens com.twitter.teruteru128.study.fx.sample2 to javafx.graphics;
    opens com.twitter.teruteru128.study.fx.sample3 to javafx.graphics;
    opens com.twitter.teruteru128.study.fx.sample4 to javafx.graphics, javafx.fxml;
    opens com.twitter.teruteru128.study.fx.sample5 to javafx.graphics;
    opens com.twitter.teruteru128.study.fx.sample6 to javafx.graphics;
}
