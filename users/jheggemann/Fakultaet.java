package jheggemann;

import java.math.BigInteger;

public class Fakultaet {
    public BigInteger Fakultaet1(int zahl) {
		// TODO Auto-generated method stub
		
		BigInteger fakultaet =  new BigInteger("" + zahl);
		
		for (int i = 1; i <= zahl; i++) {
			fakultaet = fakultaet.multiply(new BigInteger("" + i));
			if (i%100 == 0)
			{
				double dec = (((double)i/(double)zahl))*100;
				System.out.println(dec);
			}
		}
		return fakultaet;
		
	}

}