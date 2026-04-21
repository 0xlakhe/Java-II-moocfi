public class Student extends Person {
    private int studyCreds=0;
    public Student(String name, String address){
        super(name,address);
        this.studyCreds=0;
    }
    public void study(){
        this.studyCreds+=1;
    }

    public int credits(){
        return this.studyCreds;
    }

    public String toString(){
        return super.toString()+"\n  Study credits "+this.studyCreds;
    }
}
