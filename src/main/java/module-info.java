module com.example.javamasterclassjavafx {
    requires javafx.controls;
    requires javafx.fxml;


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
}