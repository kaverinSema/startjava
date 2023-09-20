public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");

        byte ram = 16;
        short ssd = 250;
        int hdd = 1000;
        long processorFrequency = 3500;
        float virtualMemory= 18.2f;
        double cotroller = 255.255;
        char numberOfCores = '2';
        boolean bool = ssd <= hdd;

        System.out.println("\nОперативная память: " + ram + " ГБ");
        System.out.println("\nSSD: " + ssd + " ГБ");
        System.out.println("\nHDD: " + hdd + " ГБ");
        System.out.println("\nЧастота процессора: " + processorFrequency + " МГц");
        System.out.println("\nВертуальная память: " + virtualMemory + " ГБ");
        System.out.println("\nКоличество ядер: " + numberOfCores);
        System.out.println("\nSSD меньше HDD? = ");
        System.out.println(ssd < hdd);


        System.out.println("\n\n2. Расчет стоимости товара со скидкой");

        int pen = 100;
        int book = 200;
        int discount = 11;

        int sum = pen + book;
        int sumDiscount = sum / 100 * 11;
        int result = sum - sumDiscount;

        System.out.println("\nОбщая стоимость товаров без скидки = " + sum);
        System.out.println("\nСумма скидки = " + sumDiscount);
        System.out.println("\nОбщая стоимость товаров со скидкой = " + result);


        System.out.println("\n\n3. Вывод слова JAVA");

        System.out.println("\n   J    a  v     v  a\n   J   a a  v   v  a a\nJ  J  aaaaa  V V  aaaaa\n JJ  a     a  V  a     a");


        System.out.println("\n\n4. Вывод min и max значений целых числовых типов");

        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;

        System.out.println("\nbyte:\nпервоначальное значение: " + b + "\nзначение после инкремента на единицу: " + b++ + "\nзначение после декремента на единицу: " + b--);
        System.out.println("\nshort:\nпервоначальное значение: " + s + "\nзначение после инкремента на единицу: " + s++ + "\nзначение после декремента на единицу: " + s--);
        System.out.println("\nint:\nпервоначальное значение: " + i + "\nзначение после инкремента на единицу: " + i++ + "\nзначение после декремента на единицу: " + i--);
        System.out.println("\nlong:\nпервоначальное значение: " + l + "\nзначение после инкремента на единицу: " + l++ + "\nзначение после декремента на единицу: " + l--);


        System.out.println("\n\n5. Перестановка значений переменных");

        int two = 2;
        int five = 5;

        System.out.println("\n1. c помощью третьей переменной: " + "\nисходные значения переменных: " + "\n1. " + two + "\n2. " + five);

        int c = two;
        two = five;
        five = c;

        System.out.println("новые значения переменных" + "\n1. " + two + "\n2. " + five);

        System.out.println("\n2. с помощью арифметических операций: " + "\nисходные значения переменных: " + "\n1. " + two + "\n2. " + five);

        two += five;
        five = two - five;
        two -= five;

        System.out.println("новые значения переменных" + "\n1. " + two + "\n2. " + five);

        System.out.println("\n3. с помощью побитовой операции ^: " + "\nисходные значения переменных: " + "\n1. " + two + "\n2. " + five);

        two ^= five;
        five ^= two;
        two ^= five;

        System.out.println("новые значения переменных" + "\n1. " + two + "\n2. " + five);


        System.out.println("\n\n6. Вывод символов и их кодов");

        char thirtySix = '$';
        char fortyTwo = '*';
        char sixtyFour = '@';
        char oneHundredTwentyFour = '|';
        char oneHundredTwentySix = '~';

        int a = (int)thirtySix;
        int a1 = (int)fortyTwo;
        int a2 = (int)sixtyFour;
        int a3 = (int)oneHundredTwentyFour;
        int a4 = (int)oneHundredTwentySix;

        System.out.println("Код символа" + " | " + "Символ");

        System.out.println(a + " | " + thirtySix);
        System.out.println(a1 + " | " + fortyTwo);
        System.out.println(a2 + " | " + sixtyFour);
        System.out.println(a3 + " | " + oneHundredTwentyFour);
        System.out.println(a4 + " | " + oneHundredTwentySix);


        System.out.println("\n\n7. Вывод в консоль ASCII-арт Дюка");

        char forty = '(';
        char fortyOne = ')';
        char fortySeven = '/';
        char ninetyTwo = '\\';
        char ninetyFive  = '_';

        System.out.println("\n    " + fortySeven + ninetyTwo);
        System.out.println("   " + fortySeven + "  " + ninetyTwo);
        System.out.println("  " + fortySeven + ninetyFive + forty + " " + fortyOne + ninetyTwo);
        System.out.println(" " + fortySeven + "      "+ ninetyTwo);
        System.out.println("" + fortySeven + ninetyFive + ninetyFive + ninetyFive + ninetyFive + fortySeven + ninetyTwo + ninetyFive + ninetyFive + ninetyTwo);


        System.out.println("\n\n8. Вывод количества сотен, десятков и единиц числа");

        int number = 123;

        int hundred = number / 100;
        int ten = number / 10;
        int unit = number / 1;
        int sumDigit = hundred + ten + unit;
        int compositionDigit = hundred * ten * unit;

        System.out.println("\nЧисло 123 содержит:" + "\n  сотен - " + hundred + "\n  десятков - " + ten + "\n  единиц - " + unit + "\nСумма его цифр = " + sumDigit + "\nПроизведение = " + compositionDigit);


        System.out.println("\n\n9. Вывод времени");

        int seconds = 86399;

        int hour = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int second = seconds % 60;

        System.out.println("\n" + hour +":" + minutes + ":" + second);
    }
}