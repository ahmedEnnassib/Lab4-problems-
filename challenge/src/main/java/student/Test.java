package student;

public class Test {
    public static void main(String[] args) {


        // Display computer science students
        Major Cs = new Major("23","computer science");
        Major Maths = new Major("24","mathematics");
        Student s1 = new Student("Safi","Amal","0662658932","AmalSafi@um6p.ma","22885676");
        Student s2 = new Student("Alami","Samir","0784377618","AlamiSamir@um6p.ma","23585976");
        Cs.addStudent(s1);
        Cs.addStudent(s2);

        System.out.println("=== The list of students in Computer science major is : ");
        Cs.displayStudents();
        Cs.getOccupancyRate();
        System.out.println(Cs.getStudentListAsString());

    }
}

