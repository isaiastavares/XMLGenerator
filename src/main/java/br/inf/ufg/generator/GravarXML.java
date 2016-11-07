package br.inf.ufg.generator;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import javax.swing.JOptionPane;

import br.inf.ufg.generator.view.N_Final;

/**
 *
 * @author Hiago
 */
public class GravarXML {

    private static Formatter gravador;
    private static final String cargoGerente = "Gerente de Testes";
    private static final String cargoAprovacao = "Coordenador de Testes";
    public static Map<Integer, GravarXML> mapa = new HashMap<>();

//    Classe responsavel por gravar os laudos no formato ".xml"
    public void criarArquivo(String laudo) {
        try {
            gravador = new Formatter(laudo + ".xml");

        } catch (FileNotFoundException error) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o arquivo!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
        }
    }

    //  Classe responsavel por gravar as informaÃ§Ãµes iniciais do sistema
    public void inicializa(String laudo) {
//        mapa.put(1, this);    //Adicionando o objeto dentro da lista;
        try {
            gravador.format("<?xml version=\"1.0\" encoding=\"UTF-8\"?>%n");
            gravador.format("<Laudo Versao=\"1.0\">%n");
            gravador.format("<Mensagem>%n");
            gravador.format("<Numero>" + laudo + "</Numero>%n");
            gravador.format("<EmiteNfe>true</EmiteNfe>%n");
            mapa.put(1, this);
        } catch (NoSuchElementException error) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o arquivo!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
        }
    }

    //  Classe responsavel por gravar as informaÃ§Ãµes da Empresa desenvolvedora requerente
    public void empresaRequerente(String razaoSocial, String cnpj, String ie, String rua, String numero, String complemento,
            String bairro, String municipio, String uf, String cep, String nome, String cpf, String telefone,
            String email, String responsavel) {

        try {
            gravador.format("<Desenvolvedora>%n");
            gravador.format("<RazaoSocial>" + razaoSocial + "</RazaoSocial>%n");
            gravador.format("<Cnpj>" + cnpj + "</Cnpj>%n");
            gravador.format("<Ie>" + ie + "</Ie>%n");
            gravador.format("<Endereco>%n");
            gravador.format("<Logradouro>" + rua + "</Logradouro>%n");
            gravador.format("<Numero>" + numero + "</Numero>%n");
            gravador.format("<Complemento>" + complemento + "</Complemento>%n");
            gravador.format("<Bairro>" + bairro + "</Bairro>%n");
            gravador.format("<Municipio>" + municipio + "</Municipio>%n");
            gravador.format("<Uf>" + uf + "</Uf>%n");
            gravador.format("<Cep>" + cep + "</Cep>%n");
            gravador.format("</Endereco>%n");
            gravador.format("<Contato>%n");
            gravador.format("<Nome>" + nome + "</Nome>%n");
            gravador.format("<Cpf>" + cpf + "</Cpf>%n");
            gravador.format("<Telefone>" + telefone + "</Telefone>%n");
            gravador.format("<Email>" + email + "</Email>%n");
            gravador.format("</Contato>%n");
            gravador.format("<ResponsavelAcompanhamentoTestes>" + responsavel + "</ResponsavelAcompanhamentoTestes>%n");
            gravador.format("</Desenvolvedora>%n");
        } catch (NoSuchElementException error) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o arquivo!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void OTC(String razaoSocial, String cnpj, String ie, String rua, String numero, String complemento,
            String bairro, String municipio, String uf, String cep, String dataInicio, String dataFim, String VersaoAto) {

        try {
            gravador.format("<Otc>%n");
            gravador.format("<RazaoSocial>" + razaoSocial + "</RazaoSocial>%n");
            gravador.format("<Cnpj>" + cnpj + "</Cnpj>%n");
            gravador.format("<Ie>" + ie + "</Ie>%n");
            gravador.format("<Endereco>%n");
            gravador.format("<Logradouro>" + rua + "</Logradouro>%n");
            gravador.format("<Numero>" + numero + "</Numero>%n");
            gravador.format("<Complemento>" + complemento + "</Complemento>%n");
            gravador.format("<Bairro>" + bairro + "</Bairro>%n");
            gravador.format("<Municipio>" + municipio + "</Municipio>%n");
            gravador.format("<Uf>" + uf + "</Uf>%n");
            gravador.format("<Cep>" + cep + "</Cep>%n");
            gravador.format("</Endereco>%n");
            gravador.format("<PeriodoAnalise>%n");
            gravador.format("<DataInicio>" + dataInicio + "</DataInicio>%n");
            gravador.format("<DataFim>" + dataFim + "</DataFim>%n");
            gravador.format("</PeriodoAnalise>%n");
            gravador.format("<VersaoEspecificacaoRequisitos>" + VersaoAto + "</VersaoEspecificacaoRequisitos>%n");
            gravador.format("</Otc>%n");
        } catch (NoSuchElementException error) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o arquivo!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void IdentificacaoPaf(String nomeComercial, String versao, String nomeExe,
            String mdExe, String nomeLista, String mdLista) {

        try {
            gravador.format("<IdentificacaoPaf>%n");
            gravador.format("<NomeComercial>" + nomeComercial + "</NomeComercial>%n");
            gravador.format("<Versao>" + versao + "</Versao>%n");
            gravador.format("<ArquivoExecutavelPrincipal>%n");
            gravador.format("<Nome>" + nomeExe + "</Nome>%n");
            gravador.format("<Md5>" + mdExe + "</Md5>%n");
            gravador.format("</ArquivoExecutavelPrincipal>%n");
            gravador.format("<ArquivoRelacaoExecutaveis>%n");
            gravador.format("<Nome>" + nomeLista + "</Nome>%n");
            gravador.format("<Md5>" + mdLista + "</Md5>%n");
            gravador.format("</ArquivoRelacaoExecutaveis>%n");
            gravador.format("<ArquivosExecutaveis>%n");
        } catch (NoSuchElementException error) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o arquivo!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void addArquivo(String nome, String md5) {

        try {
            gravador.format("<ArquivoExecutavel>%n");
            gravador.format("<Nome>" + nome + "</Nome>%n");
            gravador.format("<Md5>" + md5 + "</Md5>%n");
            gravador.format("</ArquivoExecutavel>%n");
        } catch (NoSuchElementException error) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o arquivo!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void finalizarIdentificacaoPaf(String nomeRelacao, String mdRelacao,
            String marcaEnv, String modeloEnv, String numEnv, String perfil) {

        try {
            gravador.format("</ArquivosExecutaveis>%n");
            gravador.format("<ArquivosOutros>%n");
            gravador.format("<ArquivoOutro>%n");
            gravador.format("<Nome>" + nomeRelacao + "</Nome>%n");
            gravador.format("<Md5>" + mdRelacao + "</Md5>%n");
            gravador.format("</ArquivoOutro>%n");
            gravador.format("</ArquivosOutros>%n");
            gravador.format("<EnvelopeSeguranca>%n");
            gravador.format("<Marca>" + marcaEnv + "</Marca>%n");
            gravador.format("<Modelo>" + modeloEnv + "</Modelo>%n");
            gravador.format("<Numero>" + numEnv + "</Numero>%n");
            gravador.format("</EnvelopeSeguranca>%n");
            gravador.format("<PerfisRequisitos>%n");
            gravador.format("<PerfilRequisito>" + perfil + "</PerfilRequisito>%n");
            gravador.format("</PerfisRequisitos>%n");
            gravador.format("</IdentificacaoPaf>%n");
        } catch (NoSuchElementException error) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o arquivo!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void caracteristicasPAF(String linguagem, String so, String bd, int tipoDesenvolvimento, int tipoFuncionamento,
            int gerarArquivo, int integracaoPAF) {

        try {
            gravador.format("<CaracteristicasPaf>%n");
            gravador.format("<LinguagemProgramacao>" + linguagem + "</LinguagemProgramacao>%n");
            gravador.format("<SistemaOperacional>" + so + "</SistemaOperacional>%n");
            gravador.format("<GerenciadorBancoDados>" + bd + "</GerenciadorBancoDados>%n");
            if (tipoDesenvolvimento == 1) {
                gravador.format("<TipoDesenvolvimento>" + "Comercializavel" + "</TipoDesenvolvimento>%n");
            } else if (tipoDesenvolvimento == 2) {
                gravador.format("<TipoDesenvolvimento>" + "Exclusivo proprio" + "</TipoDesenvolvimento>%n");
            } else if (tipoDesenvolvimento == 3) {
                gravador.format("<TipoDesenvolvimento>" + "Exclusivo terceirizado" + "</TipoDesenvolvimento>%n");
            }

            if (tipoFuncionamento == 1) {
                gravador.format("<TipoFuncionamento>" + "Exclusivamente 'Stand Alone'" + "</TipoFuncionamento>%n");
            } else if (tipoFuncionamento == 2) {
                gravador.format("<TipoFuncionamento>" + "Em Rede" + "</TipoFuncionamento>%n");
            } else if (tipoFuncionamento == 3) {
                gravador.format("<TipoFuncionamento>" + "Parametrizavel" + "</TipoFuncionamento>%n");
            }

            gravador.format("<MeioGeracaoArquivoSintegraEfd>%n");

            if (gerarArquivo == 1) {
                gravador.format("<Modo>" + "Pelo PAF ECF" + "</Modo>%n");
            } else if (gerarArquivo == 2) {
                gravador.format("<Modo>" + "Pelo Sistema de Retaguarda" + "</Modo>%n");
            } else if (gerarArquivo == 3) {
                gravador.format("<Modo>" + "Pelo Sistema PED ou EFD" + "</Modo>%n");
            }

            gravador.format("</MeioGeracaoArquivoSintegraEfd>%n");

            if (integracaoPAF == 1) {
                gravador.format("<IntegracaoPaf>" + "Com Sistema de Gestao ou Retaguarda" + "</IntegracaoPaf>%n");
            } else if (integracaoPAF == 2) {
                gravador.format("<IntegracaoPaf>" + "Com Sistema PED" + "</IntegracaoPaf>%n");
            } else if (integracaoPAF == 3) {
                gravador.format("<IntegracaoPaf>" + "Com Ambos" + "</IntegracaoPaf>%n");
            } else if (integracaoPAF == 4) {
                gravador.format("<IntegracaoPaf>" + "Nao Integrado" + "</IntegracaoPaf>%n");
            }

            gravador.format("<FormaImpressao>%n");
        } catch (NoSuchElementException error) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o arquivo!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void formaImpressao(String formaImpressao) {
        try {
            gravador.format("<Modo>" + formaImpressao + "</Modo>%n");
        } catch (NoSuchElementException error) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o arquivo!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void demaisCaracteristicasPaf(int interrupcao) {
        try {
            gravador.format("</FormaImpressao>%n");
            gravador.format("<TratamentoInterrupcao>%n");

            if (interrupcao == 1) {
                gravador.format("<Modo>" + "Recuperacao de Dados" + "</Modo>%n");
            } else if (interrupcao == 2) {
                gravador.format("<Modo>" + "Cancelamento Automatico" + "</Modo>%n");
            } else if (interrupcao == 3) {
                gravador.format("<Modo>" + "Bloqueio de Funcoes" + "</Modo>%n");
            }

            gravador.format("</TratamentoInterrupcao>%n");
            gravador.format("<AplicacoesEspeciais>%n");
        } catch (NoSuchElementException error) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o arquivo!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void aplicacoesEspeciais(String aplicacao) {
        try {
            gravador.format("<AplicacaoEspecial>" + aplicacao + "</AplicacaoEspecial>%n");
        } catch (NoSuchElementException error) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o arquivo!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void finalizaE() {
        try {
            gravador.format("</AplicacoesEspeciais>%n");
            gravador.format("</CaracteristicasPaf>%n");
        } catch (NoSuchElementException error) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o arquivo!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void iniciaSistemGestao() {
        try {
            gravador.format("<SistemasGestao>%n");
        } catch (NoSuchElementException error) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o arquivo!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void sistemGestao(String nomeSistema, String razaoSocial, String cnpj, String nomeArquivo, String md5, String req) {
        try {
            gravador.format("<SistemaGestao>%n");
            gravador.format("<Nome>" + nomeSistema + "</Nome>%n");
            gravador.format("<EmpresaDesenvolvedora>%n");
            gravador.format("<RazaoSocial>" + razaoSocial + "</RazaoSocial>%n");
            gravador.format("<Cnpj>" + cnpj + "</Cnpj>%n");
            gravador.format("</EmpresaDesenvolvedora>%n");
            gravador.format("<ArquivosExecutaveis>%n");
            gravador.format("<ArquivoExecutavel>%n");
            gravador.format("<Nome>" + nomeArquivo + "</Nome>%n");
            gravador.format("<Md5>" + md5 + "</Md5>%n");
            gravador.format("<RequisitosExecutados>%n");
            gravador.format("<RequisitoExecutado>" + req + "</RequisitoExecutado>%n");
            gravador.format("</RequisitosExecutados>%n");
            gravador.format("</ArquivoExecutavel>%n");
            gravador.format("</ArquivosExecutaveis>%n");
            gravador.format("</SistemaGestao>%n");
        } catch (NoSuchElementException error) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o arquivo!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void finalizaSistemGestao() {
        try {
            gravador.format("</SistemasGestao>%n");
        } catch (NoSuchElementException error) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o arquivo!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void iniciaSistemPed() {
        try {
            gravador.format("<SistemasPed>%n");
        } catch (NoSuchElementException error) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o arquivo!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void sistemaPed(String nomeSistema, String razaoSocial, String cnpj, String nomeArquivo, String md5, String funcao) {
        try {
            gravador.format("<SistemaPed>%n");
            gravador.format("<Nome>" + nomeSistema + "</Nome>%n");
            gravador.format("<EmpresaDesenvolvedora>%n");
            gravador.format("<RazaoSocial>" + razaoSocial + "</RazaoSocial>%n");
            gravador.format("<Cnpj>" + cnpj + "</Cnpj>%n");
            gravador.format("</EmpresaDesenvolvedora>%n");
            gravador.format("<ArquivosExecutaveis>%n");
            gravador.format("<ArquivoExecutavel>%n");
            gravador.format("<Nome>" + nomeArquivo + "</Nome>%n");
            gravador.format("<Md5>" + md5 + "</Md5>%n");
            gravador.format("<Funcao>" + funcao + "</Funcao>%n");
            gravador.format("</ArquivoExecutavel>%n");
            gravador.format("</ArquivosExecutaveis>%n");
            gravador.format("</SistemaPed>%n");
        } catch (NoSuchElementException error) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o arquivo!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void finalizaSistemaPed() {
        try {
            gravador.format("</SistemasPed>%n");
        } catch (NoSuchElementException error) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o arquivo!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void iniciaSistemPedNfe() {
        try {
            gravador.format("<SistemasPedNfe>%n");
        } catch (NoSuchElementException error) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o arquivo!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void sistemaPedNfe(String nomeSistema, String razaoSocial, String cnpj, String nomeArquivo, String md5, String funcao) {
        try {
            gravador.format("<SistemaPedNfe>%n");
            gravador.format("<Nome>" + nomeSistema + "</Nome>%n");
            gravador.format("<EmpresaDesenvolvedora>%n");
            gravador.format("<RazaoSocial>" + razaoSocial + "</RazaoSocial>%n");
            gravador.format("<Cnpj>" + cnpj + "</Cnpj>%n");
            gravador.format("</EmpresaDesenvolvedora>%n");
            gravador.format("<ArquivosExecutaveis>%n");
            gravador.format("<ArquivoExecutavel>%n");
            gravador.format("<Nome>" + nomeArquivo + "</Nome>%n");
            gravador.format("<Md5>" + md5 + "</Md5>%n");
            gravador.format("<Funcao>" + funcao + "</Funcao>%n");
            gravador.format("</ArquivoExecutavel>%n");
            gravador.format("</ArquivosExecutaveis>%n");
            gravador.format("</SistemaPedNfe>%n");
        } catch (NoSuchElementException error) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o arquivo!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void finalizaSistemaPedNfe() {
        try {
            gravador.format("</SistemasPedNfe>%n");
        } catch (NoSuchElementException error) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o arquivo!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void ecfAnalise(String marca, String modelo) {
        try {
            gravador.format("<EcfAnaliseFuncional>%n");
            gravador.format("<MarcaModelo>%n");
            gravador.format("<Marca>" + marca + "</Marca>%n");
            gravador.format("<Modelo>" + modelo + "</Modelo>%n");
            gravador.format("</MarcaModelo>%n");
            gravador.format("</EcfAnaliseFuncional>%n");
            gravador.format("<MarcasModelosCompativeis>%n");
        } catch (NoSuchElementException error) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o arquivo!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void ecfCompativel(String marca, String modelo) {
        try {
            gravador.format("<MarcaModelo>%n");
            gravador.format("<Marca>" + marca + "</Marca>%n");
            gravador.format("<Modelo>" + modelo + "</Modelo>%n");
            gravador.format("</MarcaModelo>%n");
        } catch (NoSuchElementException error) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o arquivo!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void finalizaEcfCompativel() {
        try {
            gravador.format("</MarcasModelosCompativeis>%n");
        } catch (NoSuchElementException error) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o arquivo!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void roteiro(String versaoAto, String versaoRoteiro, String mes, String ano, int declaracaoConfomidade) {
        try {
            gravador.format("<VersaoErPaf>" + versaoAto + "</VersaoErPaf>%n");
            gravador.format("<RoteiroAnalise>%n");
            gravador.format("<VersaoRoteiro>" + versaoRoteiro + "</VersaoRoteiro>%n");
            gravador.format("<Mes>" + mes + "</Mes>%n");
            gravador.format("<Ano>" + ano + "</Ano>%n");
            gravador.format("</RoteiroAnalise>%n");
            gravador.format("<NaoConformidades>%n");
            gravador.format("</NaoConformidades>%n");
            gravador.format("<ComentarioOtc>%n");
            gravador.format("</ComentarioOtc>%n");
            if (declaracaoConfomidade == 1) {
                gravador.format("<Declaracao>true</Declaracao>%n");
            } else {
                gravador.format("<Declaracao>false</Declaracao>%n");
            }
        } catch (NoSuchElementException error) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o arquivo!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void finalizacao(String dia, String mes, String ano, String local, int gerente, int aprovacao) {
        try {
            gravador.format("<Emissao>%n");
            gravador.format("<Data>" + ano + "-" + mes + "-" + dia + "</Data>%n");
            gravador.format("<Local>" + local + "</Local>%n");
            gravador.format("</Emissao>%n");
            gravador.format("<ExecucaoTestes>%n");
            if (gerente == 1) {
                gravador.format("<Nome>Hiago Augusto Koziel Rahmig</Nome>%n");
                gravador.format("<Cargo>" + cargoGerente + "</Cargo>%n");
                gravador.format("<Cpf>002.684.351-03</Cpf>%n");
            }
            if (gerente == 2) {
                gravador.format("<Nome>Paulo de Oliveira Neto</Nome>%n");
                gravador.format("<Cargo>" + cargoGerente + "</Cargo>%n");
                gravador.format("<Cpf>700.209.871-37</Cpf>%n");
            }
            if (gerente == 3) {
                gravador.format("<Nome>" + N_Final.getNomeGerente() + "</Nome>%n");
                gravador.format("<Cargo>" + cargoGerente + "</Cargo>%n");
                gravador.format("<Cpf>" + N_Final.getCPFGerente() + "</Cpf>%n");
            }
            gravador.format("</ExecucaoTestes>%n");
            gravador.format("<AprovacaoRelatorio>%n");
            if (aprovacao == 1) {
                gravador.format("<Nome>Edmundo Sergio Spoto</Nome>%n");
                gravador.format("<Cargo>" + cargoAprovacao + "</Cargo>%n");
                gravador.format("<Cpf>058.884.758-58</Cpf>%n");
            }
            if (aprovacao == 2) {
                gravador.format("<Nome>Marcelo Ricardo Quinta</Nome>%n");
                gravador.format("<Cargo>" + cargoAprovacao + "</Cargo>%n");
                gravador.format("<Cpf>020.748.911-48</Cpf>%n");
            }
            if (aprovacao == 3) {
                gravador.format("<Nome>Juliana Pereira de Souza Zinader</Nome>%n");
                gravador.format("<Cargo>" + cargoAprovacao + "</Cargo>%n");
                gravador.format("<Cpf>312.397.118-08</Cpf>%n");
            }
            if (aprovacao == 4) {
                gravador.format("<Nome>Taciana Novo Kudo</Nome>%n");
                gravador.format("<Cargo>" + cargoAprovacao + "</Cargo>%n");
                gravador.format("<Cpf>277.740.468-28</Cpf>%n");
            }
            if (aprovacao == 5) {
                gravador.format("<Nome>" + N_Final.getNomeAprovacao() + "</Nome>%n");
                gravador.format("<Cargo>" + cargoAprovacao + "</Cargo>%n");
                gravador.format("<Cpf>" + N_Final.getCPFAprovacao() + "</Cpf>%n");
            }
            gravador.format("</AprovacaoRelatorio>%n");
            gravador.format("</Mensagem>%n");
            gravador.format("</Laudo>%n");
        } catch (NoSuchElementException error) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o arquivo!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void fecharArquivo() {
        if (gravador != null) {
            gravador.close();
        }
    }
}
