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
            // Add sample inhouse and outsourced parts - 5 TOTAL
            OutsourcedPart r= new OutsourcedPart();
            r.setCompanyName("ZikaTronics");
            r.setName("Ram");
            r.setInv(5);
            r.setPrice(20.0);
            r.setId(100L);
            outsourcedPartRepository.save(r);
            OutsourcedPart thePart1=null;
            List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for(OutsourcedPart part:outsourcedParts){
                if(part.getName().equals("Ram"))thePart1=part;
            }

            System.out.println(thePart1.getCompanyName());

            OutsourcedPart s= new OutsourcedPart();
            s.setCompanyName("ZikaTronics");
            s.setName("Solid State Drive");
            s.setInv(5);
            s.setPrice(20.0);
            s.setId(100L);
            outsourcedPartRepository.save(s);
            OutsourcedPart thePart2=null;
            List<OutsourcedPart> outsourcedParts2=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for(OutsourcedPart part:outsourcedParts2){
                if(part.getName().equals("Solid State Drive"))thePart2=part;
            }

            System.out.println(thePart2.getCompanyName());

            OutsourcedPart m= new OutsourcedPart();
            m.setCompanyName("ZikaTronics");
            m.setName("Motherboard");
            m.setInv(5);
            m.setPrice(20.0);
            m.setId(100L);
            outsourcedPartRepository.save(m);
            OutsourcedPart thePart3=null;
            List<OutsourcedPart> outsourcedParts3=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for(OutsourcedPart part:outsourcedParts3){
                if(part.getName().equals("Motherboard"))thePart3=part;
            }

            System.out.println(thePart3.getCompanyName());


            OutsourcedPart l= new OutsourcedPart();
            l.setCompanyName("ZikaTronics");
            l.setName("LCD Screen");
            l.setInv(5);
            l.setPrice(20.0);
            l.setId(100L);
            outsourcedPartRepository.save(l);
            OutsourcedPart thePart4=null;
            List<OutsourcedPart> outsourcedParts4=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for(OutsourcedPart part:outsourcedParts4){
                if(part.getName().equals("LCD Screen"))thePart4=part;
            }

            System.out.println(thePart4.getCompanyName());

            OutsourcedPart p= new OutsourcedPart();
            p.setCompanyName("ZikaTronics");
            p.setName("Power Supply");
            p.setInv(5);
            p.setPrice(20.0);
            p.setId(100L);
            outsourcedPartRepository.save(p);
            OutsourcedPart thePart5=null;
            List<OutsourcedPart> outsourcedParts5=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for(OutsourcedPart part:outsourcedParts5){
                if(part.getName().equals("Power Supply"))thePart5=part;
            }

            System.out.println(thePart5.getCompanyName());


            // Add sample products
            Product desktop = new Product("Desktop", 50.0, 10);
            Product laptop = new Product("Laptop", 60.0, 8);
            Product tablet = new Product("Tablet", 70.0, 6);
            Product monitor = new Product("Monitor", 80.0, 12);
            Product soundBar = new Product("Sound Bar", 90.0, 15);

            productRepository.saveAll(List.of(desktop, laptop, tablet, monitor, soundBar));
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
