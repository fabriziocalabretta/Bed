module org.fc.bed {
    requires javafx.controls;
    requires java.desktop;
    requires java.logging;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;
    requires javafx.swing;

    opens org.fc.bed to javafx.fxml;
    exports org.fc.bed;
    // exports org.fc.bed;
    exports org.fc.io;
    exports org.fc.hdm;
}