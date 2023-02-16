package com.mycompany.mavenproject1;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        int isdf = 0;
        int a = 9;
        int b = 10;
        App.setRoot("secondary");
    }
}
