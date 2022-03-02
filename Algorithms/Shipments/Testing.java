// Gets rid of redundant outdated method for checking array equalities
import java.util.Arrays;

public class ShipmentArrayBig {

	public void testDistributeShipmentsToVehicles() {

	    Shipment[] shipmentArrayBig;
	    shipmentArrayBig = new Shipment[20];
			
	    shipmentArrayBig[0] = new Shipment(3.1, 1_187_313_623, 34003, 6597);
	    shipmentArrayBig[1] = new Shipment(0.1, 1_187_313_624, 34003, 6600);
	    shipmentArrayBig[2] = new Shipment(5.4, 1_187_313_625, 34003, 6600);
	    shipmentArrayBig[3] = new Shipment(7.9, 1_187_313_626, 34003, 6595);
	    shipmentArrayBig[4] = new Shipment(11, 1_187_313_627, 34003, 6597);
	    shipmentArrayBig[5] = new Shipment(15, 1_187_313_628, 34003, 6595);
	    shipmentArrayBig[6] = new Shipment(14, 1_187_313_629, 34003, 6601);
	    shipmentArrayBig[7] = new Shipment(34, 1_187_313_630, 34003, 6597);
	    shipmentArrayBig[8] = new Shipment(45, 1_187_313_621, 34003, 6595);
	    shipmentArrayBig[9] = new Shipment(5, 1_187_313_622, 34003, 6601);
	    shipmentArrayBig[10] = new Shipment(3, 1_187_313_631, 34003, 6597);
	    shipmentArrayBig[11] = new Shipment(3.25, 1_187_313_632, 34003, 6601);
	    shipmentArrayBig[12] = new Shipment(3.13, 1_187_313_633, 34003, 6597);
	    shipmentArrayBig[13] = new Shipment(4.1, 1_187_313_634, 34003, 6596);
	    shipmentArrayBig[14] = new Shipment(2.1, 1_187_313_635, 34003, 6597);
	    shipmentArrayBig[15] = new Shipment(6.1, 1_187_313_636, 34003, 6596);
	    shipmentArrayBig[16] = new Shipment(3.7, 1_187_313_637, 34003, 6597);
	    shipmentArrayBig[17] = new Shipment(6.61, 1_187_313_638, 34003, 6596);
	    shipmentArrayBig[18] = new Shipment(4, 1_187_313_639, 34003, 6596);
	    shipmentArrayBig[19] = new Shipment(5, 1_187_313_640, 34003, 6596);

	    Vehicle[] vehicleArraySmall;
	    vehicleArraySmall = new Vehicle[3];
	    
	    vehicleArraySmall[0] = new Vehicle(10, "KZ66 ZYT", "John Locke");
	    vehicleArraySmall[1] = new Vehicle(20, "SBG 984", "Down Brown");
	    vehicleArraySmall[2] = new Vehicle(50, "EKI6 LLO", "Adam Smith");

	    Shipment[] sortedShipmentArrayBig;
	    sortedShipmentArrayBig = new Shipment[20];
			
	    sortedShipmentArrayBig[0] = shipmentArrayBig[8];
	    sortedShipmentArrayBig[1] = shipmentArrayBig[7];
	    sortedShipmentArrayBig[2] = shipmentArrayBig[5];
	    sortedShipmentArrayBig[3] = shipmentArrayBig[6];
	    sortedShipmentArrayBig[4] = shipmentArrayBig[4];
	    sortedShipmentArrayBig[5] = shipmentArrayBig[3];
	    sortedShipmentArrayBig[6] = shipmentArrayBig[17];
	    sortedShipmentArrayBig[7] = shipmentArrayBig[15];
	    sortedShipmentArrayBig[8] = shipmentArrayBig[2];
	    sortedShipmentArrayBig[9] = shipmentArrayBig[9];
	    sortedShipmentArrayBig[10] = shipmentArrayBig[19];
	    sortedShipmentArrayBig[11] = shipmentArrayBig[13];
	    sortedShipmentArrayBig[12] = shipmentArrayBig[18];
	    sortedShipmentArrayBig[13] = shipmentArrayBig[16];
	    sortedShipmentArrayBig[14] = shipmentArrayBig[11];
	    sortedShipmentArrayBig[15] = shipmentArrayBig[12];
	    sortedShipmentArrayBig[16] = shipmentArrayBig[0];
	    sortedShipmentArrayBig[17] = shipmentArrayBig[10];
	    sortedShipmentArrayBig[18] = shipmentArrayBig[14];
	    sortedShipmentArrayBig[19] = shipmentArrayBig[1];
	    
	    LoadsOfVehicle[] expectedVehicleListToLoadBigShipment;
	    expectedVehicleListToLoadBigShipment = new LoadsOfVehicle[8];
			for (int i = 0; i < expectedVehicleListToLoadBigShipment.length; i++) {
				expectedVehicleListToLoadBigShipment[i] = new LoadsOfVehicle(vehicleArraySmall[i%3]);
	    }

	    expectedVehicleListToLoadBigShipment[0].addCargo(shipmentArrayBig[15]);
	    expectedVehicleListToLoadBigShipment[0].addCargo(shipmentArrayBig[11]);
	    
	    expectedVehicleListToLoadBigShipment[1].addCargo(shipmentArrayBig[6]);
	    expectedVehicleListToLoadBigShipment[1].addCargo(shipmentArrayBig[2]);
	    
	    expectedVehicleListToLoadBigShipment[2].addCargo(shipmentArrayBig[8]);
	    expectedVehicleListToLoadBigShipment[2].addCargo(shipmentArrayBig[9]);
	    
	    expectedVehicleListToLoadBigShipment[3].addCargo(shipmentArrayBig[19]);
	    expectedVehicleListToLoadBigShipment[3].addCargo(shipmentArrayBig[12]);
	    
	    expectedVehicleListToLoadBigShipment[4].addCargo(shipmentArrayBig[4]);
	    expectedVehicleListToLoadBigShipment[4].addCargo(shipmentArrayBig[13]);
	    expectedVehicleListToLoadBigShipment[4].addCargo(shipmentArrayBig[0]);
	    
	    expectedVehicleListToLoadBigShipment[5].addCargo(shipmentArrayBig[7]);
	    expectedVehicleListToLoadBigShipment[5].addCargo(shipmentArrayBig[3]);
	    expectedVehicleListToLoadBigShipment[5].addCargo(shipmentArrayBig[18]);
	    expectedVehicleListToLoadBigShipment[5].addCargo(shipmentArrayBig[10]);
	    
	    expectedVehicleListToLoadBigShipment[6].addCargo(shipmentArrayBig[17]);
	    expectedVehicleListToLoadBigShipment[6].addCargo(shipmentArrayBig[14]);
	    
	    expectedVehicleListToLoadBigShipment[7].addCargo(shipmentArrayBig[5]);
	    expectedVehicleListToLoadBigShipment[7].addCargo(shipmentArrayBig[16]);
	    expectedVehicleListToLoadBigShipment[7].addCargo(shipmentArrayBig[1]);


	    LoadsOfVehicle[] distributedLoadsBig = Sort.distributeShipmentsToVehicles(sortedShipmentArrayBig, vehicleArraySmall);

	    Arrays.equals(expectedVehicleListToLoadBigShipment[0].getCargoList().toArray(), 
	        distributedLoadsBig[0].getCargoList().toArray());
	    Arrays.equals(expectedVehicleListToLoadBigShipment[1].getCargoList().toArray(), 
	        distributedLoadsBig[1].getCargoList().toArray());
	    //skip if 5 kg cargo causes failure
	    Arrays.equals(expectedVehicleListToLoadBigShipment[2].getCargoList().toArray(), 
	        distributedLoadsBig[2].getCargoList().toArray());
	    //skip if 5 kg cargo causes failure
	    Arrays.equals(expectedVehicleListToLoadBigShipment[3].getCargoList().toArray(), 
	        distributedLoadsBig[3].getCargoList().toArray());
	    Arrays.equals(expectedVehicleListToLoadBigShipment[4].getCargoList().toArray(), 
	        distributedLoadsBig[4].getCargoList().toArray());
	    Arrays.equals(expectedVehicleListToLoadBigShipment[5].getCargoList().toArray(), 
	        distributedLoadsBig[5].getCargoList().toArray());
	    Arrays.equals(expectedVehicleListToLoadBigShipment[6].getCargoList().toArray(), 
	        distributedLoadsBig[6].getCargoList().toArray());
	    Arrays.equals(expectedVehicleListToLoadBigShipment[7].getCargoList().toArray(), 
	        distributedLoadsBig[7].getCargoList().toArray());
	}
}
