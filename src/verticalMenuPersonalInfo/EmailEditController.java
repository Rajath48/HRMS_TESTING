package verticalMenuPersonalInfo;

import java.sql.SQLException;

import org.planning.test.jdbc.Employee;
import org.planning.test.jdbc.TestDao;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import loginController.LoginController;

public class EmailEditController {
	private final LoginController contrl = new LoginController();
	Employee epass = contrl.getEmployee();
	
	  @FXML
	    private JFXTextField PersonalEmailEdit;

	    @FXML
	    private JFXButton Cancel_Cancel_btn;

	    @FXML
	    private JFXButton SAVE_Email;

	    @FXML
	    private JFXButton CLOSE;

	    @FXML
	    void CancelCinfo(ActionEvent event) {
	        // get a handle to the stage
	        Stage stage = (Stage) CLOSE.getScene().getWindow();
	        // do what you have to do
	        stage.close();
	    }

	    @FXML
	    void CloseWindow(ActionEvent event) {
	        // get a handle to the stage
	        Stage stage = (Stage) CLOSE.getScene().getWindow();
	        // do what you have to do
	        stage.close();
	    }

	    @FXML
	    void DisplayEEdit(ActionEvent event) throws SQLException, ClassNotFoundException {
	    	Employee e = new Employee();
	    	TestDao t = new TestDao();
	    	e.setEMP_ID(epass.getEMP_ID());
	    	e.setPERSONAL_EMAIL(PersonalEmailEdit.getText());
	    	int result = t.editemail(e);
	    	if(result == 1) {
	    		System.out.println("Updated the record successfully");
	    	}
	    	else
	    	{
	    		System.out.println("Update Failed");
	    	}
	    }
}
