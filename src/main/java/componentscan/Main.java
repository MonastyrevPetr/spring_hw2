package componentscan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        var beanNames = context.getBeanDefinitionNames();
        var cart = context.getBean(Cart.class);
        var product = context.getBean(ProductRepository.class);
        Scanner scan = new Scanner(System.in);

        while (true) {
            String command = scan.nextLine();
            if (command.equals("exit")){
                break;
            }
            if (command.equals("show_product")){
                System.out.println(product);
            }
            if (command.equals("show_product_id")){
                System.out.println("Ввудите id");
                System.out.println(product.findId(scan.nextInt()));
            }
            if (command.equals("show_cart")){
                System.out.println(cart);
            }
            if (command.equals("add_cart")){
                System.out.println("Введите id");
                cart.cartAdd(product.findId(scan.nextInt()));
            }
            if (command.equals("remove_cart")){
                System.out.println("Введите id");
                cart.cartRemove(scan.nextInt());
            }
        }

for (var name:beanNames){
    System.out.println(context.getBean(name));
}

        context.close();
    }
}
