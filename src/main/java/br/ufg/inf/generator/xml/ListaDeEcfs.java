package br.ufg.inf.generator.xml;

import java.util.ArrayList;
import org.simpleframework.xml.Root;

@Root(name = "Lista de Ecfs")
public class ListaDeEcfs extends LaudoBase{
    private ArrayList<Ecf> ecfs;
    
    public ListaDeEcfs(){
        ecfs = new ArrayList<>();
    }

    public ArrayList<Ecf> getEcfs() {
        return ecfs;
    }
    
    public int tamanhoDaLista(){
        return ecfs.size();
    }
    
    public void adicionarEcf (Ecf ecf){
        if(!ecfs.contains(ecf)){
            ecfs.add(ecf);
        }
    }
    
    public void removerEcf (Ecf ecf){
        if(ecfs.contains(ecf)){
            ecfs.remove(ecf);
        }
    }
    
}
