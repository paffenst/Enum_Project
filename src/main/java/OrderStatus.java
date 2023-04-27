public enum OrderStatus {
    RECEIVED("Received"),
    IN_PROGRESS("In Progress"),
    IN_DELIVERY("In Delivery"),
    COMPLETED("Compledeted"),
    CANCELED("Canceled");

    OrderStatus(String canceled) {
        String status;
    }
    @Override
    public String toString() {
        return "OrderStatus: " + super.toString();
    }
}
