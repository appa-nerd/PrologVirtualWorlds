package logicmoo;

import java.lang.*;
import java.lang.reflect.*;
import java.io.*;
import java.util.*;
import java.awt.*;

import jamud.*;

import jamud.command.*;
import jamud.object.*;
import jamud.object.event.*;
import jamud.util.*;
import com.jamud.commands.*;
import com.jamud.connections.*;
import com.jamud.communications.*;
import com.jamud.creation.*;
import net.n3.nanoxml.*;

public class SwiMoo extends LogicMoo {

	/*
	Constructor called by prolog code:
	
	createJamud:-
			 java_create_object('logicmoo.SwiMoo',JAMUD),
			 format('\njamud.Jamud=~q\n',[JAMUD]),!,
			 assert(jamud_object(JAMUD)),!.
	
	*/

	public void SwiMoo() {

	}


	public Jamud jamudInstance;
	public MudObjectRoot jamudMudObjectRoot; 
	public MudObject jamudMudObjectBelowRoot; 


	/*
	
	For loading references to Jamud basic objects as used in:

	loadJamudReferences:-
			  jamud_object(JAMUD),
			  java_invoke_method(JAMUD,getJamudInstance(Instance)),
			  java_invoke_method(JAMUD,getJamudMudObjectRoot(MudRoot)),!,
			assert(jamud_instance(Instance)),
			assert(jamud_root(MudRoot)).
	
	
	*/              

	public Jamud getJamudInstance() {
		return  jamudInstance;
	}

	/*
	
	
	For loading references to Jamud basic objects as used in:

	loadJamudReferences:-
			  jamud_object(JAMUD),
			  java_invoke_method(JAMUD,getJamudInstance(Instance)),
			  java_invoke_method(JAMUD,getJamudMudObjectRoot(MudRoot)),!,
			assert(jamud_instance(Instance)),
			assert(jamud_root(MudRoot)).
	
	*/              

	public MudObjectRoot getJamudMudObjectRoot() {
		return  jamudMudObjectRoot;
	}

	/*
	Boots the Jamud for now from prolog as:
	
	startJamud:-
					 jamud_object(JAMUD),!,
					 java_invoke_method(JAMUD,startJamud(X)).
	*/              
	public void startJamud() {
		logWrite("Start jamud");
		if ( jamudInstance==null ) {
			try {
				String[] args = { "jamud.xml"} ; 
				Jamud.main( args );
				jamudInstance = Jamud.currentInstance();
				jamudMudObjectRoot = jamudInstance.mudObjectRoot();
				//Iterator cobjs = jamudMudObjectRoot.childObjects();
				//jamudMudObjectBelowRoot = (MudObject)cobjs.next();
			} catch ( Exception e ) {
				logWrite("" +e );
				e.printStackTrace(System.out);
			}
		}
	}
}
 





}

