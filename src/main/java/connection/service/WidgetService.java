package connection.service;

import org.jooq.*;
import org.jooq.impl.DSL;
import restapi.Application;

import java.sql.Connection;

import static database.Tables.WIDGET;
import static database.Tables.WIDGETTYPE;

public class WidgetService
{
    public WidgetService()
    {

    }

    public String getWidgets()
    {
        // Connection is the only JDBC resource that we need
        // PreparedStatement and ResultSet are handled by jOOQ, internally
        try
        {
            Connection connection = Application.DatabaseConnection.getConnection();

            DSLContext dslContext = DSL.using(connection, SQLDialect.SQLITE);

            Result<Record> result = dslContext.select(WIDGET.fields()).select(WIDGETTYPE.fields()).from(WIDGET)
                    .join(WIDGETTYPE).onKey(WIDGET.WIDGETTYPEID).fetch();

            //String queryJson = dslContext.select(WIDGET.fields()).select(WIDGETTYPE.fields()).from(WIDGET)
            //        .join(WIDGETTYPE).onKey(WIDGET.WIDGETTYPEID).fetch().formatJSON();

            result.removeIf(x -> x.getValue(WIDGET.WIDGETID) != 1);

            String returnJSON = result.formatJSON();

            return returnJSON;
        }

        // For the sake of this tutorial, let's keep exception handling simple
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return null;
    }
}
