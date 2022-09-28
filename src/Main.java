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
        int inicio = 1;
        int fim = 1958;
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = inicio; i <= fim; i++) {
            lista.add(i);
        }
        for (Integer num : lista) {
            System.out.print(num);

        }
    }
}