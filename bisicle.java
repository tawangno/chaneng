class bisicle
{
 int cadence = 0;
 int speed = 0;
 int gear = 1;
 void changecadence(int newValue)
 {
  cadence = newValue;
 }
 void changegear(int newValue)
 {
  gear = newValue;
 }
 void speedup(int increment)
 {
  speed = speed = increment;
 }
 void applyBreak(int decrement){
  speed = speed = decrement;
 }
 void printStates()
 {
  System.out.println("cadence:"+cadence+" speed"+speed+" gear"+gear);
 }
}
