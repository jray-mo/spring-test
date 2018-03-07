package connection.service;

import connection.pojos.WidgetType;
import database.Tables;
import database.tables.Widget;
import database.tables.records.WidgetRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.jooq.RecordValueReader;
import restapi.Application;
import sun.nio.ch.SelectorImpl;

import java.util.*;
import java.sql.Connection;

import static database.Tables.WIDGET;
import static database.Tables.WIDGETTYPE;

public class WidgetService
{
    public WidgetService()
    {

    }

    public List<connection.pojos.Widget> getWidgets(Integer id)
    {
        // Connection is the only JDBC resource that we need
        // PreparedStatement and ResultSet are handled by jOOQ, internally
        try
        {
            Connection dbConnection = Application.DatabaseConnection.getConnection();

            DSLContext dslContext = DSL.using(dbConnection, SQLDialect.SQLITE);
            List<connection.pojos.Widget> result = new ArrayList<>();
            SelectQuery query = dslContext
                    .select(WIDGET.fields())
                    .select(WIDGETTYPE.fields())
                    .from(WIDGET)
                    .join(WIDGETTYPE).onKey(WIDGET.WIDGETTYPEID)
            .getQuery();

            if(id != null && id > 0){

                query.addConditions(WIDGET.WIDGETID.eq(id));
            }


            List<Record> queryResults = query.fetch();


            ModelMapper modelMapper = new ModelMapper();
            modelMapper.getConfiguration().addValueReader(new RecordValueReader());

            for(Iterator<Record> i = queryResults.iterator(); i.hasNext();){
                Record record = i.next();
                connection.pojos.Widget widget = modelMapper.map(record, connection.pojos.Widget.class);
                result.add(widget);
            }



            return result;
        }

        // For the sake of this tutorial, let's keep exception handling simple
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return null;
    }
}
