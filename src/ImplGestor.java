import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;

public class ImplGestor implements Gestor{

List<Product> products= new ArrayList<Product>();
   /**Hay que inicializar la lista*/


/**Creem una Cua per poder afegir les comandes*/
    Queue<Order> orders;
    HashMap<String, User> users;

    public ImplGestor(){
            this.user = new HashMap<String, user>();

        }

    @Override
    public void addUser(String idUser, String name) {
        this.users.put(idUser, new User(idUser, name));

    }

    public User getUser(String idUser){
        User user = this.users.get(idUser);
        return user;
    }

    @Override
    public List<Product> productsByPrize() {
        //sort()
        //primero hay que ordenar la lista
        return this.products;
    }

    @Override
    public void addOrder(Order o) {
//Estructura de dades més adient per gestionar LLISTES: FIFO (First In First Out) = implementem una Cua
    this.orders.add(o);

    }

    @Override
    public Order getOrder() {
       Order o = this.orders.peek();
       process(o);
       //
        User user = o.getUser();

        user.addOrder(o);
        return 0;


        return null;
    }

    private void process(Order o) {
        for (Item i: o.items()){
            q = i.q;
            product = i.p;

            product. numVendes(q);
        }
    }

    @Override
    public List<Order> ordersByUser(String idUser) {
        return null;
    }

    @Override
    public List<Product> productsySales() {
        //sort()
        //primero hay que ordenar la lista
        return this.products;
    }



    @Override
    public void addUser() {

    }

    @Override
    public void addProduct(String name, String description, double prize) {
        this.products.add(new Product(name,description,prize));//Afegir aquest producte dintre de la llista
    }


}
    public static void main (String[] args){
        Gestor g = new ImplGestor();
        g.addUser("97", "Gabri");
        User u = g.getUser( "97");
        System.out.println(u.getName());
        g.addProduct("cafe", "hola", 1.5);
        g.addProduct("bocata pernil", "adeu", 2.5);

        List<Product> llista = g.productsByPrize();

        for (Product p: llista){
            System.out.println(p);
    }
}
