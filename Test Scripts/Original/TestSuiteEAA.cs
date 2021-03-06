public void Check_ActivateCab(){

		SYS1["EAA-SWR-HW11_SIGNAL95_INPUT1-EAA-SWR"].Force(true);

		SYS1["EAA-SWR-HW31_SIGNAL98_INPUT1-EAA-SWR"].Force(true);

		SYS1["SAFETY_CONTROL_CAB_TRAIN"].WaitForSignal(1, 10000);

		SYS1["SAFETY_CONTROL_CAB_CONSIST"].WaitForSignal(1, 10000);

		SYS2["SAFETY_CONTROL_CAB_TRAIN"].WaitForSignal(4, 10000);

		SYS2["SAFETY_CONTROL_CAB_CONSIST"].WaitForSignal(3, 10000);
}


public void Check_ActivateCab2(){

		SYS2["EAA-SWR-HW13_SIGNALB5_INPUT1-EAA-SWR"].Force(true);

		SYS2["EAA-SWR-HW33_SIGNALB8_INPUT1-EAA-SWR"].Force(true);

		SYS2["SAFETY_CONTROL_CAB_TRAIN"].WaitForSignal(1, 10000);

		SYS2["SAFETY_CONTROL_CAB_CONSIST"].WaitForSignal(1, 10000);

		SYS1["SAFETY_CONTROL_CAB_TRAIN"].WaitForSignal(4, 10000);

		SYS1["SAFETY_CONTROL_CAB_CONSIST"].WaitForSignal(3, 10000);
}


public void Check_TBCResponse1(){

		SYS1["EAA-SWR-DEM_LEV_VALID_1-EAA-SWR"].Force(true);

		SYS1["EAA-SWR-DEM_LEV_1-EAA-SWR"].Force(100);

		SYS1["TB_EFFORT"].WaitForSignal(-10, 1000);

		SYS2["TB_EFFORT"].WaitForSignal(-10, 1000);
}


public void Check_TBCResponse2(){

		SYS1["EAA-SWR-DEM_LEV_1-EAA-SWR"].Force(20000);

		SYS1["TB_EFFORT"].WaitForSignal(1222, 10000);

		SYS2["TB_EFFORT"].WaitForSignal(1222, 10000);
}


public void Check_TBCResponse3(){

		SYS2["EAA-DEM_LEV_VALID_3-EAA"].Force(true);

		SYS2["EAA-DEM_LEV_3-EAA"].Force(100);

		SYS1["TB_EFFORT"].WaitForSignal(-10, 1000);

		SYS2["TB_EFFORT"].WaitForSignal(-10, 1000);
}


public void Check_TBCResponse4(){

		SYS2["EAA-DEM_LEV_3-EAA"].Force(20000);

		SYS1["TB_EFFORT"].WaitForSignal(1222, 10000);

		SYS2["TB_EFFORT"].WaitForSignal(1222, 10000);
}