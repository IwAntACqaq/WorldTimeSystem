import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.String;
import java.util.Scanner;
public class View
{
    private Date date;

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public Controller getController()
    {
        return controller;
    }

    private Controller controller;
    public void setController(Controller controller)
    {
        this.controller = controller;
    }
    public void getandsetDate(Date date)
    {
            this.date = date;
            controller.setTime(date);
            showTime();
    }
    public void showTime()
    {
        for(Clock clock : controller.getTime())
        {
            SimpleDateFormat form = new SimpleDateFormat("HH:mm:ss");
            String str =form.format(clock.date);
            System.out.println(clock.region.toString()+str);
        }
    }

}
