package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	
		Color color = new Color(255, 0, 0);
		StdDraw.setPenColor(color);
	
				StdDraw.filledRectangle(0.5, 0.5, 0.6, 0.3);
				
				Color x = new Color(0, 0, 0);
				StdDraw.setPenColor(x);
				StdDraw.text(0.5, 0.5,"習");
	}
}
