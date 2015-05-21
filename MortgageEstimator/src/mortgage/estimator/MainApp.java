package mortgage.estimator;
	
import java.io.IOException;

import mortgage.estimator.view.MainViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class MainApp extends Application {
	
	private Stage primaryStage;
	private AnchorPane layout;
	@Override
	public void start(Stage primaryStage) {
		try {
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("Mortgage Estimator");
			
			showMainView();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void showMainView() {
		try{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/MainView.fxml"));
			
			layout = (AnchorPane) loader.load();
			
			Scene scene = new Scene(layout);
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
	        MainViewController controller = loader.getController();
	        controller.setMainApp(this);
			
		}catch (IOException e){
			e.printStackTrace();
		}
	}

	public Stage getPrimaryStage() {
        return primaryStage;
    }
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
}

