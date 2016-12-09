
package br.ufg.inf.generator.xml.conversor;

public class LaudoConversor {
     public void salvarLaudo(Laudo laudo) {
        Serializer serializer = new Persister();
        String nome = laudo.getMensagem().getNumero();
        File result = new File(nome + ".xml");


        try {
            serializer.write(laudo, result);
        } catch (Exception ex) {
            Logger.getLogger(LaudoParser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
