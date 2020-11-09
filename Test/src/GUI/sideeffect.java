package GUI;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class sideeffect extends Application  {

	Button button;
	
	@Override
	public void start(Stage primaryStage) {
		 primaryStage.setTitle("FX");
		 button = new Button("FX");
		 button.setOnAction(e ->{
			 System.out.println("This is what i call");
			 System.out.println("this the side");
		 } );
		 
		 StackPane layout = new StackPane();
		 layout.getChildren().add(button);
		 
		 Scene scene = new Scene(layout,450,450);
		 primaryStage.setScene(scene);
	     primaryStage.show();
	}
		

	public static void main(String[] args) {
		launch(args);
	}

}
