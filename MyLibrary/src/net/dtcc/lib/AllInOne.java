package net.dtcc.lib;

public class AllInOne extends Object {

	//// Area Formulas ////

	/**
	 * 
	 * @param l length
	 * @param w width
	 * @return area
	 */
	public static double areaRectangle(double l, int w) {
		return l * w;
	}

	/**
	 * 
	 * @param s side length
	 * @return area
	 */
	public static double areaSquare(double s) {
		return s * s;
	}

	/**
	 * 
	 * @param b base length
	 * @param h height
	 * @return area
	 */
	public static double areaTriangle(double b, double h) {
		return (b * h)/2;
	}

	/**
	 * 
	 * @param r radius
	 * @return area
	 */
	public static double areaCircle(double r) {
		return Math.PI * (r * r);
	}

	/**
	 * 
	 * @param b1 base 1 length
	 * @param b2 base 2 length
	 * @param h height
	 * @return area
	 */
	public static double areaTrapezoid(double b1, double b2, double h) {
		return ((b1 + b2) / 2) * h;
	}

	/**
	 * 
	 * @param r1 radius 1
	 * @param r2 radius 2
	 * @return area
	 */
	public static double areaEllipse(double r1, double r2) {
		return Math.PI * r1 * r2;
	}

	/**
	 * A method that returns the area of a regular Pentagon.
	 * @param s side length
	 * @return area of a regular Pentagon with side length s
	 */
	public static double areaPentagon(double s) {
		return (.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5)))* Math.pow(s, 2));
	}

	/**
	 * 
	 * @param b base length
	 * @param h height
	 * @return area
	 */
	public static double areaParallelogram(double b, double h) {
		return b * h;
	}

	/**
	 * 
	 * @param p diagonal 1 length
	 * @param q diagonal 2 length
	 * @return area
	 */
	public static double areaRhombus(double p, double q) {
		return (p * q) / 2;
	}

	/**
	 * A method that returns the area of a regular Hexagon
	 * @param s side length
	 * @return area of a regular Hexagon with side length s
	 */
	public static double areaHexagon(double s) {
		return ((3 * Math.sqrt(3)) / 2) * Math.pow(s, 2);
	}

	/**
	 * A method that returns the area of a polygon.
	 * @param s side length
	 * @param n number of sides
	 * @return area of a polygon with n sides of length s.
	 */
	public static double areaPolygon(double s, int n) {
		return (Math.pow(s, 2) * n)/(4 * Math.tan(180 / n));
	}

	//// Fractions ////
	
	public static double addFractions(double n1, double n2, double n3, double n4) {
		return (n1 / n2) + (n3 / n4);
	}

	public static double subtractFractions(double n1, double n2, double n3, double n4) {
		return (n1 / n2) - (n3 / n4);
	}

	public static double multiplyFractions(double n1, double n2, double n3, double n4) {
		return (n1 / n2) * (n3 / n4);
	}

	public static double divideFractions(double n1, double n2, double n3, double n4) {
		return (n1 / n2) / (n3 / n4);
	}

	//// Temperature Formulas ////

	public static double celsiusToFahrenheit(double celsius) {
		return (celsius * (9.0/5)) + 32;
	}

	public static double celsiusToKelvin(double celsius) {
		return celsius + 273.15;
	}

	public static double fahrenheitToCelsius(double fahr) {
		return (fahr - 32) * (5/9.0);
	}

	public static double fahrenheitToKelvin(double fahr) {
		return (fahr - 32) * (5/9.0) + 273.15;
	}

	//// Binary ////

	public static double binaryToDecimal(String binaryString) {
		int decimal = 0;
		int indexModifier = 1;
		for (int i = 0; i < binaryString.length(); i++) {
			String value = Character.toString(binaryString.charAt(binaryString.length() - indexModifier));
			indexModifier++;
			decimal += (Double.parseDouble(value) * Math.pow(2, i));
		}
		return decimal;
	}
	
	public static double binaryToDecimal(int num) {
		String binaryString = Integer.toString(num);
		int decimal = 0;
		int indexModifier = 1;
		for (int i = 0; i < binaryString.length(); i++) {
			String value = Character.toString(binaryString.charAt(binaryString.length() - indexModifier));
			indexModifier++;
			decimal += (Double.parseDouble(value) * Math.pow(2, i));
		}
		return decimal;
	}


} // end MyLibrary
