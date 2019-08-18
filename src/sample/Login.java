package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Welcome");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text sceneTitle = new Text("Welcome");
        sceneTitle.setId("welcome-text");
        grid.add(sceneTitle, 0, 0);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userNameTextField = new TextField();
        grid.add(userNameTextField, 1, 1);

        Label password = new Label("Password:");
        grid.add(password, 0, 2);

        PasswordField passwordBox = new PasswordField();
        grid.add(passwordBox, 1, 2);

        Button signInBtn = new Button("Sign in");
        HBox btnHbox = new HBox(10);
        btnHbox.setAlignment(Pos.BOTTOM_RIGHT);
        btnHbox.getChildren().add(signInBtn);
        grid.add(btnHbox, 1, 4);

        final Text actionTarget = new Text();
        actionTarget.setId("actiontarget");
        grid.add(actionTarget, 1, 6);

        signInBtn.setOnAction(event -> {
            actionTarget.setText("Sign in button clicked!");
        });

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        scene.getStylesheets().add(Login.class.getResource("Login.css").toExternalForm());
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
