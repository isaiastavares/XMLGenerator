package br.ufg.inf.generator.telas.controladores;

import br.ufg.inf.generator.validadores.valores.ValidationFields;
import br.ufg.inf.generator.xml.estrutura.comum.Endereco;
import br.ufg.inf.generator.xml.estrutura.mensagem.Otc;
import br.ufg.inf.generator.xml.estrutura.otc.PeriodoAnalise;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class WizardOtcCtrl extends AbstractWizardCtrl implements ControlledScreen {

    @FXML
    private TextField txtRazaoSocial;
    @FXML
    private TextField txtCnpj;
    @FXML
    private TextField txtInscEstad;
    @FXML
    private TextField txtRua;
    @FXML
    private TextField txtNumero;
    @FXML
    private TextField txtComplemento;
    @FXML
    private TextField txtBairro;
    @FXML
    private TextField txtMunicipio;
    @FXML
    private TextField txtUf;
    @FXML
    private TextField txtCep;
    @FXML
    private TextField txtVersAtoCotepe;
    @FXML
    private DatePicker dateInicio;
    @FXML
    private DatePicker dateFim;

    private ScreensController myController;

    @FXML
    public void initialize() {
        getBackButton().setOnAction(event -> back());
        getNextButton().setOnAction(event -> next());
        initializeFinishButton();
    }

    @Override
    public void setScreenParent(ScreensController screenPage) {
        myController = screenPage;
    }

    @Override
    protected void back() {
        myController.setScreen(IScreens.ID_EMPRESA_DESENVOLVEDORA);
    }

    @Override
    protected void nextScreen() {
        myController.setScreen(IScreens.ID_SISTEMA_PAF);
    }

    @Override
    protected boolean isValido() {
        return ValidationFields.checkEmptyFields(txtRazaoSocial, txtCnpj, txtInscEstad, txtRua, txtNumero,
                txtComplemento, txtBairro, txtMunicipio, txtUf, txtCep, txtVersAtoCotepe);
    }

    @Override
    protected void salvar() {
        Otc otc = new Otc();
        otc.setRazaoSocial(txtRazaoSocial.getText());
        otc.setCnpj(txtCnpj.getText());
        otc.setInscricaoEstadual(txtInscEstad.getText());
        otc.setEndereco(getEndereco());
        otc.setPeriodoAnalise(getPeriodoAnalise());
        otc.setVersaoCotepe(txtVersAtoCotepe.getText());
        getMensagem().setOtc(otc);
    }

    private Endereco getEndereco() {
        Endereco endereco = new Endereco();
        endereco.setLogradouro(txtRua.getText());
        endereco.setNumero(txtNumero.getText());
        endereco.setComplemento(txtComplemento.getText());
        endereco.setBairro(txtBairro.getText());
        endereco.setMunicipio(txtMunicipio.getText());
        endereco.setUf(txtUf.getText());
        endereco.setCep(txtCep.getText());
        return endereco;
    }

    private PeriodoAnalise getPeriodoAnalise() {
        PeriodoAnalise periodoAnalise = new PeriodoAnalise();
        periodoAnalise.setDataInicio(dateInicio.getValue());
        periodoAnalise.setDataFim(dateFim.getValue());
        return periodoAnalise;
    }
}
