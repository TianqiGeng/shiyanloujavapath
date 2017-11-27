package Design;

import org.omg.CORBA.Context;
import org.omg.CORBA.ContextList;
import org.omg.CORBA.DomainManager;
import org.omg.CORBA.ExceptionList;
import org.omg.CORBA.NVList;
import org.omg.CORBA.NamedValue;
import org.omg.CORBA.Object;
import org.omg.CORBA.Policy;
import org.omg.CORBA.Request;
import org.omg.CORBA.SetOverrideType;
import org.omg.PortableServer.AdapterActivator;
import org.omg.PortableServer.POA;

public class AdapterEnplugin implements AdapterEn{

	@Override
	public void chargeWith3Pins() {
		// TODO Auto-generated method stub
		System.out.println("charge with EnPlugin");
	}
}
