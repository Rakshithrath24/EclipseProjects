package com.mindtree.eai;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IpLocationFinder {

	public static void main(String[] args) 
	{
		if(args.length!=1)
		{
			System.out.println("Please enter valid Ip address");
		}
		else
		{
			String address = args[0];
			GeoIPService IpService = new GeoIPService();
			GeoIPServiceSoap IpSoap=IpService.getGeoIPServiceSoap();
			GeoIP geoIp= IpSoap.getGeoIP(address);
			System.out.println(geoIp.getCountryName());
		}

	}

}
