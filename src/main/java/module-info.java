module com.example.javamasterclassjavafx {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.javamasterclassjavafx to javafx.fxml;
    exports com.example.javamasterclassjavafx;
}