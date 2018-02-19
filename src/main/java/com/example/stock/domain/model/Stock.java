package com.example.stock.domain.model;

public class Stock {

    private Long id;
    private String building_name;
    private String location;
    private String sku_code;
    private String item_name;
    private String delivery_code;
    private String shipping_status;
    private Integer stock_count;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBuilding_name() {
		return building_name;
	}

	public void setBuilding_name(String building_name) {
		this.building_name = building_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSku_code() {
		return sku_code;
	}

	public void setSku_code(String sku_code) {
		this.sku_code = sku_code;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public String getDelivery_code() {
		return delivery_code;
	}

	public void setDelivery_code(String delivery_code) {
		this.delivery_code = delivery_code;
	}

	public String getShipping_status() {
		return shipping_status;
	}

	public void setShipping_status(String shipping_status) {
		this.shipping_status = shipping_status;
	}

	public Integer getStock_count() {
		return stock_count;
	}

	public void setStock_count(Integer stock_count) {
		this.stock_count = stock_count;
	}

    @Override
    public String toString() {
        return getId() + "," + getBuilding_name() + "," + getLocation();
    }

}