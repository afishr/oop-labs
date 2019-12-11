package lab8;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Basic Calculator v1.0");
		
		TextField field = new TextField();
		
		Button btn = new Button();
		btn.setText("Say 'Hello World'");
		btn.setOnAction(e -> System.out.println("Hey there"));
		
		VBox root = new VBox(20);

		root.getChildren().addAll(field, btn);
		primaryStage.setScene(new Scene(root, 300, 250));
		primaryStage.show();
	}
}