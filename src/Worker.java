public class Worker extends Person {
    public static void main(String[]args){
        Worker w = new Worker("ryder","hardin","000001","mr.",1998,14.50);
        System.out.println(w.formalName());
        System.out.println(w.calculateWeeklyPay(52));
        System.out.println(w.displayWeeklyPay(52));
    }
    double hourlyPayRate;
    public Worker(String firstName,String lastName, String ID, String title, int YOB, double hourlyPayRate){
        super(firstName,lastName,ID,title,YOB);
        this.hourlyPayRate=hourlyPayRate;
    }
    public double calculateWeeklyPay (double hoursWorked){

        if (hoursWorked>40){
            double overTimeHours=hoursWorked-40;
            double overTimePay=hourlyPayRate*overTimeHours*1.5;
            double regularPay=40*hourlyPayRate;
            return overTimePay+regularPay;
        }
        else{
            return hoursWorked*hourlyPayRate;
        }
    }
    public String displayWeeklyPay(double hoursWorked) {
        double overTimeHours=0;
        if(hoursWorked>40){
            overTimeHours=hoursWorked-40;
            hoursWorked=40;
        }
        return "hours of regular pay: "+hoursWorked+" money earned:" +hoursWorked*hourlyPayRate+
                " overtime hours: "+overTimeHours+" money earned: "+overTimeHours*hourlyPayRate*1.5+
                " total: "+this.calculateWeeklyPay(hoursWorked+overTimeHours);
    }
}
