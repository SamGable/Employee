package Model;


public class Employee {

    private boolean sex ;
    private String name ;
    private int grade ;
    private int salary ;
    private int id ;

    Employee (int id , String name , int salary , int grade ) {
        this.grade = grade ;
        this.id = id ;
        this.name = name ;
        this.salary = salary ;
    }



    public void setInfo (int id , String name , int salary ) {
        this.id = id ;
        this.name = name ;
        this.salary = salary ;
    }

    String getInfo () {
        return "mr/ ms " + this.name + " with id " + this.id + " has $" + this.salary + " salary." ;
    }


    public void setName (String name) {
        this.name = name ;
    }


}


class TestEmployee {
    public static void main (String args[]) {
        Employee Kavian = new Employee (745 , "ali" , 45000 , 7 ) ;

        Kavian.setName("tara");

        Kavian.setInfo (757 , "reza" , 60000 );

        System.out.println(Kavian.getInfo());
    }



}


class GitTest {



}




