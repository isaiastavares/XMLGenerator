package br.ufg.inf.generator.telas.controladores;

import br.ufg.inf.generator.validadores.valores.ValidationFields;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class WizardQuantidadePedCtrl extends AbstractWizardCtrl implements ControlledScreen {

    private ScreensController myController;

    @FXML
    private TextField txtQuantPed;
    @FXML
    private TextField txtQuantPedNfe;

    private static int quantPed, quantPedNfe;

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
            case "Pela Retaguarda e PED ou EFD":
                myController.setScreen(IScreens.ID_INFORMACOES_RETAGUARDA);
                break;
            default:
                myController.setScreen(IScreens.ID_APLICACOES_ESPECIAIS);
                break;
        }
    }

    @Override
    protected void nextScreen() {
        System.out.println(txtQuantPed.getText());
        quantPed = Integer.parseInt(txtQuantPed.getText());
        quantPedNfe = Integer.parseInt(txtQuantPedNfe.getText());

        if (quantPed > 0) {
            decQuantPed();
            myController.setScreen(IScreens.ID_INFORMACOES_PED);
        } else if (quantPedNfe > 0) {
            decQuantPedNfe();
            myController.setScreen(IScreens.ID_INFORMACOES_PED_NFE);
        } else {
            ValidationFields.validacao("Os campos Ped e PedNfe não podem ter o valor 0 em ambos.");
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

    public static int getQuantPed() {
        return quantPed;
    }

    public static int getQuantPedNfe() {
        return quantPedNfe;
    }

    public static void decQuantPed() {
        WizardQuantidadePedCtrl.quantPed--;
    }

    public static void decQuantPedNfe() {
        WizardQuantidadePedCtrl.quantPedNfe--;
    }
}
