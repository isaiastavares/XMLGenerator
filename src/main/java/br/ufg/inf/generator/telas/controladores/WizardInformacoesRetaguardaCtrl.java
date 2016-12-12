package br.ufg.inf.generator.telas.controladores;

import javafx.fxml.FXML;

public class WizardInformacoesRetaguardaCtrl extends AbstractWizardCtrl implements ControlledScreen {

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
        myController.setScreen(IScreens.ID_QUANTIDADE_RETAGUARDA);
    }

    @Override
    protected void nextScreen() {
        if (WizardQuantidadeRetaguardaCtrl.getQuantRetaguarda() != 0) {
            WizardQuantidadeRetaguardaCtrl.decQuantRetaguarda();
            myController.setScreen(IScreens.ID_INFORMACOES_RETAGUARDA);
        } else {
            switch (WizardCaracteristicasPafCtrl.getIntegracaoPafValue()) {
                case "Pela Retaguarda e PED ou EFD":
                    myController.setScreen(IScreens.ID_QUANTIDADE_PED);
                    break;
                default:
                    myController.setScreen(IScreens.ID_HOMOLOGACAO_ECF);
                    break;
            }
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
