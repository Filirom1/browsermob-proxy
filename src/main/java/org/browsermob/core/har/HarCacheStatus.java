package com.browsermob.core.har;

import com.browsermob.core.json.ISO8601DateFormatter;
import com.browsermob.core.json.ISO8601DateParser;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.annotate.JsonWriteNullProperties;

import java.util.Date;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

@JsonWriteNullProperties(value=false)
public class HarCacheStatus {
    private Date expires;
    private Date lastAccess;
    private String eTag;
    private int hitCount;

    @JsonSerialize(using = ISO8601DateFormatter.class)
    public Date getExpires() {
        return expires;
    }

    @JsonDeserialize(using = ISO8601DateParser.class)
    public void setExpires(Date expires) {
        this.expires = expires;
    }

    @JsonSerialize(using = ISO8601DateFormatter.class)
    public Date getLastAccess() {
        return lastAccess;
    }
    
    @JsonDeserialize(using = ISO8601DateParser.class)
    public void setLastAccess(Date lastAccess) {
        this.lastAccess = lastAccess;
    }

    public String geteTag() {
        return eTag;
    }

    public void seteTag(String eTag) {
        this.eTag = eTag;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }
}
