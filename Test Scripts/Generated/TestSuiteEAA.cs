
	//Generic function ActivateCab
	//Function to activate the cab
	public void Check_ActivateCab(){
			//Force MASTER_HW11_INPUT1 True
			SYS1["EAA-SWR-HW11_SIGNAL95_INPUT1-EAA-SWR"].Force(true);
			//Force MASTER_HW31_INPUT1 True
			SYS1["EAA-SWR-HW31_SIGNAL98_INPUT1-EAA-SWR"].Force(true);
			//Check MASTER_SAFETY_CAB_TRAIN 1
			SYS1["SAFETY_CONTROL_CAB_TRAIN"].WaitForSignal(1, 10000);
			//Check MASTER_SAFETY_CAB_CONSIST 1
			SYS1["SAFETY_CONTROL_CAB_CONSIST"].WaitForSignal(1, 10000);
			//Check SLAVE_SAFETY_CAB_TRAIN 4
			SYS2["SAFETY_CONTROL_CAB_TRAIN"].WaitForSignal(4, 10000);
			//Check SLAVE_SAFETY_CAB_CONSIST 3
			SYS2["SAFETY_CONTROL_CAB_CONSIST"].WaitForSignal(3, 10000);
	}

	//Generic function ActivateCab
	//Function to activate the cab
	public void Check_ActivateCab2(){
			//Force SLAVE_HW13_INPUT1 True
			SYS2["EAA-SWR-HW13_SIGNALB5_INPUT1-EAA-SWR"].Force(true);
			//Force SLAVE_HW33_INPUT1 True
			SYS2["EAA-SWR-HW33_SIGNALB8_INPUT1-EAA-SWR"].Force(true);
			//Check SLAVE_SAFETY_CAB_TRAIN 1
			SYS2["SAFETY_CONTROL_CAB_TRAIN"].WaitForSignal(1, 10000);
			//Check SLAVE_SAFETY_CAB_CONSIST 1
			SYS2["SAFETY_CONTROL_CAB_CONSIST"].WaitForSignal(1, 10000);
			//Check MASTER_SAFETY_CAB_TRAIN 4
			SYS1["SAFETY_CONTROL_CAB_TRAIN"].WaitForSignal(4, 10000);
			//Check MASTER_SAFETY_CAB_CONSIST 3
			SYS1["SAFETY_CONTROL_CAB_CONSIST"].WaitForSignal(3, 10000);
	}

	//Generic function TBC_Response
	//Forward input reference from TBC to brake and propulsion during normal conditions
	public void Check_TBCResponse1(){
			//Force TBC_Demand_Level_Validity_1 true
			SYS1["EAA-SWR-DEM_LEV_VALID_1-EAA-SWR"].Force(true);
			//Force TBC_Demand_Level_1 100
			SYS1["EAA-SWR-DEM_LEV_1-EAA-SWR"].Force(100);
			//Check Master_Tractive_Braking_Effort -10
			SYS1["TB_EFFORT"].WaitForSignal(-10, 1000);
			//Check Slave_Tractive_Braking_Effort -10
			SYS2["TB_EFFORT"].WaitForSignal(-10, 1000);
	}

	//Generic function TBC_Response
	//Forward input reference from TBC to brake and propulsion during normal conditions
	public void Check_TBCResponse2(){
			//Force TBC_Demand_Level_1 20000
			SYS1["EAA-SWR-DEM_LEV_1-EAA-SWR"].Force(20000);
			//Check Master_Tractive_Braking_Effort 1222
			SYS1["TB_EFFORT"].WaitForSignal(1222, 10000);
			//Check Slave_Tractive_Braking_Effort 1222
			SYS2["TB_EFFORT"].WaitForSignal(1222, 10000);
	}

	//Generic function TBC_Response
	//Forward input reference from TBC to brake and propulsion during normal conditions
	public void Check_TBCResponse3(){
			//Force TBC_Demand_Level_Validity_3 true
			SYS2["EAA-DEM_LEV_VALID_3-EAA"].Force(true);
			//Force TBC_Demand_Level_3 100
			SYS2["EAA-DEM_LEV_3-EAA"].Force(100);
			//Check Master_Tractive_Braking_Effort -10
			SYS1["TB_EFFORT"].WaitForSignal(-10, 1000);
			//Check Slave_Tractive_Braking_Effort -10
			SYS2["TB_EFFORT"].WaitForSignal(-10, 1000);
	}

	//Generic function TBC_Response
	//Forward input reference from TBC to brake and propulsion during normal conditions
	public void Check_TBCResponse4(){
			//Force TBC_Demand_Level_3 20000
			SYS2["EAA-DEM_LEV_3-EAA"].Force(20000);
			//Check Master_Tractive_Braking_Effort 1222
			SYS1["TB_EFFORT"].WaitForSignal(1222, 10000);
			//Check Slave_Tractive_Braking_Effort 1222
			SYS2["TB_EFFORT"].WaitForSignal(1222, 10000);
	}



