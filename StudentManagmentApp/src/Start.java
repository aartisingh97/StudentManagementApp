import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.Student.manage.Student;
import com.Student.manage.StudentDao;

public class Start {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("Press 1 to Add Student");
			System.out.println("Press 2 to delete Student");
			System.out.println("Press 3 to Show Student");
			System.out.println("Press 4 to exit App");
			int c = Integer.parseInt(br.readLine());
			if (c == 1) {
				System.out.println("Enter the Student Name:");
				String name = br.readLine();
				System.out.println("Enter the Student Phone Number:");
				String phone = br.readLine();
				System.out.println("Enter the Student City:");
				String city = br.readLine();
				Student st = new Student(name, phone, city);

				boolean answer = StudentDao.insertStudentToDB(st);
				if (answer) {
					System.out.println("Student is added successfully");
				} else {
					System.out.println("Something went wrong");
				}
				System.out.println(st);

			} else if (c == 2) {

			} else if (c == 3) {

			} else if (c == 4) {
				break;

			} else {

			}
		}

	}

}
