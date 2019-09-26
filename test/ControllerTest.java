import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest
{
    private Controller controller;
    List<Clock> clocks = new ArrayList<Clock>();
    Date date;
    ControllerTest()
    {
        date = new Date();
        controller = new Controller();
        Clock clock1 = new Clock(date, Clock.Region.LONDON);
        Clock clock2 = new Clock(date, Clock.Region.PEKING);
        Clock clock3 = new Clock(date, Clock.Region.MOSCOW);
        Clock clock4 = new Clock(date, Clock.Region.SYDNEY);
        Clock clock5 = new Clock(date, Clock.Region.NEWYORK);
        clocks.add(clock1);
        clocks.add(clock2);
        clocks.add(clock3);
        clocks.add(clock4);
        clocks.add(clock5);
    }
    //LONDON,PEKING,MOSCOW,SYDNEY,NEWYORK
    @Test
    void setTimeTest()
    {
        controller.setClocks(clocks);
        controller.setTime(date);
        assertAll(()->assertEquals(clocks.get(0).date.getTime(),date.getTime()+clocks.get(0).offset*60*60*1000-8*60*60*1000),
                ()->assertEquals(clocks.get(1).date.getTime(),date.getTime()+clocks.get(1).offset*60*60*1000-8*60*60*1000),
        ()->assertEquals(clocks.get(2).date.getTime(),date.getTime()+clocks.get(2).offset*60*60*1000-8*60*60*1000),
        ()->assertEquals(clocks.get(3).date.getTime(),date.getTime()+clocks.get(3).offset*60*60*1000-8*60*60*1000),
        ()->assertEquals(clocks.get(4).date.getTime(),date.getTime()+clocks.get(4).offset*60*60*1000-8*60*60*1000));

    }

}
