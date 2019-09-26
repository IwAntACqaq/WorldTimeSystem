import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Controller
{


    private List<Clock> clocks;

    public void setClocks(List<Clock> clocks)
    {
        this.clocks = clocks;
    }
    public  void setTime(Date date)
    {
        Date UTCTime = new Date();
        UTCTime.setTime(date.getTime()-8*60*60*1000);
        for(Clock clock : clocks )
        {
            clock.setDate(new Date(UTCTime.getTime()+clock.offset*60*60*1000));
        }
    }
    public List<Clock> getTime()
    {
        return clocks;
    }
}
