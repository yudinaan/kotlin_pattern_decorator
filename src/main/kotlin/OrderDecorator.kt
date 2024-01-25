abstract class OrderDecorator(val order: Order): Order {

    override fun change(): String {
        return order.change()
    }

}