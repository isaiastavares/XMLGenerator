package br.ufg.inf.generator.telas.controladores;

import br.ufg.inf.generator.validadores.valores.ValidationFields;
import br.ufg.inf.generator.xml.estrutura.comum.Endereco;
import br.ufg.inf.generator.xml.estrutura.desenvolvedora.Contato;
import br.ufg.inf.generator.xml.estrutura.mensagem.Desenvolvedora;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class WizardEmpresaDesenvolvedoraCtrl extends AbstractWizardCtrl implements ControlledScreen {

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
    private TextField txtNome;
    @FXML
    private TextField txtCpf;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtTelefone;
    @FXML
    private TextField txtResponsavel;

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
        Desenvolvedora desenvolvedora = new Desenvolvedora();
        desenvolvedora.setRazaoSocial(txtRazaoSocial.getText());
        desenvolvedora.setCnpj(txtCnpj.getText());
        desenvolvedora.setInscricaoEstadual(txtInscEstad.getText());
        desenvolvedora.setEndereco(getEndereco());
        desenvolvedora.setContato(getContato());
        desenvolvedora.setRespAcompTestes(txtResponsavel.getText());
        getMensagem().setDesenvolvedora(desenvolvedora);
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

    private Contato getContato() {
        Contato contato = new Contato();
        contato.setNome(txtNome.getText());
        contato.setCpf(txtCpf.getText());
        contato.setTelefone(txtTelefone.getText());
        contato.setEmail(txtEmail.getText());
        return contato;
    }
}
