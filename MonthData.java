import java.util.Scanner;
public class MonthData {
Scanner sc;
    StepTracker tracker;
    int[] days = new int[30];
    int ReadingStepsForMonth() {
        int sum = 0;
        for (int day : days) {
            sum += day;
        }
    return sum;
    }
    int sumStepsFromMonth(){
        int maxSum = 0;
       for (int max : days) {
           if (max > maxSum) {
               maxSum = max;
           }
       }
        return maxSum;
    }
    int bestSeries(int dailyGoal){
      tracker = new StepTracker(sc);
        int currentSeries = 0;
        int finalSeries = 0;
        for (int day : days) {
            if (day == dailyGoal||day > dailyGoal) {
                currentSeries++;
                finalSeries = currentSeries;
            }
        }
        return finalSeries;
    }
}




