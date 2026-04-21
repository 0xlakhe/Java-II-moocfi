public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory history;
    public ProductWarehouseWithHistory(String productName,double capacity,double initialBalance){
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        
        this.history=new ChangeHistory();
        this.history.add(initialBalance);
    }

    public String history(){
        return this.history.toString();
    }

    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        double balance=super.getBalance();
        this.history.add(balance);
    }

    public double takeFromWarehouse(double amount){
        double rAmount=super.takeFromWarehouse(amount);
        double balance=super.getBalance();
        this.history.add(balance);
        
        return rAmount;
    }

    public void printAnalysis(){
        System.out.println("Product: "+ super.getName());
        System.out.println("History: "+ this.history());
        System.out.println("Largest amount of product: "+ this.history.maxValue());
        System.out.println("Smallest amount of product: "+ this.history.minValue());
        System.out.printf("Average: %.1f", this.history.average());
        System.out.println();
    }
}
