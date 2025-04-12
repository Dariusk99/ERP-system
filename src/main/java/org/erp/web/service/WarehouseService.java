package org.erp.web.service;

import org.erp.internal.model.Location;
import org.erp.internal.model.Product;

import java.util.List;

public interface WarehouseService {
    // Operations on products
    List<Product> findAllProducts();
    Product saveProduct();
    Product deleteProduct();

    // Operations on locations
    List<Location> findAllLocations();
    Location clearLocation();
    Location checkLocation();
}
