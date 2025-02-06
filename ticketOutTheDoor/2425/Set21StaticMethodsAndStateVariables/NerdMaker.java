public class NerdMaker{

    public static void main(String args[]){
    
    Nerd nerd1 = new Nerd();
    nerd1.name = "Minjae";
    nerd1.age = 16;
    
    Nerd nerd2 = new Nerd();
    nerd1.name = "Grace";
    nerd1.age = 17;
    
    System.out.println(nerd1.name);//grace
    System.out.println(nerd2.name);//grace
    System.out.println(nerd1.age);//17
    System.out.println(nerd2.age);//17
    System.out.println(Nerd.nerdCount);//2
    
    }
}