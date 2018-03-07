package restapi;

import connection.DBConnection;
import connection.service.WidgetService;
import database.tables.Widget;
import org.modelmapper.PropertyMap;
import org.modelmapper.jooq.RecordValueReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.modelmapper.ModelMapper;


@SpringBootApplication
public class Application
{
    public static DBConnection DatabaseConnection;
    //Services
    public static WidgetService WidgetService;

    public static void main(String[] args)
    {
        DatabaseConnection = new DBConnection();

        //Initialize Services
        WidgetService = new WidgetService();
        SpringApplication.run(Application.class, args);
    }
}