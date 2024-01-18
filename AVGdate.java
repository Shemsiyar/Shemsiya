
/**
 * Write a description of class AVGdate here.
 *
 * @author (SHEMSIYA OMAR RASHID,BITA/6/22/023/TZ)
 * @version (TEST:1, QUESTION 3)
 */
public class AVGdate
{
    private int Day;
    private String mouth;
    private String name;
    public AVGdate(int Day,String mouth,String name)
    {
        this.Day=Day;
        this.mouth=mouth;
        this.name=name;
    }
    public static double avgDate(Mapinduzi[] holidays)
    {
    int totalDays = 0;
    for(Mapinduzi holiday : holidays){
    totalDays += holiday.day;
}
{
    return (double) totalDays / holidays.length;
    }
}   
