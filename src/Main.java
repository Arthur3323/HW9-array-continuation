public class Main {
    public static void main(String[] args) {


        System.out.println("Task 1");

        int[] monthlyExpenses = {100, 500, 350, 400, 250};
        int totalMonthlyExpenses = 0;
        for (int i : monthlyExpenses) {
            totalMonthlyExpenses += i;
        }
        System.out.println("Сумма трат за месяц составила " + totalMonthlyExpenses + " рублей");


        System.out.println("\nTask 2");
        monthlyExpenses = new int[]{100, 500, 350, 400, 250};
        int maxExpenses = -1;
        for (int expens : monthlyExpenses) {
            if (expens > maxExpenses) {
                maxExpenses = expens;
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxExpenses + " рублей");
        int minExpenses = monthlyExpenses[0];
        for (int monthlyExpens : monthlyExpenses) {
            if (monthlyExpens < minExpenses) {
                minExpenses = monthlyExpens;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpenses + " рублей");


        System.out.println("\nTask 3");
        monthlyExpenses = new int[]{100, 500, 350, 400, 250};
        double averageExpenses = totalMonthlyExpenses / monthlyExpenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpenses + " рублей");


        System.out.println("\nTask 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}
