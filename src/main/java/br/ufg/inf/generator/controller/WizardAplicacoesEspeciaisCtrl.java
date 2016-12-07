/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.generator.controller;

import javafx.fxml.FXML;

/**
 *
 * @author hiago
 */
public class WizardAplicacoesEspeciaisCtrl  extends AbstractWizardCtrl implements ControlledScreen {

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
		// TODO falta dizer a proxima tela
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
