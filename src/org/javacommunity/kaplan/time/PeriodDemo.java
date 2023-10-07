package kaplan.time;

import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {
		Period p = Period.of(1,22,465);
		p = p.normalized();
		System.out.println(p);

	}

}
