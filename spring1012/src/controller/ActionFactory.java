package controller;
 //Action(모델)을 관리해주는 관리객체

import action.Action;
import action.FBoardAction;

public class ActionFactory {
	private static ActionFactory factory;
	private ActionFactory() {
		
	}
	public synchronized static ActionFactory getFactory() {
		if(factory == null)
			factory = new ActionFactory();
		return factory;
	}
	// 요청에 따른 객체를 조립후 인터페이스로 변환
	public Action getAction(String cmd) {
		Action action = null;
		if(cmd.equals("fboard")) {
			action = new FBoardAction();
		}
		return action;
	}
	
}
