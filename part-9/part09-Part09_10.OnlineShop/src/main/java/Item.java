public class Item {
    private String product;
    private int qty;
    private int unitPrice;
    private int onePrice;
    public Item(String product, int qty, int unitPrice){
        this.product=product;
        this.qty=qty;
        this.unitPrice=unitPrice;
        this.onePrice=unitPrice;
    }

    public int price(){
        return this.unitPrice;
    }

    public String getProduct(){
        return this.product;
    }

    public void increaseQuantity(){
        this.qty+=1;
        this.unitPrice=this.qty*this.onePrice;
    }



    public String toString(){
        return this.product +": "+this.qty;
    }

    public boolean equals(Object item){
        if(this==item){
            return true;
        }
        if(!(item instanceof Item)){
            return false;
        }
        Item comparedItem=(Item) item;
        if(this.product.equals(comparedItem.product)){
            return true;
        }
        return false;
    }
}
