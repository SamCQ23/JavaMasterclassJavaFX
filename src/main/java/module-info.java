module com.example.javamasterclassjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.xml;
    requires java.sql;


    opens com.example.javamasterclassjavafx to javafx.fxml;
    exports com.example.javamasterclassjavafx;

    opens com.example.javamasterclassjavafx.controls to javafx.fxml;
    exports com.example.javamasterclassjavafx.controls;

    opens com.example.javamasterclassjavafx.EventHandling to javafx.fxml;
    exports com.example.javamasterclassjavafx.EventHandling;

    opens com.example.javamasterclassjavafx.ToDoList to javafx.fxml;
    exports com.example.javamasterclassjavafx.ToDoList;

    opens com.example.javamasterclassjavafx.JavaFXApplication to javafx.fxml;
    exports com.example.javamasterclassjavafx.JavaFXApplication;

    opens com.example.javamasterclassjavafx.SceneBuilder to javafx.fxml;
    exports com.example.javamasterclassjavafx.SceneBuilder;

    opens com.example.javamasterclassjavafx.video459Challenge to javafx.fxml;
    exports com.example.javamasterclassjavafx.video459Challenge;

    opens com.example.javamasterclassjavafx.video459Challenge.dataModel to javafx.fxml;
    exports com.example.javamasterclassjavafx.video459Challenge.dataModel;

    opens com.example.javamasterclassjavafx.DBGUI to javafx.fxml;
    exports com.example.javamasterclassjavafx.DBGUI;

    opens com.example.javamasterclassjavafx.DBGUI.model to java.base;
    exports com.example.javamasterclassjavafx.DBGUI.model;
}