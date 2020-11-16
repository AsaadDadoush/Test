package GUI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ControlCircleWithoutEventHandling extends Application {
		
	Stage window;
	Button bt1 =  new Button("Enlarge");
	Button bt2 =  new Button("Shrink");
	
	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
		
		//pane for bt
		HBox root = new HBox(10);
		root.setAlignment(Pos.BOTTOM_CENTER);
		root.setPadding(new Insets(4));
		root.getChildren().addAll(bt1,bt2);
		root.setSpacing(10);
		
		//Stackpane for circle
		StackPane pane = new StackPane();
		Circle circle = new Circle(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		pane.getChildren().add(circle);
		
		//one pane for both Stack / HBox
		
		BorderPane Stack = new BorderPane();
		Stack.setCenter(pane);
		Stack.setBottom(root);
		
		//eventHandler
		bt1.setOnAction(e ->
			circle.setRadius(circle.getRadius() + 2));
		bt2.setOnAction(e ->
			circle.setRadius(circle.getRadius() > 2 ? 
				      circle.getRadius() - 2 : circle.getRadius()));	
		
		
		
		
		//Scene
		Scene scene = new Scene(Stack, 450,450);
		window.setTitle("ControlCircle");
		window.setScene(scene);
		window.show();
		BorderPane.setAlignment(root, Pos.CENTER);
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
