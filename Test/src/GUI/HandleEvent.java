package GUI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandleEvent extends Application {
	
	Button btOk = new Button("OK");
	Button btCancel = new Button("Cancel");
	Stage window; 
	
	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
		
		//Pane
		HBox pane = new HBox(10);
		pane.setAlignment(Pos.TOP_CENTER);
		pane.setPadding(new Insets(34));
		pane.getChildren().addAll(btOk,btCancel);
		
		//
		btOk.setOnAction(e ->
		System.out.println("OK button clicked\n"));
		btCancel.setOnAction(e ->
		System.out.println("Cancel button clicked\n"));
		
		//Scene window
		Scene scene = new Scene(pane);
		window.setScene(scene);
		window.setTitle("Handle Event");
		window.show();
	}
	

	public static void main(String[] args) {
		
		launch(args);
	}

}
