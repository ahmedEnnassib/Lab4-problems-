package student.instructor;

public class Subject extends Instructor{
    private int id;
    private String code;
    private String title;
    public Subject(String firstName, String secondName, String telephone, String email,String employeeNumber,int id,String code,String title){
        super(firstName,secondName,telephone,email,employeeNumber);
        this.id = id;
        this.code = code;
        this.title = title;
    }
    public String normalizedCode(){
        return code.toUpperCase().trim();
    }
    public String properTitle(){
        String[] words = title.split("\\s+");
        StringBuilder result = new StringBuilder();
        for(String w : words){
            if(!w.isEmpty()){
                String capitalized = w.substring(0,1).toUpperCase() + w.substring(1).toLowerCase();
                result.append(capitalized).append(" ");
            }
        }
        return result.toString().trim();
    }
    public boolean isIntroCourse(){
        if(title.toLowerCase().contains("intro") || code.startsWith("INTRO-")){
            return true;
        }else{
            return false;
        }
    }
    public String syllabusLine(){
        StringBuilder sb = new StringBuilder();
        sb.append(code).append(" - ").append(title).append("(Instructor : ").append(secondName).append(" ").append(firstName);
        return sb.toString();
    }
}
