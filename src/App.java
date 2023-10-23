import java.util.ArrayList;

import javax.xml.transform.sax.TemplatesHandler;

public class App {
    public static void main(String[] args) throws Exception {

        TemplateList<Customer> customer = new TemplateList<>();
        TemplateList<Inventory> inventory = new TemplateList<>();
        customer.add(new Customer());
        inventory.add(new Inventory());

    }

}
