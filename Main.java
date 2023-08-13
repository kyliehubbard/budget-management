package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.*;
import javafx.scene.*;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ExpandedBudget.fxml"));
            Scene myScene = new Scene(root, 200, 200);
            primaryStage.setScene(myScene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
