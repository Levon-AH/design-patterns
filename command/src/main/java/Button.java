public enum Button {
    LIGHT_ON_BUTTON(ButtonType.ON, 0),
    LIGHT_OFF_BUTTON(ButtonType.OFF, 1),
    GARAGE_DOOR_OPEN(ButtonType.ON, 2),
    GARAGE_DOOR_CLOSE(ButtonType.OFF, 3);

    private final ButtonType type;
    private final int order;

    Button(ButtonType type, int order) {
        this.type = type;
        this.order = order;
    }

    public ButtonType getType() {
        return type;
    }

    public int getOrder() {
        return order;
    }
}
