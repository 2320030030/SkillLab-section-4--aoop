package StreamPipelineExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPipelineExample {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 999),
            new Product("Smartphone", 499),
            new Product("Tablet", 299),
            new Product("Monitor", 199)
        );

        List<Product> result = products.stream()
            .filter(product -> product.getPrice() % 2 == 0)  
            .map(product -> {
                product.setPrice(product.getPrice() * 2);  
                return product;
            })
            .collect(Collectors.toList()); 

        result.forEach(System.out::println);
    }
}
