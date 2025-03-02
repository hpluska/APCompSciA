public class Cat extends Animal3 {

        private String name;
    
        public Cat(String n){
            name = n;
        }
      //overriden
        public String speak(){
          return "Meow!";
        }
    
        public String type(){
          return "Mammal";
        }
    
        public String toString(){
          String msg = "My name is " + name + " " + speak();
          return msg;
        }
    
}

