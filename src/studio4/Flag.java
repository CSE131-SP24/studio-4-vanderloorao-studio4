package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(0.5,0.5,0.38,0.2);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledCircle(0.5,0.5,0.1);

	}
}