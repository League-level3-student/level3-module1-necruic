package _03_RemovingStuffFromArrayLists;

import java.util.ArrayList;

public class ArrayListRemove {

	

}

	

	
    class Stuff {
        public String type;
    }
    
    class Worm extends Stuff {
        public Worm() {
            type = "worm";
        }
    }
    
    class Dirt extends Stuff {
        public Dirt() {
            type = "dirt";
        }
    	
    
    
    // 1. Write a method that removes the dirt in the yard and returns the
    //    ArrayList
    public static ArrayList<Stuff> cleanOutTheYard( ArrayList<Stuff> stuffIFoundInTheYard ) {
//    	for(int i = 0; i < yard.size(); i++){
//            Stuff stuff = yard.get(i);
//            if(stuff == Dirt) {
//            	remove
//        }
    	stuffIFoundInTheYard.remove("dirt");
        return stuffIFoundInTheYard;
    }
    
    // 2. Write a method that removes the hash tag ('#') characters from the
    //    ArrayList and returns it
    public static ArrayList<Character> removeHashTags(ArrayList<Character> truth) {
    	truth.remove("#");
        return truth;
    }
}
