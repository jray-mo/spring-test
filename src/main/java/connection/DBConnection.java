package connection;

import connection.pojos.Widget;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.modelmapper.ModelMapper;
import org.modelmapper.jooq.RecordValueReader;
import restapi.Application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static database.Tables.WIDGET;

public class DBConnection
{
    //region variables

    private static Connection connection;
    private static DSLContext dslContext;

    private static String userName;
    private static String password;
    private static String url;

    //endregion variables

    public DBConnection()
    {
        userName = "root";
        password = "";
        url = "jdbc:sqlite:things.db";
    }

    public Connection getConnection()
    {
        try
        {
            return DriverManager.getConnection(url);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
