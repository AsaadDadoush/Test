import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GUISec extends Application implements EventHandler<ActionEvent> {

	Button button;
	
	@Override
	public void start(Stage primaryStage) {
		 primaryStage.setTitle("FX");
		 button = new Button("FX");
		 button.setOnAction(this);
		 
		 StackPane layout = new StackPane();
		 layout.getChildren().add(button);
		 
		 Scene scene = new Scene(layout,450,450);
		 primaryStage.setScene(scene);
	     primaryStage.show();
	}
		
	@Override
	public void handle(ActionEvent event) {
		if(event.getSource()== button) {
			System.out.println("HERO");
		}
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
