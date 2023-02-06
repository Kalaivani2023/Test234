package POM.sample;

import sample.org.BaseClass1;

public class HotelSearchpro extends BaseClass1{
	public static void SearchHotel() {
		try {
			selectByIndex(new HotelSearch().getLoca(),2);
			selectByVisibleText(new HotelSearch().gethotel(),"Hotel Creek");
			selectByIndex(new HotelSearch().getType(),1);
			selectByIndex(new HotelSearch().getrooms(),2);
			dataSend(new HotelSearch().getCheckIn(),"24/01/2023");
			dataSend(new HotelSearch().getCheckOut(),"25/01/2023");
			selectByIndex(new HotelSearch().getadult(),0);
			selectByIndex(new HotelSearch().getchild(),1);
			click(new HotelSearch().getsubmit());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
