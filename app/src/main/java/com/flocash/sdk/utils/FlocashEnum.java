package com.flocash.sdk.utils;

public class FlocashEnum {
	public enum ResponseSuccessCodeEnum {
		CREATE_ORDER(201), OTHER(200);
		private int value;
		ResponseSuccessCodeEnum(int value) {
			this.value = value;
		}
		
		public int getValue() {
			return value;
		}
	}
}
