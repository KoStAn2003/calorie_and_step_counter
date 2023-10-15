/***
 *
 Дорогой Левин,

 Я обращаюсь к вам с просьбой о помощи в одном важном вопросе. Как вам известно, я работаю над проектом 1 спринта (35_когорта).

 Проблема заключается в том, что я столкнулся с трудностями при обращении к массиву дело в том что как не пытался он не видит данные записаные в него и не показывает их в статистике . Я уверен, что вы, как опытный специалист, можете дать мне ценные советы и рекомендации по этому поводу.

 Поэтому я был бы очень благодарен, если бы вы смогли уделить мне некоторое время и обсудить со мной эту проблему. Ваше мнение и опыт могут стать решающим фактором в успешном завершении проекта.

 Заранее благодарю вас за вашу помощь и поддержку. Надеюсь на ваше понимание и сотрудничество.

 Искренне ваш, Константин
 @author Konstantin
  * ***/




import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MonthData data = new MonthData();
        StepTracker tracker = new StepTracker();
        while (true) {
            printMenu();
            int command = sc.nextInt();

            if (command == 1) {
           /*     System.out.println("Введите число месяца от 1 до 12");
                int monthUser = sc.nextInt();*/
                System.out.println(" Пожалуйста, введите определённую дату для ввода пройденных шагов. От 1 до 30");
                int dayUser = sc.nextInt();
                System.out.println("Сколько шагов вы хотите ввести?");
                int stepUser = sc.nextInt();

              tracker.saveUserData(dayUser,stepUser);
            } else if (command == 2) {
                System.out.println("Введите новую цель по количеству шагов в день");
               int dailyGoal = sc.nextInt();
                tracker.changeDailyGoal(dailyGoal);
            } else if (command == 3) {
               data.showStatistics();
                data.monthlyCalculation();
            } else if (command == 4) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Ой что то не так давайте ещё раз");
            }
        }

    }
    public static void printMenu() {
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Изменить цель по количеству шагов в день");
        System.out.println(" 3 - Напечатать статистику за определённый месяц");
        System.out.println(" 4 - Выйти из приложения");

    }
}
