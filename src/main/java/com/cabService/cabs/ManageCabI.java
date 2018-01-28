package com.cabService.cabs;

import java.util.List;

public interface ManageCabI {
	public void addCabs(Cabs cab);
	public List<Cabs> getCabList();
	public void displayCabs();
}
