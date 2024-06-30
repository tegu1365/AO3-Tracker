package ao3.tracker.ao3tracker.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public enum Tag {
    plan("Plan To Read"),
    reading("Reading"),
    read("Read"),
    drop("Dropped"),
    onHold("onHold");

    String value;

    Tag(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static Tag fromValue(String value) {
        for (Tag tag : Tag.values()) {
            if (tag.value.equalsIgnoreCase(value)) {
                return tag;
            }
        }
        throw new IllegalArgumentException("Unknown enum value: " + value);
    }
}

class TagDeserializer extends JsonDeserializer<Tag>
{
    @Override
    public Tag deserialize(JsonParser p, DeserializationContext ctxt) throws IOException
    {
        String value = p.getText();
        return Tag.fromValue(value);
    }
}