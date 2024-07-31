package FRAMEWORK_COLLECTION.Generics;


    public class List<Type> {
        Type value;
        public List(Type value){
            this.value = value;
        }
        public void print(){
            System.out.println(value);
        }
    }
    

