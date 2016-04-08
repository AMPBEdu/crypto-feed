package bueide.cryptofeed.ui.gui;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class GUIMain extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("bueide/cryptofeed/ui/gui/graphical/ChatWindow.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getClassLoader().getResource("bueide/cryptofeed/ui/gui/graphical/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
