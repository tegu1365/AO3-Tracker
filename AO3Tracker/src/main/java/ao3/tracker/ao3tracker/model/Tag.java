package ao3.tracker.ao3tracker.model;

public enum Tag {
    plan("Plan to read"),
    reading("Reading"),
    read("Read"),
    drop("Dropped"),
    onHold("onHold");

    String value;

    Tag(String value) {
        this.value = value;
    }
}
