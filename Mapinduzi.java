
/**
 * Write a description of class mapinduz here.
 *
 * @author (Shemsiya Omar Rashid)
 * @version (BITA/6/22/023/TZ)
 */
public class Mapinduzi
{
    private String Name;
    private int Day;
    private String Month;
    public Mapinduzi (String Name,int Day,String Month)
    {
        this.Name=Name;
        this.Day=Day;
        this.Month=Month;
    }
    public void setName(String Name)
    {
        this.Name=Name;
    }
    public String getName()
    {
        return Name;
    }
    public void setDay(int Day)
    {
        this.Day=Day;
    }
    public int getDay()
    {
        return Day;
    }
    public void setMonth(String Month)
    {
        this.Month=Month;
    }
    public String getMonth()
    {
        return Month;
    }

}

