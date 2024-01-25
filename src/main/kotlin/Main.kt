fun main() {
    val order1 = TakeOrder(MegaMarket())
    println(order1.change())

    val order2 = Create(Ozon())
    println(order2.change())
}