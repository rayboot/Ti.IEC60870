/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package de.appwerft.j60870;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.TimeoutException;

import javax.net.SocketFactory;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.KrollFunction;
import org.appcelerator.kroll.KrollProxy;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.kroll.common.Log;
import org.openmuc.j60870.ASdu;
import org.openmuc.j60870.CauseOfTransmission;
import org.openmuc.j60870.ClientConnectionBuilder;
import org.openmuc.j60870.Connection;
import org.openmuc.j60870.ConnectionEventListener;
import org.openmuc.j60870.InformationObject;
import org.openmuc.j60870.TypeId;

// This proxy can be created by calling J60870.createExample({message: "hello world"})
@Kroll.proxy(creatableInModule = J60870Module.class)
public class InformationObjectProxy extends KrollProxy {
	// Standard Debugging variables
	private static final String LCAT = "J60870";
	// connection params
	private Connection connection;
	private static final String INTERROGATION_ACTION_KEY = "i";
	private static final String CLOCK_SYNC_ACTION_KEY = "c";
	private KrollFunction onLoad;
	private KrollFunction onError;
	private KrollFunction onClosed;
	private InformationObject infoObject;
	private int address;

	// Constructor
	public InformationObjectProxy() {
		super();
	}

	@Override
	public void handleCreationDict(
			@Kroll.argument(optional = true) KrollDict opts) {
		int informationObjectAddress = 0;
		InformationObject[] informationObjects;

		super.handleCreationDict(opts);

		if (opts.containsKeyAndNotNull("address")) {
			address = opts.getInt("address");
		}
		infoObject = new InformationObject();
	}

}