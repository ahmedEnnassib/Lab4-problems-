package student.instructor;

import student.Person;

public class Instructor extends Person {
    private String employeeNumber;
    public Instructor(String firstName, String secondName, String telephone, String email,String employeeNumber){
        super(firstName,secondName,telephone,email);
        this.employeeNumber = employeeNumber;
    }
    public String cleanEmployeeNumber(){
        return  employeeNumber.trim().replace(" ","");
    }
    public String summaryLine(){
        String message = String.format("Instructor[employeeNumber = %s,lastName = %s,firstName = %s]",employeeNumber,secondName,firstName);
        return message;
    }
    public String toCard(){
        StringBuilder card = new StringBuilder();
        card.append("Instructor\n");
        card.append("-------\n");
        card.append("Employee : ").append(employeeNumber).append("\n");
        card.append("Name : ").append(secondName).append(" , ").append(firstName).append("\n");
        card.append("Email : ").append(email).append("\n");
        card.append("Phone : ").append(phone);
        return card.toString();
    }
    public String displayName(){
        StringBuilder sb = new StringBuilder();
        if(firstName != null){
            sb.append(firstName).append(" ");
        }else{
            if(secondName != null){
                sb.append(secondName);
            }
        }
        return sb.toString();
    }

}
