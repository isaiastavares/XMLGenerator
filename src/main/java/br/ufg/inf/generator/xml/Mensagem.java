package br.ufg.inf.generator.xml;

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
    private ArrayList<SistemaGestao> sistemasGestao;

    @ElementList(name = "SistemasPed", required = true)
    private ArrayList<SistemaPed> sistemasPed;

    @ElementList(name = "SistemasPedNfe", required = true)
    private ArrayList<SistemaPedNfe> sistemasPedNfe;

    @ElementList(name = "EcfAnaliseFuncional", required = true)
    private ArrayList<MarcaModelo> ecfAnaliseFuncional;

    @ElementList(name = "MarcasModelosCompativeis", required = true)
    private ArrayList<MarcaModelo> marcasModelosCompativeis;

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

    public ArrayList<SistemaGestao> getSistemasGestao() {
        return sistemasGestao;
    }

    public void setSistemasGestao(ArrayList<SistemaGestao> sistemasGestao) {
        this.sistemasGestao = sistemasGestao;
    }

    public ArrayList<SistemaPed> getSistemasPed() {
        return sistemasPed;
    }

    public void setSistemasPed(ArrayList<SistemaPed> sistemasPed) {
        this.sistemasPed = sistemasPed;
    }

    public ArrayList<SistemaPedNfe> getSistemasPedNfe() {
        return sistemasPedNfe;
    }

    public void setSistemasPedNfe(ArrayList<SistemaPedNfe> sistemasPedNfe) {
        this.sistemasPedNfe = sistemasPedNfe;
    }

    public ArrayList<MarcaModelo> getEcfAnaliseFuncional() {
        return ecfAnaliseFuncional;
    }

    public void setEcfAnaliseFuncional(ArrayList<MarcaModelo> ecfAnaliseFuncional) {
        this.ecfAnaliseFuncional = ecfAnaliseFuncional;
    }

    public ArrayList<MarcaModelo> getMarcasModelosCompativeis() {
        return marcasModelosCompativeis;
    }

    public void setMarcasModelosCompativeis(ArrayList<MarcaModelo> marcasModelosCompativeis) {
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
