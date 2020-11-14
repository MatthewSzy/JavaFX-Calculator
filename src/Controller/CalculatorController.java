package Controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculatorController implements Initializable {

    @FXML
    private Label labelID;

    String calculatorText = "";

    int wynik = 0;

    boolean stan = false;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Thread refresh_List_User = new Thread(this::refreshLabel);
        refresh_List_User.setDaemon(true);
        refresh_List_User.start();
    }

    private void refreshLabel() {

        while (true)
        {
            Platform.runLater(() -> {
                labelID.setText("                              ");
                labelID.setText(String.valueOf(wynik) + " = " + calculatorText);
            });

            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

    public void BackspaceClickMethod(MouseEvent mouseEvent) {
        calculatorText = calculatorText.substring(0, calculatorText.length()-1);
    }

    public void CEClickMethod(MouseEvent mouseEvent) {
        calculatorText = "";
    }

    public void C2ClickMethod(MouseEvent mouseEvent) {
    }

    public void spaClickMethod(MouseEvent mouseEvent) {
    }

    public void aveClickMethod(MouseEvent mouseEvent) {
    }

    public void sumClickMethod(MouseEvent mouseEvent) {
    }

    public void SClickMethod(MouseEvent mouseEvent) {
    }

    public void datClickMethod(MouseEvent mouseEvent) {
    }

    public void FEClickMethod(MouseEvent mouseEvent) {
    }

    public void dmsClickMethod(MouseEvent mouseEvent) {
    }

    public void sinClickMethod(MouseEvent mouseEvent) {
    }

    public void cosClickMethod(MouseEvent mouseEvent) {
    }

    public void tanClickMethod(MouseEvent mouseEvent) {
    }

    public void PClickMethod(MouseEvent mouseEvent) {
    }

    public void expClickMethod(MouseEvent mouseEvent) {
    }

    public void xyClickMethod(MouseEvent mouseEvent) {
    }

    public void x3ClickMethod(MouseEvent mouseEvent) {
    }

    public void x2ClickMethod(MouseEvent mouseEvent) {
    }

    public void JClickMethod(MouseEvent mouseEvent) {
    }

    public void lnClickMethod(MouseEvent mouseEvent) {
    }

    public void logClickMethod(MouseEvent mouseEvent) {
    }

    public void nClickMethod(MouseEvent mouseEvent) {
    }

    public void x1ClickMethod(MouseEvent mouseEvent) {
    }

    public void MCClickMethod(MouseEvent mouseEvent) {
    }

    public void MRClickMethod(MouseEvent mouseEvent) {
    }

    public void MSClickMethod(MouseEvent mouseEvent) {
    }

    public void MplusClickMethod(MouseEvent mouseEvent) {
    }

    public void piClickMethod(MouseEvent mouseEvent) {
    }

    public void sevenClickMethod(MouseEvent mouseEvent) {
        calculatorText = calculatorText + "7";
        stan = true;
    }

    public void fourClickMethod(MouseEvent mouseEvent) {
        calculatorText = calculatorText + "4";
        stan = true;
    }

    public void oneClickMethod(MouseEvent mouseEvent) {
        calculatorText = calculatorText + "1";
        stan = true;
    }

    public void zeroClickMethod(MouseEvent mouseEvent) {
        calculatorText = calculatorText + "0";
        stan = true;
    }

    public void AClickMethod(MouseEvent mouseEvent) {
    }

    public void eightClickMethod(MouseEvent mouseEvent) {
        calculatorText = calculatorText + "8";
        stan = true;
    }

    public void fiveClickMethod(MouseEvent mouseEvent) {
        calculatorText = calculatorText + "5";
        stan = true;
    }

    public void twoClickMethod(MouseEvent mouseEvent) {
        calculatorText = calculatorText + "2";
        stan = true;
    }

    public void plusminusClickMethod(MouseEvent mouseEvent) {
    }

    public void ClickMethod(MouseEvent mouseEvent) {
    }

    public void nineClickMethod(MouseEvent mouseEvent) {
        calculatorText = calculatorText + "9";
        stan = true;
    }

    public void sixClickMethod(MouseEvent mouseEvent) {
        calculatorText = calculatorText + "6";
        stan = true;
    }

    public void threeClickMethod(MouseEvent mouseEvent) {
        calculatorText = calculatorText + "3";
        stan = true;
    }

    public void pointClickMethod(MouseEvent mouseEvent) {
    }

    public void CClickMethod(MouseEvent mouseEvent) {
    }

    public void divisionClickMethod(MouseEvent mouseEvent) {
        if(stan == true){
            wynik = wynik / Integer.parseInt(calculatorText);
            calculatorText = "";
            stan = false;
        }
    }

    public void multiClickMethod(MouseEvent mouseEvent) {
        if(stan == true){
            wynik = wynik * Integer.parseInt(calculatorText);
            calculatorText = "";
            stan = false;
        }
    }

    public void minusClickMethod(MouseEvent mouseEvent) {
        if(stan == true){
            wynik = wynik - Integer.parseInt(calculatorText);
            calculatorText = "";
            stan = false;
        }
    }

    public void plusClickMethod(MouseEvent mouseEvent) {
        if(stan == true){
            wynik = wynik + Integer.parseInt(calculatorText);
            calculatorText = "";
            stan = false;
        }
    }

    public void DClickMethod(MouseEvent mouseEvent) {
    }

    public void MODClickMethod(MouseEvent mouseEvent) {
    }

    public void OrClickMethod(MouseEvent mouseEvent) {
    }

    public void LshClickMethod(MouseEvent mouseEvent) {
    }

    public void equalClickMethod(MouseEvent mouseEvent) {
    }

    public void EClickMethod(MouseEvent mouseEvent) {
    }

    public void AndClickMethod(MouseEvent mouseEvent) {
    }

    public void XorClickMethod(MouseEvent mouseEvent) {
    }

    public void NotClickMethod(MouseEvent mouseEvent) {
    }

    public void IntClickMethod(MouseEvent mouseEvent) {
    }

    public void FClickMethod(MouseEvent mouseEvent) {
    }
}
