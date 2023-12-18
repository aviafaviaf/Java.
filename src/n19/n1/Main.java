package n19.n1;

import java.util.Scanner;

public class Main {
    private static final String[] INN = {"0000 5670 01740 0630", "0430 0342 0054 0201", "0000 4320 5322 0008", "1321 0980 0540 0000", "0060 0880 8888 0020", "0034 0880 0434 5434"
    };

    public static void main(String[] args) throws notFoundException {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите ФИО: ");
        String name = in.nextLine();

        System.out.print("Введите ИНН: ");
        String inn = in.nextLine();

        boolean find = false;
        for (String num : INN) if (num.equals(inn)) find = true;
        if (!find) throw new notFoundException("Не найден");
    }
}
