public class Factory {
    public static final String CAT = "cat";
    public static final String DOG = "dog";
    public Animal getAnimal(String str){
        if(CAT.equals(str)){
            return new Cat();
        }
        else if(DOG.equals(str)){
            return new Dog();
        }
        else{
            return null;
        }
    }
    
}
