public class BookArray {
    public static void main(String[] args){
    	
    	Book[] arr = new Book [10];
    	arr[0] = new Fiction ("Nineteen Eighty Four");
    	arr[1] = new NonFiction ("Between the World and Me ");
    	arr[2] = new Fiction ("The Hand Maids Tale");
    	arr[3] = new NonFiction ("The New Jim Crow");
    	arr[4] = new Fiction ("The Great Gatsby");
    	arr[5] = new NonFiction ("The Emperor of All Maladies");
    	arr[6] = new Fiction ("The Cather in the Rye");
    	arr[7] = new NonFiction ("Bloodlands");
    	arr[8] = new Fiction ("The Four Winds");
    	arr[9] = new NonFiction ("The Sixth Extinction");
    	
    	System.out.println("Books: ");
    	for(int i=0; i<10; i++) {
    		System.out.println("Book" + i);
    		arr[i].getTitle();
    		arr[i].getPrice();
    	}
    }
}
