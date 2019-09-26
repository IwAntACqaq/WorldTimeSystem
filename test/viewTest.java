import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class viewTest
{
    private View view;
    viewTest()
    {
        view = new View();
    }

    @Test
    void setControllerTest()
    {
        Controller controller = new Controller();
        view.setController(controller);
        assertEquals(view.getController(),controller);
    }

    @Test
    void getandsetDateTest()
    {
        Date date = new Date();
        Controller controller = new Controller();
        List<Clock> clocks =new ArrayList<Clock>();
        clocks.add(new Clock(date, Clock.Region.PEKING));
        controller.setClocks(clocks);
        view.setController(controller);
        view.getandsetDate(date);
        assertEquals(view.getDate().getTime(),date.getTime());
    }



}
