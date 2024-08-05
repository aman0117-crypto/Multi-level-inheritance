package multi_level_inheritance;

public class Semester extends Internal{
    double sum_marks;

    public void display_details(String s1,String s2,String s3,double m1,double m2){
        college_name=s1;
        Student_name=s2;
        branch_name=s3;
        mark1=m1;
        mark2=m2;
        sum_marks=mark1+mark2;

        System.out.println("THE COLLEGE NAME IS: "+college_name);
        System.out.println("THE STUDENT NAME IS: "+Student_name);
        System.out.println("THE BRANCH NAME IS: "+branch_name);
        System.out.println("THE MARKS OF SUBJECT 1 IS: "+mark1);
        System.out.println("THE MARKS OF SUBJECT 2 IS: "+mark2);
        System.out.println("THE TOTAL OF MARKS ARE: "+sum_marks);
    }

    public static void main(String[] args) {
        Semester obj=new Semester();
        obj.display_details("CSJMU", "Aman", "CS", 89.5, 90.8);
    }
    
}
