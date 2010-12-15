package com.browsermob.core.har;

import com.browsermob.core.json.ISO8601DateFormatter;
import com.browsermob.core.json.ISO8601DateParser;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonWriteNullProperties;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

@JsonWriteNullProperties(value=false)
public class HarPage {
    private String id;
    private Date startedDateTime;
    private String title;
    private HarPageTimings pageTimings;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonSerialize(using = ISO8601DateFormatter.class)
    public Date getStartedDateTime() {
        return startedDateTime;
    }

    @JsonDeserialize(using = ISO8601DateParser.class)
    public void setStartedDateTime(Date startedDateTime) {
        this.startedDateTime = startedDateTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public HarPageTimings getPageTimings() {
        return pageTimings;
    }

    public void setPageTimings(HarPageTimings pageTimings) {
        this.pageTimings = pageTimings;
    }
}
