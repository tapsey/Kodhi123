package com.bad_code.tapsey.codeonetwothree.app.model;

public enum DataType {
	
	 Void ("Void", 8),
	 INTEGER("Interger", 3),
	 DOUBLE("Double", 4),
	 STRING ("izwi", 5),
	 BOOLEAN ("Boolean", 6);

	 String desc;
	 int constValue;
	 
	 DataType(String desc ,int constValue ){
		 this.desc = desc;
		 this.constValue = constValue;
	 }

	public String getDesc() {
		return desc;
	}

	public int getConstValue() {
		return constValue;
	}
	 
	 
}
