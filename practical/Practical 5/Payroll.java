abstract class Employee{
    String name;
    int id;
    Employee(String n,int i){
        name=n;
        id=i;
    }
    abstract double monthlySalary();
}

class FullTime extends Employee{
    FullTime(String n,int i){
        super(n,i);
    }
    double monthlySalary(){
        return 50000;
    }
}



class PartTime extends Employee{
    int hours;
    PartTime(String n,int i,int h){
        super(n,i);
        hours=h;
    }
    double monthlySalary(){
        return (hours*200);
    }
}





class Intern extends Employee{
    Intern(String n,int i){
        super(n,i);
    }
    double monthlySalary() {
        return 10000;
    }
}




public class Payroll{
    public static void main(String[] args){
        Employee[] e ={
            new FullTime("Gaurav", 1),
            new PartTime("Malay", 2, 50),
            new Intern("HAri", 3)
        };
        double total=0;
        System.out.println("25AIML039");
        for (Employee x:e){
            double s=x.monthlySalary();
            System.out.println(x.name+":-Salary=" +s);
            total=total+s;
            if (x instanceof Intern){
                System.out.println("Intern");
            }
        }
        System.out.println("Total Salary= "+total);
    }
}