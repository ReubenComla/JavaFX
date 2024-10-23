package com.mycompany.mavenproject1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class PrimaryController {
   @FXML
   private TextField NameFieldText;
   @FXML
   private TextField AgeFieldText;
   @FXML
   private TextField EmailFieldTEXT;

   public void submit(ActionEvent event){
      try {
         String name = NameFieldText.getText();
         String ageStr = AgeFieldText.getText();
         String email = EmailFieldTEXT.getText();

         // Check if any field is empty
         if (name == null || name.isEmpty() || ageStr == null || ageStr.isEmpty() || email == null || email.isEmpty()) {
            throw new Exception("Fields cannot be empty.");
         }

         // Validate age (check if it's a valid integer)
         int age = Integer.parseInt(ageStr);

         // Print the inputs if everything is valid
         System.out.println("Submitted");
         System.out.println("Name: " + name);
         System.out.println("Age: " + age);
         System.out.println("Email: " + email);
         
         Alert alert =new Alert(AlertType.INFORMATION);
               alert.setTitle( "Successful");
               alert.setHeaderText("Thankyou");
               alert.setContentText("Submitted successfully");
               alert.showAndWait();

      } catch (NumberFormatException e) {
         System.out.println("Invalid age. Please enter a valid number.");
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }
}
