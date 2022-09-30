public class Neise {
    public static void main(String[] args) {
        int firstNumber = 1;
        int lastNumber = 1958;
        String convertIntToString = "";
        int biggerSequence = 0;
        int currentSequence = 0;

        for(int i = firstNumber; i<= lastNumber; i++) {
            convertIntToString += String.valueOf(i);
        }

        for(int j=0; j< convertIntToString.length(); j++) {
            char singleChar = convertIntToString.charAt(j);

            if(singleChar == '1') {
                currentSequence++;
                continue;
            }

            if(currentSequence > biggerSequence) {
                biggerSequence = currentSequence;
                currentSequence = 0;
            }
            currentSequence = 0;
        }
        System.out.print(biggerSequence);
    }
}
