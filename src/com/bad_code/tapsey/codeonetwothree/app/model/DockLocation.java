package com.bad_code.tapsey.codeonetwothree.app.model;

public enum DockLocation {
	
	CLASS("Inside class body"),
	
	METHOD("Inside method body"),
	METHOD_PARAMS("Inside method params"),
	METHOD_RETRUN("Inside method return"),
	METHOD_ARGUMENT("Inside method argument"),
	
	CASE("On case "),
	IF_ELSE("Inside if else statement body"),
	IF_ELSE_PARAM("Inside if else param statement body"),
	IF("Inside if statement body"),
	IF_PARAM("Inside if param statement body"),
	SWITCH("Inside switch body"),
	SWITCH_CONDITION("Inside switch condition"),
	
	DO("Inside do while body"),
	WHILE("Inside while body"),
	WHILE_CONDTION("Inside while condition"),
	REPEAT_CONDTION("Inside repeat condition"),
	REPEAT("Inside repeat "),
	FOR("inside for loop"),
	FOR_CONDITION("inside for condition"),
	
	AND("Inside and"),
	OR("inside or"),
	NOT("inside not"),
	
	
	PREINCREAMENT("inside preincreament"),
	PREDECREAMENT("inside predecreament"),
	POSTINCREAMENT("inside preincreament"),
	POSTDECREAMENT("inside predecreament"),
	ASSIGNMENT("inside assignment"),
	SUBTRACT("inside subtract"),
	EQUAL("inside equal"),
	MULTIPLY("inside multiply"),
	PLUS("inside plus"),
	DIVIDE("inside devide"),
	MODULUS("inside modulus"),
	GREATER("inside greater"),
	GREATEROREQUAL("inside greater or equal"),
	LESS("inside less"),
	LESSOREQUAL("inside less or equal"),
	
	PRINT("inside print"),
	INPUT("inside input"),
	
	TOINTEGER("inside to integer"),
	TOBOOLEAN("inside to integer"),
	TODOUBLE("inside to double"),
	
	;
			
	String desc;
	DockLocation(String desc){
		 this.desc = desc;
	 }

	public String getDesc() {
		return desc;
	}
	

}
