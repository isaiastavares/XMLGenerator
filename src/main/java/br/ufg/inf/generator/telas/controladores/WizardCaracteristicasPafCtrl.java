package br.ufg.inf.generator.telas.controladores;

import java.util.Arrays;
import java.util.List;

import br.ufg.inf.generator.validadores.valores.ValidationFields;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;

public class WizardCaracteristicasPafCtrl extends AbstractWizardCtrl implements ControlledScreen {

	private static String integracaoPafValue;

	private ScreensController myController;
    private boolean verificaFormaImpressao = false;
    private boolean verificaTratamentoInterrupcao = false;
    private boolean verificaMeioGeracao = false;

    @FXML
    private ChoiceBox<String> choiceTipoDesenvolvimento;
    @FXML
    private ChoiceBox<String> choiceIntegracaoPaf;
    @FXML
    private ChoiceBox<String> choiceTipoFuncionamento;
    @FXML
    private CheckBox checkFormaConcomitante;
    @FXML
    private CheckBox checkFormaNaoConcomitanteComDav;
    @FXML
    private CheckBox checkFormaNaoConcomitanteComPreVenda;
    @FXML
    private CheckBox checkFormaNaoConcomitanteComContaCliente;
    @FXML
    private CheckBox checkFormaDavSemImpressao;
    @FXML
    private CheckBox checkFormaDavImpressoraNaoFiscal;
    @FXML
    private CheckBox checkFormaDavImpressoEcf;
    @FXML
    private CheckBox checkTratamentoRecuperacao;
    @FXML
    private CheckBox checkTratamentoCancelamento;
    @FXML
    private CheckBox checkTratamentoBloqueio;
    @FXML
    private CheckBox checkMeioGeracaoPaf;
    @FXML
    private CheckBox checkMeioGeracaoRetaguarda;
    @FXML
    private CheckBox checkMeioGeracaoPed;

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
    	//TODO falta implementar a parte de salvar
    }

    public synchronized static String getIntegracaoPafValue() {
        return integracaoPafValue;
    }
}
