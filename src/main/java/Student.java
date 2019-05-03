public class Student {

    public String lastName;



    private String firstName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int age;

    public String getFirstName(String badword) {
       firstName += "Loh";
        return firstName + badword;
    }
    //constructor
    public Student(String name){

        firstName="Vasya";
    }
    public boolean passExam(String subject){
        return true;
 /*   }
    public void print(){
        System.out.println(firstName);
    }*/
/*    public void print(String badword)
    {
        System.out.println(firstName + badword);
    }
    public void print(String badword, Object... messages)
    {
        System.out.println(badword);
        for (Object msg: messages)
        {
            System.out.println(msg);
        }
    }*/
    public void print(String firstName){
        this.firstName = firstName;
        }
}//ctrl shift /
