
public class StepTracker {
int dailyGoal = 10_000;
    int[] month = new int[12];
    MonthData data = new MonthData();
// здесь происходит обращение к массиву и проверка на ошибку со стороны пользователя
    void saveUserData(int dayUser, int stepUser) {
      if (dayUser - 1 < data.days.length) {
              data.days[dayUser - 1] += stepUser;
          System.out.println("Шаги записаны за " + dayUser + " -ое число");
      }
      else if (dayUser-1 >data.days.length  ){
            System.out.println("Что то не так попробуйте ещё раз");
        }
    }


  void changeDailyGoal(int dailyGoal){
    this.dailyGoal = dailyGoal;
  if (dailyGoal < 500){
      System.out.println("Отлично! Ваша цель теперь " + dailyGoal);
  } else {
      System.out.println("К сожалению, это очень маленькая цель. Вы сможете достичь большего. Попробуйте еще раз.");
  }
  }


}

/*
* */