class Car implements Runnable
{
    private String name;

    public Car(String nm)
    {
        name = nm;
    }
    public void run()
    {
        for(int i=0; i<5; i++){
            System.out.println(name + " 가 동작하고 있습니다.") ;
        }
    }
}
class SampleP2
{
    public static void main(String[] args)
    {
        Car car1 = new Car("1 호차");

        Thread th1 = new Thread(car1);
        th1.start();

        Car car2 = new Car("2 호차");

        Thread th2 = new Thread(car2);
        th2.start();

        for(int i=0; i<5; i++){
            System.out.println("main() 메소드 실행중입니다.");
        }
    }
}


