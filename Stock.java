
/**
 * Write a description of class Stock here.
 *
 * @author (SHEMSIYA OMAR RASHID, BITA/6/22/023/TZ)
 * @version (TEST:1,QUESTION 2)
 */
public class Stock
{
    private int stocknumber;
    private String name;
    private double price;
    private int totalnumber;
    public Stock(int stocknumber,String name,double price,int totalnumber)
    {
        this.stocknumber=stocknumber;
        this.name=name;
        this.price=price;
        this.totalnumber=0;
    }
    public void setprice(double newprice)
    {
        this.price=newprice;
    }
    public void addstock(int quantity)
    {
        this.totalnumber+=quantity;
    }
    public double totalvalue()
    {
        return price * totalnumber;
    }
    public int getstocknumber()
    {
        return stocknumber;
    }
    public String getname(){
        return name;
    }
    public double getprice(){
        return price;
    }
    public int gettotalnumber(){
        return totalnumber;
    }

}
