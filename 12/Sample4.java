// 탈것 인터페이스
interface iVehicle
{
    void vShow ();
}
// 목재 인터페이스
interface iMaterial
{
    void mShow();
}
// 자동차 클래스
class Car implements iVehicle, iMaterial
{
    private int num;
    private double gas;
    
    public Car(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("차량 번호가 " + num + " 이며, 연료 양이 " + gas + " 인 자동차가 만들어졌습니다.");
    }
    public void vShow()
    {
        System.out.println("차량 번호는 " + num + " 입니다.");
        System.out.println("연료 양은 " + gas + " 입니다.");
    }
    public void mShow()
    {
        System.out.println("자동차의 재질은 철입니다.");
    }
}
class Sample4
{
    public static void main(String[] args)
    {
        Car car1 = new Car(1234, 20.5);
        car1.vShow();
        car1.mShow();
    }
}
