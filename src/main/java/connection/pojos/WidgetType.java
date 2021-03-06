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
public class WidgetType implements Serializable
{
    private Integer widgettypeid;
    private String widgetTypeName;
    private String widgetTypeDescription;
    private Integer widgetTypeNuts;
    private Integer widgetTypeBolts;
    private Integer widgetTypeGears;

    public WidgetType() {}

    public WidgetType(WidgetType value) {
        this.widgettypeid = value.widgettypeid;
        this.widgetTypeName = value.widgetTypeName;
        this.widgetTypeDescription = value.widgetTypeDescription;
        this.widgetTypeNuts = value.widgetTypeNuts;
        this.widgetTypeBolts = value.widgetTypeBolts;
        this.widgetTypeGears = value.widgetTypeGears;
    }

    public WidgetType(
        Integer widgettypeid,
        String  name,
        String  description,
        Integer nuts,
        Integer bolts,
        Integer gears
    ) {
        this.widgettypeid = widgettypeid;
        this.widgetTypeName = name;
        this.widgetTypeDescription = description;
        this.widgetTypeNuts = nuts;
        this.widgetTypeBolts = bolts;
        this.widgetTypeGears = gears;
    }

    public Integer getWidgettypeid() {
        return this.widgettypeid;
    }

    public void setWidgettypeid(Integer widgettypeid) {
        this.widgettypeid = widgettypeid;
    }

    public String getWidgetTypeName() {
        return this.widgetTypeName;
    }

    public void setWidgetTypeName(String name) {
        this.widgetTypeName = name;
    }

    public String getWidgetTypeDescription() {
        return this.widgetTypeDescription;
    }

    public void setWidgetTypeDescription(String widgetTypeDescription) {
        this.widgetTypeDescription = widgetTypeDescription;
    }

    public Integer getWidgetTypeNuts() {
        return this.widgetTypeNuts;
    }

    public void setWidgetTypeNuts(Integer nuts) {
        this.widgetTypeNuts = nuts;
    }

    public Integer getWidgetTypeBolts() {
        return this.widgetTypeBolts;
    }

    public void setWidgetTypeBolts(Integer widgetTypeBolts) {
        this.widgetTypeBolts = widgetTypeBolts;
    }

    public Integer getWidgetTypeGears() {
        return this.widgetTypeGears;
    }

    public void setWidgetTypeGears(Integer widgetTypeGears) {
        this.widgetTypeGears = widgetTypeGears;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("WidgetType (");

        sb.append(widgettypeid);
        sb.append(", ").append(widgetTypeName);
        sb.append(", ").append(widgetTypeDescription);
        sb.append(", ").append(widgetTypeNuts);
        sb.append(", ").append(widgetTypeBolts);
        sb.append(", ").append(widgetTypeGears);

        sb.append(")");
        return sb.toString();
    }
}
