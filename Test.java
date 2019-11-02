/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housetemplate;

/**
 *
 * @author fa16-bse-075
 */
public class Test {
    

	public static void main(String[] args) {
		
		HouseTemplate houseType = new WoodenHouse();
		
		//using template method
		houseType.buildHouse();
		System.out.println("************");
		
		houseType = new GlassHouse();
		
		houseType.buildHouse();
	}

}
