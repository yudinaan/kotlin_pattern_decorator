class TakeOrder(order: Order): OrderDecorator(order) {

    override fun change(): String {
        return super.change() + takeOrder()
    }

    private fun takeOrder(): String{
        return "успешно получен"
    }
}