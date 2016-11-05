package Interface;

import javax.swing.JOptionPane;

public class A_JanelaInicial {

    public String InicializarProcesso() {
        String laudo;
        laudo = JOptionPane.showInputDialog("Digite o número do laudo. Ex.: 'UFG0012015'");
        return laudo;
    }
}
