import java.util.Scanner;

public class StepTracker {
    MonthData data = new MonthData();
    MonthData[] monthData = new MonthData[12];
    Converter converter = new Converter();

    StepTracker(Scanner sc){
        this.sc=sc;
        for(int i=0; i<monthData.length; i++){
            monthData[i] = new MonthData();
        }
    }
    int dailyGoal = 10_000;
    Scanner sc;
    int stepUser;
    int dayUser;
    int monthUser;

    void showStatistics(MonthData monthData){
        this.monthData = new MonthData[]{monthData};
        for (int i=0; i< monthData.days.length; i++){
            System.out.println((i+1) + " день:" + monthData.days[i] );
        }
    }
    void saveUserData(Scanner sc, MonthData monthData) {
        this.monthData= new MonthData[]{monthData};
        System.out.println("Введите число месяца от 1 до 12");
        monthUser = sc.nextInt();

        System.out.println(" Пожалуйста, введите определённую дату для ввода пройденных шагов. От 1 до 30");
        dayUser = sc.nextInt();

        System.out.println("Сколько шагов вы хотите ввести?");
        stepUser = sc.nextInt();



        if (dayUser - 1 < monthData.days.length) {
            monthData.days[dayUser - 1] += stepUser;
            System.out.println("Шаги записаны за " + dayUser + " -ое число");
        }
        else if (dayUser-1 >monthData.days.length ){
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

    void printStatistic( MonthData data){
       this.data = new MonthData();
        showStatistics(data);
        int sum = data.ReadingStepsForMonth();
        System.out.println("Шаги за месяц " + sum);

        int maxSum = data.sumStepsFromMonth();
        System.out.println("Ваш самый большой шаг" + maxSum);

        int finalSeries =  data.bestSeries(dailyGoal);
        System.out.println("Ваша прекрасная серия за месяц  " + finalSeries);

         int rezKm = converter.convertToKm(sum);
        System.out.println("Вы прошли " + rezKm + " км. за месяц");

       int rezKl = converter.convertStepsToKilocalories(sum);
        System.out.println("вы сожгли " + rezKl + " калорий");
    }
}

/*
 * */