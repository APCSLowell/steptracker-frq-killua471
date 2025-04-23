import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 private int minSteps,steps,daysA,days;
 public StepTracker(int num){
  minsteps=num;
  steps=0;
  days=0;
  daysA=0
 }
 public int activeDays(){
  return daysA;
 }
 public void addDailySteps(int num){
  if(num>minSteps){
   daysA++;
  }
  days++;
  steps=steps+num
 }
 public double averageSteps(){
  if(steps==0){
   return (double)steps;
  }
  return (double)steps/days;
 }
} 
