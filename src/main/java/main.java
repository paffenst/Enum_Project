public class main {
    public static void main(String[] args) {
        Order order = new Order("1",OrderStatus.IN_DELIVERY);
        switch (order.getStatus()){
            case IN_DELIVERY -> System.out.println("In delivery");
            case IN_PROGRESS -> System.out.println("In progress");
            case RECEIVED -> System.out.println("Received");
            case COMPLETED -> System.out.println("Completed");
            case CANCELED -> System.out.println("Canceled");
        }
    }
}