public class Sort {

	/**
	 * @param shipments
	 * @param vehicles
	 * @return
	 */
	public static LoadsOfVehicle[] getLoadingArray(Shipment[] shipments, Vehicle[] vehicles) {
					
		return null;
	}
	
	public static void sortShipmentsByWeight(Shipment[] shipmentsToSort) {
		int n = shipmentsToSort.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (shipmentsToSort[j].getWeight() < shipmentsToSort[j+1].getWeight())
                {
                    Shipment temp = shipmentsToSort[j];
                    shipmentsToSort[j] = shipmentsToSort[j+1];
                    shipmentsToSort[j+1] = temp;
                }
	}	
	
    private static void mergeSortShipmentsByWeight(Shipment[] shipmentsToSort, int start, int end) {
    	if (start < end) {
            int m = start + (start - end)/2;
  
            mergeSortShipmentsByWeight(shipmentsToSort, start, m);
            mergeSortShipmentsByWeight(shipmentsToSort, m + 1, end);
  
            merge(shipmentsToSort, start, m, end);
        }
	}

	private static void merge(Shipment[] array, int start, int middle, int end) {
		int n1 = middle - start + 1;
        int n2 = end - middle;
  
        Shipment L[] = new Shipment[n1];
        Shipment R[] = new Shipment[n2];
  
        for (int i = 0; i < n1; ++i)
            L[i] = array[start + i];
        for (int j = 0; j < n2; ++j)
            R[j] = array[middle + 1 + j];
  
        int i = 0, j = 0;
  
        int k = start;
        while (i < n1 && j < n2) {
            if (L[i].getWeight() <= R[j].getWeight()) {
                array[k] = L[i];
                i++;
            }
            else {
                array[k] = R[j];
                j++;
            }
            k++;
        }
  
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }
  
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

	/**
	 * @param sortedShipments
	 * @param vehicles
	 * @return
	 */
	public static LoadsOfVehicle[] distributeShipmentsToVehicles(
			Shipment[] sortedShipments, Vehicle[] vehicles) {
		
	
		
		return null;
	}

	/**
	 * @param vehicleListToLoad
	 * @param sortedShipments
	 */
	public static void loadTheVehicles(LoadsOfVehicle[] vehicleListToLoad, Shipment[] sortedShipments) {
						
		
	}

	public static void main(String[] args) {
        
		Shipment[] shipmentArraySmall;
	    shipmentArraySmall = new Shipment[6];
	   
	    shipmentArraySmall[0] = new Shipment(20, 2_147_013_624, 10020, 34546);
	    shipmentArraySmall[1] = new Shipment(2, 2_147_253_625, 70001, 34547);
	    shipmentArraySmall[2] = new Shipment(0.5, 2_147_014_626, 71064, 34542);
	    shipmentArraySmall[3] = new Shipment(.75, 2_147_043_627, 16178, 34543);
	    shipmentArraySmall[4] = new Shipment(1.25, 2_147_013_628, 35468, 34543);
	    shipmentArraySmall[5] = new Shipment(15, 2_147_313_623, 34971, 34543);
	    
	    Shipment[] sortedShipmentArraySmall;
	    sortedShipmentArraySmall = new Shipment[6];

	    sortedShipmentArraySmall[0] = shipmentArraySmall[0];
	    sortedShipmentArraySmall[1] = shipmentArraySmall[5];
	    sortedShipmentArraySmall[2] = shipmentArraySmall[1];
	    sortedShipmentArraySmall[3] = shipmentArraySmall[4];
	    sortedShipmentArraySmall[4] = shipmentArraySmall[3];
	    sortedShipmentArraySmall[5] = shipmentArraySmall[2];

	    Sort.sortShipmentsByWeight(shipmentArraySmall);
	    
	    System.out.println(shipmentArraySmall);
    }
}
