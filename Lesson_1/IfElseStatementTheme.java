public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");

        boolean manGender = true;
        if (!manGender) {
            System.out.println("Девочка");
        } else {
            System.out.println("Мальчик");
        }

        int age = 22;
        if (age > 18) {
            System.out.println("Взрослый");
        } else {
            System.out.println("Нужно еще расти");
        }

        double height = 1.83;
        if (height < 1.8) {
            System.out.println("Низкий");
        } else {
            System.out.println("Высокий");
        }

        char firstLetterName = "Имя".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Нет");
        } else if (firstLetterName == 'I') {
            System.out.println("Нет");
        } else {
            System.out.println("Ничего из сверенных");
        }


        System.out.println("\n\n2. Поиск большего числа");

        int a = 1;
        int b = 2;

        System.out.println("Первое число: " + a + "\nВторое число: " + b);

        if (a > b) {
            System.out.println("Число " + a + " больше " + "числа " + b);
        } else {
            System.out.println("Число " + a + " меньше " + "числа " + b);
        }

        if (a == b) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Числа не равны");
        }


        System.out.println("\n\n3. Проверка числа");

        int number = -14;

        if (number == 0) {
            System.out.println("Число равно нулю");
        } else {
            if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println("Число " + number + " является положительным и четным");
                } else {
                    System.out.println("Число " + number + " является положительным и нечетным");
                }
            } else {
                if (number % 2 == 0) {
                    System.out.println("Число " + number + " является отрицательным и четным");
                } else {
                    System.out.println("Число " + number + " является отрицательным и нечетным");
                }
            }
        }


        System.out.println("\n\n4. Поиск одинаковых цифр в числах");

        int number1 = 123;
        int number2 = 223;

        int n = number1 % 10;
        int n1 = number1 / 10 % 10;
        int n2 = number1 / 100 % 10;

        int n11 = number2 % 10;
        int n22 = number2 / 10 % 10;
        int n33 = number2 / 100 % 10;

        if (n2 == n33) {
            if (n1 == n22) {
                if (n == n11) {
                    System.out.println("Все цифры чисел одинаковые!" + "\n1. " + number1 + "\n2. " + number2 + "\nОдинаковыее цифры: " + n2 + " | " + n1 +" | " + n + "\nРазряды: №1 | №2 | №3 ");
                } else {
                    System.out.println("Первые 2 цифры чисел одинаковые!" + "\n1. " + number1 + "\n2. " + number2 + "\nОдинаковыее цифры: " + n2 + " | " + n1 +" | " + "\nРазряды: №1 | №2");
                }
            } else {
                if (n == n11) {
                    System.out.println("Первая и последняя цифра чисел одинаковые!"+ "\n1. " + number1 + "\n2. " + number2 + "\nОдинаковыее цифры: " + n2 + " | " + n + "\nРазряды: №1 | №3 ");
                } else {
                    System.out.println("Только 1 цифра чисел одинаковые!" + "\n1. " + number1 + "\n2. " + number2 + "\nОдинаковыее цифры: " + n2 + "\nРазряды: №1 | №2 | №3 ");
                }
            }
        } else {
            if (n1 == n22) {
                if (n == n11) {
                    System.out.println("Последние 2 цифры чисел одинаковые!" + "\n1. " + number1 + "\n2. " + number2 + "\nОдинаковыее цифры: " + n1 +" | " + n + "\nРазряды: №2 | №3 ");
                } else {
                    System.out.println("Только 2 цифра чисел одинаковая!" + "\n1. " + number1 + "\n2. " + number2 + "\nОдинаковыее цифры: " + n1 + "\nРазряды: №2 ");
                }
            } else {
                if (n == n11) {
                    System.out.println("Только последняя цифра чисел одинаковая!"  + "\n1. " + number1 + "\n2. " + number2 + "\nОдинаковыее цифры: " + n + "\nРазряды: №3 ");
                } else {
                    System.out.println("Цифры чисел разные!" + "\n1. " + number1 + "\n2. " + number2);
                }
            }
        }


        System.out.println("\n\n5. Определение символа по его коду");

        char code = '\u0031';

        if (code >= 'a' && code <= 'z') {
            System.out.println("Символ " + code + " является маленькой буквой");
        } else if (code >= 'A' && code <= 'Z') {
            System.out.println("Символ " + code + " является большой буквой");
        } else if (code >= '0' && code <= '9') {
            System.out.println("Символ " + code + " является цифрой");
        } else {
            System.out.println("Символ " + code + " является ни буквой и не цифрой");
        }


        System.out.println("\n\n6. Подсчет суммы вклада и начисленных банком %");

        double contribution = 301000;
        double percent;
        double result;

        if (contribution < 100000) {
            percent = contribution * 0.05;
            result = percent + contribution;
            System.out.println("Сумма вклада - " + contribution + "\nСумма начисленного % - " + percent + "\nИтоговая сумма с % - " + result);
        } else if (contribution >= 100000 && contribution <= 300000) {
            percent = contribution * 0.07;
            result = percent + contribution;
            System.out.println("Сумма вклада - " + contribution + "\nСумма начисленного % - " + percent + "\nИтоговая сумма с % - " + result);
        } else if (contribution > 300000) {
            percent = contribution * 0.1;
            result = percent + contribution;
            System.out.println("Сумма вклада - " + contribution + "\nСумма начисленного % - " + percent + "\nИтоговая сумма с % - " + result);
        }

        System.out.println("\n\n7. Определение оценки по предметам");

        double history = 0.59;
        double programming = 0.92;
        double estimationHistory;
        double estimationProgramming;
        double averageScore;
        double averagePercent;

        if (history <= 0.6) {
            estimationHistory = 2.0;
            if (programming <= 0.6) {
                estimationProgramming = 2.0;
                averageScore = (estimationHistory + estimationProgramming) / 2.0;
                averagePercent = (((history + programming) * 100) / 2) * 0.01;
                System.out.println("История - " + estimationHistory + "\nПрограммирование - " + estimationProgramming + 
                    "\nCредний балл оценок по предметам - " + averageScore + "\nCредний % по предметам - " + averagePercent);
            } else if (programming > 0.6 && programming <= 0.73) {
                estimationProgramming = 3.0;
                averageScore = (estimationHistory + estimationProgramming) / 2.0;
                averagePercent = (((history + programming) * 100) / 2) * 0.01;
                System.out.println("История - " + estimationHistory + "\nПрограммирование - " + estimationProgramming + 
                    "\nCредний балл оценок по предметам - " + averageScore + "\nCредний % по предметам - " + averagePercent);
            } else if (programming > 0.73 && programming <= 0.91) {
                estimationProgramming = 4.0;
                averageScore = (estimationHistory + estimationProgramming) / 2.0;
                averagePercent = (((history + programming) * 100) / 2) * 0.01;
                System.out.println("История - " + estimationHistory + "\nПрограммирование - " + estimationProgramming + 
                    "\nCредний балл оценок по предметам - " + averageScore + "\nCредний % по предметам - " + averagePercent);
            } else if (programming > 0.91) {
                estimationProgramming = 5.0;
                averageScore = (estimationHistory + estimationProgramming) / 2.0;
                averagePercent = (((history + programming) * 100) / 2) * 0.01;
                System.out.println("История - " + estimationHistory + "\nПрограммирование - " + estimationProgramming + 
                    "\nCредний балл оценок по предметам - " + averageScore + "\nCредний % по предметам - " + averagePercent);
            }
        } else if (history > 0.6 && history <= 0.73) {
            estimationHistory = 3.0;
            if (programming <= 0.6) {
                estimationProgramming = 2.0;
                averageScore = (estimationHistory + estimationProgramming) / 2.0;
                averagePercent = (((history + programming) * 100) / 2) * 0.01;
                System.out.println("История - " + estimationHistory + "\nПрограммирование - " + estimationProgramming + 
                    "\nCредний балл оценок по предметам - " + averageScore + "\nCредний % по предметам - " + averagePercent);
            } else if (programming > 0.6 && programming <= 0.73) {
                estimationProgramming = 3.0;
                averageScore = (estimationHistory + estimationProgramming) / 2.0;
                averagePercent = (((history + programming) * 100) / 2) * 0.01;
                System.out.println("История - " + estimationHistory + "\nПрограммирование - " + estimationProgramming + 
                    "\nCредний балл оценок по предметам - " + averageScore + "\nCредний % по предметам - " + averagePercent);
            } else if (programming > 0.73 && programming <= 0.91) {
                estimationProgramming = 4.0;
                averageScore = (estimationHistory + estimationProgramming) / 2.0;
                averagePercent = (((history + programming) * 100) / 2) * 0.01;
                System.out.println("История - " + estimationHistory + "\nПрограммирование - " + estimationProgramming + 
                    "\nCредний балл оценок по предметам - " + averageScore + "\nCредний % по предметам - " + averagePercent);
            } else if (programming > 0.91) {
                estimationProgramming = 5.0;
                averageScore = estimationHistory + estimationProgramming / 2.0;
                averagePercent = (((history + programming) * 100) / 2) * 0.01;
                System.out.println("История - " + estimationHistory + "\nПрограммирование - " + estimationProgramming + 
                    "\nCредний балл оценок по предметам - " + averageScore + "\nCредний % по предметам - " + averagePercent);
            }
        } else if (history > 0.73 && history <= 0.91) {
            estimationHistory = 4.0;
            if (programming <= 0.6) {
                estimationProgramming = 2.0;
                averageScore = (estimationHistory + estimationProgramming) / 2.0;
                averagePercent = (((history + programming) * 100) / 2) * 0.01;
                System.out.println("История - " + estimationHistory + "\nПрограммирование - " + estimationProgramming + 
                    "\nCредний балл оценок по предметам - " + averageScore + "\nCредний % по предметам - " + averagePercent);
            } else if (programming > 0.6 && programming <= 0.73) {
                estimationProgramming = 3.0;
                averageScore = (estimationHistory + estimationProgramming) / 2.0;
                averagePercent = (((history + programming) * 100) / 2) * 0.01;
                System.out.println("История - " + estimationHistory + "\nПрограммирование - " + estimationProgramming + 
                    "\nCредний балл оценок по предметам - " + averageScore + "\nCредний % по предметам - " + averagePercent);
            } else if (programming > 0.73 && programming <= 0.91) {
                estimationProgramming = 4.0;
                averageScore = (estimationHistory + estimationProgramming) / 2.0;
                averagePercent = (((history + programming) * 100) / 2) * 0.01;
                System.out.println("История - " + estimationHistory + "\nПрограммирование - " + estimationProgramming + 
                    "\nCредний балл оценок по предметам - " + averageScore + "\nCредний % по предметам - " + averagePercent);
            } else if (programming > 0.91) {
                estimationProgramming = 5.0;
                averageScore = (estimationHistory + estimationProgramming) / 2.0;
                averagePercent = (((history + programming) * 100) / 2) * 0.01;
                System.out.println("История - " + estimationHistory + "\nПрограммирование - " + estimationProgramming + 
                    "\nCредний балл оценок по предметам - " + averageScore + "\nCредний % по предметам - " + averagePercent);
            }
        } else if (history > 0.91) {
            estimationHistory = 5.0;
            if (programming <= 0.6) {
                estimationProgramming = 2.0;
                averageScore = (estimationHistory + estimationProgramming) / 2.0;
                averagePercent = (((history + programming) * 100) / 2) * 0.01;
                System.out.println("История - " + estimationHistory + "\nПрограммирование - " + estimationProgramming + 
                    "\nCредний балл оценок по предметам - " + averageScore + "\nCредний % по предметам - " + averagePercent);
            } else if (programming > 0.6) {
                estimationProgramming = 3.0;
                averageScore = (estimationHistory + estimationProgramming) / 2.0;
                averagePercent = (((history + programming) * 100) / 2) * 0.01;
                System.out.println("История - " + estimationHistory + "\nПрограммирование - " + estimationProgramming + 
                    "\nCредний балл оценок по предметам - " + averageScore + "\nCредний % по предметам - " + averagePercent);
            } else if (programming > 0.73 && programming <= 0.91) {
                estimationProgramming = 4.0;
                averageScore = (estimationHistory + estimationProgramming) / 2.0;
                averagePercent = (((history + programming) * 100) / 2) * 0.01;
                System.out.println("История - " + estimationHistory + "\nПрограммирование - " + estimationProgramming + 
                    "\nCредний балл оценок по предметам - " + averageScore + "\nCредний % по предметам - " + averagePercent);
            } else if (programming > 0.91) {
                estimationProgramming = 5.0;
                averageScore = (estimationHistory + estimationProgramming) / 2.0;
                averagePercent = (((history + programming) * 100) / 2) * 0.01;
                System.out.println("История - " + estimationHistory + "\nПрограммирование - " + estimationProgramming + 
                    "\nCредний балл оценок по предметам - " + averageScore + "\nCредний % по предметам - " + averagePercent);
            }
        }


        System.out.println("\n\n8. Расчет годовой прибыли");

        int profitMouth;
        int profitYear;
        int sale = 13000;
        int rent = 5000;
        int production = 9000;

        profitMouth = sale - (rent + production);
        profitYear = profitMouth * 12;

        if (profitYear < 0) {
            System.out.println("Прибыль за год: " + profitYear);
        } else if (profitYear > 0 ) {
            System.out.println("Прибыль за год: " + profitYear);
        } else if (profitYear == 0) {
            System.out.println("Прибыль за год: " + profitYear);
        }
    }
}