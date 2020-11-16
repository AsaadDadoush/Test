package FX_UI_Controls;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class FadeTransitionDemo extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Place an ellipse to the pane
    StackPane pane = new StackPane();
    Circle cricle = new Circle(250);
    cricle.setFill(Color.RED); 
    cricle.setStroke(Color.BLACK);
    pane.getChildren().add(cricle);
    
    // Apply a fade transition to ellipse
    FadeTransition ft = 
      new FadeTransition(Duration.millis(1500), cricle);
    ft.setFromValue(1.0);
    ft.setToValue(0.1);
    ft.setCycleCount(Timeline.INDEFINITE);
    ft.setAutoReverse(true);
    ft.play(); // Start animation 
    
    // Control animation
    cricle.setOnMousePressed(e -> ft.pause());
    cricle.setOnMouseReleased(e -> ft.play());
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 500, 500);
    primaryStage.setTitle("FadeTransitionDemo"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}