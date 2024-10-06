module saracoglu.module05part2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens saracoglu.module05part2 to javafx.fxml;
    exports saracoglu.module05part2;
}