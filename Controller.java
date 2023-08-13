package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML private TextField txtEducation;
    @FXML private TextField txtHousing;
    @FXML private TextField txtFood;
    @FXML private TextField txtIncome;
    @FXML private TextField txtTransportation;
    @FXML private Label resultLabel;

    @FXML
    private void total(ActionEvent event) {
        try {
            double educationExpense = Double.parseDouble(txtEducation.getText());
            double housingExpense = Double.parseDouble(txtHousing.getText());
            double foodExpense = Double.parseDouble(txtFood.getText());
            double transportationExpense = Double.parseDouble(txtTransportation.getText());

            double totalExpenses = educationExpense + housingExpense + foodExpense + transportationExpense;
            resultLabel.setText("Total Expenses: $" + totalExpenses);
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid input");
        }
    }

    @FXML
    private void visual(ActionEvent event) {
        try {
            double educationExpense = Double.parseDouble(txtEducation.getText());
            double housingExpense = Double.parseDouble(txtHousing.getText());
            double foodExpense = Double.parseDouble(txtFood.getText());
            double transportationExpense = Double.parseDouble(txtTransportation.getText());

            double totalExpenses = educationExpense + housingExpense + foodExpense + transportationExpense;

            double educationPercentage = (educationExpense / totalExpenses) * 100;
            double housingPercentage = (housingExpense / totalExpenses) * 100;
            double foodPercentage = (foodExpense / totalExpenses) * 100;
            double transportationPercentage = (transportationExpense / totalExpenses) * 100;

            resultLabel.setText(
                "Education: " + educationPercentage + "%\n" +
                "Housing: " + housingPercentage + "%\n" +
                "Food: " + foodPercentage + "%\n" +
                "Transportation: " + transportationPercentage + "%"
            );
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid input");
        }
    }
    
    @FXML
    private void plan(ActionEvent event) {
        try {
            double income = Double.parseDouble(txtIncome.getText());

            double needsBudget = 0.5 * income;
            double wantsBudget = 0.3 * income;
            double savingsBudget = 0.2 * income;

            resultLabel.setText(
                "Recommended Budget Breakdown:\n" +
                "Needs: $" + needsBudget + "\n" +
                "Wants: $" + wantsBudget + "\n" +
                "Savings: $" + savingsBudget
            );
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid input");
        }
    }
}