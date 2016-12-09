package br.ufg.inf.generator.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class WizardQuantidadeRetaguardaCtrl extends AbstractWizardCtrl implements ControlledScreen {

    private ScreensController myController;

    @FXML
    TextField txtQuantidadeRetaguarda;

    int quantRetaguarda;

    String quantRetStr;

    @FXML
    public void initialize() {
        getNextButton().setOnAction(event -> next());
        getBackButton().setOnAction(event -> back());
        initializeFinishButton();
    }

//    @FXML
//    private void handleTextFieldFormaImpressaoAction() {
//        quantRetaguarda = Integer.parseInt(txtQuantidadeRetaguarda.toString());
//    }
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
//        quantRetaguarda = Integer.parseInt(txtQuantidadeRetaguarda.toString());
//        System.out.println(quantRetaguarda);
        myController.setScreen(IScreens.ID_INFORMACOES_RETAGUARDA);
    }

    @Override
    protected boolean isValido() {
        // TODO falta implementar validacao
        return true;
    }

    @Override
    protected void salvar() {
        // TODO falta implementar a parte de salvar
    }
}
