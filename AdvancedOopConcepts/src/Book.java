public abstract class Book {
    private String Title;
    private double Price;
    
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