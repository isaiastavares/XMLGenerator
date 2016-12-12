package br.ufg.inf.generator.telas.controladores;

import javafx.fxml.FXML;

public class WizardAplicacoesEspeciaisCtrl extends AbstractWizardCtrl implements ControlledScreen {

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
        myController.setScreen(IScreens.ID_CARACTERISTICAS_PAF);
    }

    @Override
    protected void nextScreen() {
        switch (WizardCaracteristicasPafCtrl.getIntegracaoPafValue()) {
            case "Pelo PAF-ECF":
                myController.setScreen(IScreens.ID_HOMOLOGACAO_ECF);
                break;
            case "Pelo sistema PED ou EFD":
                myController.setScreen(IScreens.ID_QUANTIDADE_PED);
                break;
            default:
                myController.setScreen(IScreens.ID_QUANTIDADE_RETAGUARDA);
                break;
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
