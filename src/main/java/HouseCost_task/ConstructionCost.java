package HouseCost_task;

import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConstructionCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Logger logger = LogManager.getLogger(ConstructionCost.class);

		StandardMaterial standardmaterial=new StandardMaterial();
		AboveStandardMaterial abovestandardmaterial=new AboveStandardMaterial();
		HighStandardMaterial highstandardmaterial=new HighStandardMaterial();
		HighStandardMaterialAndAutomation highstandardmaterialandautomation =new HighStandardMaterialAndAutomation();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.standard material  2.above standard material 3.high standard material");
		int option=sc.nextInt();
		System.out.println("Enter the area in square feets");
		double area=sc.nextDouble();
		double cost=0.0;
		switch(option) {
		case 1:
		cost=standardmaterial.cost(area);
		break;
		case 2:
		cost=abovestandardmaterial.cost(area);
		break;
		case 3:
		System.out.println("1.need a fully automated home  2.do not need a fully automated home");
		int automation=sc.nextInt();
		if(automation ==1) {
		cost=highstandardmaterialandautomation.cost(area);
		break;
		}
		else {
		cost=highstandardmaterial.cost(area);
		break;
		}
		}
		logger.info("Cost of the Construction materials is "+cost);
		sc.close();
	}

}
