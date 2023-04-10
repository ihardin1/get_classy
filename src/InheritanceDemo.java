import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class InheritanceDemo {
    public static void main(String[]args){
        List<Worker> workerList=new ArrayList<>();
        workerList.add(new Worker("ryder","hardin","000001","mr.",1998,14.50));
        workerList.add(new Worker("jason","biggs","000002","mr.",1997,16.50));
        workerList.add(new Worker("tristen","helge","000003","mr.",1996,18.50));
        workerList.add(new SalaryWorker("aalaya","brown","000004","mrs.",1996,20.50,60000));
        workerList.add(new SalaryWorker("ray","hardin","000005","mr.",1998,14.50,50000));
        workerList.add(new SalaryWorker("ricardo","max","000006","mr.",1993,15.50,52000));
        int [] hours={40,50,40};

        List<Double> workerPay=new ArrayList<>();
        for(int hoursInWeek:hours){
            for(Worker worker:workerList){
               workerPay.add( worker.calculateWeeklyPay(hoursInWeek));
            }

        }
       // System.out.print;

    }
}
