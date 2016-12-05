package br.ufg.inf.generator.controller;

import java.util.Arrays;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;

public class WizardCaracteristicasPafCtrl extends AbstractWizardCtrl implements ControlledScreen {

    private ScreensController myController;

    private boolean verificaFormaImpressao = false, verificaTratamentoInterrupcao = false, verificaMeioGeracao = false;

    @FXML
    private ChoiceBox<String> choiceTipoDesenvolvimento, choiceIntegracaoPaf, choiceTipoFuncionamento;

    @FXML
    private CheckBox checkFormaConcomitante, checkFormaNaoConcomitanteComDav, checkFormaNaoConcomitanteComPreVenda,
            checkFormaNaoConcomitanteComContaCliente, checkFormaDavSemImpressao, checkFormaDavImpressoraNaoFiscal, checkFormaDavImpressoEcf;

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

    }

    @FXML
    private void handleCheckBoxMeioGeracaoAction() {

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
                "Pelo sistema PED ou EFD");
    }

    @Override
    public void setScreenParent(ScreensController screenPage) {
        myController = screenPage;
    }

    @Override
    void back() {
        myController.setScreen(IScreens.ID_SISTEMA_PAF);
    }

    @Override
    void next() {
        if (verificaFormaImpressao) {
            myController.setScreen(IScreens.ID_APLICACOES_ESPECIAIS);
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Erro encontrado");
            alert.setContentText("É preciso selecionar pelo menos uma opcao em Forma de Impressao");

            alert.showAndWait();
        }
    }
}
