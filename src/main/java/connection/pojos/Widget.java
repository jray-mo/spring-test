/*
 * This file is generated by jOOQ.
*/
package connection.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Widget implements Serializable {

    private Integer widgetid;
    private String widgetName;
    private String widgetDescription;
    private Integer widgettypeid;
    private WidgetType widgetType;

    public Widget() {}

    public Widget(Widget value) {
        this.widgetid = value.widgetid;
        this.widgetName = value.widgetName;
        this.widgetDescription = value.widgetDescription;
        this.widgettypeid = value.widgettypeid;
        this.widgetType = value.widgetType;
    }

    public Widget(
        Integer widgetid,
        String  name,
        String  description,
        Integer widgettypeid,
        WidgetType widgetType
    ) {
        this.widgetid = widgetid;
        this.widgetName = name;
        this.widgetDescription = description;
        this.widgettypeid = widgettypeid;
        this.widgetType = widgetType;
    }

    public Integer getWidgetid() {
        return this.widgetid;
    }

    public void setWidgetid(Integer widgetid) {
        this.widgetid = widgetid;
    }

    public String getWidgetName() {
        return this.widgetName;
    }

    public void setWidgetName(String name) {
        this.widgetName = name;
    }

    public String getWidgetDescription() {
        return this.widgetDescription;
    }

    public void setWidgetDescription(String widgetDescription) {
        this.widgetDescription = widgetDescription;
    }

    public Integer getWidgettypeid() {
        return this.widgettypeid;
    }

    public void setWidgettypeid(Integer widgettypeid) {
        this.widgettypeid = widgettypeid;
    }

    public WidgetType getWidgetType() {
        return this.widgetType;
    }

    public void setWidgetType(WidgetType widgetType) {
        this.widgetType = widgetType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Widget (");

        sb.append(widgetid);
        sb.append(", ").append(widgetName);
        sb.append(", ").append(widgetDescription);
        sb.append(", ").append(widgettypeid);
        sb.append(", ").append(widgetType);

        sb.append(")");
        return sb.toString();
    }
}
