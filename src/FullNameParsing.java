import java.util.Arrays;
import java.util.Scanner;

public class FullNameParsing {

    public static void main(String[] args) {
        String full_name = enterFullName();
        String[] full_name_parsed = parsingFullName(full_name);

        if (full_name_parsed.length != 3){
            System.out.println("Неправильный формат ввода");
            return;
        }

        System.out.println(String.format("Фамилия: %s\nИмя: %s\nОтчество: %s\n", full_name_parsed[0], full_name_parsed[1], full_name_parsed[2]));
    }

    private static String[] parsingFullName(String full_name){
        return full_name.split(" ");
    }

    private static String enterFullName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ФИО в формате {Фамилия} {Имя} {Отчество} например, “Иванов Сергей Петрович”");

        return scanner.nextLine();
    }
}
