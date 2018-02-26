
import java.util.ArrayList;


public class GPACalculator {
    private double gpa;
    private double note;
    private int credit;
    private int total_credit;
    ArrayList<Double> note_array=new ArrayList<Double>();
    ArrayList<Integer> credit_array=new ArrayList<Integer>();
   

    public void addNoteandCredit(double note,int credit){
        note_array.add(note);
        credit_array.add(credit);
    }
    
    public double calculateGPA(){
        gpa=totalNote()/totalCredit();
        return gpa;
    }
    public double totalNote(){
        note=0;
        for (int i = 0; i < note_array.size(); i++) {
            note+=note_array.get(i)*credit_array.get(i);
        }
        return note;
    }
    public int totalCredit(){
        total_credit=0;
        for (int i = 0; i < credit_array.size(); i++) {
            total_credit+=credit_array.get(i);
        }
        return total_credit;
    }
    
    public void clearAll(){
        gpa=0;
        note_array.clear();
        credit_array.clear();
    }
    /*public static void main(String[] args) {
        GPACalculator gpaCal=new GPACalculator();
        gpaCal.addNoteandCredit(3, 3);
        System.out.println(gpaCal.calculateGPA());
        gpaCal.addNoteandCredit(2, 4);
        System.out.println(gpaCal.calculateGPA());
        gpaCal.addNoteandCredit(3, 1);
        gpaCal.addNoteandCredit(1.5, 3);
        gpaCal.addNoteandCredit(2.3, 3);
        gpaCal.addNoteandCredit(2.7, 3);
    }*/
    
}
