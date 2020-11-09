package GUI;
import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Switch_Scene extends Application {

	Stage window;
	Scene scene1, scene2;
	@Override
		public void start(Stage primaryStage) {
			window = primaryStage;
			
			Label label1 = new Label("I love Switch");
			Button button1 = new Button("Click");
			button1.setOnAction(e -> window.setScene(scene2));
			
			// Layout
			VBox layout1 = new VBox(20);
			layout1.getChildren().addAll(label1,button1);
			scene1 = new Scene(layout1,200,200);

			Button button2 = new Button("The Scene XD");
			button2.setOnAction(e -> window.setScene(scene1));
			
			
			StackPane layout2 =	new StackPane();
			layout2.getChildren().addAll(button2);
			scene2 = new Scene(layout2, 600, 300);
			window.setScene(scene1);
			window.setTitle("YOO");
			window.show();
	}
	public static void main(String[] args) {
		launch(args);

	}

}
