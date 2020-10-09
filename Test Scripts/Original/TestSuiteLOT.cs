public void Check_ActivateCab(){

		SYS1["LOT-HW11_SIGNAL92_INPUT1-LOT"].Force(true);

		SYS1["LOT-HW31_SIGNAL99_INPUT1-LOT"].Force(true);

		SYS1["SAFETY_CONTROL_CAB_TRAIN"].WaitForSignal(1, 10000);

		SYS1["SAFETY_CONTROL_CAB_CONSIST"].WaitForSignal(1, 10000);

		SYS2["SAFETY_CONTROL_CAB_TRAIN"].WaitForSignal(4, 10000);

		SYS2["SAFETY_CONTROL_CAB_CONSIST"].WaitForSignal(3, 10000);
}


public void Check_ActivateCab2(){

		SYS2["LOT-HW13_SIGNALB2_INPUT1-LOT"].Force(true);

		SYS2["LOT-HW33_SIGNALB9_INPUT1-LOT"].Force(true);

		SYS2["SAFETY_CONTROL_CAB_TRAIN"].WaitForSignal(1, 10000);

		SYS2["SAFETY_CONTROL_CAB_CONSIST"].WaitForSignal(1, 10000);

		SYS1["SAFETY_CONTROL_CAB_TRAIN"].WaitForSignal(4, 10000);

		SYS1["SAFETY_CONTROL_CAB_CONSIST"].WaitForSignal(3, 10000);
}


public void Check_TBCResponse1(){

		SYS1["LOT-DEM_LEV_VALID_1-LOT"].Force(true);

		SYS1["LOT-DEM_LEV_1-LOT"].Force(100);

		SYS1["TB_EFFORT"].WaitForSignal(-10, 1000);

		SYS2["TB_EFFORT"].WaitForSignal(-10, 1000);
}


public void Check_TBCResponse2(){

		SYS1["LOT-DEM_LEV_1-LOT"].Force(20000);

		SYS1["TB_EFFORT"].WaitForSignal(1222, 10000);

		SYS2["TB_EFFORT"].WaitForSignal(1222, 10000);
}


public void Check_TBCResponse3(){

		SYS2["LOT-DEM_LEV_VALID_3-LOT"].Force(true);

		SYS2["LOT-DEM_LEV_3-LOT"].Force(100);

		SYS1["TB_EFFORT"].WaitForSignal(-10, 1000);

		SYS2["TB_EFFORT"].WaitForSignal(-10, 1000);
}


public void Check_TBCResponse4(){

		SYS2["LOT-DEM_LEV_3-LOT"].Force(20000);

		SYS1["TB_EFFORT"].WaitForSignal(1222, 10000);

		SYS2["TB_EFFORT"].WaitForSignal(1222, 10000);
}