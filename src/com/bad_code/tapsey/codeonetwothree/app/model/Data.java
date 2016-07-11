package com.bad_code.tapsey.codeonetwothree.app.model;

public class Data<T>{

	protected T value;
			
	protected DataType dataType;	
	
	public DataType getDataType() {
		return dataType;
	}


	public void setValue(T value){
		
		if(value instanceof String){
			this.dataType = DataType.STRING;
		}else if(value instanceof Integer){
			this.dataType = DataType.INTEGER;
		}else if(value instanceof Double){
			this.dataType = DataType.DOUBLE;
		}else if(value instanceof Boolean ){
			this.dataType = DataType.BOOLEAN;
		}
		
		this.value = value;
	}
	
	public T getValue(){
		
		return value;
	}
		
}
