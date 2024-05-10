package model;

public enum Status {
    ongoing("ongoing"),
    complete("complete"),
    onHold("onHold");

    String value;

    Status(String value) {
        this.value = value;
    }
}