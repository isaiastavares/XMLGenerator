package br.ufg.inf.generator.telas.controladores;

import javafx.fxml.FXML;

public class WizardHomologacaoEcfCtrl extends AbstractWizardCtrl implements ControlledScreen {

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

        switch (WizardCaracteristicasPafCtrl.getIntegracaoPafValue()) {
            case "Pelo PAF-ECF":
                myController.setScreen(IScreens.ID_APLICACOES_ESPECIAIS);
                break;
            case "Pelo sistema de Retaguarda":
                myController.setScreen(IScreens.ID_QUANTIDADE_RETAGUARDA);
                break;
            default:
                myController.setScreen(IScreens.ID_QUANTIDADE_PED);
                break;
        }
    }

    @Override
    protected void nextScreen() {
        myController.setScreen(IScreens.ID_ECF_COMPATIVEL);
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
