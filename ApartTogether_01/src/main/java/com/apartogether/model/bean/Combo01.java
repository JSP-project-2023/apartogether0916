package com.apartogether.model.bean;

public class Combo01 {
	private int roomno;
	private String menuname;
	private int qty;
	private int roomprice;
	private int totalmenu;
	private String orderplace;
	private String stname;
	private int fee;
	private String roomname;
	private int price;
	private int personalprice;
	private String id;
	private int allprice;
	private String ready;
	private String menuImage;
	private String menuDetail;
	private int menuno;
	private int orderno;
	private String sttime;
	
	
	
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Combo01 [roomno=");
		builder.append(roomno);
		builder.append(", menuname=");
		builder.append(menuname);
		builder.append(", qty=");
		builder.append(qty);
		builder.append(", roomprice=");
		builder.append(roomprice);
		builder.append(", totalmenu=");
		builder.append(totalmenu);
		builder.append(", orderplace=");
		builder.append(orderplace);
		builder.append(", stname=");
		builder.append(stname);
		builder.append(", fee=");
		builder.append(fee);
		builder.append(", roomname=");
		builder.append(roomname);
		builder.append(", price=");
		builder.append(price);
		builder.append(", personalprice=");
		builder.append(personalprice);
		builder.append(", id=");
		builder.append(id);
		builder.append(", allprice=");
		builder.append(allprice);
		builder.append(", ready=");
		builder.append(ready);
		builder.append(", menuImage=");
		builder.append(menuImage);
		builder.append(", menuDetail=");
		builder.append(menuDetail);
		builder.append(", menuno=");
		builder.append(menuno);
		builder.append(", orderno=");
		builder.append(orderno);
		builder.append(", sttime=");
		builder.append(sttime);
		builder.append("]");
		return builder.toString();
	}







	public String getSttime() {
		return sttime;
	}







	public void setSttime(String sttime) {
		this.sttime = sttime;
	}







	public int getOrderno() {
		return orderno;
	}







	public void setOrderno(int orderno) {
		this.orderno = orderno;
	}







	public int getMenuno() {
		return menuno;
	}







	public void setMenuno(int menuno) {
		this.menuno = menuno;
	}







	public String getMenuImage() {
		return menuImage;
	}







	public void setMenuImage(String menuImage) {
		this.menuImage = menuImage;
	}







	public String getMenuDetail() {
		return menuDetail;
	}







	public void setMenuDetail(String menuDetail) {
		this.menuDetail = menuDetail;
	}







	public Combo01(){}













	public String getReady() {
		return ready;
	}







	public void setReady(String ready) {
		this.ready = ready;
	}







	public int getAllprice() {
		return allprice;
	}





	public void setAllprice(int allprice) {
		this.allprice = allprice;
	}





	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getOrderplace() {
		return orderplace;
	}


	public void setOrderplace(String orderplace) {
		this.orderplace = orderplace;
	}


	public int getPersonalprice() {
		return personalprice;
	}






	public void setPersonalprice(int personalprice) {
		this.personalprice = personalprice;
	}






	public int getPrice() {
		return price;
	}












	public void setPrice(int price) {
		this.price = price;
	}












	public String getRoomname() {
		return roomname;
	}





	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}





	public String getStname() {
		return stname;
	}



	public void setStname(String stname) {
		this.stname = stname;
	}



	public int getFee() {
		return fee;
	}



	public void setFee(int fee) {
		this.fee = fee;
	}



	public int getRoomno() {
		return roomno;
	}



	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}



	public String getMenuname() {
		return menuname;
	}

	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getRoomprice() {
		return roomprice;
	}

	public void setRoomprice(int roomprice) {
		this.roomprice = roomprice;
	}





	public int getTotalmenu() {
		return totalmenu;
	}





	public void setTotalmenu(int totalmenu) {
		this.totalmenu = totalmenu;
	}

	


	
}
