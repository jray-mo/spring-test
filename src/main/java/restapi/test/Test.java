package restapi.test;

import connection.pojos.Widget;
import java.util.ArrayList;
import java.util.List;

public class Test
{
    private final long id;
    private final ArrayList<Widget> content;

    public Test(long id, List<Widget> content)
    {
        this.id = id;
        this.content = new ArrayList<>();
                this.content.addAll(content);
    }

    public long getId()
    {
        return id;
    }

    public ArrayList<Widget> getContent()
    {
        return content;
    }
}
