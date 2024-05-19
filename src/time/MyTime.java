package time;

public class MyTime {

	private int hour;
	private int minute;
	private int second;

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void nextTime(int hour, int minute, int second) {
		System.out.println("Time");
		if (hour <= 23 && hour >= 0 && minute <= 59 && minute >= 0 && second <= 59 && second >= 0) {
			System.out.printf("%02d:%02d:%02d", +hour, minute, second);
			
			second++;
			if (second > 59) {
				second = 0;
				minute++;

				if (minute > 59) {
					minute = 0;
					hour++;

					if (hour > 23) {
						hour = 0;
					}
				}
			}
			System.out.printf("\nNext second: %02d:%02d:%02d", +hour, minute, second);
			minute++;
			if (minute > 59) {
				minute = 0;
				hour++;
				if (hour > 23) {
					hour = 00;
				}
			}
			System.out.printf("\nNext minute: %02d:%02d:%02d", +hour, minute, second);
			hour++;
			if (hour > 23) {
				hour = 0;
			}
			System.out.printf("\nNext hour: %02d:%02d:%02d", +hour, minute, second);
		} else {
			System.out.println("Xato vaqt kiritildi;");
		}
	}

	public void PreviousTime(int hour, int minute, int second) {
		int hour1 = hour;
		int minute2 = minute;
		System.out.println("\nTime");
		if (hour <= 23 && hour >= 0 && minute <= 59 && minute >= 0 && second <= 59 && second >= 0) {
			System.out.printf("%02d:%02d:%02d", +hour, minute, second);
			hour1--;
			if (hour1 < 0) {
				hour1 = 23;
			}
			System.out.printf("\nPrevious hour: %02d:%02d:%02d", hour1, minute, second);
			int hour2 = hour;
			minute--;
			if (minute < 0) {
				minute = 59;
				hour2--;
				if (hour2 < 0) {
					hour2 = 23;
				}
			}
			System.out.printf("\nPrevious minute: %02d:%02d:%02d", hour2, minute, second);
			int hour3 = hour;
			second--;
			if (second < 0) {
				second = 59;
				minute2--;
				if (minute2 < 0) {
					minute2 = 59;
					hour3--;
					if (hour3 < 0) {
						hour3 = 23;
					}
				}
			}
			System.out.printf("\nPrevious second: %02d:%02d:%02d", hour3, minute2, second);
		} else {
			System.out.println("Xato vaqt kiritildi;");
		}

	}
}
