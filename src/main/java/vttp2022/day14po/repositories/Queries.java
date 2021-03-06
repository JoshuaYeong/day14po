package vttp2022.day14po.repositories;

public interface Queries {
    public static final String SQL_INSERT_PURCHASE_ORDER = 
        "insert into purchase_order(order_id, name, order_date) values (?, ?, ?)";
    public static final String SQL_INSERT_LINE_ITEM =
        "insert into line_items(prod_id, order_id, quantity) values (?, ?, ?)";
}