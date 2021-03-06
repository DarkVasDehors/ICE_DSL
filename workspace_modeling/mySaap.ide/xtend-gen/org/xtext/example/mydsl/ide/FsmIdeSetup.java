/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.mydsl.FsmRuntimeModule;
import org.xtext.example.mydsl.FsmStandaloneSetup;
import org.xtext.example.mydsl.ide.FsmIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class FsmIdeSetup extends FsmStandaloneSetup {
  @Override
  public Injector createInjector() {
    FsmRuntimeModule _fsmRuntimeModule = new FsmRuntimeModule();
    FsmIdeModule _fsmIdeModule = new FsmIdeModule();
    return Guice.createInjector(Modules2.mixin(_fsmRuntimeModule, _fsmIdeModule));
  }
}
