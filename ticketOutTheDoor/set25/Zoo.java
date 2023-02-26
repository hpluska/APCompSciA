public class Zoo {
    public static void main(String args[]){
        Animal unicorn = new Unicorn();
        unicorn.setType("rainbow");
        unicorn.setAge(400);
        Animal dino = new Brontosaurus();
        dino.setType("Brontosaurus");
        dino.setAge(80);
        System.out.println(dino.getEats());
        System.out.println(unicorn.getAnimalInfo());
        System.out.println(dino.getAnimalInfo());
   

    }
}
