package org.erp.internal.serviceimpl;

import lombok.RequiredArgsConstructor;
import org.erp.internal.model.Location;
import org.erp.internal.model.Product;
import org.erp.internal.repository.ProductRepository;
import org.erp.web.service.WarehouseService;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
class WarehouseServiceImpl implements WarehouseService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> findAllProducts() {
        return List.of();
    }

    @Override
    public Product saveProduct() {
        return null;
    }

    @Override
    public Product deleteProduct() {
        return null;
    }

    @Override
    public List<Location> findAllLocations() {
        return List.of();
    }

    @Override
    public Location clearLocation() {
        return null;
    }

    @Override
    public Location checkLocation() {
        return null;
    }
}
