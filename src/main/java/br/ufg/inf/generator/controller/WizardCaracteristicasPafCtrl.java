package br.ufg.inf.generator.controller;

import java.util.Arrays;
import java.util.List;

import br.ufg.inf.generator.validadores.ValidationFields;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;

public class WizardCaracteristicasPafCtrl extends AbstractWizardCtrl implements ControlledScreen {

    private ScreensController myController;

    private boolean verificaFormaImpressao = false;
    private boolean verificaTratamentoInterrupcao = false;
    private boolean verificaMeioGeracao = false;
    static String integracaoPafValue;

    @FXML
    private ChoiceBox<String> choiceTipoDesenvolvimento, choiceIntegracaoPaf, choiceTipoFuncionamento;

    @FXML
    private CheckBox checkFormaConcomitante, checkFormaNaoConcomitanteComDav, checkFormaNaoConcomitanteComPreVenda,
            checkFormaNaoConcomitanteComContaCliente, checkFormaDavSemImpressao, checkFormaDavImpressoraNaoFiscal, checkFormaDavImpressoEcf;

    @FXML
    private CheckBox checkTratamentoRecuperacao, checkTratamentoCancelamento, checkTratamentoBloqueio;

    @FXML
    private CheckBox checkMeioGeracaoPaf, checkMeioGeracaoRetaguarda, checkMeioGeracaoPed;

    @FXML
    public void initialize() {
        getNextButton().setOnAction(event -> next());
        getBackButton().setOnAction(event -> back());
        initializeFinishButton();
        initializeChoiceBox();
    }

    private void initializeChoiceBox() {
        choiceTipoDesenvolvimento.setItems(FXCollections.observableArrayList(getListTipoDesenvolvimento()));
        choiceIntegracaoPaf.setItems(FXCollections.observableArrayList(getListIntegracaoPaf()));
        choiceTipoFuncionamento.setItems(FXCollections.observableArrayList(getListTipoFuncionamento()));
    }

    @FXML
    private void handleCheckBoxFormaImpressaoAction() {
        verificaFormaImpressao = checkFormaConcomitante.isSelected() || checkFormaNaoConcomitanteComDav.isSelected() || checkFormaNaoConcomitanteComPreVenda.isSelected()
                || checkFormaNaoConcomitanteComContaCliente.isSelected() || checkFormaDavSemImpressao.isSelected() || checkFormaDavImpressoraNaoFiscal.isSelected()
                || checkFormaDavImpressoEcf.isSelected();
    }

    @FXML
    private void handleCheckBoxTratamentoInterrupcaoAction() {
        verificaTratamentoInterrupcao = checkTratamentoRecuperacao.isSelected() || checkTratamentoCancelamento.isSelected() || checkTratamentoBloqueio.isSelected();
    }

    @FXML
    private void handleCheckBoxMeioGeracaoAction() {
        verificaMeioGeracao = checkMeioGeracaoPaf.isSelected() || checkMeioGeracaoRetaguarda.isSelected() || checkMeioGeracaoPed.isSelected();
    }

    private List<String> getListTipoDesenvolvimento() {
        return Arrays.asList(
                "Comercializável",
                "Exclusivo próprop",
                "Exclusivo terceirizado");
    }

    private List<String> getListTipoFuncionamento() {
        return Arrays.asList(
                "Exclusivamente stand alone",
                "Em rede",
                "Parametrizavel");
    }

    private List<String> getListIntegracaoPaf() {
        return Arrays.asList(
                "Pelo PAF-ECF",
                "Pelo sistema de Retaguarda",
                "Pelo sistema PED ou EFD",
                "Pela Retaguarda e PED ou EFD");
    }

    @Override
    public void setScreenParent(ScreensController screenPage) {
        myController = screenPage;
    }

    @Override
    protected void back() {
        myController.setScreen(IScreens.ID_SISTEMA_PAF);
    }

    @Override
    protected void nextScreen() {
        integracaoPafValue = choiceIntegracaoPaf.getValue();
        System.out.println(integracaoPafValue);
        myController.setScreen(IScreens.ID_APLICACOES_ESPECIAIS);
    }

    @Override
    protected boolean isValido() {
        if (verificaFormaImpressao && verificaTratamentoInterrupcao && verificaMeioGeracao) {
            return true;
        } else {
            ValidationFields.validacao("É preciso selecionar pelo menos uma opção em Forma de Impresso");
            return false;
        }
    }

    @Override
    protected void salvar() {
        // TODO falta implementar a parte de salvar
    }

    public static String getIntegracaoPafValue() {
        return integracaoPafValue;
    }
}
