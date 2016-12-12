package br.ufg.inf.generator.telas.controladores;

import javafx.fxml.FXML;

public class WizardInformacoesPedCtrl extends AbstractWizardCtrl implements ControlledScreen {

    private ScreensController myController;

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
        myController.setScreen(IScreens.ID_QUANTIDADE_PED);
    }

    @Override
    protected void nextScreen() {
        if (WizardQuantidadePedCtrl.getQuantPed() != 0) {
            WizardQuantidadePedCtrl.decQuantPed();
            myController.setScreen(IScreens.ID_INFORMACOES_PED);
        } else if (WizardQuantidadePedCtrl.getQuantPedNfe() != 0) {
            WizardQuantidadePedCtrl.decQuantPedNfe();
            myController.setScreen(IScreens.ID_INFORMACOES_PED_NFE);
        } else {
            myController.setScreen(IScreens.ID_HOMOLOGACAO_ECF);
        }
    }

    @Override
    protected boolean isValido() {
        return true;
    }

    @Override
    protected void salvar() {
        //TODO falta implementar a parte de salvar
    }
}
