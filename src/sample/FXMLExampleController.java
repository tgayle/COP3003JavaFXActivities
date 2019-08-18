package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class FXMLExampleController {
  @FXML
  private Text actiontarget;

  @FXML
  public void handleSubmitButtonAction(ActionEvent actionEvent) {
    actiontarget.setText("Sign in button pressed!");
  }
}
