public class Letters {

    public static void main(String[] args) {
        System.out.println("Английский алфавит {буква} : {код}");
        printLettersCodes('a', 'z');
        System.out.println("Русский алфавит {буква} : {код}");
        printLettersCodes('а', 'я');
    }

    private static void printLettersCodes(char startLetter, char endLetter){
        int iteration = 1;
        for(char i = startLetter; i <= endLetter; i++){
            System.out.format(" %1s : %3d |", i, (int) i);
            if (iteration % 5 == 0){
                System.out.print("\n");
            }
            iteration++;
        }
        System.out.print("\n");
    }
}
