package org.prog.HW_5;
//TODO: add class Plane
//TODO: plane must have flightId
//TODO: plane must have maximum passenger seats
//TODO: plane must have taken passenger seats
//TODO: add method that will say flight number ### has ##% seats taken
//TODO: * - add method register passengers int passengers. If too many passengers - print "not enough seats", and decline boarding (no passengers added)

public class Plane {
    public int flightId;
    public int maxPassSeats;
    public int takenSeats;
    public Plane(int flightId, int maxPassSeats, int takenSeats) {
        this.flightId = flightId;
        this.maxPassSeats = maxPassSeats;
        this.takenSeats = takenSeats;
    }
    public void perTakenSeats() {
        if (maxPassSeats>0) {
           int persent = takenSeats * 100 / maxPassSeats;;
            System.out.println(" рейс номер " + flightId+ " заполнен на " + persent + " % ");
        }
                else{
            System.out.println("введены не верно данные");
        }
    }
    public void registerPass(int passandgers){
        if ((passandgers+ takenSeats) <= maxPassSeats && passandgers>0){
            takenSeats+=passandgers;
            System.out.println("на рейс номер " + flightId + " теперь зарегистрировано "+ takenSeats +" пасажиров" );
        }else if (maxPassSeats < (passandgers+ takenSeats)){
            System.out.println(" недостаточно мест на рейсе номер "+ flightId );
        }
    else {
            System.out.println("проверьте корректность введенных данных" );
        }
    }


}
