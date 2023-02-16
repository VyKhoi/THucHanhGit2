package com.mycompany.mavenproject1;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        int isdf = 0;
<<<<<<< HEAD
        int a = 2;
        int b = 2;

=======
        int a = 9;
        int b = 10;
>>>>>>> c3d2346d78b71c965d8a4ddd8cef96ff928da516
        App.setRoot("secondary");
    }
}
