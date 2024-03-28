package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.InhousePart;//change
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.InhousePartRepository;//change
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.InhousePartService;//change
import com.example.demo.service.InhousePartServiceImpl;//change
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (productRepository.count() == 0 && partRepository.count() == 0 && outsourcedPartRepository.count() == 0) {
            // Add sample parts
            Part part1 = new Part("Part 1", 10, 5.0);
            Part part2 = new Part("Part 2", 20, 8.0);
            Part part3 = new Part("Part 3", 15, 6.5);
            Part part4 = new Part("Part 4", 30, 7.0);
            Part part5 = new Part("Part 5", 25, 9.0);

            partRepository.saveAll(List.of(part1, part2, part3, part4, part5));

            // Add sample inhouse and outsourced parts - 5 TOTAL

            InhousePart inhousePart1 = new InhousePart("Inhouse Part 1", "Company A", 12, 15.0);
            InhousePart inhousePart1 = new InhousePart("Inhouse Part 2", "Company B", 12, 15.0);
            InhousePart inhousePart1 = new InhousePart("Inhouse Part 3", "Company C", 12, 15.0);
            InhousePart inhousePart1 = new InhousePart("Inhouse Part 4", "Company D", 12, 15.0);
            OutsourcedPart outsourcedPart5 = new OutsourcedPart("Outsourced Part 5", "Company E", 22, 16.5);

            outsourcedPartRepository.saveAll(List.of(outsourcedPart5));
            inhousePartRepository.saveAll(List.of(inhousePart1, inohousePart2, inhousePart3, inhousePart4));

            // Add sample products
            Product product1 = new Product("Product 1", 50.0, 10);
            Product product2 = new Product("Product 2", 60.0, 8);
            Product product3 = new Product("Product 3", 70.0, 6);
            Product product4 = new Product("Product 4", 80.0, 12);
            Product product5 = new Product("Product 5", 90.0, 15);

            productRepository.saveAll(List.of(product1, product2, product3, product4, product5));
        }
       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
