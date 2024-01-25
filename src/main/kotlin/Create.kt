class Create(order: Order): OrderDecorator(order) {

    override fun change(): String {
        return super.change() + createOrder()
    }

    private fun createOrder(): String{
        return "успешно создан"
    }
}