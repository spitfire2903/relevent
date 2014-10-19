package br.com.sevencode.android.antitedio;

import com.parse.Parse;
import com.parse.ParseFacebookUtils;
import com.parse.ParseObject;

import android.app.Application;
import br.com.sevencode.android.antitedio.model.Event;

public class ReleventApp extends Application {

	public ReleventApp() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		
		ParseObject.registerSubclass(Event.class);
		
		Parse.initialize(this, "cdBdah6LvqTkDZ705lxB3bf6teXoEv5NS5UEC2mz", "TilCqTseTA2Tr8MvkQ7zEtCyen86gR87JgCbxkvN");
		
		ParseFacebookUtils.initialize(getString(R.string.facebook_app_id));
	}
}
