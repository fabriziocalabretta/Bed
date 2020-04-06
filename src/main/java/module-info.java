module org.fc.bed {
	requires transitive java.desktop;
    requires java.logging;
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;
    requires javafx.swing;

    opens org.fc.bed to javafx.fxml;
    exports org.fc.bed;
    // exports org.fc.bed;
    exports org.fc.io;
    exports org.fc.hdm;
    exports org.fc.utils;
}