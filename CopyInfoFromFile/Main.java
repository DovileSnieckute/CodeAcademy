import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		
		File data = new File("data.txt");
		File results = new File("results.txt");
		File studentsData = new File("studentsData.txt");
		
		results.createNewFile();
		studentsData.createNewFile();
		
		FileWriter fileWriter = new FileWriter(results, false);
		FileWriter fw = new FileWriter(studentsData, true);
		
		data.createNewFile();
		List<String> list = new ArrayList<>();

		try {
			Scanner scanner = new Scanner(data);
			
			while(scanner.hasNext()) {
				list.add(scanner.next());
				
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			System.out.println("file does not exists");
		}
		
		fileWriter.write("Original data list: \n" + list + "\n");
		
		a(list, fileWriter);
		longerThanSix(list, fileWriter);
		sort(list, fileWriter);
		unique(list, fileWriter);
		startsWithS(list, fileWriter);
		
		stringToInteger(list, fileWriter);
		moreThan3(list, fileWriter);
		
		fileWriter.close();
		
		List<Student> students = readStudentsFromFile();
		fw.write("Original students list: \n");

		printStudentsList(students, fw);
		filterStudents(students, fw);
		findGirls(students, fw);
		sorted(students, fw);

		fw.close();
	}
	
	public static void a(List<String> list, FileWriter fileWriter) throws IOException {
		
		List<String> a = list
				.stream()
				.filter(word -> word.contains("a") || word.contains("A"))
				.collect(Collectors.toList());
		
		System.out.println(a);
		
		fileWriter.write("Strings containing a/A \n");
		writeListToFile(a, fileWriter);
				
				
	}
	
	public static void longerThanSix(List<String> list, FileWriter fileWriter) throws IOException {
		
		Long longerThan = list
				.stream()
				.filter(word -> word.length() > 6)
				.count();
		
		System.out.println(longerThan);
		
		fileWriter.write("String longer than 6 count: " + longerThan);
		fileWriter.write("\n");
				
	}
	
	public static void sort (List<String> list, FileWriter fileWriter) throws IOException {
		
		
		List<String> sortedList = list
				.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		
		System.out.println(sortedList);
		
		fileWriter.write("Reverse order \n");
		writeListToFile(sortedList, fileWriter);

	}
	
	public static void unique(List<String> list, FileWriter fileWriter) throws IOException {
		
		
		Long uniqueString = list
				.stream()
				.distinct()
				.count();
		
		System.out.println(uniqueString);
		
		fileWriter.write("Unique strings count: " + uniqueString);
		fileWriter.write("\n");
	}
	
	public static void startsWithS(List<String> list, FileWriter fileWriter) throws IOException {

		List<String> s = list
				.stream()
				.filter(word -> word.startsWith("S"))
				.collect(Collectors.toList());
		
		System.out.println(s);
		
		fileWriter.write("Starts with s \n");
		writeListToFile(s, fileWriter);
		

	}
	
//	public static void newList (List<String> list) {
//		
//		List<String> newList = list
//				.stream()
//				.filter(word -> word.getChars(0, 1))
//				.collect(Collectors.toList());
//		
//		System.out.println(newList);
//	}
	
	public static void stringToInteger(List<String> list, FileWriter fileWriter) throws IOException {
		
		List<Integer> integerList = list
				.stream()
				.map(word -> word.length())
				.collect(Collectors.toList());
		
		System.out.println(integerList);
		
		fileWriter.write("String list to integer list: " + integerList);
		fileWriter.write("\n");

	}
	
	public static void moreThan3(List<String> list, FileWriter fileWriter) throws IOException {
		
		boolean moreThan3 = list
				.stream()
				.allMatch(word -> word.length() >= 3);
		
		System.out.println(moreThan3);
		
		fileWriter.write("String longer than 3: " + moreThan3);
		fileWriter.write("\n");
	}
	
	public static void writeListToFile(List<String> list, FileWriter fileWriter) throws IOException {
		
		for(int i = 0; i < list.size(); i++) {
		
		fileWriter.write(list.get(i) + ",");
			
		}
		fileWriter.write("\n");
	}
	
	public static List<Student> readStudentsFromFile() throws FileNotFoundException{
		
		List<Student> students = new ArrayList<>();
		File studentsData = new File("studentsData.txt");
		Scanner studentsScanner = new Scanner(studentsData);
		
		while(studentsScanner.hasNextLine()) {
			
			String line = studentsScanner.nextLine();
			System.out.println(line);
			String[] fields = line.split(";");
			students.add(new Student(fields[0], fields[1], Integer.valueOf(fields[2]), fields[3]));
			
		}
		return students;
	}
	
	public static void filterStudents(List<Student> students, FileWriter fw) throws IOException {
		
		List<Student> filtered = students
				.stream()
				.filter(student -> student.getCourse() > 1)
				.collect(Collectors.toList());
		
		fw.write("Non first course students: \n");
		printStudentsList(filtered, fw);

		
	}

	public static void findGirls(List<Student> students, FileWriter fw) throws IOException {

		List<Student> girls = students
				.stream()
				.filter(student -> student.getName().endsWith("a") || student.getName().endsWith("e"))
				.collect(Collectors.toList());
		
		fw.write("All girls: \n");
		printStudentsList(girls, fw);


	}
	
	public static void sorted (List<Student> students, FileWriter fw) throws IOException {

		List<Student> sortStudents = students
				.stream()
				.sorted(Comparator.comparing(Student::getName, Comparator.naturalOrder()))
				.collect(Collectors.toList());
		
		
		fw.write("Sorted students: \n");
		printStudentsList(sortStudents, fw);

	}
	
	public static void printStudentsList(List<Student> students, FileWriter fw) throws IOException {
		
		for(Student student: students) {
			fw.write(String.format("Students name: %s, Group: %s, Course: %d, Phone: %s \n", student.getName(), student.getCourse(), student.getCourse(), student.getPhoneNumber()));
		}
	}

}
