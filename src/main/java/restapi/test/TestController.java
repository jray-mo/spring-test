package restapi.test;

import connection.pojos.Widget;
import connection.pojos.WidgetType;
import database.Tables;
import database.tables.records.WidgetRecord;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import restapi.Application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class TestController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/testing")
    public Test Testing(@RequestParam(value = "id", required = false) Integer id ) {
        List<connection.pojos.Widget> widgets = new ArrayList<>();
        List queryList = Application.WidgetService.getWidgets(id);
        widgets.addAll(queryList);


        return new Test(counter.incrementAndGet(), widgets);
        //        String.format("Name: %s, Description: %s, Widget Type: ");
    }
}