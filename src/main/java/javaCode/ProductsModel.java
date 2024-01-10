package javaCode;

public record ProductsModel(
        int id,
        boolean isActive,
        boolean isArchived,
        String description,
        String name,
        String nameFull,
        int price,
        int bonuses,
        int weight,
        ProductSaldo productSaldo) {
    public record ProductSaldo(String productCode,
                               String scladId,
                               int volume,
                               int regionId) {
    }

}

