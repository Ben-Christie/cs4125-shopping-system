package com.shopmanagementsystem.spring.Database.DAO;

@Service
public class DiscountedProductsDAO {
    @Autowired
    private DiscountedProductRepo repository;

    public void save(DiscountedProduct discountedProduct) {
        repository.save(discountedProduct);
    }

    public void delete(DiscountedProduct discountedProduct) {
        repository.delete(discountedProduct);
    }

    public List<DiscountedProduct> getAllDiscountedProducts() {
        List<DiscountedProduct> discountedProductList = new ArrayList<>();

        Streamable.of(repository.findAll()).forEach(discountedProductList::add);

        return discountedProductList;
    }
}