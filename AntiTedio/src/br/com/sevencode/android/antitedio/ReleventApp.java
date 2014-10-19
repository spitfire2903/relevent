package br.com.sevencode.android.antitedio;

import com.parse.Parse;

import android.app.Application;

public class ReleventApp extends Application {

	public ReleventApp() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		
		Parse.initialize(this, "cdBdah6LvqTkDZ705lxB3bf6teXoEv5NS5UEC2mz", "TilCqTseTA2Tr8MvkQ7zEtCyen86gR87JgCbxkvN");
	}
}
