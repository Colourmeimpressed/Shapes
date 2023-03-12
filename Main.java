import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	// Method to count the number of shapes created
	// Used to initialize size of Shapes array and display how made shapes were made
	static public int shapeCount(String fileName) {
		int numOfShapes = 0;
		String s;
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			while ((s = br.readLine()) != null) {
				String[] tokens = s.split(",");

				if (tokens[0].equals("Circle") && tokens.length == 2) {
					if (Double.parseDouble(tokens[1]) > 0.0) {
						numOfShapes++;
					}
				} else if (tokens[0].equals("Rectangle") && tokens.length == 3) {
					if (Double.parseDouble(tokens[1]) > 0.0 && Double.parseDouble(tokens[2]) > 0.0) {
						numOfShapes++;
					}
				} else if (tokens[0].equals("Square") && tokens.length == 2) {
					if (Double.parseDouble(tokens[1]) > 0.0) {
						numOfShapes++;
					}
				} else if (tokens[0].equals("Parallelogram") && tokens.length == 3) {
					if (Double.parseDouble(tokens[1]) > 0.0 && Double.parseDouble(tokens[2]) > 0.0) {
						numOfShapes++;
					}
				} else if (tokens[0].equals("Triangle") && tokens.length == 4) {
					if (Double.parseDouble(tokens[1]) > 0.0 && Double.parseDouble(tokens[2]) > 0.0
							&& Double.parseDouble(tokens[3]) > 0.0 && (Double.parseDouble(tokens[1])
									+ Double.parseDouble(tokens[2]) > Double.parseDouble(tokens[3]))) {
						numOfShapes++;
					}
				}
			}
		} catch (

		IOException e) {
			System.out.println(e.getMessage());
		}
		return numOfShapes;
	}

	// Method to read shapes from text and load them into a Shapes array that is
	// returned at the end of the method
	static public Shapes[] shapeLoader(String fileName) {
		String s;
		int index = 0;
		// Calls shapeCount method to initialize shapeArr to proper size
		Shapes[] shapeArr = new Shapes[shapeCount(fileName)];

		try (BufferedReader br = new BufferedReader(new FileReader("Shapes.txt"))) {
			while ((s = br.readLine()) != null) {
				String[] tokens = s.split(",");

				if (tokens[0].equals("Circle") && tokens.length == 2) {
					try {
						shapeArr[index] = new Circle(Double.parseDouble(tokens[1]));
						index++;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}

				} else if (tokens[0].equals("Rectangle") && tokens.length == 3) {
					try {
						shapeArr[index] = new Rectangle(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
						index++;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}

				} else if (tokens[0].equals("Square") && tokens.length == 2) {
					try {
						shapeArr[index] = new Square(Double.parseDouble(tokens[1]));
						index++;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				} else if (tokens[0].equals("Parallelogram") && tokens.length == 3) {
					try {
						shapeArr[index] = new Parallelogram(Double.parseDouble(tokens[1]),
								Double.parseDouble(tokens[2]));
						index++;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				} else if (tokens[0].equals("Triangle") && tokens.length == 4) {
					try {
						shapeArr[index] = new Triangle(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]),
								Double.parseDouble(tokens[3]));
						index++;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return shapeArr;
	}

	public static void main(String[] args) {

		System.out.println("------->JAC 444 Workshop 7<-------");

		// Calling function to load shapes into an array of type Shapes
		Shapes[] shapeArr = shapeLoader("shapes.txt");


		System.out.println("\n" +shapeCount("shapes.txt") + " shapes were created:");

		for (int i = 0; i < shapeArr.length; i++) {
			if (shapeArr[i] != null) {
				System.out.println(shapeArr[i]);
			}
		}
	}
}
