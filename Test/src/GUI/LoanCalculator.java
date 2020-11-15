package GUI;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoanCalculator extends Application {

	Stage window;
	private TextField tfMothlyPayment = new TextField();
	private TextField tfTotalPayment = new TextField();
	 
	@Override	
	public  void start(Stage primaryStage) {
		window = primaryStage;
		
		//GridPane
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(13,15,17,11));
		pane.setHgap(5);
		pane.setVgap(5);
		
		pane.add(new Label("Annaul Interest Rate :"), 0, 0);
		pane.add(new TextField(), 1, 0);
		pane.add(new Label("Number of Years :"), 0, 1);
		pane.add(new TextField(), 1, 1);
		pane.add(new Label("Loan Amount :"), 0, 2);
		pane.add(new TextField(), 1, 2);
		pane.add(new Label("Monthly Payment :"), 0, 3);
		pane.add(tfMothlyPayment, 1, 3);
		pane.add(new Label("Total Payment :"), 0, 4);
		pane.add(tfTotalPayment, 1, 4);
		
		Button bt1 = new Button("Calculate");
		pane.add(bt1,1,5);
		GridPane.setHalignment(bt1,HPos.RIGHT);
		
		//events
		tfMothlyPayment.setEditable(false);
		tfTotalPayment.setEditable(false);
		
		
		//Scene / window
		Scene scene = new Scene(pane);
		window.setScene(scene);
		window.setTitle("Loan Calculator");
		window.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
