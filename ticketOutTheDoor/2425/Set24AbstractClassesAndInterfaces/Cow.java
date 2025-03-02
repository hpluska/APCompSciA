public class Cow extends Animal3{

        private String name;
    
        public Cow(String n){
            name = n;
        }
    
        public String speak(){
          return "Mooo!";
        }
           public String type(){
          return "Mammal";
        }
    
        public String toString(){
          String msg = "My name is " + name + " " + speak();
          return msg;
        }
    }

