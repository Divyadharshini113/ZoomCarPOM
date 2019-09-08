package org.testleaf.zoomcar.testcases;

import org.testleaf.zoomcar.base.ProjectSpecificMethods;
import org.testleaf.zoomcar.pages.Homepage;
import org.testng.annotations.Test;

public class ZoomCarTC extends ProjectSpecificMethods{
	
	@Test
	public void runZoomcar() throws InterruptedException {
		new Homepage().clickStart().clickThuraipakkam().clickNext().clickTommorrow().clickNext().clickDone().clickDesort().getFirstCarName();
		
	}

}
