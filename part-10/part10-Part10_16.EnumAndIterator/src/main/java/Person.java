public class Person {
    private Education education;
    private String name;

    public Person(String name, Education education){
        this.name=name;
        this.education=education;
    }

    public String toString(){
        StringBuilder result= new StringBuilder();
        result.append(this.name);
        result.append(", ");
        result.append(this.education);
        return result.toString();
    }

    public Education getEducation(){
        return this.education;
    }

}
