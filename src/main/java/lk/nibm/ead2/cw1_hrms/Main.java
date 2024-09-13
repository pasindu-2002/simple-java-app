package lk.nibm.ead2.cw1_hrms;
 
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lk.nibm.ead2.cw1_hrms.controller.EmployeeController;
 
public class Main extends Application {
 
	@Override
	public void start(Stage primaryStage) throws Exception {
		//Create Controller
        EmployeeController controller = new EmployeeController();
 
        Parent root = FXMLLoader.load(getClass().getResource("/Registration.fxml"));
 
        //Show stage
        primaryStage.setTitle("HRMS");
        primaryStage.setScene(new Scene(root,400,400));
        primaryStage.show();
	}
 
	public static void main(String[] args) {
		launch(args);
	}
 
}
 




