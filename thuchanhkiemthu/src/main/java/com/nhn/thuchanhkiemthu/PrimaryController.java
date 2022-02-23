package com.nhn.thuchanhkiemthu;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    private void huhu(){
        int a = 10;
        int b = 100;
        int c = a + b;
    }
}
