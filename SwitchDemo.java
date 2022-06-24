public class SwitchDemo {
    public static void main(String[] args) {
       String course="mysql";
       switch(course){
           case "java","python","PHP"->System.out.println("programming");
           case "mysql","oracle","mongodb"->System.out.println("database");
           default->System.out.println("default");
       }
    }  
}
