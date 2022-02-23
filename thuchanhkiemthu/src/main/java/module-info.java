module com.nhn.thuchanhkiemthu {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.nhn.thuchanhkiemthu to javafx.fxml;
    exports com.nhn.thuchanhkiemthu;
}
