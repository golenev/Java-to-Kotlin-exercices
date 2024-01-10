package javaCode;

import java.util.List;

public class Products {

    private List<ProductsModel> generateProducts() {
        var product1 = new ProductsModel(1001, true, false, """
                Зубная щетка средней жесткости создана с применением антибактериального метода Nano Silver. 
                Ультратонкая двойная щетина проникает в труднодоступные промежутки между зубами
                """, "Зубная щетка Nano Silver", "Зубная щетка Siberian Нealth", 200, 12, 10,
                new ProductsModel.ProductSaldo("1278", "46", 6, 12));

        var product2 = new ProductsModel(
                2,
                false,
                true,
                "Samsung Galaxy S21",
                "Samsung",
                "Smartphone",
                699,
                75,
                500,
                new ProductsModel.ProductSaldo(
                        "Los Angeles",
                        "Best Buy",
                        15,
                        2
                ));

        var product3 = new ProductsModel(
                3,
                true,
                true,
                "Sony PlayStation 5",
                "Sony",
                "Gaming Console",
                499,
                25,
                250,
                new ProductsModel.ProductSaldo(
                        "Chicago",
                        "GameStop",
                        15,
                        3
                )
        );

        var product4 = new ProductsModel(
                4,
                false,
                false,
                "Bose QuietComfort Earbuds",
                "Bose",
                "Wireless Earbuds",
                249,
                100,
                1000,
                new ProductsModel.ProductSaldo(
                        "San Francisco",
                        "Bose Store",
                        20,
                        4
                )
        );

        var product5 = new ProductsModel(
                5,
                true,
                false,
                "Dell XPS 13",
                "Dell",
                "Laptop",
                1299,
                50,
                500,
                new ProductsModel.ProductSaldo(
                        "Seattle",
                        "Microsoft Store",
                        8,
                        2
                )
        );

        var product6 = new ProductsModel(
                6,
                false,
                true,
                "LG OLED CX Series",
                "LG",
                "TV",
                1999,
                10,
                100,
                new ProductsModel.ProductSaldo(
                        "Miami",
                        "Best Buy",
                        3,
                        1
                )
        );

        var product7 = new ProductsModel(
                7,
                true,
                true,
                "Fitbit Charge 5",
                "Fitbit",
                "Fitness Tracker",
                179,
                200,
                1000,
                new ProductsModel.ProductSaldo(
                        "Boston",
                        "Target",
                        50,
                        10
                )
        );

        var product8 = new ProductsModel(
                9,
                true,
                false,
                "Apple iPad Pro (2021)",
                "Apple",
                "Tablet",
                1099,
                30,
                200,
                new ProductsModel.ProductSaldo(
                        "Washington D.C.",
                        "Apple Store",
                        45,
                        1
                )
        );

        var product9 = new ProductsModel(
                10,
                false,
                true,
                "Breville Barista Express",
                "Breville",
                "Espresso Machine",
                699,
                20,
                100,
                new ProductsModel.ProductSaldo(
                        "Austin",
                        "Williams Sonoma",
                        2,
                        1
                )
        );

        return List.of(product1, product1, product3, product4, product5, product6, product7, product8, product9);
    }

    public final List<ProductsModel> productList = generateProducts();

    int prod = productList.stream().mapToInt(a->a.price()).sum();

    public static void main(String[] args) {

        System.out.println(new Products().prod);
      /*  new Products().productList
                .stream()
                .filter(a->a.productSaldo().volume() >= 10)
                .map(a->a.nameFull())
                .forEach(System.out::println);*/
    }

}
