package com.cabService.cabs;


public class Cabs implements Comparable<Cabs>
{
	private String id;
	private float cost;
	private int capacity;
	public Cabs(String id, float cost, int capacity) {
		super();
		this.id = id;
		this.cost = cost;
		this.capacity = capacity;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Cabs [id=" + id + ", cost=" + cost + ", capacity=" + capacity + "]";
	}
	@Override
	public int compareTo(Cabs o) {
		
		return this.getCapacity()-o.getCapacity();
	}
	
	
}
