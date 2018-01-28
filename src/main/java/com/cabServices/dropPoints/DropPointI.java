package com.cabServices.dropPoints;

import java.io.IOException;
import java.io.InputStream;

public interface DropPointI {
	
	public void addDropPoints(InputStream incomingData) throws IOException;

}
