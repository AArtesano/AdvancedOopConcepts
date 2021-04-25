public class UseBook {
    
    public static void main(String[] args){
    	
    	Book books;
    	books = new NonFiction("The Invention of Nature");
    	books.getTitle();
    	books.getPrice();
    	
    	books = new Fiction("Lord of the Flies");
    	books.getTitle();
    	books.getPrice();
    }
}