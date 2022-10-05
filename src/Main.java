import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Mike se deparou com um inigma enquanto tentava liberar o botão de parada emergencial,
        // que abriria o portal para o Mundo invertido. Ele precisa encontrar a resposta para esse
        // problema e por isso, entrou em contato com você, expert em matemática, para ajudá-lo.
        //Neste enigma, os números de 1 a 1958 foram escritos lado a lado, formando uma fila de
        //algarismos. Na fila, aparecem blocos de diversos tamanhos, somente com o algarismo 1.
        //A seguir, vemos destacado um bloco de tamanho três:12345678910111213...
        //Para desvendar esse desafio, responda a pergunta: Qaul é o tamanho do maior desses blocos?
        int firstNumber = 1;
        int lastNumber = 1958;
        String convertIntToString = "";
        int biggerSequence = 0;
        int currentSequence = 0;

        //Vai contar de 1 até 1958 e converter int em String
        for(int i = firstNumber; i<= lastNumber; i++) {
            convertIntToString += String.valueOf(i);
        }
        //Vai percorrer a String pegando um caracter por vez
        for(int j=0; j< convertIntToString.length(); j++) {
            char singleChar = convertIntToString.charAt(j);

            //Compara o caracter, se igual a 1, ele soma mais 1 na sequência atual
            if(singleChar == '1') {
                currentSequence++;
                continue;
            }
            //Compara se a sequência atual é a maior sequência
            if(currentSequence > biggerSequence) {
                biggerSequence = currentSequence;
                currentSequence = 0;
            }
            currentSequence = 0;
        }
        //Exibe a maior sequência
        System.out.print(biggerSequence);
    }
}
