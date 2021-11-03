import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		ArrayList<Student> studentList = new ArrayList<Student>();

		boolean makingStudent = true;
		System.out.println("Are you ready to start your student list? 'y' or 'n'");
		String ans = s.nextLine();
		while (makingStudent)
		{ 
			if(ans.equals("y"))
			{
				System.out.println("What is your student's name?");
				String name = s.nextLine();
				System.out.println("What is your student's grade?");
				int grade = s.nextInt();
				String clear = s.nextLine();
				System.out.println("What is your student's GPA?");
				float gpa = s.nextFloat();
				System.out.println("Does your student like BlueJ more than Greenfoot? 'true' or 'false'");
				boolean prefBluej = s.nextBoolean();
				String clear2 = s.nextLine();
				Student student = new Student(name, grade, gpa, prefBluej);
				studentList.add(student);
			}
			if(ans.equals("n"))
			{
				System.out.println("Come back when you're ready!");
			}
			System.out.println("Do you wish to continue? yes/no");
			String ans2 = s.nextLine();
			if(ans2.equals("yes"))
			{
				System.out.println("Let's get back to it!");
			}
			if(ans2.equals("no"))
			{
				System.out.println("dang you're boring...");
				makingStudent = false;
			}
		}
		System.out.println("Do you want to sort your student list? 'y' or 'n'");
		String sort = s.nextLine();
		if(sort.equals("y"))
		{
			StudentList orgStudentList = new StudentList(studentList);
            boolean goodAns = false;
            int studToComp = 0;
            while (goodAns == false)
            {
                System.out.println("Which student do you want to see the best partner for? '0-"+(studentList.size()-1)+"'");
                studToComp = s.nextInt();
                String clear3 = s.nextLine();
                if (studToComp >= 0 && studToComp <= (studentList.size()-1))
                {
                    goodAns = true;
                }
            }
			orgStudentList.compareStudents(studToComp);
		}
		else if(sort.equals("no"))
		{
		    System.out.println("why wouldn't you organize your student list...");
		}
		
	}
}