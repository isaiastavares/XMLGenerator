package br.ufg.inf.generator.controller;

import br.ufg.inf.generator.validadores.ValidationFields;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class WizardEmpresaDesenvolvedoraCtrl extends AbstractWizardCtrl implements ControlledScreen {

	@FXML
	private TextField txtRazaoSocial, txtCnpj, txtInscEstad;
	@FXML
	private TextField txtRua, txtNumero, txtComplemento, txtBairro, txtMunicipio, txtUf, txtCep;
	@FXML
	private TextField txtNome, txtCpf, txtEmail, txtTelefone, txtResponsavel;

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
        myController.setScreen(IScreens.ID_LAUDO_INICIAL);
    }

	@Override
	protected void nextScreen() {
		myController.setScreen(IScreens.ID_OTC);
	}

	@Override
	protected boolean isValido() {
		return ValidationFields.checkEmptyFields(txtRazaoSocial, txtCnpj, txtInscEstad, txtRua, txtNumero,
				txtComplemento, txtBairro, txtMunicipio, txtUf, txtCep, txtNome, txtCpf, txtEmail, txtTelefone,
				txtResponsavel);
	}

	@Override
	protected void salvar() {
		// TODO falta implementar a parte de salvar
	}
}
