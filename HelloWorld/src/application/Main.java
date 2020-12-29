package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Hello World!");
			Button btn=new Button();
			btn.setText("Say 'Hello World'");
			btn.setOnAction(new EventHandler<ActionEvent>()
					{
				@Override
				public void handle(ActionEvent event) {
					System.out.println("Hello World!");
				}
					}
					
					
					);
			StackPane root = new StackPane();
			root.getChildren().add(btn);
			//Scene scene = new Scene(root,400,400);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(new Scene(root, 100,250));
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
