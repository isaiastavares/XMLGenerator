package geradorxml;

public class CorretorOrtografico {

    public static String corretor(String inicio) {
        String fim = inicio;
        char[] emChar = fim.toCharArray();

        for (int i = 0; i < fim.length(); i++) {
            char c = fim.charAt(i);
            
            //Para a letra A
            if(c == 'á' || c == 'ã' || c == 'â'){
                emChar[i] = 'a';
            }
            if (c == 'Á' || c == 'Ã' || c == 'Á') {
                emChar[i] = 'A';
            }

            //Para a letra E
            if (c == 'é' || c == 'ê'){
                emChar[i] = 'e';
            }
            if (c == 'É' || c == 'Ê') {
                emChar[i] = 'E';
            }

            //Para a letra I
            if (c == 'í' || c == 'î') {
                emChar[i] = 'i';
            }
            if (c == 'Í' || c == 'Î') {
                emChar[i] = 'I';
            }
            
            //Para a letra O
            if (c == 'ó' || c == 'õ' || c == 'ô') {
                emChar[i] = 'o';
            }
            if (c == 'Ó' || c == 'Õ' || c == 'Ô') {
                emChar[i] = 'O';
            }
            
            //Para a letra U
            if (c == 'ú' || c == 'û') {
                emChar[i] = 'u';
            }
            if (c == 'Ú' || c == 'Û') {
                emChar[i] = 'U';
            }
            
            //Para o ç
            if (c == 'ç') {
                emChar[i] = 'c';
            }
            if (c == 'Ç') {
                emChar[i] = 'C';
            }
        }

        fim = String.valueOf(emChar);

        return fim;
    }
}
