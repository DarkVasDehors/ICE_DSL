/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.ui.tests;

import com.google.inject.Injector;
import mySaap.ui.internal.MySaapActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class FsmUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MySaapActivator.getInstance().getInjector("org.xtext.example.mydsl.Fsm");
	}

}