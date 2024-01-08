package kotlin

data class ProductsModel(
    val id: Int,
    val isActive: Boolean,
    val isArchived: Boolean,
    val description: String,
    val name: String,
    val nameFull: String,
    val price: Int,
    val bonuses: Int,
    val weight: Int,
    val productSaldo: ProductSaldo
) {
    data class ProductSaldo(
        val productCode: String,
        val scladId: String,
        val volume: Int,
        val regionId: Int
    )


}