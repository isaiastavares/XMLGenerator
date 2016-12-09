package br.ufg.inf.generator.xml;

import br.ufg.inf.generator.xml.estrutura.mensagem.AprovacaoRelatorio;
import br.ufg.inf.generator.xml.estrutura.mensagem.ExecucaoTestes;
import br.ufg.inf.generator.xml.estrutura.mensagem.NaoConformidade;
import br.ufg.inf.generator.xml.estrutura.mensagem.Emissao;
import br.ufg.inf.generator.xml.estrutura.mensagem.RoteiroAnalise;
import br.ufg.inf.generator.xml.estrutura.comum.Sistemas;
import br.ufg.inf.generator.xml.estrutura.mensagem.CaracteristicasPaf;
import br.ufg.inf.generator.xml.estrutura.mensagem.IdentificacaoPaf;
import br.ufg.inf.generator.xml.estrutura.mensagem.Otc;
import br.ufg.inf.generator.xml.estrutura.mensagem.Desenvolvedora;
import br.ufg.inf.generator.xml.estrutura.comum.MarcaModelo;
import br.ufg.inf.generator.xml.estrutura.comum.MarcasModelosCompativeis;
import java.util.ArrayList;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

public class Mensagem extends LaudoBase {

    @Element(name = "Numero", required = true)
    private String numero;

    @Element(name = "EmiteNfe", required = true)
    private Boolean emiteNFe;

    @Element(name = "Desenvolvedora", required = true)
    private Desenvolvedora desenvolvedora;

    @Element(name = "Otc", required = true)
    private Otc otc;

    @Element(name = "IdentificacaoPaf", required = true)
    private IdentificacaoPaf identificacaoPaf;

    @Element(name = "CaracteristicasPaf", required = true)
    private CaracteristicasPaf caracteristicasPaf;

    @ElementList(name = "SistemasGestao", required = true)
    private ArrayList<Sistemas> sistemasGestao;

    @ElementList(name = "SistemasPed", required = true)
    private ArrayList<Sistemas> sistemasPed;

    @ElementList(name = "SistemasPedNfe", required = true)
    private ArrayList<Sistemas> sistemasPedNfe;

    @ElementList(name = "EcfAnaliseFuncional", required = true)
    private ArrayList<MarcaModelo> ecfAnaliseFuncional;

    @Element(required = true)
    private MarcasModelosCompativeis marcasModelosCompativeis;

    @Element(name = "VersaoErPaf", required = true)
    private String versaoErPaf;

    @Element(name = "RoteiroAnalise", required = true)
    private RoteiroAnalise roteiroAnalise;

    @ElementList(name = "NaoConformidades", required = true)
    private ArrayList<NaoConformidade> naoConformidades;

    @Element(name = "ComentarioOtc", required = true)
    private String comentarioOtc;

    @Element(name = "Declaracao", required = true)
    private String declaracao;

    @Element(name = "Emissao", required = true)
    private Emissao emissao;

    @Element(name = "ExecucaoTestes", required = true)
    private ExecucaoTestes execucaoTestes;

    @Element(name = "AprovacaoRelatorio", required = true)
    private AprovacaoRelatorio aprovacaoRelatorio;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Boolean getEmiteNFe() {
        return emiteNFe;
    }

    public void setEmiteNFe(Boolean emiteNFe) {
        this.emiteNFe = emiteNFe;
    }

    public Desenvolvedora getDesenvolvedora() {
        return desenvolvedora;
    }

    public void setDesenvolvedora(Desenvolvedora desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
    }

    public Otc getOtc() {
        return otc;
    }

    public void setOtc(Otc otc) {
        this.otc = otc;
    }

    public IdentificacaoPaf getIdentificacaoPaf() {
        return identificacaoPaf;
    }

    public void setIdentificacaoPaf(IdentificacaoPaf identificacaoPaf) {
        this.identificacaoPaf = identificacaoPaf;
    }

    public CaracteristicasPaf getCaracteristicasPaf() {
        return caracteristicasPaf;
    }

    public void setCaracteristicasPaf(CaracteristicasPaf caracteristicasPaf) {
        this.caracteristicasPaf = caracteristicasPaf;
    }

    public ArrayList<Sistemas> getSistemasGestao() {
        return sistemasGestao;
    }

    public void setSistemasGestao(ArrayList<Sistemas> sistemasGestao) {
        this.sistemasGestao = sistemasGestao;
    }

    public ArrayList<Sistemas> getSistemasPed() {
        return sistemasPed;
    }

    public void setSistemasPed(ArrayList<Sistemas> sistemasPed) {
        this.sistemasPed = sistemasPed;
    }

    public ArrayList<Sistemas> getSistemasPedNfe() {
        return sistemasPedNfe;
    }

    public void setSistemasPedNfe(ArrayList<Sistemas> sistemasPedNfe) {
        this.sistemasPedNfe = sistemasPedNfe;
    }

    public ArrayList<MarcaModelo> getEcfAnaliseFuncional() {
        return ecfAnaliseFuncional;
    }

    public void setEcfAnaliseFuncional(ArrayList<MarcaModelo> ecfAnaliseFuncional) {
        this.ecfAnaliseFuncional = ecfAnaliseFuncional;
    }

    public MarcasModelosCompativeis getMarcasModelosCompativeis() {
        return marcasModelosCompativeis;
    }

    public void setMarcasModelosCompativeis(MarcasModelosCompativeis marcasModelosCompativeis) {
        this.marcasModelosCompativeis = marcasModelosCompativeis;
    }

    public String getVersaoErPaf() {
        return versaoErPaf;
    }

    public void setVersaoErPaf(String versaoErPaf) {
        this.versaoErPaf = versaoErPaf;
    }

    public RoteiroAnalise getRoteiroAnalise() {
        return roteiroAnalise;
    }

    public void setRoteiroAnalise(RoteiroAnalise roteiroAnalise) {
        this.roteiroAnalise = roteiroAnalise;
    }

    public ArrayList<NaoConformidade> getNaoConformidades() {
        return naoConformidades;
    }

    public void setNaoConformidades(ArrayList<NaoConformidade> naoConformidades) {
        this.naoConformidades = naoConformidades;
    }

    public String getComentarioOtc() {
        return comentarioOtc;
    }

    public void setComentarioOtc(String comentarioOtc) {
        this.comentarioOtc = comentarioOtc;
    }

    public String getDeclaracao() {
        return declaracao;
    }

    public void setDeclaracao(String declaracao) {
        this.declaracao = declaracao;
    }

    public Emissao getEmissao() {
        return emissao;
    }

    public void setEmissao(Emissao emissao) {
        this.emissao = emissao;
    }

    public ExecucaoTestes getExecucaoTestes() {
        return execucaoTestes;
    }

    public void setExecucaoTestes(ExecucaoTestes execucaoTestes) {
        this.execucaoTestes = execucaoTestes;
    }

    public AprovacaoRelatorio getAprovacaoRelatorio() {
        return aprovacaoRelatorio;
    }

    public void setAprovacaoRelatorio(AprovacaoRelatorio aprovacaoRelatorio) {
        this.aprovacaoRelatorio = aprovacaoRelatorio;
    }
}
