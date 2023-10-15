

public class MonthData {
int[] days = new int[30];
    // вывод статистики без данных о масиве
void showStatistics(){
for (int i=0; i<days.length; i++){
    System.out.println((i+1) + " день:" + days[i] );
}
}
    void monthlyCalculation() {
        int steps = 0;
        for (int i=0; i<days.length;i++){
            days[i] += steps;
        }
        System.out.println("Итог за месяц " + steps);
    }
    }




