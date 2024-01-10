package kotlinCode

import kotlinCode.ProductsModel.*
import java.util.*

class ProductsDSL() {


    fun generateProducts(): List<kotlinCode.ProductsModel> {
        val product1 = ProductsModel(
            1001,
            isActive = true,
            isArchived = false,
            description = """
                            Зубная щетка средней жесткости создана с применением антибактериального метода Nano Silver. 
                            Ультратонкая двойная щетина проникает в труднодоступные промежутки между зубами
                            
                            """.trimIndent(),
            name = "Зубная щетка Nano Silver",
            nameFull = "Siberian Нealth - Зубная щетка Nano Silver",
            price = 200,
            bonuses = 12,
            weight = 10,
            productSaldo = ProductSaldo("1278", "46", 34, 12)
        )

        val product2 = ProductsModel(
            2,
            false,
            true,
            "Samsung Galaxy S21",
            "Samsung",
            "Smartphone",
            699,
            75,
            500,
            ProductSaldo(
                "Los Angeles",
                "Best Buy",
                5,
                2
            )
        )

        val product3 = ProductsModel(
            3,
            true,
            true,
            "Sony PlayStation 5",
            "Sony",
            "Gaming Console",
            499,
            25,
            250,
            ProductSaldo(
                "Chicago",
                "GameStop",
                15,
                3
            )
        )

        val product4 = ProductsModel(
            4,
            false,
            false,
            "Bose QuietComfort Earbuds",
            "Bose",
            "Wireless Earbuds",
            249,
            100,
            1000,
            ProductSaldo(
                "San Francisco",
                "Bose Store",
                20,
                4
            )
        )

        val product5 = ProductsModel(
            5,
            true,
            false,
            "Dell XPS 13",
            "Dell",
            "Laptop",
            1299,
            50,
            500,
            ProductSaldo(
                "Seattle",
                "Microsoft Store",
                8,
                2
            )
        )

        val product6 = ProductsModel(
            6,
            false,
            true,
            "LG OLED CX Series",
            "LG",
            "TV",
            35599,
            10,
            100,
            ProductSaldo(
                "Miami",
                "Best Buy",
                3,
                1
            )
        )

        val product7 = ProductsModel(
            7,
            true,
            true,
            "Fitbit Charge 5",
            "Fitbit",
            "Fitness Tracker",
            179,
            200,
            1000,
            ProductSaldo(
                "Boston",
                "Target",
                50,
                10
            )
        )

        val product8 = ProductsModel(
            9,
            true,
            false,
            "Apple iPad Pro (2021)",
            "Apple",
            "Tablet",
            1099,
            30,
            200,
            ProductSaldo(
                "Washington D.C.",
                "Apple Store",
                5,
                1
            )
        )

        val product9 = ProductsModel(
            10,
            false,
            true,
            "Breville Barista Express",
            "Breville",
            "Espresso Machine",
            699,
            20,
            100,
            ProductSaldo(
                "Austin",
                "Williams Sonoma",
                762,
                1
            )
        )

        return listOf(
            product1,
            product1,
            product3,
            product4,
            product5,
            product6,
            product7,
            product8,
            product9
        )

    }

    var productList = generateProducts()

    val sum = this.productList.stream()
        .map { it.price }?.mapToInt { it }?.sum()

    val max = this.productList.stream()
        .map { it.price }?.mapToInt { it }?.max()

    fun searchVolumeLessThan(volume: Int, productList: List<ProductsModel>): Optional<ProductsModel>? {
        return productList.stream().filter { it.productSaldo.volume >= volume }?.findFirst()
    }

    fun getName(productsModel: kotlinCode.ProductsModel): String {
        return productsModel.nameFull
    }

    fun getNameSize(name: String): Int {
        return name.length
    }


}

fun main() {
    val productList = ProductsDSL().generateProducts()
    val qwerty = ProductsDSL().searchVolumeLessThan(700, productList)
    println(qwerty)
}