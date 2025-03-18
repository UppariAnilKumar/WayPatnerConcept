package package1;

import java.util.Scanner;

public class FullCarBooking {

	static Scanner sc = new Scanner(System.in);

	static double distance, milage, fuelPrice, tollCharges, greenCoins, fuelConsumptionCost, totalCost, perSeatCost,
			passengerCount, passangerTarvelDistance, fixedCharges, platFormCharges, waySoldierCharge,
			passengerFinalFare, GST;

	public static void ruralJourneyCost() {
		System.out.println(" enter the distance to be traveled ");
		distance = sc.nextDouble();
		System.out.println(" enter the milage of the vehicle  ");
		milage = sc.nextDouble();
		System.out.println(" enter the current fuelPrice  ");
		fuelPrice = sc.nextDouble();
		System.out.println(" enter the current passenger count   ");
		passengerCount = sc.nextDouble();
		System.out.println(" enter the passenger distance traveled  ");
		passangerTarvelDistance = sc.nextDouble();
		tollCharges = 20;
		greenCoins = distance * 0.75;
		System.out.println(" greencoins  value =  " + greenCoins);
		fuelConsumptionCost = (distance / milage) * fuelPrice;
		System.out.println(" fuelconsumptioncost  =  " + fuelConsumptionCost);

		totalCost = fuelConsumptionCost + tollCharges;
		System.out.println(" total cost  " + totalCost);
		perSeatCost = totalCost / passengerCount;
		System.out.println(" perseat cost  = " + perSeatCost);
		fixedCharges = 15;
		waySoldierCharge = 7;
		platFormCharges = (perSeatCost + fixedCharges + waySoldierCharge
				+ (greenCoins * (passangerTarvelDistance / distance))) * 0.05;
		System.out.println("platFormCharges  = " + platFormCharges);
		GST = (fixedCharges + waySoldierCharge + platFormCharges
				+ (greenCoins * (passangerTarvelDistance / distance) * 0.05)) * 0.05;
		System.out.println(" GST  = " + GST);
		System.out.println(" GST            = " + GST / 0.05);

		passengerFinalFare = perSeatCost + fixedCharges + waySoldierCharge
				+ (greenCoins * (passangerTarvelDistance / distance)) + GST + platFormCharges;

		System.out.println(" Passenger final fare to  be Shown = " + passengerFinalFare);

	}

	public static void urbanJourneyCost() {
		System.out.println(" enter the distance to be traveled ");
		distance = sc.nextDouble();
		System.out.println(" enter the milage of the vehicle  ");
		milage = sc.nextDouble();
		System.out.println(" enter the current fuelPrice  ");
		fuelPrice = sc.nextDouble();
		System.out.println(" enter the current passenger count   ");
		passengerCount = sc.nextDouble();
		System.out.println(" enter the passenger distance traveled  ");
		passangerTarvelDistance = sc.nextDouble();
		tollCharges = 10;
		greenCoins = distance * 1;
		System.out.println(" greencoins  value =  " + greenCoins);
		fuelConsumptionCost = (distance / milage) * fuelPrice;
		System.out.println(" fuelconsumptioncost  =  " + fuelConsumptionCost);

		totalCost = fuelConsumptionCost + tollCharges;
		System.out.println(" total cost  " + totalCost);
		perSeatCost = totalCost / passengerCount;
		System.out.println(" perseat cost  = " + perSeatCost);
		fixedCharges = 15;
		waySoldierCharge = 7;
		platFormCharges = (perSeatCost + fixedCharges + waySoldierCharge
				+ (greenCoins * (passangerTarvelDistance / distance))) * 0.05;
		System.out.println("platFormCharges  = " + platFormCharges);
		GST = (fixedCharges + waySoldierCharge + platFormCharges
				+ (greenCoins * (passangerTarvelDistance / distance) * 0.05)) * 0.05;
		System.out.println(" GST  = " + GST);
		System.out.println(" GST            = " + GST / 0.05);

		passengerFinalFare = perSeatCost + fixedCharges + waySoldierCharge
				+ (greenCoins * (passangerTarvelDistance / distance)) + GST + platFormCharges;

		System.out.println(" Passenger final fare to  be Shown = " + passengerFinalFare);

	}

	public static void longJourneyCost() {
		System.out.println(" enter the distance to be traveled ");
		distance = sc.nextDouble();
		System.out.println(" enter the milage of the vehicle  ");
		milage = sc.nextDouble();
		System.out.println(" enter the current fuelPrice  ");
		fuelPrice = sc.nextDouble();
		System.out.println(" enter the current passenger count   ");
		passengerCount = sc.nextDouble();
		System.out.println(" enter the passenger distance traveled  ");
		passangerTarvelDistance = sc.nextDouble();
		tollCharges = 50;
		greenCoins = distance * 1;
		System.out.println(" greencoins  value =  " + greenCoins);
		fuelConsumptionCost = (distance / milage) * fuelPrice;
		System.out.println(" fuelconsumptioncost  =  " + fuelConsumptionCost);

		totalCost = fuelConsumptionCost + tollCharges;
		System.out.println(" total cost  " + totalCost);
		perSeatCost = totalCost / passengerCount;
		System.out.println(" perseat cost  = " + perSeatCost);
		fixedCharges = 50;
		waySoldierCharge = 7;
		platFormCharges = (perSeatCost + fixedCharges + waySoldierCharge
				+ (greenCoins * (passangerTarvelDistance / distance))) * 0.05;
		System.out.println("platFormCharges  = " + platFormCharges);
		GST = (fixedCharges + waySoldierCharge + platFormCharges
				+ (greenCoins * (passangerTarvelDistance / distance) * 0.05)) * 0.05;
		System.out.println(" GST  = " + GST);
		System.out.println(" GST            = " + GST / 0.05);

		passengerFinalFare = perSeatCost + fixedCharges + waySoldierCharge
				+ (greenCoins * (passangerTarvelDistance / distance)) + GST + platFormCharges;

		System.out.println(" Passenger final fare to  be Shown = " + passengerFinalFare);

	}

	public static void main(String[] a) {
//	fuelCost();
//	perSeatCost();
		ruralJourneyCost();
		urbanJourneyCost();
		longJourneyCost();

	}
}
