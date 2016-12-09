package br.ufg.inf.generator.xml.estrutura;

import br.ufg.inf.generator.xml.estrutura.mensagem.TestadorAprovacaoRelatorio;
import br.ufg.inf.generator.xml.estrutura.mensagem.TestadorExecucaoTestes;
import br.ufg.inf.generator.xml.estrutura.mensagem.NaoConformidade;
import br.ufg.inf.generator.xml.estrutura.mensagem.Emissao;
import br.ufg.inf.generator.xml.estrutura.mensagem.RoteiroAnalise;
import br.ufg.inf.generator.xml.estrutura.sistemasgestao.Sistemas;
import br.ufg.inf.generator.xml.estrutura.mensagem.CaracteristicasPaf;
import br.ufg.inf.generator.xml.estrutura.mensagem.IdentificacaoPaf;
import br.ufg.inf.generator.xml.estrutura.mensagem.Otc;
import br.ufg.inf.generator.xml.estrutura.mensagem.Desenvolvedora;
import br.ufg.inf.generator.xml.estrutura.comum.MarcaModelo;
import br.ufg.inf.generator.xml.estrutura.comum.MarcasModelosCompativeis;
import java.util.List;

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
    private List<Sistemas> sistemasGestao;

    @ElementList(name = "SistemasPed", required = true)
    private List<Sistemas> sistemasPed;

    @ElementList(name = "SistemasPedNfe", required = true)
    private List<Sistemas> sistemasPedNfe;

    @ElementList(name = "EcfAnaliseFuncional", required = true)
    private List<MarcaModelo> ecfAnaliseFuncional;

    @Element(required = true)
    private MarcasModelosCompativeis marcasModelosCompativeis;

    @Element(name = "VersaoErPaf", required = true)
    private String versaoErPaf;

    @Element(name = "RoteiroAnalise", required = true)
    private RoteiroAnalise roteiroAnalise;

    @ElementList(name = "NaoConformidades", required = true)
    private List<NaoConformidade> naoConformidades;

    @Element(name = "ComentarioOtc", required = true)
    private String comentarioOtc;

    @Element(name = "Declaracao", required = true)
    private String declaracao;

    @Element(name = "Emissao", required = true)
    private Emissao emissao;

    @Element(name = "ExecucaoTestes", required = true)
    private TestadorExecucaoTestes execucaoTestes;

    @Element(name = "AprovacaoRelatorio", required = true)
    private TestadorAprovacaoRelatorio aprovacaoRelatorio;

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

    public List<Sistemas> getSistemasGestao() {
        return sistemasGestao;
    }

    public void setSistemasGestao(List<Sistemas> sistemasGestao) {
        this.sistemasGestao = sistemasGestao;
    }

    public List<Sistemas> getSistemasPed() {
        return sistemasPed;
    }

    public void setSistemasPed(List<Sistemas> sistemasPed) {
        this.sistemasPed = sistemasPed;
    }

    public List<Sistemas> getSistemasPedNfe() {
        return sistemasPedNfe;
    }

    public void setSistemasPedNfe(List<Sistemas> sistemasPedNfe) {
        this.sistemasPedNfe = sistemasPedNfe;
    }

    public List<MarcaModelo> getEcfAnaliseFuncional() {
        return ecfAnaliseFuncional;
    }

    public void setEcfAnaliseFuncional(List<MarcaModelo> ecfAnaliseFuncional) {
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

    public List<NaoConformidade> getNaoConformidades() {
        return naoConformidades;
    }

    public void setNaoConformidades(List<NaoConformidade> naoConformidades) {
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

    public TestadorExecucaoTestes getExecucaoTestes() {
        return execucaoTestes;
    }

    public void setExecucaoTestes(TestadorExecucaoTestes execucaoTestes) {
        this.execucaoTestes = execucaoTestes;
    }

    public TestadorAprovacaoRelatorio getAprovacaoRelatorio() {
        return aprovacaoRelatorio;
    }

    public void setAprovacaoRelatorio(TestadorAprovacaoRelatorio aprovacaoRelatorio) {
        this.aprovacaoRelatorio = aprovacaoRelatorio;
    }
}
