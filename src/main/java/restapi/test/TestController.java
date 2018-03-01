package restapi.test;

import connection.pojos.Widget;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import restapi.Application;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class TestController
{

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/testing")
    public Test test(@RequestParam(value="name", defaultValue="World") String name)
    {
        String widgetsJson = Application.WidgetService.getWidgets();



        return new Test(counter.incrementAndGet(), widgetsJson);
        //        String.format("Name: %s, Description: %s, Widget Type: ");
    }
}