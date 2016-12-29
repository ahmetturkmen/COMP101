package oldFinal;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int MAX_IP_PACK_SIZE = 65536;    //Declaring the size of IP packet as given question
		final int MAX_WIFI_PACK_SIZE = 7981;   // Declaring max wifi packet size
		int temp, temp2;                        // this temporary variables hold calculated value as shown below.
		Scanner sc = new Scanner(System.in);

		int packet_size = sc.nextInt();

		if (packet_size > MAX_IP_PACK_SIZE) {   // conditionality 

			System.out.println("The packet  is too big");

		} else if (packet_size > MAX_WIFI_PACK_SIZE) {

			temp = packet_size / MAX_WIFI_PACK_SIZE;
			if (packet_size % MAX_WIFI_PACK_SIZE != 0) {
				temp2 = packet_size - (temp * MAX_WIFI_PACK_SIZE);
				temp++;
				System.out.printf("%d %d",temp,temp2);
			} else { 
				System.out.printf("%d %d",temp,MAX_WIFI_PACK_SIZE);
			
			}

		}
		if (packet_size < MAX_WIFI_PACK_SIZE) {
			temp = 1;
			temp2 = packet_size;
			System.out.printf("%d %d",temp,temp2);
		}

	}

}

