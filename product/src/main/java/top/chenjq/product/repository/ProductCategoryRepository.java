package top.chenjq.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.chenjq.product.dataobject.ProductCategory;

import java.util.List;

/**
 * Created by 廖师兄
 * 2017-12-09 21:41
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
