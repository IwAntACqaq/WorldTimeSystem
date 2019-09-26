import com.sun.scenario.effect.Offset;

import java.util.Date;

public class Clock
{
    public enum Region
    {
        LONDON,PEKING,MOSCOW,SYDNEY,NEWYORK
    }
    Date date;
    Region region;
    int offset;
    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public Region getRegion()
    {
        return region;
    }

    public void setRegion(Region region)
    {
        this.region = region;
    }

    public int getOffset()
    {
        return offset;
    }

    public void setOffset(int offset)
    {
        this.offset = offset;
    }
    Clock(Date date,Region region)
    {
        this.date = date;
        this.region = region;
        switch (region)
        {
            case LONDON:
                this.offset = 0;
                break;
            case PEKING:
                this.offset = -8;
                break;
            case MOSCOW:
                this.offset = -4;
                break;
            case SYDNEY:
                this.offset = -10;
                break;
            case NEWYORK:
                this.offset = 5;
                break;
        }
    }


}
