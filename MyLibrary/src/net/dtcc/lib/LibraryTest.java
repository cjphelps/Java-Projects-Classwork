package net.dtcc.lib;

public class LibraryTest {

public static void main(String[] args) {
		
		System.out.println(AllInOne.areaRectangle(5, 5));
		
		System.out.println(AllInOne.areaSquare(3));
	
		System.out.println(AllInOne.areaTriangle(4, 3));
		
		System.out.println(AllInOne.areaCircle(4));
		
		System.out.println(AllInOne.areaTrapezoid(3, 3, 5));
		
		System.out.println(AllInOne.areaEllipse(3, 4));
		
		System.out.println("pentagon:" + AllInOne.areaPentagon(5));
		
		System.out.println("parallelogram: " + AllInOne.areaParallelogram(4, 5));
		
		System.out.println(AllInOne.areaRhombus(5, 6));
		
		System.out.println(AllInOne.areaHexagon(5));
		
		System.out.println(AllInOne.areaPolygon(3, 2));
		
		System.out.println(AllInOne.addFractions(1, 2, 1, 2));
		
		System.out.println(AllInOne.subtractFractions(2, 3, 1, 3));
		
		System.out.println(AllInOne.multiplyFractions(1, 2, 1, 2));
		
		System.out.println(AllInOne.divideFractions(1, 2, 1, 2));
		
		System.out.println(AllInOne.celsiusToFahrenheit(23));
		
		System.out.println(AllInOne.celsiusToKelvin(23));
		
		System.out.println(AllInOne.fahrenheitToCelsius(50));
		
		System.out.println(AllInOne.fahrenheitToKelvin(50));
		
		System.out.println(AllInOne.binaryToDecimal("1001"));
		
		System.out.println(AllInOne.binaryToDecimal(0101));
		double binaryString = AllInOne.binaryToDecimal("1001");
		System.out.println(binaryString);
	}

}
