package guru.springframework.vktests;

public enum EnumTests {
 friday,
 sunday;
 
  EnumTests() {
	 
 }
  private int dayInWeek;
  
  public void setDayInWeek(int dayInWeek) {
	  this.dayInWeek = dayInWeek;
  }
  
  public int getDayInWeek() {
	 return this.dayInWeek;
  }
}
