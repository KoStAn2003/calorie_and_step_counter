import java.util.Scanner;

public class StepTracker {
    MonthData[] getMonthUser = new MonthData[12];
    Converter converter = new Converter();

    StepTracker(Scanner sc){
        this.sc=sc;
        for(int i=0; i<getMonthUser.length; i++){
            getMonthUser[i] = new MonthData();
        }
    }
    int dailyGoal = 10_000;
    Scanner sc;
    int stepUser;
    int dayUser;
    int monthUser;

    void showStatistics(MonthData getMonthUser){
        for (int i = 0; i < getMonthUser.days.length; i++) {
            System.out.println((i + 1) + " день:" + getMonthUser.days[i]);
        }
    }
    void saveUserData(Scanner sc, MonthData getMonthUser) {

        System.out.println("Введите число месяца от 1 до 12");
        monthUser = sc.nextInt();

        if (monthUser < 0 || monthUser >=13){
            System.out.println("Ай видимо где то ошибка, давайте ещё раз");
            return;
        }

        System.out.println(" Пожалуйста, введите определённую дату для ввода пройденных шагов. От 1 до 30");
        dayUser = sc.nextInt();

        System.out.println("Сколько шагов вы хотите ввести?");
        stepUser = sc.nextInt();


        if (dayUser - 1 < getMonthUser.days.length) {
                    getMonthUser.monthData[monthUser-1] = monthUser;
                 getMonthUser.days[dayUser - 1] += stepUser;
            System.out.println("Шаги записаны за " + dayUser + " -ое число " + getMonthUser.monthData[monthUser-1] + " -ого месяца");
        }
        else if (dayUser-1 >getMonthUser.days.length || stepUser <= 0 ){
            System.out.println("Что то не так попробуйте ещё раз");

        }
    }
    void changeDailyGoal(int dailyGoal){
        this.dailyGoal = dailyGoal;
        if (dailyGoal > 500){
            System.out.println("Отлично! Ваша цель теперь " + dailyGoal);
        } else {
            System.out.println("К сожалению, это очень маленькая цель. Вы сможете достичь большего. Попробуйте еще раз.");
        }
    }
    void printStatistic(MonthData getMonthUser){
       this.getMonthUser = new MonthData[]{getMonthUser};

        System.out.println("Введите месяц от 1 до 12");
       int month = sc.nextInt();

        if (getMonthUser.monthData[month-1]  == getMonthUser.monthData[monthUser-1]) {

            System.out.println("Вот статистика за " + monthUser + " месяц:");

            showStatistics(getMonthUser);
            int sum = getMonthUser.ReadingStepsForMonth();
            System.out.println("Шаги за месяц " + sum);

            int maxSum = getMonthUser.sumStepsFromMonth();
            System.out.println("Ваш самый большой шаг " + maxSum);

            int finalSeries = getMonthUser.bestSeries(dailyGoal);
            System.out.println("Ваша прекрасная серия за месяц  " + finalSeries);

            int rezKm = converter.convertToKm(sum);
            System.out.println("Вы прошли " + rezKm + " км. за месяц");

            int rezKl = converter.convertStepsToKilocalories(sum);
            System.out.println("вы сожгли " + rezKl + " калорий");

        } else{
            System.out.println("Что то не так попробуйте ещё раз");
}
        }
    }

