/*
Author: Mustafa Can İnce
Date : June 2021
 */

public class Test extends Inventory{

    public static void main (String[] args){

        boolean[][] Sivic_Option = {{false, false, false, false}, {false, false, false, true}, {false, false, true, false}, {false, false, true, true},
                {false,true,false,false}, {false,true,false,true}, {false,true,true,false}, {false,true,true,true},
                {true,false,false,false}, {true,false,false,true}, {true,false,true,false}, {true,false,true,true},
                {true,true,false,false}, {true,true,false,true}, {true,true,true,false}, {true,true,true,true}};

        boolean[][] Sity_Option = {{false, false, false, false}, {false, false, false, true}, {false, false, true, false}, {false, false, true, true},
                {false,true,false,false}, {false,true,false,true}, {false,true,true,false}, {false,true,true,true},
                {true,false,false,false}, {true,false,false,true}, {true,false,true,false}, {true,false,true,true},
                {true,true,false,false}, {true,true,false,true}, {true,true,true,false}, {true,true,true,true}};
        boolean[][] Racer_Option = {{true,true}, {false,false}, {true,false}, {false,true}};
        boolean[][] Scooter_Option = {{true,true}, {false,false}, {true,false}, {false,true}, {true,true,true,true,false}};

        /*   (Sivic_Option and Sity_Option)
        false,false,false,false   Without_Airbag----Without_Music----Without_ABS----Without_SunRoof
        false,false,false true    Without_Airbag----Without_Music----Without_ABS----With_SunRoof
        false,false,true,false    Without_Airbag----Without_Music----With_ABS-------Without_SunRoof
        false,false,true,true     Without_Airbag----Without_Music----With_ABS-------With_SunRoof

        false,true,false,false    Without_Airbag----With_Music-------Without_ABS----Without_SunRoof
        false,true,false,true     Without_Airbag----With_Music-------Without_ABS----With_SunRoof
        false,true,true,false     Without_Airbag----With_Music-------With_ABS-------Without_SunRoof
        false,true,true,true      Without_Airbag----With_Music-------With_ABS-------With_SunRoof

        true,false,false,false    With_Airbag-------Without_Music----Without_ABS----Without_SunRoof
        true,false,false,true     With_Airbag-------Without_Music----Without_ABS----With_SunRoof
        true,false,true,false     With_Airbag-------Without_Music----With_ABS-------Without_SunRoof
        true,false,true,true      With_Airbag-------Without_Music----With_ABS-------With_SunRoof

        true,true,false,false     With_Airbag-------With_Music-------Without_ABS----Without_SunRoof
        true,true,false,true      With_Airbag-------With_Music-------Without_ABS----With_SunRoof
        true,true,true,false      With_Airbag-------With_Music-------With_ABS-------Without_SunRoof
        true,true,true,true       With_Airbag-------With_Music-------With_ABS-------With_SunRoof
            (Racer_Option and Scooter_Option)
        true,true           With_Heating------With_ABS
        false,false         Without_Heating---Without_ABS
        true,false          With_Heating------Without_ABS
        false,true          Without_Heating---With_ABS

        Cars_Array = {{model_name, airbag, music system, abs, sunroof, price},...}
        Bike_Array = {{model_name, seat heating, abs, price},...}
         */
        Car[] Cars_Array;
        Bike[] Bike_Array;
        Bike_Array = new Bike[9];
        Cars_Array = new Car[32];

        int z= 0;
        while (z <= Bike_Array.length-1){
            Bike_Array[z] = new Bike("",false,false,0);
            z++;
        }
        z= 0;
        while (z <= Cars_Array.length-1){
            Cars_Array[z] = new Car("",false,false,false,false,0);
            z++;
        }
        try {
            for (int ix = 0; ix <= Racer_Option.length + Scooter_Option.length - 1; ix++){
                int all_inv_price = 0;
                if (ix <= 3){
                    if (Bike_Array[ix] == null) {
                        throw new NullPointerException("The argument cannot be null");
                    }
                    if (Racer_Option[ix].length != 2){
                        Bike_Array[ix].setModel_Name("Racer");
                        Bike_Array[ix].setBike_Optional_SeatHeating(Racer_Option[ix][0]);
                        Bike_Array[ix].setBike_Optional_ABS(Racer_Option[ix][1]);
                        all_inv_price = all_inv_price + Racer_Base_Price;
                        if (Bike_Array[ix].getBike_Optional_SeatHeating()) {
                            all_inv_price = all_inv_price + Bike_Optional_SeatHeating_Price;
                        }
                        if (Bike_Array[ix].getBike_Optional_ABS()) {
                            all_inv_price = all_inv_price + Bike_Optional_ABS_Price;
                        }
                        Bike_Array[ix].setBike_Price(all_inv_price);
                        throw new Invalid_Option("Wrong input.But first and second appearance added1");
                    }
                    Bike_Array[ix].setModel_Name("Racer");
                    Bike_Array[ix].setBike_Optional_SeatHeating(Racer_Option[ix][0]);
                    Bike_Array[ix].setBike_Optional_ABS(Racer_Option[ix][1]);
                    all_inv_price = all_inv_price + Racer_Base_Price;
                    if (Bike_Array[ix].getBike_Optional_SeatHeating()) {
                        all_inv_price = all_inv_price + Bike_Optional_SeatHeating_Price;
                    }
                    if (Bike_Array[ix].getBike_Optional_ABS()) {
                        all_inv_price = all_inv_price + Bike_Optional_ABS_Price;
                    }
                    Bike_Array[ix].setBike_Price(all_inv_price);
                }
                if (ix > 3){
                    if (Bike_Array[ix] == null){
                        throw new IllegalArgumentException("The argument cannot be null");
                    }

                    if (Scooter_Option[ix-4].length != 2){          //that is teacher wants it.
                        Bike_Array[ix].setModel_Name("Scooter");
                        Bike_Array[ix].setBike_Optional_SeatHeating(Scooter_Option[ix-4][0]);
                        Bike_Array[ix].setBike_Optional_ABS(Scooter_Option[ix-4][1]);
                        all_inv_price = all_inv_price + Scooter_Base_Price;
                        if (Bike_Array[ix].getBike_Optional_SeatHeating()){
                            all_inv_price = all_inv_price + Bike_Optional_SeatHeating_Price;
                        }
                        if (Bike_Array[ix].getBike_Optional_ABS()){
                            all_inv_price = all_inv_price + Bike_Optional_ABS_Price;
                        }
                        Bike_Array[ix].setBike_Price(all_inv_price);
                        throw new Invalid_Option("Wrong input.But first and second appearance added" + "\n" + "Error Source: Scooter_Option index of: " + (ix-4) + "\n");
                    }
                    Bike_Array[ix].setModel_Name("Scooter");
                    Bike_Array[ix].setBike_Optional_SeatHeating(Scooter_Option[ix-4][0]);
                    Bike_Array[ix].setBike_Optional_ABS(Scooter_Option[ix-4][1]);
                    all_inv_price = all_inv_price + Scooter_Base_Price;
                    if (Bike_Array[ix].getBike_Optional_SeatHeating()){
                        all_inv_price = all_inv_price + Bike_Optional_SeatHeating_Price;
                    }
                    if (Bike_Array[ix].getBike_Optional_ABS()){
                        all_inv_price = all_inv_price + Bike_Optional_ABS_Price;
                    }
                    Bike_Array[ix].setBike_Price(all_inv_price);
                }
            }
        }catch (Exception e){
        }
        try {
            int all_inv_price =0;
            for (int il = 0; il <= (Sivic_Option.length + Sity_Option.length - 1); il++){
                if (il <=15){
                    if (Cars_Array[il] == null) {
                        throw new IllegalArgumentException("The argument cannot be null");
                    }
                    Cars_Array[il].setModel_Name("Sivic");
                    Cars_Array[il].setCar_Optional_Airbag(Sivic_Option[il][0]);
                    Cars_Array[il].setCar_Optional_MusicSystem(Sivic_Option[il][1]);
                    Cars_Array[il].setCar_Optional_ABS(Sivic_Option[il][2]);
                    Cars_Array[il].setCar_Optional_Sunroof(Sivic_Option[il][3]);
                    all_inv_price = all_inv_price + Sivic_Base;
                    if (Cars_Array[il].getCar_Optional_ABS()) {
                        all_inv_price = all_inv_price + Car_Optional_ABS_Price;
                    }
                    if (Cars_Array[il].getCar_Optional_Airbag()) {
                        all_inv_price = all_inv_price + Car_Optional_Airbag_Price;
                    }
                    if (Cars_Array[il].getCar_Optional_MusicSystem()) {
                        all_inv_price = all_inv_price + Car_Optional_MusicSystem_Price;
                    }
                    if (Cars_Array[il].getCar_Optional_Sunroof()) {
                        all_inv_price = all_inv_price + Car_Optional_Sunroof_Price;
                    }
                    Cars_Array[il].setCar_Price(all_inv_price);
                }
                all_inv_price = 0;
                if (il > 15){
                    if (Cars_Array[il] == null){
                        throw new IllegalArgumentException("The argument cannot be null");
                    }
                    Cars_Array[il].setModel_Name("Sity");
                    Cars_Array[il].setCar_Optional_Airbag(Sity_Option[il-16][0]);
                    Cars_Array[il].setCar_Optional_MusicSystem(Sity_Option[il-16][1]);
                    Cars_Array[il].setCar_Optional_ABS(Sity_Option[il-16][2]);
                    Cars_Array[il].setCar_Optional_Sunroof(Sity_Option[il-16][3]);
                    all_inv_price = all_inv_price + Sity_Base;
                    if (Cars_Array[il].getCar_Optional_ABS()){
                        all_inv_price = all_inv_price + Car_Optional_ABS_Price;
                    }
                    if (Cars_Array[il].getCar_Optional_Airbag()){
                        all_inv_price = all_inv_price + Car_Optional_Airbag_Price;
                    }
                    if (Cars_Array[il].getCar_Optional_MusicSystem()){
                        all_inv_price = all_inv_price + Car_Optional_MusicSystem_Price;
                    }
                    if (Cars_Array[il].getCar_Optional_Sunroof()){
                        all_inv_price = all_inv_price + Car_Optional_Sunroof_Price;
                    }
                    Cars_Array[il].setCar_Price(all_inv_price);
                }
            }
        }catch (Exception e){
            System.out.println("Error! Please follow the instructions.2");
        }


        for (int i = 0;i <= Cars_Array.length-1;i++){
            if (Cars_Array[i] != null) {
                Cars_Array[i].display();
            }
        }
        for (int i = 0;i <= Bike_Array.length-1;i++){
            if (Bike_Array[i] != null) {
                Bike_Array[i].display();
            }
        }
        int all_cars_price = 0;
        int all_bike_price = 0;
        for (int i = 0; i <= Cars_Array.length - 1; i++){
            if (Cars_Array[i] != null) {
                all_cars_price += Cars_Array[i].getCar_Price();
            }
        }
        for (int i = 0; i <= Bike_Array.length - 1; i++){
            all_bike_price += Bike_Array[i].getBike_Price();
        }

        Cost_Function(all_cars_price + all_bike_price);
        TOTAL((Cars_Array.length + Bike_Array.length),Cars_Array.length,Bike_Array.length,(all_cars_price + all_bike_price));
    }
}

class Car extends Inventory implements vehicle{
    private boolean Car_Optional_Airbag;
    private boolean Car_Optional_MusicSystem;
    private boolean Car_Optional_ABS;
    private boolean Car_Optional_Sunroof;
    private int Car_Price;

    protected void setModel_Name(String Model_Name){ this.Model_Name = Model_Name; }
    protected void setCar_Optional_Airbag(boolean Car_Optional_Airbag){ this.Car_Optional_Airbag = Car_Optional_Airbag; }
    protected void setCar_Optional_MusicSystem(boolean Car_Optional_MusicSystem){ this.Car_Optional_MusicSystem = Car_Optional_MusicSystem; }
    protected void setCar_Optional_ABS(boolean Car_Optional_ABS){ this.Car_Optional_ABS = Car_Optional_ABS; }
    protected void setCar_Optional_Sunroof(boolean Car_Optional_Sunroof){ this.Car_Optional_Sunroof = Car_Optional_Sunroof; }
    protected void setCar_Price(int Car_Price){ this.Car_Price = Car_Price;}

    protected String getModel_Name(){ return Model_Name; }
    protected Boolean getCar_Optional_Airbag(){ return Car_Optional_Airbag; }
    protected Boolean getCar_Optional_MusicSystem(){ return Car_Optional_MusicSystem; }
    protected Boolean getCar_Optional_ABS(){ return Car_Optional_ABS; }
    protected Boolean getCar_Optional_Sunroof(){ return Car_Optional_Sunroof; }
    protected int getCar_Price(){ return Car_Price; }

    public Car(String Model_Name, boolean Car_Optional_Airbag, boolean Car_Optional_MusicSystem, boolean Car_Optional_ABS, boolean Car_Optional_Sunroof, int Car_Price){
        this.Model_Name = Model_Name;
        this.Car_Optional_Airbag = Car_Optional_Airbag;
        this.Car_Optional_MusicSystem = Car_Optional_MusicSystem;
        this.Car_Optional_ABS =Car_Optional_ABS;
        this.Car_Optional_Sunroof= Car_Optional_Sunroof;
        this.Car_Price = Car_Price;
    }
    @Override
    public void display(){
        if (!getCar_Optional_Airbag() && !getCar_Optional_MusicSystem() && !getCar_Optional_ABS() && !getCar_Optional_Sunroof()){
            System.out.println(getModel_Name() +"'s" +  " price is " + getCar_Price() + " TL");
        }
        if (!getCar_Optional_Airbag() && !getCar_Optional_MusicSystem() && !getCar_Optional_ABS() && getCar_Optional_Sunroof()){
            System.out.println(getModel_Name() + " with" + " Sunroof," + " having a total price of " + getCar_Price() + " Tl");
        }
        if (!getCar_Optional_Airbag() && !getCar_Optional_MusicSystem() && getCar_Optional_ABS() && !getCar_Optional_Sunroof()){
            System.out.println(getModel_Name() + " with" + " ABS," + " having a total price of " + getCar_Price() + " Tl");
        }
        if (!getCar_Optional_Airbag() && !getCar_Optional_MusicSystem() && getCar_Optional_ABS() && getCar_Optional_Sunroof()){
            System.out.println(getModel_Name() + " with" + " ABS," + " Sunroof," + " having a total price of " + getCar_Price() + " Tl");
        }
        if (!getCar_Optional_Airbag() && getCar_Optional_MusicSystem() && !getCar_Optional_ABS() && !getCar_Optional_Sunroof()){
            System.out.println(getModel_Name() + " with" + " Music System," + " having a total price of " + getCar_Price() + " Tl");
        }
        if (!getCar_Optional_Airbag() && getCar_Optional_MusicSystem() && !getCar_Optional_ABS() && getCar_Optional_Sunroof()){
            System.out.println(getModel_Name() + " with" + " Music System," + " Sunroof," + " having a total price of " + getCar_Price() + " Tl");
        }
        if (!getCar_Optional_Airbag() && getCar_Optional_MusicSystem() && getCar_Optional_ABS() && !getCar_Optional_Sunroof()){
            System.out.println(getModel_Name() + " with" + " Music System," + " ABS," + " having a total price of " + getCar_Price() + " Tl");
        }
        if (!getCar_Optional_Airbag() && getCar_Optional_MusicSystem() && getCar_Optional_ABS() && getCar_Optional_Sunroof()){
            System.out.println(getModel_Name() + " with" + " Music System," + " ABS," + " Sunroof," + " having a total price of " + getCar_Price() + " Tl");
        }
        if (getCar_Optional_Airbag() && !getCar_Optional_MusicSystem() && !getCar_Optional_ABS() && !getCar_Optional_Sunroof()){
            System.out.println(getModel_Name() + " with" + " Air Bag," + " having a total price of " + getCar_Price() + " Tl");
        }
        if (getCar_Optional_Airbag() && !getCar_Optional_MusicSystem() && !getCar_Optional_ABS() && getCar_Optional_Sunroof()){
            System.out.println(getModel_Name() + " with" + " Air Bag," + " Sunroof," + " having a total price of " + getCar_Price() + " Tl");
        }
        if (getCar_Optional_Airbag() && !getCar_Optional_MusicSystem() && getCar_Optional_ABS() && !getCar_Optional_Sunroof()){
            System.out.println(getModel_Name() + " with" + " Air Bag," + " ABS," + " having a total price of " + getCar_Price() +" Tl");
        }
        if (getCar_Optional_Airbag() && !getCar_Optional_MusicSystem() && getCar_Optional_ABS() && getCar_Optional_Sunroof()){
            System.out.println(getModel_Name() + " with" + " Air Bag," + " ABS," + " Sunroof," + " having a total price of " + getCar_Price() + " Tl");
        }
        if (getCar_Optional_Airbag() && getCar_Optional_MusicSystem() && !getCar_Optional_ABS() && !getCar_Optional_Sunroof()){
            System.out.println(getModel_Name() + " with" + " Air Bag," + " Music System," + " having a total price of " + getCar_Price() + " Tl");
        }
        if (getCar_Optional_Airbag() && getCar_Optional_MusicSystem() && !getCar_Optional_ABS() && getCar_Optional_Sunroof()){
            System.out.println(getModel_Name() + " with" + " Air Bag," + " Music System," + " Sunroof," + " having a total price of " + getCar_Price() +" Tl");
        }
        if (getCar_Optional_Airbag() && getCar_Optional_MusicSystem() && getCar_Optional_ABS() && !getCar_Optional_Sunroof()){
            System.out.println(getModel_Name() + " with" + " Air Bag," + " Music System," + " ABS," + " having a total price of " + getCar_Price() + " Tl");
        }
        if (getCar_Optional_Airbag() && getCar_Optional_MusicSystem() && getCar_Optional_ABS() && getCar_Optional_Sunroof()){
            System.out.println(getModel_Name() + " with" + " Air Bag," + " Music System," + " ABS," + " Sunroof," + " having a total price of " + getCar_Price() + " Tl");
        }
    }
}
class Bike extends Inventory implements vehicle{
    private boolean Bike_Optional_ABS;
    private boolean Bike_Optional_SeatHeating;
    private int Bike_Price;

    protected void setModel_Name(String Model_Name){ this.Model_Name = Model_Name; }
    protected void setBike_Optional_ABS(boolean Bike_Optional_ABS){ this.Bike_Optional_ABS = Bike_Optional_ABS; }
    protected void setBike_Optional_SeatHeating(boolean Bike_Optional_SeatHeating){ this.Bike_Optional_SeatHeating = Bike_Optional_SeatHeating;}
    protected void setBike_Price(int Bike_Price){ this.Bike_Price = Bike_Price;}

    protected String getModel_Name(){ return Model_Name; }
    protected Boolean getBike_Optional_ABS(){ return Bike_Optional_ABS; }
    protected Boolean getBike_Optional_SeatHeating(){return Bike_Optional_SeatHeating;}
    protected int getBike_Price(){ return Bike_Price;}

    protected Bike(String Model_Name, boolean Bike_Optional_ABS, boolean Bike_Optional_SeatHeating, int Bike_Price){
        this.Model_Name = Model_Name;
        this.Bike_Optional_ABS = Bike_Optional_ABS;
        this.Bike_Optional_SeatHeating = Bike_Optional_SeatHeating;
        this.Bike_Price = Bike_Price;
    }
    @Override
    public void display(){
        if (getBike_Optional_SeatHeating() && getBike_Optional_ABS()){
            System.out.println(getModel_Name() + " with" + " Seat Heating," + " ABS," + " having a total price of " + getBike_Price() + " Tl");
        }
        if (!getBike_Optional_SeatHeating() && !getBike_Optional_ABS()){
            System.out.println(getModel_Name() + "'s" +  " price is " + getBike_Price() + " TL");
        }
        if (getBike_Optional_SeatHeating() && !getBike_Optional_ABS()){
            System.out.println(getModel_Name() + " with" + " Seat Heating," + " having a total price of " + getBike_Price() + " Tl");
        }
        if (!getBike_Optional_SeatHeating() && getBike_Optional_ABS()){
            System.out.println(getModel_Name() + " with" + " ABS," + " having a total price of " + getBike_Price() + " Tl");
        }
    }
}

abstract class Inventory {

    String Model_Name;

    static final int Sivic_Base = 50000;
    static final int Sity_Base = 40000;
    static final int Car_Optional_Airbag_Price = 3000;
    static final int Car_Optional_MusicSystem_Price = 1000;
    static final int Car_Optional_ABS_Price = 5000;
    static final int Car_Optional_Sunroof_Price = 2000;

    static final int Racer_Base_Price = 60000;
    static final int Scooter_Base_Price = 20000;
    static final int Bike_Optional_ABS_Price = 5000;
    static final int Bike_Optional_SeatHeating_Price = 2000;


    static void TOTAL(int veh, int car, int bike, int sum) {
        System.out.println("TOTAL : " + veh + " Vehicles including " + car + " Cars and " + bike + " Motorbikes having a total price of " + sum + " Tl");
    }
    static void Cost_Function(int sum){
        System.out.println("All vehicles price's " + sum + " Tl");
    }
}
class Invalid_Option extends Exception{
    public Invalid_Option(String message){
        super (message);
        System.out.println(message);
    }
}
interface vehicle {
    void display();
}