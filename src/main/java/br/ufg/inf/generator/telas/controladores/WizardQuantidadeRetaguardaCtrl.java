package br.ufg.inf.generator.telas.controladores;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class WizardQuantidadeRetaguardaCtrl extends AbstractWizardCtrl implements ControlledScreen {

    private ScreensController myController;

    @FXML
    private TextField txtQuantidadeRetaguarda;

    private static int quantRetaguarda;

    @FXML
    public void initialize() {
        getNextButton().setOnAction(event -> next());
        getBackButton().setOnAction(event -> back());
        initializeFinishButton();
    }

    @Override
    public void setScreenParent(ScreensController screenPage) {
        myController = screenPage;
    }

    @Override
    protected void back() {
        myController.setScreen(IScreens.ID_APLICACOES_ESPECIAIS);
    }

    @Override
    protected void nextScreen() {
        quantRetaguarda = Integer.parseInt(txtQuantidadeRetaguarda.getText());
        decQuantRetaguarda();
        myController.setScreen(IScreens.ID_INFORMACOES_RETAGUARDA);
    }

    @Override
    protected boolean isValido() {
        return true;
    }

    @Override
    protected void salvar() {
        //TODO falta implementar a parte de salvar
    }

    public static int getQuantRetaguarda() {
        return quantRetaguarda;
    }

    public static void decQuantRetaguarda() {
        WizardQuantidadeRetaguardaCtrl.quantRetaguarda--;
    }
}
