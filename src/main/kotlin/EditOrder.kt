class EditOrder(order: Order): OrderDecorator(order) {

    override fun change(): String {
        return super.change() + editOrder()
    }

    private fun editOrder(): String{
        return "успешно изменён"
    }
}