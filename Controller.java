import java.util.Optional;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Controller {

    // @FXML
    // private Button btn;

    // @FXML
    // private TextField tf_name;

    private Stage mainwindow;

    public void setMainWindow(Stage mainwindow){
        this.mainwindow = mainwindow;
    }
    @FXML
    private AnchorPane myAnchorPane;
    private Question que = new Question();
    private String questionText;
    private int curr;
    private int corrAns;
    private String[] Answers;
    private int count;
    private String btnCss;
    private boolean RESTART;

    @FXML
    private Pane app;
    @FXML
    private Label question;
    @FXML
    private Label simple;
    @FXML
    private Pane ans;

    @FXML
    private Button ans1;
    // private String btnCss = ans1.getStyle();

    @FXML
    private Button ans2;

    @FXML
    private Button ans3;

    @FXML
    private Button ans4;

    @FXML
    private Button next;
    @FXML
    public void initialize() {
        ans1.setDisable(false);
        ans2.setDisable(false);
        ans3.setDisable(false);
        ans4.setDisable(false);
        ans1.setStyle(btnCss);
        ans2.setStyle(btnCss);
        ans3.setStyle(btnCss);
        ans4.setStyle(btnCss);
        next.setVisible(false); // Hide the button initially
        next.setText("Next");
        RESTART = false;
        
        count = 0;
        next.setVisible(false); // Hide the button initially
        questionText = que.getCurrQue();
        // int curr = que.getcurr();
        // if (curr == 2 || curr == 3) {
        //     question.setStyle(question.getStyle() + "; -fx-font-size: 16px;");
        // }
        question.setText(questionText);
        Answers = que.getCurrAns();
        // corrAns = que.getCorrectAns();
        ans1.setText(Answers[0]);
        ans2.setText(Answers[1]);
        ans3.setText(Answers[2]);
        ans4.setText(Answers[3]);
        // que.increaseCurr();
    }
    public void handleNext(){
        ans1.setDisable(false);
        ans2.setDisable(false);
        ans3.setDisable(false);
        ans4.setDisable(false);
        ans1.setStyle(btnCss);
        ans2.setStyle(btnCss);
        ans3.setStyle(btnCss);
        ans4.setStyle(btnCss);
        next.setVisible(false); // Hide the button initially
        questionText = que.getCurrQue();
        curr = que.getcurr();
        if (curr == 2 || curr == 3) {
            question.setStyle(question.getStyle() + "; -fx-font-size: 16px;");
        }
        question.setText(questionText);
        Answers = que.getCurrAns();
        // corrAns = que.getCorrectAns();
        ans1.setText(Answers[0]);
        ans2.setText(Answers[1]);
        ans3.setText(Answers[2]);
        ans4.setText(Answers[3]);
        // que.increaseCurr();
    }


    @FXML
    void onAns1_Click(ActionEvent event) {
        corrAns = que.getCorrectAns();
        if (corrAns == 0) {
            //stylesheet
            ans1.setStyle(ans1.getStyle()+";-fx-background-color: #9aeabc;");
            count++;
        }else{
            //stylesheet
            ans1.setStyle(ans1.getStyle()+";-fx-background-color: #ff9393;");
            if (corrAns == 1) {
                ans2.setStyle(ans2.getStyle()+";-fx-background-color: #9aeabc;");
            }else if (corrAns == 2) {
                ans3.setStyle(ans3.getStyle()+";-fx-background-color: #9aeabc;");
            }else{
                ans4.setStyle(ans4.getStyle()+";-fx-background-color: #9aeabc;");
            }
        }
        next.setVisible(true);
        ans1.setDisable(true);
        ans2.setDisable(true);
        ans3.setDisable(true);
        ans4.setDisable(true);
        System.out.println(que.getcurr());
        if (que.getcurr() == que.getQueArr().length-1) {
            next.setVisible(false);
            System.out.println("done");
            EndQuiz();
        }
    }
    @FXML
    void onAns2_Click(ActionEvent event) {
        corrAns = que.getCorrectAns();
        if (corrAns == 1) {
            //stylesheet
            ans2.setStyle(ans2.getStyle()+";-fx-background-color: #9aeabc;");
            count++;
            // make other btns unclickable
        }else{
            //stylesheet
            ans2.setStyle(ans2.getStyle()+";-fx-background-color: #ff9393;");
            if (corrAns == 0) {
                ans1.setStyle(ans1.getStyle()+";-fx-background-color: #9aeabc;");
            }else if (corrAns == 2) {
                ans3.setStyle(ans3.getStyle()+";-fx-background-color: #9aeabc;");
            }else{
                ans4.setStyle(ans4.getStyle()+";-fx-background-color: #9aeabc;");
            }
        }
        next.setVisible(true);
        ans1.setDisable(true);
        ans2.setDisable(true);
        ans3.setDisable(true);
        ans4.setDisable(true);
        if (que.getcurr() == que.getQueArr().length-1) {
            next.setVisible(false);
            System.out.println("done");
            EndQuiz();
        }
    }
    @FXML
    void onAns3_Click(ActionEvent event) {
        corrAns = que.getCorrectAns();
        if (corrAns == 2) {
            //stylesheet
            ans3.setStyle(ans3.getStyle()+";-fx-background-color: #9aeabc;");
            count++;
        }else{
            //stylesheet
            ans3.setStyle(ans3.getStyle()+";-fx-background-color: #ff9393;");
            if (corrAns == 1) {
                ans2.setStyle(ans2.getStyle()+";-fx-background-color: #9aeabc;");
            }else if (corrAns == 0) {
                ans1.setStyle(ans1.getStyle()+";-fx-background-color: #9aeabc;");
            }else{
                ans4.setStyle(ans4.getStyle()+";-fx-background-color: #9aeabc;");
            }
        }
        next.setVisible(true);
        ans1.setDisable(true);
        ans2.setDisable(true);
        ans3.setDisable(true);
        ans4.setDisable(true);
        if (que.getcurr() == que.getQueArr().length-1) {
            next.setVisible(false);
            System.out.println("done");
            EndQuiz();
        }
    }
    @FXML
    void onAns4_Click(ActionEvent event) {
        corrAns = que.getCorrectAns();
        if (corrAns == 3) {
            //stylesheet
            ans4.setStyle(ans4.getStyle()+";-fx-background-color: #9aeabc;");
            count++;
        }else{
            //stylesheet
            ans4.setStyle(ans4.getStyle()+";-fx-background-color: #ff9393;");
            if (corrAns == 1) {
                ans2.setStyle(ans2.getStyle()+";-fx-background-color: #9aeabc;");
            }else if (corrAns == 2) {
                ans3.setStyle(ans3.getStyle()+";-fx-background-color: #9aeabc;");
            }else{
                ans1.setStyle(ans1.getStyle()+";-fx-background-color: #9aeabc;");
            }
        }
        next.setVisible(true);
        ans1.setDisable(true);
        ans2.setDisable(true);
        ans3.setDisable(true);
        ans4.setDisable(true);
        if (que.getcurr() == que.getQueArr().length-1) {
            next.setVisible(false);
            System.out.println("done");
            EndQuiz();
        }
    }



    @FXML
    void onNext_Click(ActionEvent event) {
        que.increaseCurr();
        //reseting buttons
        if (que.getcurr() < que.getQueArr().length) {
            handleNext(); 
        }else{
            // if the quiz ends
            // Stage stage = (Stage) myAnchorPane.getScene().getWindow();
            // AlertType type = AlertType.INFORMATION;
            // Alert alert = new Alert(type,"wow");
            // alert.initModality(Modality.APPLICATION_MODAL);
            // alert.initOwner(stage);
            // alert.getDialogPane().setContentText("You scored {count} out of {que.getQueArr().length}");
            // alert.getDialogPane().setHeaderText("Test Completed");
            // alert.showAndWait();
        }
        if (RESTART) {
            restartQuiz();
        }
    }
    // public void EndQuiz(){
    //     // If the quiz ends
    //     Stage stage = (Stage) myAnchorPane.getScene().getWindow();
    //     Alert alert = new Alert(Alert.AlertType.INFORMATION);
    //     alert.initModality(Modality.APPLICATION_MODAL);
    //     alert.initOwner(stage);
    //     alert.setHeaderText("Test Completed");

    //     alert.setContentText(String.format("You scored %d out of %d", count, que.getQueArr().length));

    //     alert.show();
    // }
    public void EndQuiz() {
        Stage stage;
        if (myAnchorPane != null && myAnchorPane.getScene() != null) {
            stage = (Stage) myAnchorPane.getScene().getWindow();
        } else if (mainwindow != null) {
            stage = mainwindow;
        } else {
            System.out.println("Stage is null! Alert may not work.");
            return;
        }
    
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.initOwner(stage);
        alert.setHeaderText("Test Completed");
        alert.setContentText(String.format("You scored %d out of %d", count, que.getQueArr().length));

        // Apply CSS
        DialogPane dialogPane = alert.getDialogPane();
        dialogPane.getStylesheets().add(getClass().getResource("/scene.css").toExternalForm());
        dialogPane.getStyleClass().add("alert");

        // Change button text to "Play Again"

        ButtonType playAgainButton = new ButtonType("Quiz Again", ButtonBar.ButtonData.OK_DONE);
        alert.getButtonTypes().setAll(playAgainButton);

        //alert.showAndWait();
        // // Change button text to "Play Again"

        // ButtonType playAgainButton = new ButtonType("Quiz Again", ButtonBar.ButtonData.OK_DONE);
        // alert.getButtonTypes().setAll(playAgainButton);

        // Show dialog and handle button action
        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == playAgainButton) {
            restartQuiz(); // Call restart function
        }else{
            next.setText("Quiz Again");
            next.setVisible(true);
            RESTART = true;
        }
    }
    public void restartQuiz(){
        count = 0;
        que.setcurr(0);
        initialize();
    }

}
