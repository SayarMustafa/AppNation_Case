package utils;

import lombok.Data;
import pages.*;

@Data
public class Pages {

	private Homepage homepage;

	private InstructorsPage instructorsPage;

	public Pages() {
		homepage = new Homepage();
		instructorsPage = new InstructorsPage();
	}

}
