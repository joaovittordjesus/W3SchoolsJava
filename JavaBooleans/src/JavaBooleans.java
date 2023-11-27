public class JavaBooleans{    
    public static void main(String[] args){
        boolean isJavaFun = false;
        boolean isFishTasty = true;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);
        
        int myAge = 15;
        int voteAge = 16;
        System.out.println(myAge >= voteAge);
        
        if(myAge >= voteAge){
            System.out.println(myAge + " is Old enough to Vote");
        }else{
            System.out.println(myAge + " is not old enough to vote");
        }
        
    }
}