package capstone.bcs.lifo.converters.examples;

import capstone.bcs.lifo.commands.example.ExampleProductForm;
import capstone.bcs.lifo.model.examples.Product;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * Created by jt on 1/10/17.
 */
@Component
public class ProductFormToProduct implements Converter<ExampleProductForm,Product>{

    @Override
    public Product convert(ExampleProductForm productForm) {
        Product product = new Product();
        if (productForm.getId() != null  && !StringUtils.isEmpty(productForm.getId())) {
            product.setId(new Long(productForm.getId()));
        }
        product.setDescription(productForm.getDescription());
        product.setPrice(productForm.getPrice());
        product.setImageUrl(productForm.getImageUrl());
        return product;
    }
}
