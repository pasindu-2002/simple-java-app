package lk.nibm.ead2.cw1_hrms.controller;
 
import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.converter.NumberStringConverter;
import lk.nibm.ead2.cw1_hrms.model.Employee;
import lk.nibm.ead2.cw1_hrms.service.EmployeeService;
 
public class EmployeeController {
	@FXML
	private TextField firstName;
	@FXML
	private TextField lastName;
	@FXML
	private TextField designation;
	@FXML
	private TextField email;
	@FXML
	private TextField telephone;
	@FXML
	private TextField age;
	@FXML
	private Label message;
	@FXML
	private Button submitButton;
 
	private SimpleStringProperty firstNameProperty = new SimpleStringProperty();
	private SimpleStringProperty lastNameProperty = new SimpleStringProperty();
	private SimpleStringProperty designationProperty = new SimpleStringProperty();
	private SimpleStringProperty emailProperty = new SimpleStringProperty();
	private SimpleStringProperty telephoneProperty = new SimpleStringProperty();
	private SimpleIntegerProperty ageProperty = new SimpleIntegerProperty();
	private SimpleStringProperty messageProperty = new SimpleStringProperty();
 
	private EmployeeService service = new EmployeeService();
 
	@FXML
	private void initialize() {
		this.firstName.textProperty().bindBidirectional(firstNameProperty);
		this.lastName.textProperty().bindBidirectional(lastNameProperty);
		this.designation.textProperty().bindBidirectional(designationProperty);
		this.email.textProperty().bindBidirectional(emailProperty);
		this.telephone.textProperty().bindBidirectional(telephoneProperty);
		this.message.textProperty().bindBidirectional(messageProperty);
		Bindings.bindBidirectional(age.textProperty(), ageProperty,new NumberStringConverter());
	}
 
	@FXML
	public void handleSubmitButtonAction(ActionEvent event) {
		Employee emp = new Employee();
		emp.setFirstname(firstNameProperty.get());	
		emp.setLastname(lastNameProperty.get());		
		emp.setDesignation(designationProperty.get());		
		emp.setEmail(emailProperty.get());		
		emp.setTelephone(telephoneProperty.get());	
		emp.setAge(ageProperty.get());	
 
		System.out.println(emp);
		try {
			if(service.insert(emp)) {
				messageProperty.setValue("Record inserted succesfuly");
			}
		} catch (Exception e) {
			e.printStackTrace();
			messageProperty.setValue(e.getMessage());
		}
	}
 
	@FXML
	public void handleClearButtonAction(ActionEvent event) {
		//Implement clear function
	}
}
 




