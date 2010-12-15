package com.browsermob.core.har;

import com.browsermob.core.json.ISO8601DateFormatter;
import com.browsermob.core.json.ISO8601DateParser;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.annotate.JsonWriteNullProperties;

import java.util.Date;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

@JsonWriteNullProperties(value=false)
@JsonIgnoreProperties(ignoreUnknown=true)
public class HarCookie {
    private String name;
    private String value;
    private String path;
    private String domain;
    private Date expires;
    private Boolean httpOnly;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @JsonSerialize(using = ISO8601DateFormatter.class)
    public Date getExpires() {
        return expires;
    }
    
    @JsonDeserialize(using = ISO8601DateParser.class)
    public void setExpires(Date expires) {
        this.expires = expires;
    }

    public Boolean getHttpOnly() {
        return httpOnly;
    }

    public void setHttpOnly(Boolean httpOnly) {
        this.httpOnly = httpOnly;
    }
}
