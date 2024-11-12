public class Cuckoo extends Bird{


    @Override
    public void sing(){
        int randInt = random.nextInt(10) + 1;
        for(int i = 0; i < randInt; i++ ){
            System.out.println("Ку-ку");
        }
        System.out.println(" ");
    }
}
