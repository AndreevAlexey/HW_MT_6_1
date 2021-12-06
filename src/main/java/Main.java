import java.util.Scanner;

public class Main {
    // получение данных с консоли
    private static int getScannerArgument(Scanner scanner, String text) {
        String input;
        int result;
        System.out.println(text);
        input = scanner.nextLine();
        // проверка на выход
        if("end".equals(input)) return -999;
        // получение значения из строки
        try {
            result = Integer.parseInt(input);
        } catch (Exception exp) {
            System.out.println("Неверно указано значение!");
            result = -1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int choise;
        int loanSum, prc, period;
        // калькулятор
        LoanCalculator loanCalculator = new LoanCalculator();
        // основной цикл
        while(true) {
            // получение суммы кредита
            loanSum = getScannerArgument(scanner, "Введите сумму кредита(end для выхода):");
            if (loanSum == -999) break;
            if (loanSum == -1) continue;
            // получение процентной ставки
            prc = getScannerArgument(scanner, "Введите процентную ставку(end для выхода):");
            if (prc == -999) break;
            if (prc == -1) continue;
            // получение периода
            period = getScannerArgument(scanner, "Введите срок кредита(end для выхода):");
            if (period == -999) break;
            if (period == -1) continue;
            // сохранение параметров
            loanCalculator.setLoanSum(loanSum);
            loanCalculator.setPeriod(period);
            loanCalculator.setPrc(prc);
            // цикл получения информации
            while (true) {
                System.out.println("Выберите действие:");
                System.out.println("1. Рассчет ежемесячного платежа");
                System.out.println("2. Рассчет общей суммы к возврату в банк");
                System.out.println("3. Рассчет переплаты за весь период");
                System.out.println("0. Выход");
                // выбор действия с консоли
                input = scanner.nextLine();
                try {
                    choise = Integer.parseInt(input);
                } catch (Exception exp) {
                    System.out.println("Неверно указано значение!");
                    continue;
                }
                // проверка на выход
                if (choise == 0) break;
                // обработка выбора
                switch(choise) {
                    // Рассчет ежемесячного платежа
                    case 1: System.out.println(loanCalculator.getMonthPaySum());
                            break;
                    // Рассчет общей суммы к возврату в банк
                    case 2: System.out.println(loanCalculator.getFullLoanSum());
                        break;
                    // Рассчет переплаты за весь период
                    case 3: System.out.println(loanCalculator.getOverpaymentSum());
                        break;
                    default:
                        System.out.println("Неверно указано значение!");
                        break;
                }
            }
        }
    }
}
