package br.ufg.inf.generator.xml;

import java.util.ArrayList;

import org.junit.Test;

public class CaracteristicasPafTest {

	private static final String MODO = "Recuperação de dados";

    @Test
    public void naoDevePermitirNomeNulo() {
        final CaracteristicasPaf caracteristicasPaf = new CaracteristicasPaf();
        final TratamentoInterrupcao tratamentoInterrupcao = new TratamentoInterrupcao();

        Modo modo = new Modo();
        modo.setModo(MODO);

        Modo modo2 = new Modo();
        modo2.setModo(MODO);

        ArrayList<Modo> list = new ArrayList<>();
        list.add(modo);
        list.add(modo2);

        tratamentoInterrupcao.setModos(list);
        caracteristicasPaf.setTratamentoInterrupcao(tratamentoInterrupcao);

        System.out.println(caracteristicasPaf.toString());
    }

//    @Test
//    public void naoDevePermitirNomeNulo() {
//        final CaracteristicasPaf caracteristicasPaf = new CaracteristicasPaf();
//
//        Modo modo = new Modo();
//        modo.setModo(MODO);
//
//        Modo modo2 = new Modo();
//        modo2.setModo(MODO);
//
//        ArrayList<Modo> list = new ArrayList<>();
//        list.add(modo);
//        list.add(modo2);
//
//        caracteristicasPaf.setModos(list);
//
//        System.out.println(caracteristicasPaf.toString());
//    }
}
