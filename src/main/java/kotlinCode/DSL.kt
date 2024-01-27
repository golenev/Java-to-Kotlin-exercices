package kotlinCode

fun main() {
    val store = store {
        product {
            name = "Apple"
            price = 50
            weight = 0.1
        }
        product {
            name = "Banana"
            price = 30
            weight = 0.2
        }
        product {
            name = "Orange"
            price = 40
            weight = 0.3
        }
        product {
            name = "Grapes"
            price = 60
            weight = 0.4
        }
        product {
            name = "Pear"
            price = 70
            weight = 0.5
        }
    }

    val customer = customer {
        budget = 100
        maxWeight = 3.0
    }

    val cart = customer.buy(store)

    println("Customer bought:")
    for (product in cart) {
        println("- ${product.name} for ${product.price} rubles")
    }
}

data class Product(var name: String, var price: Int, var weight: Double)

class Store {
    private val products: MutableList<Product> = mutableListOf()

    fun addProduct(product: Product) {
        products.add(product)
    }

    fun getProductsByPrice(maxPrice: Int): List<Product> {
        return products.filter { it.price <= maxPrice }
    }

    fun getProductsByWeight(maxWeight: Double): List<Product> {
        return products.filter { it.weight <= maxWeight }
    }
}

data class Customer(var budget: Int, var maxWeight: Double) {
    fun buy(store: Store): List<Product> {
        val cart = mutableListOf<Product>()
        val affordableProducts = store.getProductsByPrice(budget)
        val lightProducts = store.getProductsByWeight(maxWeight)

        for (product in affordableProducts) {
            if (lightProducts.contains(product)) {
                cart.add(product)
                budget -= product.price
                maxWeight -= product.weight
            }
        }

        return cart
    }
}

fun store(init: Store.() -> Unit): Store {
    val store = Store()
    store.init()
    return store
}

fun Store.product(init: Product.() -> Unit) {
    val product = Product("", 0, 0.0)
    product.init()
    addProduct(product)
}

fun customer(init: Customer.() -> Unit): Customer {
    val customer = Customer(0, 0.0)
    customer.init()
    return customer
}
