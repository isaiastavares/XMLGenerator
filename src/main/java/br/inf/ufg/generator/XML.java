package br.inf.ufg.generator;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

import br.inf.ufg.generator.view.A_JanelaInicial;
import br.inf.ufg.generator.view.B_EmpresaDesenvolvedora;
import br.inf.ufg.generator.view.C_OTC;
import br.inf.ufg.generator.view.D_IdentificacaoPAF;
import br.inf.ufg.generator.view.E_CaracteristicasPAF;
import br.inf.ufg.generator.view.F_AplicacoesEspeciais;
import br.inf.ufg.generator.view.G_SistemaGestao;
import br.inf.ufg.generator.view.H_SistemaPED;
import br.inf.ufg.generator.view.I_SistemaPedNfe;
import br.inf.ufg.generator.view.J_EcfHomologacao;
import br.inf.ufg.generator.view.K_EcfCompativel;
import br.inf.ufg.generator.view.L_EcfCompativelExtra;
import br.inf.ufg.generator.view.M_RoteiroAnalise;
import br.inf.ufg.generator.view.N_Final;

/**
 *
 * @author Hiago
 */
public class XML {

    public static void RealizarProcesso() {

        A_JanelaInicial janela = new A_JanelaInicial();
        String laudo = janela.InicializarProcesso();
        GravarXML arquivo = new GravarXML();

        arquivo.criarArquivo(laudo);

        arquivo.inicializa(laudo);

        //Gerando dados para a empresa desenvolvedora
        B_EmpresaDesenvolvedora empresa = new B_EmpresaDesenvolvedora();
        while (B_EmpresaDesenvolvedora.getFlag() == false) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Erro!");
            }
        }
        arquivo.empresaRequerente(razao, cnpj, ie, rua, numero, complemento,
                bairro, municipio, uf, cep, nome, cpf, telefone, email,
                responsAcompTestes);

//        Gerando dados para o órgão técnico credenciado - OTC
        C_OTC otc = new C_OTC();
        while (C_OTC.getFlag() == false) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Erro!");
            }
        }
        arquivo.OTC(razao, cnpj, ie, rua, numero, complemento,
                bairro, municipio, uf, cep, dataInicio, dataFim, VersaoAto);
        //Gerando dados para o órgão técnico credenciado - OTC
        D_IdentificacaoPAF identpaf = new D_IdentificacaoPAF();
        while (D_IdentificacaoPAF.getFlag() == false) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Erro!");
            }
        }
        arquivo.IdentificacaoPaf(nomeComercial, versao, nomeExe, mdExe, nomeLista, mdLista);
        if (D_IdentificacaoPAF.isEdit1() == true) {
            if (!"".equals(nome1) && !"".equals(md1)) {
                arquivo.addArquivo(nome1, md1);
            }
        }

        if (D_IdentificacaoPAF.isEdit2() == true) {
            if (!"".equals(nome2) && !"".equals(md2)) {
                arquivo.addArquivo(nome2, md2);
            }
        }

        if (D_IdentificacaoPAF.isEdit3() == true) {
            if (!"".equals(nome3) && !"".equals(md3)) {
                arquivo.addArquivo(nome3, md3);
            }
        }

        if (D_IdentificacaoPAF.isEdit4() == true) {
            if (!"".equals(nome4) && !"".equals(md4)) {
                arquivo.addArquivo(nome4, md4);
            }
        }

        if (D_IdentificacaoPAF.isEdit5() == true) {
            if (!"".equals(nome5) && !"".equals(md5)) {
                arquivo.addArquivo(nome5, md5);
            }
        }

        if (D_IdentificacaoPAF.isEdit6() == true) {
            if (!"".equals(nome6) && !"".equals(md6)) {
                arquivo.addArquivo(nome6, md6);
            }
        }

        if (D_IdentificacaoPAF.isEdit7() == true) {
            if (!"".equals(nome7) && !"".equals(md7)) {
                arquivo.addArquivo(nome7, md7);
            }
        }

        if (D_IdentificacaoPAF.isEdit8() == true) {
            if (!"".equals(nome8) && !"".equals(md8)) {
                arquivo.addArquivo(nome8, md8);
            }
        }

        if (D_IdentificacaoPAF.isEdit9() == true) {
            if (!"".equals(nome9) && !"".equals(md9)) {
                arquivo.addArquivo(nome9, md9);
            }
        }

        if (D_IdentificacaoPAF.isEdit10() == true) {
            if (!"".equals(nome10) && !"".equals(md10)) {
                arquivo.addArquivo(nome10, md10);
            }
        }

        if (D_IdentificacaoPAF.isEdit11() == true) {
            if (!"".equals(nome11) && !"".equals(md11)) {
                arquivo.addArquivo(nome11, md11);
            }
        }

        if (D_IdentificacaoPAF.isEdit12() == true) {
            if (!"".equals(nome12) && !"".equals(md12)) {
                arquivo.addArquivo(nome12, md12);
            }
        }

        if (D_IdentificacaoPAF.isEdit13() == true) {
            if (!"".equals(nome13) && !"".equals(md13)) {
                arquivo.addArquivo(nome13, md13);
            }
        }

        if (D_IdentificacaoPAF.isEdit14() == true) {
            if (!"".equals(nome14) && !"".equals(md14)) {
                arquivo.addArquivo(nome14, md14);
            }
        }

        if (D_IdentificacaoPAF.isEdit15() == true) {
            if (!"".equals(nome15) && !"".equals(md15)) {
                arquivo.addArquivo(nome15, md15);
            }
        }

        arquivo.finalizarIdentificacaoPaf(nomeRelacao, mdRelacao, marcaEnv, modeloEnv, numEnv, perfil);

        E_CaracteristicasPAF caracteristica = new E_CaracteristicasPAF();

        while (E_CaracteristicasPAF.getFlag() == false) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Erro!");
            }
        }

        arquivo.caracteristicasPAF(linguagem, so, bd, tipoDesenvolvimento, tipoFuncionamento, gerarArquivo, integracaoPAF);

        if (E_CaracteristicasPAF.isImpressao1() == true) {
            arquivo.formaImpressao("Concomitante");
        }
        if (E_CaracteristicasPAF.isImpressao2() == true) {
            arquivo.formaImpressao("Nao Concomitnate, com emissao de DAV");
        }
        if (E_CaracteristicasPAF.isImpressao3() == true) {
            arquivo.formaImpressao("Nao concomitante, com controle de pre-venda");
        }
        if (E_CaracteristicasPAF.isImpressao4() == true) {
            arquivo.formaImpressao("Nao concomitante, com controle de conta de cliente");
        }
        if (E_CaracteristicasPAF.isImpressao5() == true) {
            arquivo.formaImpressao("DAV emitido sem possibilidade de impressao");
        }
        if (E_CaracteristicasPAF.isImpressao6() == true) {
            arquivo.formaImpressao("DAV impresso em impressora nao fiscal");
        }
        if (E_CaracteristicasPAF.isImpressao7() == true) {
            arquivo.formaImpressao("DAV impresso em ECF");
        }

        arquivo.demaisCaracteristicasPaf(interrupcao);
        F_AplicacoesEspeciais aplicacao = new F_AplicacoesEspeciais();
        while (F_AplicacoesEspeciais.isFlag() == false) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Erro!");
            }
        }

        if (F_AplicacoesEspeciais.isApp1() == true) {
            arquivo.aplicacoesEspeciais("Posto de pedagio");
        }
        if (F_AplicacoesEspeciais.isApp2() == true) {
            arquivo.aplicacoesEspeciais("Transporte de passageiros");
        }
        if (F_AplicacoesEspeciais.isApp3() == true) {
            arquivo.aplicacoesEspeciais("Farmacia de manipulacao");
        }
        if (F_AplicacoesEspeciais.isApp4() == true) {
            arquivo.aplicacoesEspeciais("Oficina de conserto com DAV-OS");
        }
        if (F_AplicacoesEspeciais.isApp5() == true) {
            arquivo.aplicacoesEspeciais("Oficina de conserto com conta de cliente");
        }
        if (F_AplicacoesEspeciais.isApp6() == true) {
            arquivo.aplicacoesEspeciais("Bar, restaurante e estabelecimento similar com utilizacao de ECF-Restaurante e Balanca interligada");
        }
        if (F_AplicacoesEspeciais.isApp7() == true) {
            arquivo.aplicacoesEspeciais("Bar, restaurante e estabelecimento similar com utilizacao de ECF-Normal e Balanca interligada");
        }
        if (F_AplicacoesEspeciais.isApp8() == true) {
            arquivo.aplicacoesEspeciais("Bar, restaurante e estabelecimento similar com utilizacao de ECF-Restaurante e SEM Balanca interligada");
        }
        if (F_AplicacoesEspeciais.isApp9() == true) {
            arquivo.aplicacoesEspeciais("Bar, restaurante e estabelecimento similar com utilizacao de ECF-Normal e SEM Balanca interligada");
        }
        if (F_AplicacoesEspeciais.isApp10() == true) {
            arquivo.aplicacoesEspeciais("Posto revendedor de combustivel COM sistema de interligacao de bombas");
        }
        if (F_AplicacoesEspeciais.isApp11() == true) {
            arquivo.aplicacoesEspeciais("Posto revendedor de combustivel SEM sistema de interligacao de bombas");
        }
        if (F_AplicacoesEspeciais.isApp12() == true) {
            arquivo.aplicacoesEspeciais("Estacionamento, moteis e similares que utiliza controle de trafego de veiculos ou pessoas");
        }
        if (F_AplicacoesEspeciais.isApp13() == true) {
            arquivo.aplicacoesEspeciais("Prestador de servico de cinema, espetaculos ou similares");
        }
        if (F_AplicacoesEspeciais.isApp15() == true) {
            arquivo.aplicacoesEspeciais("Estabelecimento enquadrado no Simples Nacional (Art 5 do Ato COTEPE da ER PAF ECF)");
        }
        if (F_AplicacoesEspeciais.isApp14() == true) {
            arquivo.aplicacoesEspeciais("Demais atividades");
        }

        arquivo.finalizaE();

        // Sistema de gestao ou retaguarda
        arquivo.iniciaSistemGestao();
        if (integracaoPAF == 1 || integracaoPAF == 3) {

            boolean integraFlag = false;
            String quantReta;
            int quantRet = 0;

            while (integraFlag == false) {
                try {
                    quantReta = JOptionPane.showInputDialog("Digite a quantidade de retaguardas.");
                    quantRet = Integer.parseInt(quantReta);
                    integraFlag = true;
                    if (quantRet <= 0) {
                        integraFlag = false;
                        JOptionPane.showMessageDialog(null, "Digite um número inteiro acima de 0!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
                    }
                    if (quantRet > 10) {
                        integraFlag = false;
                        JOptionPane.showMessageDialog(null, "Excedeu o número permitido de retaguardas!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Digite um número inteiro acima de 0!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
                }
            }

            for (int i = 0; i < quantRet; i++) {
                G_SistemaGestao.setFlag(false);
                G_SistemaGestao sistGestao = new G_SistemaGestao();

                while (G_SistemaGestao.isFlag() == false) {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println("Erro!");
                    }
                }
                arquivo.sistemGestao(retNome, retRazao, retCnpj, retNomeExe, retMd, retReqExe);
            }
        }
        arquivo.finalizaSistemGestao();

        //Sistema PED
        arquivo.iniciaSistemPed();
        if (integracaoPAF == 2 || integracaoPAF == 3) {

            boolean integraFlag = false;
            String quantPed;
            int quantSisPed = 0;

            while (integraFlag == false) {
                try {
                    quantPed = JOptionPane.showInputDialog("Digite a quantidade de sistemas PED.");
                    quantSisPed = Integer.parseInt(quantPed);
                    integraFlag = true;
                    if (quantSisPed < 0) {
                        integraFlag = false;
                        JOptionPane.showMessageDialog(null, "Digite um número inteiro igual ou maior que 0!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
                    }
                    if (quantSisPed > 10) {
                        integraFlag = false;
                        JOptionPane.showMessageDialog(null, "Excedeu o número permitido de sistemas PED!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Digite um número inteiro igual ou maior que 0!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
                }
            }

            for (int i = 0; i < quantSisPed; i++) {
                H_SistemaPED.setFlag(false);
                H_SistemaPED sistemaPeD = new H_SistemaPED();

                while (H_SistemaPED.isFlag() == false) {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println("Erro!");
                    }
                }
                arquivo.sistemaPed(pedNome, pedRazao, pedCnpj, pedNomeArquivo, pedMd5, pedFuncao);

            }
        }
        arquivo.finalizaSistemaPed();

        //Sistema PEDNfe
        arquivo.iniciaSistemPedNfe();
        if (integracaoPAF == 2 || integracaoPAF == 3) {

            boolean integraFlag = false;
            String quantPedNfe;
            int quantSisPedNfe = 0;

            while (integraFlag == false) {
                try {
                    quantPedNfe = JOptionPane.showInputDialog("Digite a quantidade de sistemas PEDNfe.");
                    quantSisPedNfe = Integer.parseInt(quantPedNfe);
                    integraFlag = true;
                    if (quantSisPedNfe < 0) {
                        integraFlag = false;
                        JOptionPane.showMessageDialog(null, "Digite um número inteiro igual ou maior que 0!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
                    }
                    if (quantSisPedNfe > 10) {
                        integraFlag = false;
                        JOptionPane.showMessageDialog(null, "Excedeu o número permitido de sistemas PedNfe!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Digite um número inteiro igual ou maior que 0!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
                }
            }

            for (int i = 0; i < quantSisPedNfe; i++) {
                I_SistemaPedNfe.setFlag(false);
                I_SistemaPedNfe sistemaPeD = new I_SistemaPedNfe();

                while (I_SistemaPedNfe.isFlag() == false) {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println("Erro!");
                    }
                }
                arquivo.sistemaPedNfe(pedNfeNome, pedNfeRazao, pedNfeCnpj, pedNfeNomeArquivo, pedNfeMd5, pedNfeFuncao);

            }
        }
        arquivo.finalizaSistemaPedNfe();
//        Gerando dados para a ecf usada na homologacao
        J_EcfHomologacao ecfAnalise = new J_EcfHomologacao();
        while (J_EcfHomologacao.isFlag() == false) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Erro!");
            }
        }
        arquivo.ecfAnalise(marca, modelo);

        //Gerando dados para as ecfs compativeis com o sistema
        K_EcfCompativel ecfCompativel = new K_EcfCompativel();
        while (K_EcfCompativel.isFlag() == false) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Erro!");
            }
        }
        if (K_EcfCompativel.isAa1() == true) {
            arquivo.ecfCompativel("Bematech", "MP-2000 TH FI");
        }
        if (K_EcfCompativel.isAa2() == true) {
            arquivo.ecfCompativel("Bematech", "MP-2100 TH FI");
        }
        if (K_EcfCompativel.isAa3() == true) {
            arquivo.ecfCompativel("Bematech", "MP-2500 TH");
        }
        if (K_EcfCompativel.isAa4() == true) {
            arquivo.ecfCompativel("Bematech", "MP-3000 TH FI");
        }
        if (K_EcfCompativel.isAa5() == true) {
            arquivo.ecfCompativel("Bematech", "MP-4000 TH FI");
        }
        if (K_EcfCompativel.isAa6() == true) {
            arquivo.ecfCompativel("Bematech", "MP-4200 TH");
        }
        if (K_EcfCompativel.isAa7() == true) {
            arquivo.ecfCompativel("Bematech", "MP-6000 TH FI");
        }
        if (K_EcfCompativel.isAa8() == true) {
            arquivo.ecfCompativel("Bematech", "MP-6100 TH FI");
        }
        if (K_EcfCompativel.isAa9() == true) {
            arquivo.ecfCompativel("Bematech", "MP-7000 TH FI");
        }
        if (K_EcfCompativel.isBb1() == true) {
            arquivo.ecfCompativel("DataRegis", "IF MT 100");
        }
        if (K_EcfCompativel.isBb2() == true) {
            arquivo.ecfCompativel("DataRegis", "IF 3202 DT");
        }
        if (K_EcfCompativel.isCc1() == true) {
            arquivo.ecfCompativel("Daruma", "FS 345");
        }
        if (K_EcfCompativel.isCc2() == true) {
            arquivo.ecfCompativel("Daruma", "FS 500");
        }
        if (K_EcfCompativel.isCc3() == true) {
            arquivo.ecfCompativel("Daruma", "FS 600");
        }
        if (K_EcfCompativel.isCc4() == true) {
            arquivo.ecfCompativel("Daruma", "FS 700");
        }
        if (K_EcfCompativel.isCc5() == true) {
            arquivo.ecfCompativel("Daruma", "FS 700 H");
        }
        if (K_EcfCompativel.isCc6() == true) {
            arquivo.ecfCompativel("Daruma", "FS 700 M");
        }
        if (K_EcfCompativel.isCc7() == true) {
            arquivo.ecfCompativel("Daruma", "FS 700 L");
        }
        if (K_EcfCompativel.isCc8() == true) {
            arquivo.ecfCompativel("Daruma", "FS 2100 T");
        }
        if (K_EcfCompativel.isCc9() == true) {
            arquivo.ecfCompativel("Daruma", "FS 7000");
        }
        if (K_EcfCompativel.isCc10() == true) {
            arquivo.ecfCompativel("Daruma", "MACH");
        }
        if (K_EcfCompativel.isDd1() == true) {
            arquivo.ecfCompativel("Elgin", "IF MFD FIT ");
        }
        if (K_EcfCompativel.isDd2() == true) {
            arquivo.ecfCompativel("Elgin", "ECF-IF X5");
        }
        if (K_EcfCompativel.isDd3() == true) {
            arquivo.ecfCompativel("Elgin", "K FISCAL");
        }
        if (K_EcfCompativel.isDd4() == true) {
            arquivo.ecfCompativel("Elgin", "IF 6000TH ");
        }
        if (K_EcfCompativel.isDd5() == true) {
            arquivo.ecfCompativel("Elgin", "FX7");
        }
        if (K_EcfCompativel.isEe1() == true) {
            arquivo.ecfCompativel("Epson", "TM - 81");
        }
        if (K_EcfCompativel.isEe2() == true) {
            arquivo.ecfCompativel("Epson", "TM-T81 FBII");
        }
        if (K_EcfCompativel.isEe3() == true) {
            arquivo.ecfCompativel("Epson", "TM-T81 FBIII");
        }
        if (K_EcfCompativel.isEe4() == true) {
            arquivo.ecfCompativel("Epson", "TM-T88 FBII");
        }
        if (K_EcfCompativel.isEe5() == true) {
            arquivo.ecfCompativel("Epson", "TM-T88 FBIII");
        }
        if (K_EcfCompativel.isEe6() == true) {
            arquivo.ecfCompativel("Epson", "TM-H6000 FB");
        }
        if (K_EcfCompativel.isEe7() == true) {
            arquivo.ecfCompativel("Epson", "TM-H6000 FBII ");
        }
        if (K_EcfCompativel.isEe8() == true) {
            arquivo.ecfCompativel("Epson", "TM-H6000 FBIII");
        }
        if (K_EcfCompativel.isEe9() == true) {
            arquivo.ecfCompativel("Epson", "TM-U675 FB");
        }
        if (K_EcfCompativel.isFf1() == true) {
            arquivo.ecfCompativel("Sweda", "IF ST100");
        }
        if (K_EcfCompativel.isFf2() == true) {
            arquivo.ecfCompativel("Sweda", "IF ST 120");
        }
        if (K_EcfCompativel.isFf3() == true) {
            arquivo.ecfCompativel("Sweda", "IF ST 200");
        }
        if (K_EcfCompativel.isFf4() == true) {
            arquivo.ecfCompativel("Sweda", "IF ST1000");
        }
        if (K_EcfCompativel.isFf5() == true) {
            arquivo.ecfCompativel("Sweda", "IF ST 2000");
        }
        if (K_EcfCompativel.isFf6() == true) {
            arquivo.ecfCompativel("Sweda", "IF ST2500");
        }

        if (K_EcfCompativel.isEcfExtra() == true) {

            do {
                L_EcfCompativelExtra ecfExtra = new L_EcfCompativelExtra();
                L_EcfCompativelExtra.setFlag(false);
                L_EcfCompativelExtra.setEcfExtra(false);
                while (L_EcfCompativelExtra.isFlag() == false) {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println("Erro!");
                    }
                }
                arquivo.ecfCompativel(marca, modelo);
            } while (L_EcfCompativelExtra.isEcfExtra() == true);
        }

        arquivo.finalizaEcfCompativel();
//        Gerando dados para o roteiro de analise
        M_RoteiroAnalise roteiro = new M_RoteiroAnalise();
        while (M_RoteiroAnalise.isFlag() == false) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Erro!");
            }
        }
        arquivo.roteiro(VersaoAto, versaoRoteiro, M_RoteiroAnalise.getMes(), ano, declaracaoConfomidade);
//        Gerando dados para o roteiro de analise
        N_Final finalizando = new N_Final();

        while (N_Final.isFlag() == false) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Erro!");
            }
        }
        arquivo.finalizacao(diaAtual, mesAtual, anoAtual, local, gerente, aprovacao);
        arquivo.fecharArquivo();

        JOptionPane.showMessageDialog(null, "Processo finalizado, o laudo foi gerado com sucesso", "Processo Concluído", JOptionPane.PLAIN_MESSAGE);

    }

    static String razao, cnpj, ie;
    static String rua, numero, complemento, bairro, municipio, uf, cep;
    static String nome, cpf, telefone, email;
    static String responsAcompTestes;
    static String dataInicio, dataFim, VersaoAto;
    static String nomeComercial, versao, nomeExe, mdExe, nomeLista, mdLista;
    static String nome1, nome2, nome3, nome4, nome5, nome6, nome7, nome8, nome9,
            nome10, nome11, nome12, nome13, nome14, nome15;
    static String md1, md2, md3, md4, md5, md6, md7, md8, md9, md10, md11, md12, md13,
            md14, md15;
    static String nomeRelacao, mdRelacao, marcaEnv, modeloEnv, numEnv, perfil;
    static String linguagem, so, bd;
    static int tipoDesenvolvimento, tipoFuncionamento, gerarArquivo, integracaoPAF, interrupcao;
    static String retCnpj, retMd, retNome, retNomeExe, retRazao, retReqExe;
    static String pedNome, pedRazao, pedCnpj, pedNomeArquivo, pedMd5, pedFuncao;
    static String pedNfeNome, pedNfeRazao, pedNfeCnpj, pedNfeNomeArquivo, pedNfeMd5, pedNfeFuncao;
    static String marca, modelo;
    static String versaoRoteiro, ano;
    static int declaracaoConfomidade;
    static String diaAtual, mesAtual, anoAtual, local;
    static int gerente, aprovacao;

    public static int getGerente() {
        return gerente;
    }

    public static void setGerente(int gerente) {
        XML.gerente = gerente;
    }

    public static int getAprovacao() {
        return aprovacao;
    }

    public static void setAprovacao(int aprovacao) {
        XML.aprovacao = aprovacao;
    }

    public static String getLocal() {
        return local;
    }

    public static void setLocal(String local) {
        XML.local = local;
    }

    public static String getDiaAtual() {
        return diaAtual;
    }

    public static void setDiaAtual(String diaAtual) {
        XML.diaAtual = diaAtual;
    }

    public static String getMesAtual() {
        return mesAtual;
    }

    public static void setMesAtual(String mesAtual) {
        XML.mesAtual = mesAtual;
    }

    public static String getAnoAtual() {
        return anoAtual;
    }

    public static void setAnoAtual(String anoAtual) {
        XML.anoAtual = anoAtual;
    }

    public static int isDeclaracaoConfomidade() {
        return declaracaoConfomidade;
    }

    public static void setDeclaracaoConfomidade(int declaracaoConfomidade) {
        XML.declaracaoConfomidade = declaracaoConfomidade;
    }

    public static String getAno() {
        return ano;
    }

    public static void setAno(String ano) {
        XML.ano = ano;
    }

    public static String getPedFuncao() {
        return pedFuncao;
    }

    public static String getVersaoRoteiro() {
        return versaoRoteiro;
    }

    public static void setVersaoRoteiro(String versaoRoteiro) {
        XML.versaoRoteiro = versaoRoteiro;
    }

    public static String getMarca() {
        return marca;
    }

    public static void setMarca(String marca) {
        XML.marca = marca;
    }

    public static String getModelo() {
        return modelo;
    }

    public static void setModelo(String modelo) {
        XML.modelo = modelo;
    }

    public static void setPedFuncao(String pedFuncao) {
        XML.pedFuncao = pedFuncao;
    }

    public static String getPedNfeNome() {
        return pedNfeNome;
    }

    public static void setPedNfeNome(String pedNfeNome) {
        XML.pedNfeNome = pedNfeNome;
    }

    public static String getPedNfeRazao() {
        return pedNfeRazao;
    }

    public static void setPedNfeRazao(String pedNfeRazao) {
        XML.pedNfeRazao = pedNfeRazao;
    }

    public static String getPedNfeCnpj() {
        return pedNfeCnpj;
    }

    public static void setPedNfeCnpj(String pedNfeCnpj) {
        XML.pedNfeCnpj = pedNfeCnpj;
    }

    public static String getPedNfeNomeArquivo() {
        return pedNfeNomeArquivo;
    }

    public static void setPedNfeNomeArquivo(String pedNfeNomeArquivo) {
        XML.pedNfeNomeArquivo = pedNfeNomeArquivo;
    }

    public static String getPedNfeMd5() {
        return pedNfeMd5;
    }

    public static void setPedNfeMd5(String pedNfeMd5) {
        XML.pedNfeMd5 = pedNfeMd5;
    }

    public static String getPedNfeFuncao() {
        return pedNfeFuncao;
    }

    public static void setPedNfeFuncao(String pedNfeFuncao) {
        XML.pedNfeFuncao = pedNfeFuncao;
    }

    public static String getPedNome() {
        return pedNome;
    }

    public static void setPedNome(String pedNome) {
        XML.pedNome = pedNome;
    }

    public static String getPedRazao() {
        return pedRazao;
    }

    public static void setPedRazao(String pedRazao) {
        XML.pedRazao = pedRazao;
    }

    public static String getPedCnpj() {
        return pedCnpj;
    }

    public static void setPedCnpj(String pedCnpj) {
        XML.pedCnpj = pedCnpj;
    }

    public static String getPedNomeArquivo() {
        return pedNomeArquivo;
    }

    public static void setPedNomeArquivo(String pedNomeArquivo) {
        XML.pedNomeArquivo = pedNomeArquivo;
    }

    public static String getPedMd5() {
        return pedMd5;
    }

    public static void setPedMd5(String pedMd5) {
        XML.pedMd5 = pedMd5;
    }

    public static String getPedReq() {
        return pedFuncao;
    }

    public static void setPedReq(String pedReq) {
        XML.pedFuncao = pedReq;
    }

    public static String getRetCnpj() {
        return retCnpj;
    }

    public static void setRetCnpj(String retCnpj) {
        XML.retCnpj = retCnpj;
    }

    public static String getRetMd() {
        return retMd;
    }

    public static void setRetMd(String retMd) {
        XML.retMd = retMd;
    }

    public static String getRetNome() {
        return retNome;
    }

    public static void setRetNome(String retNome) {
        XML.retNome = retNome;
    }

    public static String getRetNomeExe() {
        return retNomeExe;
    }

    public static void setRetNomeExe(String retNomeExe) {
        XML.retNomeExe = retNomeExe;
    }

    public static String getRetRazao() {
        return retRazao;
    }

    public static void setRetRazao(String retRazao) {
        XML.retRazao = retRazao;
    }

    public static String getRetReqExe() {
        return retReqExe;
    }

    public static void setRetReqExe(String retReqExe) {
        XML.retReqExe = retReqExe;
    }

    public static int getTipoFuncionamento() {
        return tipoFuncionamento;
    }

    public static int getInterrupcao() {
        return interrupcao;
    }

    public static void setInterrupcao(int interrupcao) {
        XML.interrupcao = interrupcao;
    }

    public static int getIntegracaoPAF() {
        return integracaoPAF;
    }

    public static void setIntegracaoPAF(int integracaoPAF) {
        XML.integracaoPAF = integracaoPAF;
    }

    public static int getGerarArquivo() {
        return gerarArquivo;
    }

    public static void setGerarArquivo(int gerarArquivo) {
        XML.gerarArquivo = gerarArquivo;
    }

    public static void setTipoFuncionamento(int tipoFuncionamento) {
        XML.tipoFuncionamento = tipoFuncionamento;
    }

    public static String getLinguagem() {
        return linguagem;
    }

    public static void setLinguagem(String linguagem) {
        XML.linguagem = linguagem;
    }

    public static String getSo() {
        return so;
    }

    public static void setSo(String so) {
        XML.so = so;
    }

    public static String getBd() {
        return bd;
    }

    public static void setBd(String bd) {
        XML.bd = bd;
    }

    public static int getTipoDesenvolvimento() {
        return tipoDesenvolvimento;
    }

    public static void setTipoDesenvolvimento(int tipoDesenvolvimento) {
        XML.tipoDesenvolvimento = tipoDesenvolvimento;
    }

    public static String getNomeRelacao() {
        return nomeRelacao;
    }

    public static void setNomeRelacao(String nomeRelacao) {
        XML.nomeRelacao = nomeRelacao;
    }

    public static String getMdRelacao() {
        return mdRelacao;
    }

    public static void setMdRelacao(String mdRelacao) {
        XML.mdRelacao = mdRelacao;
    }

    public static String getMarcaEnv() {
        return marcaEnv;
    }

    public static void setMarcaEnv(String marcaEnv) {
        XML.marcaEnv = marcaEnv;
    }

    public static String getModeloEnv() {
        return modeloEnv;
    }

    public static void setModeloEnv(String modeloEnv) {
        XML.modeloEnv = modeloEnv;
    }

    public static String getNumEnv() {
        return numEnv;
    }

    public static void setNumEnv(String numEnv) {
        XML.numEnv = numEnv;
    }

    public static String getPerfil() {
        return perfil;
    }

    public static void setPerfil(String perfil) {
        XML.perfil = perfil;
    }

    public static String getNomeLista() {
        return nomeLista;
    }

    public static String getNome1() {
        return nome1;
    }

    public static void setNome1(String nome1) {
        XML.nome1 = nome1;
    }

    public static String getNome2() {
        return nome2;
    }

    public static void setNome2(String nome2) {
        XML.nome2 = nome2;
    }

    public static String getNome3() {
        return nome3;
    }

    public static void setNome3(String nome3) {
        XML.nome3 = nome3;
    }

    public static String getNome4() {
        return nome4;
    }

    public static void setNome4(String nome4) {
        XML.nome4 = nome4;
    }

    public static String getNome5() {
        return nome5;
    }

    public static void setNome5(String nome5) {
        XML.nome5 = nome5;
    }

    public static String getNome6() {
        return nome6;
    }

    public static void setNome6(String nome6) {
        XML.nome6 = nome6;
    }

    public static String getNome7() {
        return nome7;
    }

    public static void setNome7(String nome7) {
        XML.nome7 = nome7;
    }

    public static String getNome8() {
        return nome8;
    }

    public static void setNome8(String nome8) {
        XML.nome8 = nome8;
    }

    public static String getNome9() {
        return nome9;
    }

    public static void setNome9(String nome9) {
        XML.nome9 = nome9;
    }

    public static String getNome10() {
        return nome10;
    }

    public static void setNome10(String nome10) {
        XML.nome10 = nome10;
    }

    public static String getNome11() {
        return nome11;
    }

    public static void setNome11(String nome11) {
        XML.nome11 = nome11;
    }

    public static String getNome12() {
        return nome12;
    }

    public static void setNome12(String nome12) {
        XML.nome12 = nome12;
    }

    public static String getNome13() {
        return nome13;
    }

    public static void setNome13(String nome13) {
        XML.nome13 = nome13;
    }

    public static String getNome14() {
        return nome14;
    }

    public static void setNome14(String nome14) {
        XML.nome14 = nome14;
    }

    public static String getNome15() {
        return nome15;
    }

    public static void setNome15(String nome15) {
        XML.nome15 = nome15;
    }

    public static String getMd1() {
        return md1;
    }

    public static void setMd1(String md1) {
        XML.md1 = md1;
    }

    public static String getMd2() {
        return md2;
    }

    public static void setMd2(String md2) {
        XML.md2 = md2;
    }

    public static String getMd3() {
        return md3;
    }

    public static void setMd3(String md3) {
        XML.md3 = md3;
    }

    public static String getMd4() {
        return md4;
    }

    public static void setMd4(String md4) {
        XML.md4 = md4;
    }

    public static String getMd5() {
        return md5;
    }

    public static void setMd5(String md5) {
        XML.md5 = md5;
    }

    public static String getMd6() {
        return md6;
    }

    public static void setMd6(String md6) {
        XML.md6 = md6;
    }

    public static String getMd7() {
        return md7;
    }

    public static void setMd7(String md7) {
        XML.md7 = md7;
    }

    public static String getMd8() {
        return md8;
    }

    public static void setMd8(String md8) {
        XML.md8 = md8;
    }

    public static String getMd9() {
        return md9;
    }

    public static void setMd9(String md9) {
        XML.md9 = md9;
    }

    public static String getMd10() {
        return md10;
    }

    public static void setMd10(String md10) {
        XML.md10 = md10;
    }

    public static String getMd11() {
        return md11;
    }

    public static void setMd11(String md11) {
        XML.md11 = md11;
    }

    public static String getMd12() {
        return md12;
    }

    public static void setMd12(String md12) {
        XML.md12 = md12;
    }

    public static String getMd13() {
        return md13;
    }

    public static void setMd13(String md13) {
        XML.md13 = md13;
    }

    public static String getMd14() {
        return md14;
    }

    public static void setMd14(String md14) {
        XML.md14 = md14;
    }

    public static String getMd15() {
        return md15;
    }

    public static void setMd15(String md15) {
        XML.md15 = md15;
    }

    public static void setNomeLista(String nomeLista) {
        XML.nomeLista = nomeLista;
    }

    public static String getMdLista() {
        return mdLista;
    }

    public static void setMdLista(String mdLista) {
        XML.mdLista = mdLista;
    }

    public static String getNomeComercial() {
        return nomeComercial;
    }

    public static void setNomeComercial(String nomeComercial) {
        XML.nomeComercial = nomeComercial;
    }

    public static String getVersao() {
        return versao;
    }

    public static void setVersao(String versao) {
        XML.versao = versao;
    }

    public static String getNomeExe() {
        return nomeExe;
    }

    public static void setNomeExe(String NomeExe) {
        XML.nomeExe = NomeExe;
    }

    public static String getMdExe() {
        return mdExe;
    }

    public static void setMdExe(String mdExe) {
        XML.mdExe = mdExe;
    }

    public static String getDataInicio() {
        return dataInicio;
    }

    public static void setDataInicio(String dataInicio) {
        XML.dataInicio = dataInicio;
    }

    public static String getDataFim() {
        return dataFim;
    }

    public static void setDataFim(String dataFim) {
        XML.dataFim = dataFim;
    }

    public static String getVersaoAto() {
        return VersaoAto;
    }

    public static void setVersaoAto(String VersaoAto) {
        XML.VersaoAto = VersaoAto;
    }

    public static String getRazao() {
        return razao;
    }

    public static void setRazao(String razao) {
        XML.razao = razao;
    }

    public static String getCnpj() {
        return cnpj;
    }

    public static void setCnpj(String cnpj) {
        XML.cnpj = cnpj;
    }

    public static String getIe() {
        return ie;
    }

    public static void setIe(String ie) {
        XML.ie = ie;
    }

    public static String getRua() {
        return rua;
    }

    public static void setRua(String rua) {
        XML.rua = rua;
    }

    public static String getNumero() {
        return numero;
    }

    public static void setNumero(String numero) {
        XML.numero = numero;
    }

    public static String getComplemento() {
        return complemento;
    }

    public static void setComplemento(String complemento) {
        XML.complemento = complemento;
    }

    public static String getBairro() {
        return bairro;
    }

    public static void setBairro(String bairro) {
        XML.bairro = bairro;
    }

    public static String getMunicipio() {
        return municipio;
    }

    public static void setMunicipio(String municipio) {
        XML.municipio = municipio;
    }

    public static String getUf() {
        return uf;
    }

    public static void setUf(String uf) {
        XML.uf = uf;
    }

    public static String getCep() {
        return cep;
    }

    public static void setCep(String cep) {
        XML.cep = cep;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        XML.nome = nome;
    }

    public static String getCpf() {
        return cpf;
    }

    public static void setCpf(String cpf) {
        XML.cpf = cpf;
    }

    public static String getTelefone() {
        return telefone;
    }

    public static void setTelefone(String telefone) {
        XML.telefone = telefone;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        XML.email = email;
    }

    public static String getResponsAcompTestes() {
        return responsAcompTestes;
    }

    public static void setResponsAcompTestes(String responsAcompTestes) {
        XML.responsAcompTestes = responsAcompTestes;
    }
}
