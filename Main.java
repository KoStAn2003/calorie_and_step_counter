import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MonthData data = new MonthData();
        StepTracker tracker = new StepTracker(sc);
        while (true) {
            printMenu();
            int command = sc.nextInt();

            if (command == 1) {
                tracker.saveUserData(sc,data);
            } else if (command == 2) {
                System.out.println("Введите новую цель по количеству шагов в день");
              int dailyGoal = sc.nextInt();
                tracker.changeDailyGoal(dailyGoal);
            } else if (command == 3) {
            tracker.printStatistic(data);
            } else if (command == 4) {
                System.out.println("До свидания!");
                sc.close();
                return;
            } else {
                System.out.println("Ой что то не так давайте ещё раз");
            }
        }

    }
    public static void printMenu() {
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Изменить цель по количеству шагов в день");
        System.out.println("3 - Напечатать статистику за определённый месяц");
        System.out.println("4 - Выйти из приложения");

    }

}
