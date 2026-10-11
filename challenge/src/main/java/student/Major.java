package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;

    public Major(String code, String name) {
        this.code = code;
        this.name = name;
        this.id = nextId++;
        this.students = new Student[50];
        this.studentCount = 0;
    }

    // Method to add a student
    public void addStudent(Student s) {
        if(studentCount < students.length){
            students[studentCount] = s;
            studentCount++;
        }
    }

    // Getters
    public Student findStudentByCNE(String cne){
        for(int i = 0 ; i < studentCount;i++){
            if(students[i] != null && students[i].getCne().equals(cne)){
                return students[i];
            }
        }
        return null;
    }
    public boolean removeStudent(String cne){
        Student studentToRemove = findStudentByCNE(cne);
        if(studentToRemove == null){
            return false;
        }
        int indexToRemove = -1;
        for(int i = 0 ; i < studentCount;i++){
            if(students[i] == studentToRemove){
                indexToRemove = i;
                break;
            }
        }
        if(indexToRemove != -1){
            for(int i = indexToRemove ; i < studentCount - 1;i++){
                students[i] = students[i+1];
            }
            students[studentCount - 1] = null;
            studentCount--;
            return true;
        }else{
            return false;
        }
    }
    public int getStudentCount(){
        return studentCount;
    }
    public void getOccupancyRate(){
        System.out.println(name + " capacity : " + 50 + " students");
        System.out.println("Current enrollement : " + studentCount + " students");
        double rate = (studentCount / 50.0) * 100;
        String message = String.format("Occupancy rate : %.1f",rate);
        System.out.println(message + "%");
    }
    // Display all students in the major
    public void displayStudents() {
        for(int i = 0 ; i < studentCount ; i++){
            System.out.println((i + 1) + ". " + students[i].getCne() + " " + students[i].getFullNameFormatted());
        }
    }
    public String getStudentListAsString(){
        if(studentCount == 0){
            return "No students found";
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < studentCount ; i++){
            sb.append(students[i].getFullNameFormatted());
            if(i < studentCount - 1){
                sb.append("\n");
            }
        }
        return sb.toString();
    }


}
