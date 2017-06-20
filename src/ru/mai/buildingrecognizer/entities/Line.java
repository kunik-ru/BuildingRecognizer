package ru.mai.buildingrecognizer.entities;

import org.opencv.core.Point;

public class Line {
	
	public Point p1;
	public Point p2;
	
	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
}
