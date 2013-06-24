//package com.sjo;
//
//
//import java.util.List;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import com.sjo.model.ressource.Equipement;
//import com.sjo.services.EquipementService;
//
//public class SampleClient {
//    public static void main(String args[]) {
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("classpath*:spring/client-context.xml");
//
//        dumpEquipement(context);
//      //  dumpProducts(context);
//
//        System.exit(0);
//    }
//
//    private static void dumpEquipement(ApplicationContext context) {
//        EquipementService client = (EquipementService) context.getBean("equipementClient");
//
//        List<Equipement> categories = client.findAllEquipement();
//        System.out.println("Equipement found: " + categories.size());
//        for (Equipement equipement : categories) {
//            System.out.println("Found equipement: " + equipement.toString());
//        }
//        System.out.println("");
//
//        Equipement equipement = client.retrieveEquipement("1000");
//        System.out.println("Equipement 1000, Name: " + equipement.getNumSerie());
//    }
//
////    private static void dumpProducts(ApplicationContext context) {
////        ProductService client = (ProductService) context.getBean("productClient");
////
////        List<Product> products = client.retrieveProductsForEquipement("FISH");
////        System.out.println("Products found: " + products.size());
////        for (Product product : products) {
////            System.out.println("Found product: " + product.toString());
////        }
////        System.out.println("");
////    }
//}
