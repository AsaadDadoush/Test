package GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class EditScene extends Application{
	
	
	Stage window;
	Button button;
	 
	@Override
	public void start(Stage primaryStage) {
	
	//window	
	window = primaryStage;
	window.setTitle("Editor");
	 
	//button
	button = new Button("Click");
	button.setOnAction(e -> AlertForEdit.display("title", "lol fool"));
	
	//pane
	StackPane layout = new StackPane();
	layout.getChildren().add(button);
	
	//scene
	Scene scene = new Scene(layout,300,250);
	window.setScene(scene);
	window.show();
	
	}
	

	public static void main(String[] args) {
		launch(args);

	}

}
