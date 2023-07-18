package mate.academy.springboot.datajpa.repository;

import java.math.BigDecimal;
import java.util.List;
import mate.academy.springboot.datajpa.model.Category;
import mate.academy.springboot.datajpa.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    public List<Product> findAllByPriceBetween(BigDecimal from, BigDecimal to);

    public List<Product> findAllByCategoryIn(List<Category> category);
}
