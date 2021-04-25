public abstract class Book {
    String Title;
    double Price;
    
    public Book(String title ){
        Title=title;
    }
    
    public String getTitle(){
    	System.out.println("Book Name: "+ Title);
        return Title;
    }
    
    public double getPrice(){
    	System.out.println("Book Price: "+ Price);
        return Price;
    }
    
    public abstract void setPrice();
}