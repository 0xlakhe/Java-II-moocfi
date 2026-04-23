public enum Education {
    PHD("Doctoral degree"),
    MA("Masters degee"),
    BA("Bachelors degree"),
    HS("High School diploma");

    private String degree;

    private Education(String degree){
        this.degree=degree;
    }

    public String getEducation(){
        return this.degree;
    }
}
