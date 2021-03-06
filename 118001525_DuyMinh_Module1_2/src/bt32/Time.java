package bt32;

import java.text.DecimalFormat;

public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time() {
		setTime(0, 0, 0);
	}

	public Time(int h) {
		setTime(h, 0, 0);
	}

	public Time(int h, int m) {
		setTime(h, m, 0);
	}

	public Time(int h, int m, int s) {
		setTime(h, m, s);
	}

	public Time(Time time) {
		setTime(time.hour, time.minute, time.second);
	}

	private void setTime(int h, int m, int s) {
		if ((h >= 0 && h < 24))
			hour = h;
		else
			hour = 0;
		minute = ((m >= 0 && m < 60) ? m : 0);
		second = ((s >= 0 && s < 60) ? s : 0);
	}

	public String toUniversalString() {
		DecimalFormat twoDigits = new DecimalFormat("00");
		return twoDigits.format(hour) + ":" + twoDigits.format(minute) + ":" + twoDigits.format(second);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		DecimalFormat twoDigits = new DecimalFormat("00");
		return ((hour == 12 || hour == 0) ? 12 : hour % 12) + ":" + twoDigits.format(hour) + ":"
				+ twoDigits.format(minute) + ":" + twoDigits.format(second) + (hour < 12 ? " AM" : " PM");
	}
}
