package bookstore;
public class BookStore {

    public static void main(String[] args) {
       
        Person [] p = new Person[2];
        Book [] b = new Book[3];
        
        p[0] = new Person("Wildes", 27,'M');
        p[1] = new Person("Eliane", 28, 'F');
        
        b[0] = new Book("Java como Programar","zender", 700,p[0]);
        b[1] = new Book("JavaScript", "Gunabara", 500, p[0]);
        b[2] = new Book("Estetica para todos", "Priscila", 450,p[1]);
        
        b[0].open();
        b[0].leafThrough(701);
        b[0].pageForward();
        
        b[2].pageForward();
        
        System.out.println("----------------DETAILS---------------");
        System.out.print(b[0].details());
        System.out.println("\n");
        System.out.println(b[2].details());
       
        /*final int i = 1; TESTE
        //System.out.println(i++); // NÃO compila
        System.out.println(i);*/
        
    }
    
}
